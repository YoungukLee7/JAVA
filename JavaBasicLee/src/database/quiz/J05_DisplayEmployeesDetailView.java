package database.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import database.OjdbConnection;

public class J05_DisplayEmployeesDetailView {
	/*
	  	emp_details_view를 자바 콘솔에 보기 좋게 출력해보세요
	 */
	public static void main(String[] args) {
		String sql = "select * from emp_details_view";
		
		try (
				Connection conn = OjdbConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		){
			ResultSetMetaData meta = rs.getMetaData();
			
			for (int i = 1; i < meta.getColumnCount(); i++) {
				System.out.printf(meta.getColumnLabel(i) + "\t");
			}
			System.out.println();
			while (rs.next()) {
				System.out.printf("%-8d\t%10s\t%-8d\t%-8d\t%-8d\t%10s\t%15s\t%15s\t%10d\t%.2f\t%30s\t%40s\t%30s\t%30s\t%40s\t%30s\n",
						rs.getInt("employee_id"),
						rs.getString("job_id"),
						rs.getInt("manager_id"),
						rs.getInt("department_id"),
						rs.getInt("location_id"),
						rs.getString("country_id"),
						rs.getString("first_name"),
						rs.getString("last_name"),
						rs.getInt("salary"),
						rs.getFloat("commission_pct"),
						rs.getString("department_name"),
						rs.getString("job_title"),
						rs.getString("city"),
						rs.getString("state_province"),
						rs.getString("country_name"),
						rs.getString("region_name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("연결 생성 실패");
		}
	}
}
