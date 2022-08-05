package quiz;

import java.util.Scanner;

public class B11_Count3691 {
	/*
	   사용자로부터 정수를 하나 입력받고
	   해당 숫자까지 369 게임이 진행된다면 박수를 총 몇번 쳐야 하는지 출력하여 보시오
	   문자열로 풀음
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;
		int clap = 0;

		System.out.print("정수를 하나 입력하시오.");
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.printf("%d : ", i);

			String numStr = "" + i; // 문자열 더하기 숫자하면 문자열이 된다 
                                    // 이 곳에서 숫자를 문자열로 바꿔주고 3,6,9를 비교한다.
			for (int j = 0; j < numStr.length(); j++) {

				char ch = numStr.charAt(j);

				if (ch == '3' || ch == '6' || ch == '9') {
					System.out.print("짝");
					++clap;
				}
			}
			System.out.println();
		}
		System.out.printf("%d번 박수쳐야 한다.",clap);
	}

}
