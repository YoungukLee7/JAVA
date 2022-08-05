package database.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.OjdbConnection;
import database.model.CoffeeFour_Locations2;

public class J06_JoinDataClass {
	/*
	 	coffeeFour 테이블과 locations2 테이블 조인 결과의 모든 행을
	 	데이터 클래스에 담아 출력해보세요
	 */
	public static void main(String[] args) {
		
		String sql = "SELECT * FROM locations2 INNER JOIN coffeefour USING (location_id)";
		
		try (
				Connection conn = OjdbConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		){
			while (rs.next()) {
				System.out.println(new CoffeeFour_Locations2(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
