package quiz;

import java.util.Arrays;

public class B15_Sort {

	/*
	   ���� ���� 30�� (0 ~ 99999) �� ����ִ� �迭�� ������ ��
	   1. �ش� �迭�� ������ ���� ������ ���ʴ�� ������ ���ο� �迭�� �����غ�����
	   2. �ش� �迭�� ������ ū ������ ���ʴ�� ������ ���ο� �迭�� �����غ�����
	 */
	public static void main(String[] args) {

		int[] num = new int [30];
		int[] small = new int [30];
		int[] big = new int [30];
		int temp;
		
		for (int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random()*100000);
		}
		System.out.println(Arrays.toString(num));
		
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if (num[i] < num[j]) {
				} else {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		small = num;
		System.out.println(Arrays.toString(small));
		
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if (num[i] > num[j]) {
				} else {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		big = num;
		System.out.println(Arrays.toString(big));
	}

}
