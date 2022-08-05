package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.model.Coffee;

public class J06_DataModelClass {
	
	public static void main(String[] args) {
		
		// DB에서 꺼내온 데이터는 테이블의 모든 내용을 담을 수 있는 데이터 모델 클래스에 넣어두는 것이 좋다
		String sql = "select * from coffeefour";
		// 모델에 넣은 데이터를 컬렉션을 사용해 편하게 다룰 수 있다
		ArrayList<Coffee> coffees = new ArrayList<>();
		 
		try (
				Connection conn = OjdbConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		){
				while (rs.next()) {
					coffees.add(new Coffee(rs));
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 System.out.println(coffees);
	}
}
