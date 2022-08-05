package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class J01_JdbcConnection {
	/*
	   		#JDBC
	   		- Java database Connection
	   		- DB�� �������� ������ ������ �� ����� �޾ƿ� �� �ִ� JAVA API
	   		- �پ��� ������ DB�� ����� �� �ֵ��� ����Ǿ��ִ�
	   		- JAVA�� �ҽ� �ڵ�� � ������ DB�� �����ϴ��� �׻� �����ϴ�
	   		
	   		# QJDBC
	   		- ����Ŭ �����ͺ��̽��� JDBC API�� �����ϱ� ���� �������� ���̺귯��
	   		- ����Ŭ DB�� ��ġ�� ������ ���ԵǾ��ִ�
	   		- SQL DEVELOPER ���ο��� ���ԵǾ��ִ�
	 */
	public static void main(String[] args) {
		// 1. Class.forName() ���� jdbc ����̹��� �ε��Ѵ�
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // ���
			System.out.println("����̹� �ε� �Ϸ�");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("����̹� �ε� �� ���� �߻� ");
		}
		
		// 2. DriverManager Ŭ������ ���� db�� �����Ѵ�
		try {
			Connection conn = 
			DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:XE", // @ ������ ip�� ���� ��ǻ�� ip���� �����ϴ� (cmdâ�� ipconfig�� ġ�� ���´�)
					"hr","1234"); // ���̵� ��й�ȣ
			System.out.println("���� ���� �Ϸ�: " + conn);
			
			// 3. ������ ���� ��ü�� ���� �������� �����Ѵ�
			
			// 3-1. ���� �غ��ϱ� (�����ݷ��� �����ؾ� �Ѵ�)
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM employees"
					+ " inner join departments using (department_id) order by employee_id");
			
			// 3-2. �غ�� ���� �����ϱ�
			ResultSet rs = pstmt.executeQuery();
			
			// 4. �޾ƿ� ����� ����Ѵ� rs.next() : �������� �ѱ��
			while (rs.next()) {
				System.out.printf("%-8d%15s%15s%10s%20s%8d\n",
						rs.getInt("employee_id"),
						rs.getString("first_name"),
						rs.getString("last_name"),
						rs.getString("job_id"),
						rs.getString("department_name"),
						rs.getInt("salary"));
			}
			
			// 5. �� ����� ������ ���߿� ������ ������� �ݾ���� �Ѵ�
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("���� ���� ����");
		}
	}
}















