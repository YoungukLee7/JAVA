package quiz;

import java.util.Arrays;
import java.util.Iterator;

public class B15_Sort1 {
	/*
	   랜덤 숫자 30개 (0 ~ 99999) 가 들어있는 배열을 생성한 후
	   1. 해당 배열의 내용을 작은 값부터 차례대로 저장한 새로운 배열을 생성해보세요
	   2. 해당 배열의 내용을 큰 값부터 차례대로 저장한 새로운 배열을 생성해보세요
	   강사님 풀이
	   구글검색 : 정렬 알고리즘  
	  
	   # 선택 정렬
	   1. 배열 전체에서 가장 작은 값을 찾아 맨 앞에 넣는다
	   2. 맨 앞을 제외한 배열 전체에서 가장 작은 값을 찾아 두번째 자리에 넣는다
	   3. ...
	   
	   9 4 3 2 1
	-->1 4 3 2 9
	-->1 2 3 4 9
	-->1 2 3 4 9
	
		# 버블 정렬
		
	 */
	public static void main(String[] args) {
		
		int[] data = new int [10];

		for (int i = 0; i < data.length; i++) {
			data[i] = (int)(Math.random()*100000);
		}
		
//		int asc = new int[data.length];    기존 data 배열에 있던 것을 asc배열과 desc배열로 옮기는 방법이다
//		int desc = new int[data.length];   아래 data라고 적힌 부분들을 다 asc로 바꿔준다.
//		
//		for (int i = 0; i < asc.length; i++) {
//			asc[i] = data[i];
//			desc[i] = data[i];
//		}
		
		
		
		System.out.printf("원본 : %s\n",Arrays.toString(data));
		
		//  # 선택 정렬
		for (int step = 0; step < data.length - 1; step++) {
			
			// 1단계 : 최소값의 위치를 찾는다
			int min_index = step;
			
			for (int i = step+1; i < data.length; i++) {
				min_index = data[min_index] > data[i] ? i : min_index;
			}
			// 2단계 : 최소값을 맨 앞(현재의 단계 인덱스)으로 이동시킨다
			int temp = data[step];
			data[step] = data[min_index];
			data[min_index] = temp;
			System.out.printf("%d 단계: %s\n",step,Arrays.toString(data));
			
		}
	}

}
