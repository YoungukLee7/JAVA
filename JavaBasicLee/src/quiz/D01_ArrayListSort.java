package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class D01_ArrayListSort {

	
	public static void main(String[] args) {
		// 문자열을 오름차순으로 정렬하는 예제
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("monkey");
		animals.add("zibra");
		animals.add("lion");
		animals.add("giraffe");
		
		// Collections.sort(list) : 리스트의 내용을 오름차순으로 정렬해주는 메서드
		Collections.sort(animals);

		System.out.println(animals);
		// Collections.reverse(list) : 리스트의 내용을 거꾸로 뒤집어주는 메서드
		Collections.reverse(animals);;
		
		System.out.println(animals);
		
		/*
		 연습문제 : ArrayList에 100개의 랜덤 정수값을 채운 후 리스트의 내용을 내림차순으로 정렬하여 출력해보세요
		 */
		ArrayList<Integer> num = new ArrayList<Integer>();
		Random ran = new Random();

		for (int i = 0; i < 100; i++) {

			num.add(ran.nextInt(1000));

		}

		System.out.println(num);

		for (int i = 0; i < num.size(); i++) {

			for (int j = i + 1; j < num.size(); j++) {

				if (num.get(i) < num.get(j)) {

					int temp = num.get(i);

					num.set(i, num.get(j));

					num.set(j, temp);

				}

			}

		}

		System.out.println(num);
	}
}
