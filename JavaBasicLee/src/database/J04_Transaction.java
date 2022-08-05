package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class J04_Transaction {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String sql = "INSERT INTO coffeeFour VALUES (?,?,?,null,sysdate+15)";	
		System.out.print("몇 개 추가하시겠습니까? ");
		int num = sc.nextInt();
		
		try(
				Connection conn = OjdbConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			
			// Connection 객체의 AutoCommit을 해제한 이후 트랜젝션을 직접 관리 할 수 있다
			// 기본값이 setAutoCommit(true)입니다 true일 경우 commit이 자동적으로 된다는 것이고 
			// false면 rollback이나 savepoint를 사용자가 사용할 수 있게 해주는 것이다
			conn.setAutoCommit(false);
			
			for (int i = 0; i < num; i++) {
				pstmt.setInt(1, i);
				pstmt.setString(2, "커피" + i);
				pstmt.setString(3, "coffee" + i);
				
				System.out.printf("%d 행이 추가되었습니다.\n",pstmt.executeUpdate());
 			}
			
			System.out.println("저장하시겠습니까? 예(1) 아니오(0)");
			
			switch (sc.nextInt()) {
			case 0:
				conn.rollback();
				break;
			case 1:
				conn.commit();
				break;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
