package quiz;

import java.util.Scanner;

public class B03_AppleQuiz {
	/*
	 ���� : ����� 10���� ���� �� �ִ� �ٱ��ϰ� �ִ�
	 ����� ������ �Է��ϸ� ����� ��� ��� ���� �ʿ���
	 �ٱ����� ������ �˷��ִ� ���α׷��� ��������
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �� ����� ���� > ");
		
		final int BASKET_SIZE = 10; //���
		int apple_count = scanner.nextInt();
		int apple_basket;
		

		if(apple_count < 0) {
			// ����� ������ �������� ��
			System.out.println("�߸��� �Է� ���̴�");
		} else  {
			// ����� ������ ������ ��
			if (apple_count % BASKET_SIZE == 0)  {
				apple_basket = apple_count / BASKET_SIZE;
			} else {
				apple_basket = apple_count / BASKET_SIZE + 1;
			}
			System.out.printf("%d���� ����� %d�� �ٱ��Ͽ� �� �� �ִ�.", apple_count, apple_basket );
		}
	}

}
