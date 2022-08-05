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
 	coffeeFour ���̺�� locations2 ���̺� ���� ����� ��� ����
 	������ Ŭ������ ��� ����غ�����
 	����� Ǯ��
 */
	public static void main(String[] args) {
		
		try (Connection conn = OjdbConnection.getConnection()){
			List<CoffeeDetail> coffeeDetails = CoffeeDetail.getAll(conn);
			
			for (CoffeeDetail detail : coffeeDetails) {
				System.out.println(detail);
			}
			
			System.out.println("====Ư�� �ุ ���� ��====");
			System.out.println(CoffeeDetail.get(conn, 2200));
			
			//coffee ���̺� ���ϴ� ������ insert
			Coffee.add(conn, new Coffee(5,"Ŀ�ǿ���","coffee milk",2600,new Date()));
			
			//location ���̺� ���ϴ� ������ insert
			Location.add(conn, new Location(990,"1234 korea","12345","kingdom","kong","IT"));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
