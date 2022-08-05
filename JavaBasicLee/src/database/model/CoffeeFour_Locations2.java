package database.model;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CoffeeFour_Locations2 {
	
	private Integer LOCATION_ID;
	private String STREET_ADDRESS;
	private String POSTAL_CODE;
	private String CITY;
	private String STATE_PROVINCE;
	private String COUNTRY_ID;
	private Integer cid;
	private String kor_name;
	private String eng_name;
	private Date expiry;
	
	public CoffeeFour_Locations2(ResultSet rs) throws SQLException{
		LOCATION_ID 	= rs.getInt(1);
		STREET_ADDRESS 	= rs.getString(2);
		POSTAL_CODE 	= rs.getString(3);
		CITY 			= rs.getString(4);
		STATE_PROVINCE 	= rs.getString(5);
		COUNTRY_ID		= rs.getString(6);
		cid 			= rs.getInt(7);
		kor_name 		= rs.getString(8);
		eng_name 		= rs.getString(9);
		expiry 			= rs.getDate(10);
	}
	@Override
	public String toString() {
		return String.format("%d |%s |%s |%s |%s |%s |%d |%s |%s |%s",
				LOCATION_ID,STREET_ADDRESS,POSTAL_CODE,CITY,STATE_PROVINCE,COUNTRY_ID
				,cid,kor_name,eng_name,expiry);
	}
}
