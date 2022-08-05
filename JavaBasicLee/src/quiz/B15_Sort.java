package quiz;

import java.util.Arrays;

public class B15_Sort {

	/*
	   랜덤 숫자 30개 (0 ~ 99999) 가 들어있는 배열을 생성한 후
	   1. 해당 배열의 내용을 작은 값부터 차례대로 저장한 새로운 배열을 생성해보세요
	   2. 해당 배열의 내용을 큰 값부터 차례대로 저장한 새로운 배열을 생성해보세요
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
