package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class J02_PrepareStatement {
	public static String driverName = "oracle.jdbc.driver.OracleDriver";
	public static String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	public static String user = "hr";
	public static String password = "1234";
	
	public static void main(String[] args) {
		
		int a = 2000 , b = 3000;
		
//		String b = "0; DELETE FROM employees; --"; // SQL Injection 공격
		
		// 문자열 + 연산을 이용해 쿼리문을 만드는 것은 보안상 매우 취약하다
		String sql = "SELECT * FROM employees where salary between" + a + "and" + b;
		
		// prepareStatement의 ? 기능을 이용해 변수를 채우는 것이 안전하다
		String sql2 = "SELECT * FROM employees where salary between ? and ?";
		
		try (
				Connection conn = DriverManager.getConnection(url,user,password);
				PreparedStatement pstmt = conn.prepareStatement(sql2);
		){
			Class.forName(driverName);
			
			pstmt.setInt(1, 2000);
			pstmt.setInt(2, 3000);
			
			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					System.out.printf("%-8d%15s%15s%10s%8d\n",
							rs.getInt("employee_id"),
							rs.getString("first_name"),
							rs.getString("last_name"),
							rs.getString("job_id"),
							rs.getInt("salary"));
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
