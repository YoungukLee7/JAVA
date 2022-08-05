package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.swing.ListCellRenderer;

public class D01_ArraysListPractice1 {
	/*
 	# ArraysList에 1000부터 9999의 랜덤 정수를 100개 추가한 후 다음을 구하시오
 	1. 모든 숫자의 평균
 	2. 모든 숫자중 가장 큰 수
 	3. 모든 숫자중 가장 작은 수
 	4. 77번째로 나온 수
 	강사님 풀이 밑 추가 설명
 */
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			list.add((int) (Math.random() * 9000 + 1000));
		}

		int sum = 0;
		int max = list.get(0);
		int min = list.get(0);
		
		for (int num : list) {
			sum += num;
			min = min > num ? num : min;
			max = max < num ? num : max;
		}
		
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
		
		// ------------------------------------------------------------------------//
		
		// 배열은 Collections 불가능하다.
		System.out.println("Collections로 구한 최대값: " + Collections.max(list));
		System.out.println("Collections로 구한 최소값: " + Collections.min(list));
		
		// 리스트를 배열로 변환하기
		
		// 1. 값을 담을 배열을 미리 생성한다
		Integer[] arr = new Integer[list.size()];
		// 2. toArray() 메서드에 미리 만들어둔 배열을 전달한다
		list.toArray(arr);
		System.out.println(Arrays.toString(arr));
		
		// 배열을 리스트로 변환하기
		List<Integer> list1 = Arrays.asList(arr);
		System.out.println(list1);
		
		// 리스트로 변환된 배열은 컬랙션이기 때문에 다시 ArrayList로 변환할 수 있다
		Collection<Integer> c = new ArrayList<>(list);
		List<Integer> l = new ArrayList<>(list);
		ArrayList<Integer> l2 = new ArrayList<>(list);
		
		// 리스트로 변환한 결과를 수정해도 원본 배열에는 영향을 미치지 않는다
		for (int i = 0; i < l2.size(); i++) {
			if (l2.get(i) > 1100) {
				l2.remove(i--);
			}
		}
		System.out.println(l2);
		// 배열 원본은 그대로 있다
		System.out.println(Arrays.toString(arr));
	}
}
