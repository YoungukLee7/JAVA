package quiz;

import java.util.ArrayList;
import java.util.Collections;

public class D07_CountFruits {
	/*
	 배열에 다음 과일을 랜덤으로 1000개 추가한 후에 각 과일이 몇 번씩 등장했는지 세어보세요
	 */
	private static String[] fruitsName = {"apple","banana","orange","kiwi","graps","peach","strawberry"};
	
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		
		int cnt = 0;
		for (int i = 0; i < 1000; i++) {
			cnt++;
			fruits.add(fruitsName[(int)(Math.random()*fruitsName.length)]);
			System.out.println(cnt + "번 : " + fruits.get(i));
		}
		
		System.out.println();
		
		int sum = 0;
		for (int i = 0; i < fruitsName.length; i++) {
			int count = Collections.frequency(fruits, fruitsName[i]);
			System.out.println(fruitsName[i] + "의 등장 횟수\t: " + count + "개");
			sum += count;
		}
		System.out.println();
		System.out.printf("등장 횟수 총 합: %d개",sum);
	}
}
