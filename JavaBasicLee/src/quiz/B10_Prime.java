package quiz;

import java.util.Scanner;

public class B10_Prime {
	/*
	 사용자로부터 숫자(양수)를 입력 받으면 1부터 입력한 숫자 사이에 존재하는 모든 소수를 출력하시오
	 사용자가 음수로 입력받는 경우 다시 제대로 입력하게 만들기
	 
	 # 소수 : 나누어 떨어지는 수가 1과 자기 자신밖에 없는 수
	 ex) 2 3 5 7 11 13 17 19
	 
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int user_input;
		int count = 0;

		
		System.out.print("숫자를 입력하라 : ");
		user_input = sc.nextInt();
	
		if (user_input < 0) {
		System.out.println("양수만 적어주십시오.");	
		} else {
		}
		
		
		for (int i = 1; i < user_input; i++) {
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 1) {
				System.out.print(i + " ");
			}
			count = 0;
		}
	}
}
