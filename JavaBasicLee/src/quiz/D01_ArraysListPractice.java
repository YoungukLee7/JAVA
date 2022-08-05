package quiz;

import java.util.ArrayList;

public class D01_ArraysListPractice {
/*
 	# ArraysList에 1000부터 9999의 랜덤 정수를 100개 추가한 후 다음을 구하시오
 	1. 모든 숫자의 평균
 	2. 모든 숫자중 가장 큰 수
 	3. 모든 숫자중 가장 작은 수
 	4. 77번째로 나온 수
 */
	public static void main(String[] args) {
		int sum = 0;
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < 100; i++) {
			list.add((int)(Math.random()*9000+1000));
		}
		
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		
		System.out.println("평균 : " + sum/(double)list.size());
		
		int max = list.get(0);
		int min = list.get(0);
		
		for (int i = 0; i < list.size(); i++) {
			if (max < list.get(i)) {
				max = list.get(i);
			}
		}
		
		for (int i = 0; i < list.size(); i++) {
			if (min > list.get(i)) {
				min = list.get(i);
			}
		}
		
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
		
		System.out.println("77번째로 나온 수: " + list.get(76));
		
	}
}
