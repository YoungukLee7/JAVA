package quiz;

import java.util.Scanner;

public class B01_DollarExchange {
	/*
	 �޷��� �Է¹����� �ѱ������� ������ �˷��ִ� ���α׷��� ��������
	 (ȯ���� ���۸����� �˻�)
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�޷� �Է¶� > ");
		double us_money = scanner.nextDouble();
		double k_money = 0.00082;
		double exchange = us_money/k_money ;
		System.out.printf("�޷��� %.2f�޷��� ȯ���ϸ� %.2f���� �˴ϴ�.",us_money, exchange);
		
		/*
		Scanner sc = new Scanner(System.in);
		double = us_money, k_money;
		
		System.out.print("�޷� �Է¶� > ");
		us_money = sc.nextDouble();
		k_money = us_money * 1224.94;
		
		System.out.printf("�޷��� %.2f�޷��� ȯ���ϸ� %.0f���� �˴ϴ�.",us_money, k_money);
		 */
	}

}
