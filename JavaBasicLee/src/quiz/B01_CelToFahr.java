package quiz;

import java.util.Scanner;

public class B01_CelToFahr {
	
	/*
	 ����ڷκ��� ����(��) �µ��� �Է¹����� ȭ��(��)�� �� ������ �˷��ִ� ���α׷��� ��������
	 (�µ� ��ȯ ������ ���۸� �� ��)
	 */
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("����(��) �µ��� �Է��Ͻÿ� : ");
	double c_temperature = sc.nextDouble();
	double f_temperature = c_temperature * 1.8 + 32;
	
	System.out.println("ȭ��(��) : " + f_temperature + "��");
	
	/*
	 Scanner sc = new Scanner(System.in);
	 
	 double c_temperature, f_temperature;
	 System.out.print("����(��) �µ��� �Է��Ͻÿ� : ");
	 
	 c_temperature = sc.nextDouble();
	 f_temperature = (c_temperature * 1.8) + 32;
	 
	 System.out.printf("���� %.1���� ȭ�� %.1f���Դϴ�.\n" ,c_temperature, f_temperature;
	 */
	}

}
