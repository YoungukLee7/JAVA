package database.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import database.OjdbConnection;

public class J05_MetaData {
	
	public static void main(String[] args) {
		
		String sql = "select * from employees";
		
		try (
				Connection conn = OjdbConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		){
			
			// ResultSetMetaData : 해당 쿼리 실행 결과에 대한 여러 정보를 담고있는 데이터
			ResultSetMetaData meta = rs.getMetaData();
			
			System.out.println("컬럼의 개수 : " + meta.getColumnCount() + "개");
			
			for (int i = 1; i < meta.getColumnCount(); i++) {
				System.out.printf("%d번째 컬럼의 이름 : %s\n",i,meta.getColumnLabel(i));
				System.out.println("컬럼의 타입: " + meta.getColumnTypeName(i));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
