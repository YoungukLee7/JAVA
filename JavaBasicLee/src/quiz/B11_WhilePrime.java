package quiz;

import java.util.Scanner;

public class B11_WhilePrime {
	/*
	 ����ڷκ��� ����(���)�� �Է� ������ 1���� �Է��� ���� ���̿� �����ϴ� ��� �Ҽ��� ����Ͻÿ�
	 ����ڰ� ������ �Է¹޴� ��� �ٽ� ����� �Է��ϰ� �����
	 
	 # �Ҽ� : ������ �������� ���� 1�� �ڱ� �ڽŹۿ� ���� ��
	 ex) 2 3 5 7 11 13 17 19
	 
	 while���� �̿��Ͽ� Ǯ��ÿ�
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;
		int count = 0;

		while (true) {
			System.out.print("���ڸ� �Է����ּ��� >> ");
			num = sc.nextInt();

			if (num > 2) {
				break;
			}
			System.out.println("�ٽ� �Է��Ͻÿ�.");
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
