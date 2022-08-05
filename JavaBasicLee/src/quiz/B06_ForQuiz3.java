package quiz;

import java.util.Scanner;

public class B06_ForQuiz3 {
	/*
	 사용자로부터 숫자를 입력받으면
	 1부터 해당 숫자 사이에 있는 5의 배수를 한 줄에 7개씩 모두 출력하시오
	 (음수를 입력받은 경우에도 올바르게 동작해야 합니다.)
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하시오 > ");
		int userNum = sc.nextInt();

		int startNum, endNum;
		
		if (userNum > 1) {
			startNum = 1;
			endNum = userNum;
		} else {
			startNum = userNum;
			endNum = 1;
		}
		
		for (int num = startNum, count = 0; num < endNum; ++num) {
			 
			 if (num % 5 == 0) {
				System.out.printf("%+-8d",num);

				// System.out.println("/숫자를 출력한 횟수: " + count++);
				if (count++ % 7 == 6) {
					System.out.print('\n');
				} 
			}
		
		}
	}
}
