package database.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

import myobj.parking.Car;
import myobj.parking.CarFactory;
import myobj.parking.CarType;

public class J03_ParkingSystem {
	/*
	  차량이 진입하면 차량 5부제를 적용하여 주차여부를 판별한 후 DB에 기록해보세요
	 */
	private static HashMap<DayOfWeek, String> limitNumMap = new HashMap<>();
	private static HashSet<CarType> allowedCarType = new HashSet<>();
	
	static {
		limitNumMap.put(DayOfWeek.MONDAY,    "16");
		limitNumMap.put(DayOfWeek.TUESDAY,   "27");
		limitNumMap.put(DayOfWeek.WEDNESDAY, "38");
		limitNumMap.put(DayOfWeek.THURSDAY,  "49");
		limitNumMap.put(DayOfWeek.FRIDAY,    "50");
		
		allowedCarType.add(Car.babyRide);
		allowedCarType.add(Car.disabled);
		allowedCarType.add(Car.lightCard);
	}
	
	public String check(Car car) {
		DayOfWeek todaysDow = LocalDate.now().getDayOfWeek();
		
		String limitNum = limitNumMap.get(todaysDow);
		
		if (limitNum == null) {
			String String1 = "오늘은 주말이므로 차량 5부제를 실행하지 않습니다";
			return String1;
		}
		
		
		if (allowedCarType.contains(car.getCarType())) {
			String String2 = "츨입 가능";
			return String2;
		}else if (limitNum.contains(car.getLastNum())) {
			String String3 = "출입 제한";
			return String3;
		}else {
			String String4 = "출입 가능";
			return String4;
		}
	}
	public static void main(String[] args) {
		J03_ParkingSystem sys = new J03_ParkingSystem();
		
			
			for (int i = 0; i < 10; i++) {
				Car car = CarFactory.getRandomTestCar();
				
				String a = car.getCarNum();
				CarType carType = car.getCarType();
				String b = carType.getName();
				String c = sys.check(car);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 완료");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패");
		}
		
		try {
			Connection conn =
			DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:XE",
					"hr","1234");
			System.out.println("연결 생성 완료: " + conn);
			
			PreparedStatement pstmt = conn.prepareStatement(
					"INSERT INTO parking_car VALUES (?,?,?)");
			
			pstmt.setString(1, a);
			pstmt.setString(2, b);
			pstmt.setString(3, c);
			
			pstmt.executeUpdate();
			
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
			}
	}
}
