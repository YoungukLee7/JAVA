package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class J03_ExecuteUpdate {
	public static void main(String[] args) {
		
		// SELECT�� executeQuery() ���� ����� ResultSet�� �޾ƿ���
		// INSERT, UPDATE, DELETE�� executeUpdate() ���� ����� �ٲ� �� ���� �����Ѵ�
		String sql = "UPDATE coffeeFour SET cid=cid+1 where eng_name=?";
		
		try (Connection conn = OjdbConnection.getConnection();
			 PreparedStatement pstmt = conn.prepareStatement(sql);
				){
					pstmt.setString(1, "latte");
					
					int row = pstmt.executeUpdate();
					
					System.out.println(row + " row(s) update.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
