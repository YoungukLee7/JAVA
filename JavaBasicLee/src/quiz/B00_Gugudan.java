package quiz;

import java.util.Scanner;

public class B00_Gugudan {
	/*
	 사용자로부터 숫자를 입력받으면
	 구구단의 해당 숫자 단을 모두 출력하는 프로그램을 만들어보세요.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오 >> ");
		int gugudan = sc. nextInt();
		
		System.out.printf(" %d단 : %d * 1 = %d\n" , gugudan , gugudan , gugudan * 1);
		System.out.printf(" %d단 : %d * 2 = %d\n" , gugudan , gugudan , gugudan * 2);
		System.out.printf(" %d단 : %d * 3 = %d\n" , gugudan , gugudan , gugudan * 3);
		System.out.printf(" %d단 : %d * 4 = %d\n" , gugudan , gugudan , gugudan * 4);
		System.out.printf(" %d단 : %d * 5 = %d\n" , gugudan , gugudan , gugudan * 5);
		System.out.printf(" %d단 : %d * 6 = %d\n" , gugudan , gugudan , gugudan * 6);
		System.out.printf(" %d단 : %d * 7 = %d\n" , gugudan , gugudan , gugudan * 7);
		System.out.printf(" %d단 : %d * 8 = %d\n" , gugudan , gugudan , gugudan * 8);
		System.out.printf(" %d단 : %d * 9 = %d\n" , gugudan , gugudan , gugudan * 9);
	}  

}
