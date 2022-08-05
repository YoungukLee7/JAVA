package quiz;

import java.util.Arrays;
import java.util.Random;

public class B16_Array2Quiz {

	/*
	 1. numArr의 모든 값을 0 ~ 100 사이의 랜덤 정수로 바꾸기
	 2. 랜덤으로 바뀐 numArr의 모든 값을 출력하고 총합과 평균을 출력
	 3. numArr의 각 행(row)의 합을 구해서 출력하기
	 4. numArr의 각 열(column)의 합을 구해서 출력하기
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
		
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		
		// 1. numArr의 모든 값을 0 ~ 100 사이의 랜덤 정수로 바꾸기
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				numArr[i][j] = ran.nextInt(101);
				sum += numArr[i][j];
				
			}
			System.out.println(Arrays.toString(numArr[i]));
		}
		// 2. 랜덤으로 바뀐 numArr의 모든 값을 출력하고 총합과 평균을 출력
		System.out.println("=========== 총합 평균 ============");
		System.out.printf("총 합 : %d 평균 : %d\n",sum,sum/22);
		System.out.println("=========== 각 행(row)의 합 ============");
		// 3. numArr의 각 행(row)의 합을 구해서 출력하기
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
					sum1 += numArr[i][j];
			}
			System.out.printf("%d 행(row)의 합 : %d\n",i ,sum1);
			sum1 = 0;
		}
		System.out.println("=========== 각 열(column)의 합 ============");
		// 4. numArr의 각 열(column)의 합을 구해서 출력하기
		for (int i = 0; i < numArr[i].length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				System.out.println(j + ", " + i);
					sum1 += numArr[j][i];
			}
			System.out.printf("%d 행(row)의 합 : %d\n",i ,sum1);
			sum1 = 0;
		}
	}

}
