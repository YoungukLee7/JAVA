package quiz;

import java.util.Iterator;
import java.util.Scanner;

public class B06_ForQuiz {
	/*
	 1. 100���� 300������ ������ ���غ�����
	 2. 1���� 2000 ������ 7�� ����� ����غ��ÿ�
	 3. 1000���� 1500���� 10�� ����� ���ٿ� 10���� ��µǵ��� ����� ������
	 */
	public static void main(String[] args) {
		
		// 1. 100���� 300������ ������ ���غ�����
		
		int plus = 0;
		
		for (int i = 100; i <= 300; i++) {
			plus += i;
		}
		System.out.printf("100���� 300���� �� : %d\n", plus);
		
		// 2. 1���� 2000 ������ 7�� ����� ����غ��ÿ�
		
		for (int i = 1; i <= 2000; i++) {
			if (i%7==0) {
				System.out.printf("7�� ����� ��� : %d\n", i);
			}	
		}
		
		// 3. 1000���� 1500���� 10�� ����� ���ٿ� 10���� ��µǵ��� ����� ������
		int x = 0;
		for (int i = 1000; i <= 1500; i++) {

			if (i % 10 == 0) {
				System.out.printf("10�� ����� ���ٿ� 10���� : %d, ", i);
				if (x % 10 == 9) {
					System.out.println();
				}
				x++;
			}
		}
	}
}
