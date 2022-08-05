package database.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class CoffeeDetail {
	
	Coffee coffee;
	Location location;
	
	// DB연결과 ID값을 전달 받으면 특정 행을 조회해 리턴해주는 메서드 
	public static CoffeeDetail get(Connection conn, int cid) {
		String sql = "SELECT * FROM locations2 INNER JOIN coffeefour USING (location_id) WHERE location_id = ?";
		
		try (
				PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			pstmt.setInt(1, cid);
			
			try (ResultSet rs = pstmt.executeQuery()) {
				rs.next();
				return new CoffeeDetail(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	// DB연결 (Connection)을 전달 받으면 모든 커피목록을 만들어 리턴하는 메서드
	public static List<CoffeeDetail> getAll(Connection conn) {
		List<CoffeeDetail> list = new ArrayList<>();
		
		String sql = "SELECT * FROM locations2 INNER JOIN coffeefour USING (location_id)";
		
		try(
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				list.add(new CoffeeDetail(rs));
			}
		}	catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	private CoffeeDetail(ResultSet rs) throws SQLException{
		this.coffee = new Coffee(rs);
		this.location = new Location(rs);
	}
	
	@Override
	public String toString() {
		return String.format("coffee: %s, location: %s", coffee, location);
	}
}
