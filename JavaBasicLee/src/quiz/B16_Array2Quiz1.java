package quiz;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.Random;

public class B16_Array2Quiz1 {
	/*
	 1. numArr의 모든 값을 0 ~ 100 사이의 랜덤 정수로 바꾸기
	 2. 랜덤으로 바뀐 numArr의 모든 값을 출력하고 총합과 평균을 출력
	 3. numArr의 각 행(row)의 합을 구해서 출력하기
	 4. numArr의 각 열(column)의 합을 구해서 출력하기
	 강사님 풀이
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
			
			// 랜덤 클래스를 사용할때 랜덤 범위 정해주는 방법
			// System.out.println(ran.nextInt(101));
			
			// 1. numArr의 모든 값을 0 ~ 100 사이의 랜덤 정수로 바꾸기
			for (int i = 0; i < numArr.length; i++) {
				System.out.printf("%d번째 배열의 길이: %d\n",i,numArr[i].length);
				System.out.printf("0부터 %d번까지 반복해야 합니다\n",numArr[i].length-1);
				for (int j = 0; j < numArr[i].length; j++) {
					numArr[i][j] = ran.nextInt(101);
				}
				System.out.println(Arrays.toString(numArr[i]));
			}
			System.out.println("2.");
			// 2. 랜덤으로 바뀐 numArr의 모든 값을 출력하고 총합과 평균을 출력
			int sum = 0;
			int size = 0;
			
			for (int i = 0; i < numArr.length; i++) {
				int len = numArr[i].length;
				size += len;
				for (int j = 0; j < len; j++) {
					sum += numArr[i][j];
				}
			}
			System.out.printf("총 합 : %d 평균 %.2f\n",sum,sum / (double)size);
			
			// 3. numArr의 각 행(row)의 합을 구해서 출력하기
			int maxColumnSize = 0;
			for (int i = 0; i < numArr.length; i++) {
				int len = numArr[i].length; // 4번 문제때문에 추가
				maxColumnSize = Math.max(maxColumnSize, len); // 4번 문제때문에 추가
					
					int row_sum = 0;
				for (int j = 0; j < numArr[i].length; j++) {
					row_sum += numArr[i][j];
				}
				System.out.printf("%d 행(row)의 합 : %d\n",i ,row_sum);
			}
			
			// 4. numArr의 각 열(column)의 합을 구해서 출력하기
			for (int col = 0; col < maxColumnSize; col++) {
				int col_sum = 0;
				for (int row = 0; row < numArr.length; row++) {
					System.out.printf("col : %d row : %d의 값을 더했습니다.\n",col,row);
					if (col < numArr[row].length) {
						col_sum += numArr[row][col];
					} else {
						System.out.printf("col : %d row : %d에는 값이 존재하지 않습니다.\n",col,row);
					}
				}
				System.out.printf("%d열의 합 : %d\n",col,col_sum);
			}
			
//			int[] colSum = new int[maxColumnSize];        // 위에 것을 쉽게 하는 법
//			
//			for (int row = 0; row < numArr.length; row++) {
//				for (int col = 0; col < numArr[row].length; col++) {
//					colSum[col] += numArr[row][col];
//				}
//			}
//			System.out.println(Arrays.toString(colSum));
	}

}
