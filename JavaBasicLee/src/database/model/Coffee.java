package database.model;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDate;

import database.OjdbConnection;

public class Coffee {
	// 데이터 클래스의 하나의 인스컨스가 DB의 한 행을 담을 수 있다
	// 데이터 클래스 규칙 1 : 필드의 접근 제어자는 private으로 설정한다
	// Integer로 하는 이유는 null값이 나올 수 있기 때문이다
	private Integer cid;
	private String kor_name;
	private String eng_name;
	private Integer location_id;
	private Date expiry;
	
	public static boolean add(Connection conn, Coffee coffee) {
		String sql = "INSERT INTO coffeeFour VALUES(?,?,?,?,?)";
		
		try (PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setInt(1, coffee.cid);
			pstmt.setString(2, coffee.kor_name);
			pstmt.setString(3, coffee.eng_name);
			pstmt.setInt(4, coffee.location_id);
			// java.util.Date를 java.sql.Date로 변환하여 전달해야 함
			pstmt.setDate(5, new java.sql.Date(coffee.expiry.getTime()));
			
			// LocalDate를 java.sql.Date로 변환해야 하는 경우
			// java.sql.Date.valueOf(LocalDate.now());
			
			return pstmt.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public Coffee(int cid, String kor_name, String eng_name, int location_id, Date expiry) {
		this.cid = cid;
		this.kor_name = kor_name;
		this.eng_name = eng_name;
		this.location_id = location_id;
		this.expiry = expiry;
	}
	
	public Coffee(ResultSet rs) throws SQLException{
		cid 		= rs.getInt("cid");
		kor_name 	= rs.getString("kor_name");
		eng_name 	= rs.getString("eng_name");
		location_id = rs.getInt("location_id");
		expiry 		= rs.getDate("expiry");
	}
	
	// 데이터 클래스 규칙 2 : 접근이 필요한 필드는 getter 메서드를 달고 수정이 필요한 메서드는 setter 메서드를 달아준다
	// set이 필요할 때는 회원정보가 저장되어 있을 때 회원이 닉네임을 바꾼경우 수정이 가능하게 set을 써준다
	
	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getKor_name() {
		return kor_name;
	}

	public void setKor_name(String kor_name) {
		this.kor_name = kor_name;
	}

	public String getEng_name() {
		return eng_name;
	}

	public void setEng_name(String eng_name) {
		this.eng_name = eng_name;
	}

	public Integer getLocation_id() {
		return location_id;
	}

	public void setLocation_id(Integer location_id) {
		this.location_id = location_id;
	}

	public Date getExpiry() {
		return expiry;
	}

	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}
	
	@Override
	public String toString() {
		return String.format("%s(%s)", kor_name,eng_name);
	}
}
