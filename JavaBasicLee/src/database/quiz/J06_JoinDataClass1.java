package database.quiz;

import java.sql.Connection;
import java.util.Date;
import java.sql.SQLException;
import java.util.List;

import database.OjdbConnection;
import database.model.Coffee;
import database.model.CoffeeDetail;
import database.model.Location;

public class J06_JoinDataClass1 {
	/*
 	coffeeFour 테이블과 locations2 테이블 조인 결과의 모든 행을
 	데이터 클래스에 담아 출력해보세요
 	강사님 풀이
 */
	public static void main(String[] args) {
		
		try (Connection conn = OjdbConnection.getConnection()){
			List<CoffeeDetail> coffeeDetails = CoffeeDetail.getAll(conn);
			
			for (CoffeeDetail detail : coffeeDetails) {
				System.out.println(detail);
			}
			
			System.out.println("====특정 행만 뽑을 때====");
			System.out.println(CoffeeDetail.get(conn, 2200));
			
			//coffee 테이블에 원하는 데이터 insert
			Coffee.add(conn, new Coffee(5,"커피우유","coffee milk",2600,new Date()));
			
			//location 테이블에 원하는 데이터 insert
			Location.add(conn, new Location(990,"1234 korea","12345","kingdom","kong","IT"));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
