package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class J04_Transaction {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String sql = "INSERT INTO coffeeFour VALUES (?,?,?,null,sysdate+15)";	
		System.out.print("�� �� �߰��Ͻðڽ��ϱ�? ");
		int num = sc.nextInt();
		
		try(
				Connection conn = OjdbConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			
			// Connection ��ü�� AutoCommit�� ������ ���� Ʈ�������� ���� ���� �� �� �ִ�
			// �⺻���� setAutoCommit(true)�Դϴ� true�� ��� commit�� �ڵ������� �ȴٴ� ���̰� 
			// false�� rollback�̳� savepoint�� ����ڰ� ����� �� �ְ� ���ִ� ���̴�
			conn.setAutoCommit(false);
			
			for (int i = 0; i < num; i++) {
				pstmt.setInt(1, i);
				pstmt.setString(2, "Ŀ��" + i);
				pstmt.setString(3, "coffee" + i);
				
				System.out.printf("%d ���� �߰��Ǿ����ϴ�.\n",pstmt.executeUpdate());
 			}
			
			System.out.println("�����Ͻðڽ��ϱ�? ��(1) �ƴϿ�(0)");
			
			switch (sc.nextInt()) {
			case 0:
				conn.rollback();
				break;
			case 1:
				conn.commit();
				break;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
