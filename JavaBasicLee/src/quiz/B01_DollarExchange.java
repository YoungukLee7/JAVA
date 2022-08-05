package quiz;

import java.util.Scanner;

public class B01_DollarExchange {
	/*
	 달러를 입력받으면 한국돈으로 얼마인지 알려주는 프로그램을 만들어보세요
	 (환율은 구글링으로 검색)
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("달러 입력란 > ");
		double us_money = scanner.nextDouble();
		double k_money = 0.00082;
		double exchange = us_money/k_money ;
		System.out.printf("달러를 %.2f달러을 환전하면 %.2f원이 됩니다.",us_money, exchange);
		
		/*
		Scanner sc = new Scanner(System.in);
		double = us_money, k_money;
		
		System.out.print("달러 입력란 > ");
		us_money = sc.nextDouble();
		k_money = us_money * 1224.94;
		
		System.out.printf("달러를 %.2f달러을 환전하면 %.0f원이 됩니다.",us_money, k_money);
		 */
	}

}
