package quiz;

import java.util.Scanner;

public class B11_Count3691 {
	/*
	   ����ڷκ��� ������ �ϳ� �Է¹ް�
	   �ش� ���ڱ��� 369 ������ ����ȴٸ� �ڼ��� �� ��� �ľ� �ϴ��� ����Ͽ� ���ÿ�
	   ���ڿ��� Ǯ��
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;
		int clap = 0;

		System.out.print("������ �ϳ� �Է��Ͻÿ�.");
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.printf("%d : ", i);

			String numStr = "" + i; // ���ڿ� ���ϱ� �����ϸ� ���ڿ��� �ȴ� 
                                    // �� ������ ���ڸ� ���ڿ��� �ٲ��ְ� 3,6,9�� ���Ѵ�.
			for (int j = 0; j < numStr.length(); j++) {

				char ch = numStr.charAt(j);

				if (ch == '3' || ch == '6' || ch == '9') {
					System.out.print("¦");
					++clap;
				}
			}
			System.out.println();
		}
		System.out.printf("%d�� �ڼ��ľ� �Ѵ�.",clap);
	}

}
