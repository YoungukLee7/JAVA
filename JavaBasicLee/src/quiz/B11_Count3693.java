package quiz;

import java.util.Scanner;

public class B11_Count3693 {
	/*
	   사용자로부터 정수를 하나 입력받고
	   해당 숫자까지 369 게임이 진행된다면 박수를 총 몇번 쳐야 하는지 출력하여 보시오
	   숫자로만 푸는 법
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;

		System.out.print("정수를 하나 입력하시오.");
		num = sc.nextInt();

		int clap = 0;

		for (int i = 1; i < num; i++) {
			// 12345
			// 123/4...5
			// 12/3...4
			// 1/2...3
			// 1 ...2
			// 0...1 하나씩 분리해서 비교한다 % 10으로 한것이다.
			int checkNum = i; // i값이 변하면 안되니까 checkNum에 집어 넣는다.
			System.out.printf("%d : ", i);

			while (checkNum > 0) {

				int digit = checkNum % 10;

				if (digit == 3 || digit == 6 || digit == 9) {
					System.out.print("짝");
					++clap;
				}
				checkNum /= 10;
			}
			System.out.println();
		}
		System.out.printf("%d번 박수쳐야 한다.", clap);
	}

}
