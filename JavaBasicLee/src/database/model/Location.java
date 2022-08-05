package database.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Location {

	private Integer LOCATION_ID;
	private String STREET_ADDRESS;
	private String POSTAL_CODE;
	private String CITY;
	private String STATE_PROVINCE;
	private String COUNTRY_ID;
	
	public static boolean add(Connection conn, Location location) {
		String sql = "INSERT INTO locations2 VALUES(?,?,?,?,?,?)";
		
		try (PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setInt(1, location.LOCATION_ID);
			pstmt.setString(2, location.STREET_ADDRESS);
			pstmt.setString(3, location.POSTAL_CODE);
			pstmt.setString(4, location.CITY);
			pstmt.setString(5, location.STATE_PROVINCE);
			pstmt.setString(6, location.COUNTRY_ID);
			
			return pstmt.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public Location(int location_id, String street_address, String postal_code, String city, String state_province, String country_id) {
		this.LOCATION_ID = location_id;
		this.STREET_ADDRESS = street_address;
		this.POSTAL_CODE = postal_code;
		this.CITY = city;
		this.STATE_PROVINCE = state_province;
		this.COUNTRY_ID = country_id;
	}
	
	// 마우스 우클릭 -> source -> Generate Getters and setters (Getters, setters 만드는 방법)
	public Integer getLOCATION_ID() {
		return LOCATION_ID;
	}
	public void setLOCATION_ID(Integer lOCATION_ID) {
		LOCATION_ID = lOCATION_ID;
	}
	public String getSTREET_ADDRESS() {
		return STREET_ADDRESS;
	}
	public void setSTREET_ADDRESS(String sTREET_ADDRESS) {
		STREET_ADDRESS = sTREET_ADDRESS;
	}
	public String getPOSTAL_CODE() {
		return POSTAL_CODE;
	}
	public void setPOSTAL_CODE(String pOSTAL_CODE) {
		POSTAL_CODE = pOSTAL_CODE;
	}
	public String getCITY() {
		return CITY;
	}
	public void setCITY(String cITY) {
		CITY = cITY;
	}
	public String getSTATE_PROVINCE() {
		return STATE_PROVINCE;
	}
	public void setSTATE_PROVINCE(String sTATE_PROVINCE) {
		STATE_PROVINCE = sTATE_PROVINCE;
	}
	public String getCOUNTRY_ID() {
		return COUNTRY_ID;
	}
	public void setCOUNTRY_ID(String cOUNTRY_ID) {
		COUNTRY_ID = cOUNTRY_ID;
	}
	
	public Location(ResultSet rs) throws SQLException{
		LOCATION_ID 		= rs.getInt("LOCATION_ID");
		STREET_ADDRESS 		= rs.getString("STREET_ADDRESS");
		POSTAL_CODE 		= rs.getString("POSTAL_CODE");
		CITY 				= rs.getString("CITY");
		STATE_PROVINCE 		= rs.getString("STATE_PROVINCE");
		COUNTRY_ID		 	= rs.getString("COUNTRY_ID");
	}
	
	@Override
	public String toString() {
		return String.format("%s(%s), %s", STREET_ADDRESS,POSTAL_CODE,CITY);
	}
}
