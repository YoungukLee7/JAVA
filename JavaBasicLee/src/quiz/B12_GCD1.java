package quiz;

import java.util.Random;

public class B12_GCD1 {
	/*
 	�������� ������ �� ������ �ִ������� ���Ͻÿ�
 	����� Ǯ��
 */
	public static void main(String[] args) {

		// Integer.MAX_VALUE : ������ �ִ밪 (4byte ������ �ִ� �����) ������ �ȳ���
		int a = (int)(Math.random() * Integer.MAX_VALUE);
		int b = (int)(Math.random() * Integer.MAX_VALUE);
		
//		Random random = new Random();
//		int a = Math.abs(random.nextInt());
//		int b = Math.abs(random.nextInt());
		
		int min = Math.min(a, b);
		
		/*
		 # ���� ������
		 
		 - �� ? �� : �ƴϿ�
		 
		 */
		min = a < b ? a:b;
		
		int gcd = 1;
		
		for (int i = min; i > 0; i--) {
			if (a%i == 0 && b%i == 0) {
				System.out.println("�ִ� ����� : " + i);
				gcd = i;
				break;
			}
		}
		System.out.printf("%d�� %d�� �ִ������� %d�Դϴ�.\n",a,b,gcd);
	}

}
