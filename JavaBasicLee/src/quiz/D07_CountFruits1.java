package quiz;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class D07_CountFruits1 {
	/*
	 배열에 다음 과일을 랜덤으로 1000개 추가한 후에 각 과일이 몇 번씩 등장했는지 세어보세요
	 강사님 풀이
	 */
	private static String[] fruitNames = {"apple","banana","orange","kiwi","graps","peach","strawberry"};
	
	public static void main(String[] args) {
		HashMap<String, Integer> fruitCountMap = new HashMap<>();
		String[] fruits = new String[1000];
		
		for (int i = 0; i < fruits.length; i++) {
			fruits[i] = fruitNames[(int)(Math.random()*fruitNames.length)];
		}
		
		for (String fruit : fruits) {
			// Map에서 과일 이름에 해당하는 과일 개수를 꺼낸다
			// 해당 과일 이름이 등록되있지 않다면 null이 나온다는 점을 이용한다
//			Integer cnt = fruitCountMap.get(fruit);
			// 위의 것을 짧게
			Integer cnt = fruitCountMap.putIfAbsent(fruit,1);
			
			// 아래것을 짧게
			if (cnt != null) {
				fruitCountMap.put(fruit, cnt + 1);
			}
			
			// cnt가 null이라면 처음 나온 과일이므로 값을 1로 등록한다
//			if (cnt == null) {
//				fruitCountMap.put(fruit, 1);
//			}else {
//				fruitCountMap.put(fruit, cnt + 1);
//			}
		}
		
		System.out.println(fruitCountMap);
	}
}
