package quiz;

import java.util.Arrays;
import java.util.Random;

public class B16_Array2Quiz {

	/*
	 1. numArr�� ��� ���� 0 ~ 100 ������ ���� ������ �ٲٱ�
	 2. �������� �ٲ� numArr�� ��� ���� ����ϰ� ���հ� ����� ���
	 3. numArr�� �� ��(row)�� ���� ���ؼ� ����ϱ�
	 4. numArr�� �� ��(column)�� ���� ���ؼ� ����ϱ�
	 */
	public static void main(String[] args) {

		Random ran = new Random();
		
		int[][] numArr = new int[][]{
			{1,1,1,1,1},
			{1,1,1},
			{1,1,1,1,1,1,1,1},
			{1,1},
			{1,1,1,1}
		};
		
		// ���� Ŭ������ ����Ҷ� ���� ���� �����ִ� ���
		// System.out.println(ran.nextInt(101));
		
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		
		// 1. numArr�� ��� ���� 0 ~ 100 ������ ���� ������ �ٲٱ�
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				numArr[i][j] = ran.nextInt(101);
				sum += numArr[i][j];
				
			}
			System.out.println(Arrays.toString(numArr[i]));
		}
		// 2. �������� �ٲ� numArr�� ��� ���� ����ϰ� ���հ� ����� ���
		System.out.println("=========== ���� ��� ============");
		System.out.printf("�� �� : %d ��� : %d\n",sum,sum/22);
		System.out.println("=========== �� ��(row)�� �� ============");
		// 3. numArr�� �� ��(row)�� ���� ���ؼ� ����ϱ�
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
					sum1 += numArr[i][j];
			}
			System.out.printf("%d ��(row)�� �� : %d\n",i ,sum1);
			sum1 = 0;
		}
		System.out.println("=========== �� ��(column)�� �� ============");
		// 4. numArr�� �� ��(column)�� ���� ���ؼ� ����ϱ�
		for (int i = 0; i < numArr[i].length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				System.out.println(j + ", " + i);
					sum1 += numArr[j][i];
			}
			System.out.printf("%d ��(row)�� �� : %d\n",i ,sum1);
			sum1 = 0;
		}
	}

}
