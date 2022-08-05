package quiz;

import java.util.Scanner;

public class B11_WhilePrime {
	/*
	 사용자로부터 숫자(양수)를 입력 받으면 1부터 입력한 숫자 사이에 존재하는 모든 소수를 출력하시오
	 사용자가 음수로 입력받는 경우 다시 제대로 입력하게 만들기
	 
	 # 소수 : 나누어 떨어지는 수가 1과 자기 자신밖에 없는 수
	 ex) 2 3 5 7 11 13 17 19
	 
	 while문을 이용하여 풀어보시오
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;
		int count = 0;

		while (true) {
			System.out.print("숫자를 입력해주세요 >> ");
			num = sc.nextInt();

			if (num > 2) {
				break;
			}
			System.out.println("다시 입력하시오.");
		}

		int i = 1;
		while (i < num) {
			int j = 2;
			while (j <= i) {
				if (i % j == 0) {
					count++;
				}
				++j;

			}
			if (count == 1) {
				System.out.print(i + " ");
			}
			count = 0;
			++i;
		}
	}

}
