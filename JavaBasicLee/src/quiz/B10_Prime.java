package quiz;

import java.util.Scanner;

public class B10_Prime {
	/*
	 ����ڷκ��� ����(���)�� �Է� ������ 1���� �Է��� ���� ���̿� �����ϴ� ��� �Ҽ��� ����Ͻÿ�
	 ����ڰ� ������ �Է¹޴� ��� �ٽ� ����� �Է��ϰ� �����
	 
	 # �Ҽ� : ������ �������� ���� 1�� �ڱ� �ڽŹۿ� ���� ��
	 ex) 2 3 5 7 11 13 17 19
	 
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int user_input;
		int count = 0;

		
		System.out.print("���ڸ� �Է��϶� : ");
		user_input = sc.nextInt();
	
		if (user_input < 0) {
		System.out.println("����� �����ֽʽÿ�.");	
		} else {
		}
		
		
		for (int i = 1; i < user_input; i++) {
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 1) {
				System.out.print(i + " ");
			}
			count = 0;
		}
	}
}
