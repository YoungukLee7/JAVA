package quiz;

import java.util.Scanner;

public class B06_ForQuiz3 {
	/*
	 ����ڷκ��� ���ڸ� �Է¹�����
	 1���� �ش� ���� ���̿� �ִ� 5�� ����� �� �ٿ� 7���� ��� ����Ͻÿ�
	 (������ �Է¹��� ��쿡�� �ùٸ��� �����ؾ� �մϴ�.)
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("���ڸ� �Է��Ͻÿ� > ");
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

				// System.out.println("/���ڸ� ����� Ƚ��: " + count++);
				if (count++ % 7 == 6) {
					System.out.print('\n');
				} 
			}
		
		}
	}
}
