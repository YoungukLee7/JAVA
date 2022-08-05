package quiz;

import java.util.Scanner;

public class B11_Count3693 {
	/*
	   ����ڷκ��� ������ �ϳ� �Է¹ް�
	   �ش� ���ڱ��� 369 ������ ����ȴٸ� �ڼ��� �� ��� �ľ� �ϴ��� ����Ͽ� ���ÿ�
	   ���ڷθ� Ǫ�� ��
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;

		System.out.print("������ �ϳ� �Է��Ͻÿ�.");
		num = sc.nextInt();

		int clap = 0;

		for (int i = 1; i < num; i++) {
			// 12345
			// 123/4...5
			// 12/3...4
			// 1/2...3
			// 1 ...2
			// 0...1 �ϳ��� �и��ؼ� ���Ѵ� % 10���� �Ѱ��̴�.
			int checkNum = i; // i���� ���ϸ� �ȵǴϱ� checkNum�� ���� �ִ´�.
			System.out.printf("%d : ", i);

			while (checkNum > 0) {

				int digit = checkNum % 10;

				if (digit == 3 || digit == 6 || digit == 9) {
					System.out.print("¦");
					++clap;
				}
				checkNum /= 10;
			}
			System.out.println();
		}
		System.out.printf("%d�� �ڼ��ľ� �Ѵ�.", clap);
	}

}
