package quiz;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.Random;

public class B16_Array2Quiz1 {
	/*
	 1. numArr�� ��� ���� 0 ~ 100 ������ ���� ������ �ٲٱ�
	 2. �������� �ٲ� numArr�� ��� ���� ����ϰ� ���հ� ����� ���
	 3. numArr�� �� ��(row)�� ���� ���ؼ� ����ϱ�
	 4. numArr�� �� ��(column)�� ���� ���ؼ� ����ϱ�
	 ����� Ǯ��
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
			
			// 1. numArr�� ��� ���� 0 ~ 100 ������ ���� ������ �ٲٱ�
			for (int i = 0; i < numArr.length; i++) {
				System.out.printf("%d��° �迭�� ����: %d\n",i,numArr[i].length);
				System.out.printf("0���� %d������ �ݺ��ؾ� �մϴ�\n",numArr[i].length-1);
				for (int j = 0; j < numArr[i].length; j++) {
					numArr[i][j] = ran.nextInt(101);
				}
				System.out.println(Arrays.toString(numArr[i]));
			}
			System.out.println("2.");
			// 2. �������� �ٲ� numArr�� ��� ���� ����ϰ� ���հ� ����� ���
			int sum = 0;
			int size = 0;
			
			for (int i = 0; i < numArr.length; i++) {
				int len = numArr[i].length;
				size += len;
				for (int j = 0; j < len; j++) {
					sum += numArr[i][j];
				}
			}
			System.out.printf("�� �� : %d ��� %.2f\n",sum,sum / (double)size);
			
			// 3. numArr�� �� ��(row)�� ���� ���ؼ� ����ϱ�
			int maxColumnSize = 0;
			for (int i = 0; i < numArr.length; i++) {
				int len = numArr[i].length; // 4�� ���������� �߰�
				maxColumnSize = Math.max(maxColumnSize, len); // 4�� ���������� �߰�
					
					int row_sum = 0;
				for (int j = 0; j < numArr[i].length; j++) {
					row_sum += numArr[i][j];
				}
				System.out.printf("%d ��(row)�� �� : %d\n",i ,row_sum);
			}
			
			// 4. numArr�� �� ��(column)�� ���� ���ؼ� ����ϱ�
			for (int col = 0; col < maxColumnSize; col++) {
				int col_sum = 0;
				for (int row = 0; row < numArr.length; row++) {
					System.out.printf("col : %d row : %d�� ���� ���߽��ϴ�.\n",col,row);
					if (col < numArr[row].length) {
						col_sum += numArr[row][col];
					} else {
						System.out.printf("col : %d row : %d���� ���� �������� �ʽ��ϴ�.\n",col,row);
					}
				}
				System.out.printf("%d���� �� : %d\n",col,col_sum);
			}
			
//			int[] colSum = new int[maxColumnSize];        // ���� ���� ���� �ϴ� ��
//			
//			for (int row = 0; row < numArr.length; row++) {
//				for (int col = 0; col < numArr[row].length; col++) {
//					colSum[col] += numArr[row][col];
//				}
//			}
//			System.out.println(Arrays.toString(colSum));
	}

}
