package quiz;

public class B11_WhileQuiz {
	/*
	 while���� ����Ͻÿ�
	 
	 1. 500 ~ 1200 ���̿� �ִ� ��� 3�� ����� ����
	 2. 30���� 1���� �� �ٿ� ���ڸ� 5���� ���
	 3. 1���� 200������ �����߿� 2�ǹ���� �ƴϰ� 3�ǹ���� �ƴ� ���ڵ��� ����
	 
	 */
	public static void main(String[] args) {

//		1. 500 ~ 1200 ���̿� �ִ� ��� 3�� ����� ����
		int i = 500;
		int sum = 0;
		while (1200 >= i) {
			if (i % 3 == 0) {
				sum += i;
			}
			++i;
		}
		System.out.println("500 ~ 1200 ���̿� �ִ� ��� 3�� ����� ���� : " + sum);
		System.out.println();
//		2. 30���� 1���� �� �ٿ� ���ڸ� 5���� ���
		int i1 = 30;
		int count = 0;
		while (i1 >= 1) {

			System.out.printf("%-2d ", i1);
			if (count++ % 5 == 4) {
				System.out.println();
			}
			--i1;
		}
		System.out.println();
//		3. 1���� 200������ �����߿� 2�ǹ���� �ƴϰ� 3�ǹ���� �ƴ� ���ڵ��� ����
		int i2 = 1;
		int sum1 = 0;
		while (i2 <= 200) {
			if (i2 % 2 != 0 && i % 3 != 0) {
				sum1 += i2;
			}
			++i2;
		}
		System.out.println("���� : " + sum1);
	}

}
