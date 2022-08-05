package quiz;

import java.util.Arrays;

public class C01_Range {
	/*
 	1. 최대값을 매개변수로 받으면 0부터 최대값 미만의 모든 값을 포함하는 int배열을 생성하여 반환하는
 	range 매서드를 만들어 보세요
 	
 	ex) range(10)의 결과 -> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 	
 	2. 최소값과 최대값을 매개변수로 전달받으면
 		최소값부터 최대값 미만의 모든 값을 포함하는 int 배열을 생성하여 반환하는 
 		range 메서드를 만들어 보세요
 		
 	ex) range(10,15)의 결과 -> [10,11,12,13,14]
 	ex) range(15,10)의 결과 -> [15,14,13,12,11]
 	
 	3. 최소값과 최대값과 증가값을 매개변수로 전달 받으면
 		최소값부터 최대값 미만까지 증가값만큼 증가하는 int 배열을 생성하여 반환하는
 		range 메서드를 만들어 보세요
 		
 	ex) range(30,40,3)의 결과 -> [30,33,36,39]
 	ex) range(40,45,5)의 결과 -> [40]
 	ex) range(40,30,-2)의 결과 -> [40,38,36,34,32]
 */
	public static int[] range(int a) {
		int[] num = new int[a];
		for (int i = a - 1; i >= 0; i--) {
			num[i] = i;
		}
		return num;
	}

	public static int[] range(int a, int b) {
		if (a > b) {
			int index = 0;
			int[] num = new int[a - b];
			for (int i = a; i > b; i--) {
				num[index++] = i;
			}
			return num;
		} else {
			int index = 0;
			int[] num = new int[b - a];
			for (int i = a; i < b; i++) {
				num[index++] = i;
			}
			return num;
		}
	}

	public static int count(int a, int b, int c) {
		if (a < b) {
			int index = 0;
			int cnt = 0;
			int[] num = new int[b - a];
			for (int i = a; i < b; i += c) {
				num[index++] = i;
				cnt++;
			}
			return cnt;
		} else {
			int index = 0;
			int cnt = 0;
			int[] num = new int[a - b];
			for (int i = a; i > b; i += c) {
				num[index++] = i;
				cnt++;
			}
			return cnt;
		}
	}

	public static int[] range(int a, int b, int c) {
		if (a < b) {
			int index = 0;
			int[] num = new int[count(a, b, c)];
			for (int i = a; i < b; i += c) {
				num[index++] = i;
			}
			return num;
		} else {
			int index = 0;
			int[] num = new int[count(a, b, c)];
			for (int i = a; i > b; i += c) {
				num[index++] = i;
			}
			return num;
		}
	}

	public static void main(String[] args) {

		System.out.println("1번");
		System.out.println(Arrays.toString(range(10)));
		System.out.println("2번");
		System.out.println(Arrays.toString(range(10, 15)));
		System.out.println(Arrays.toString(range(15, 10)));
		System.out.println("3번");
		System.out.println(Arrays.toString(range(30, 40, 3)));
		System.out.println(Arrays.toString(range(40, 30, -3)));
		System.out.println(Arrays.toString(range(40, 45, 5)));
		System.out.println(Arrays.toString(range(40, 30, -2)));
	}

}
