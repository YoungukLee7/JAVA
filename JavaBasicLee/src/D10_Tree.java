import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class D10_Tree {
	/*
	 # TreeSet , TreeMap
	 - Tree: 데이터를 추가하면서 자기 자리를 찾아가는 자료구조방식 (도서관 책 정리 방식)
	 - 데이터를 추가하는 동시에 미리 정렬이 되어있기 때문에 추가로 정렬할 필요가 없다
	 - 추가시 정렬을 해야하기 때문에 Hash보다는 느릴수 밖에 없다
	 - 정렬이 되어있기 떄문에 Hash와는 다르게 index를 사용할 수 있다
	 */
	public static void main(String[] args) {
		TreeSet<Integer> number = new TreeSet<>();
		
		number.add(41);
		number.add(111);
		number.add(55);
		number.add(100);
		number.add(13);
		number.add(32);
		
		System.out.println(number);
		
		//-------------------------------------------------------------------------------
												// 내림차순으로 바꾸기
		TreeSet<Integer> numbers = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) {
				return i2.compareTo(i1);
			}
		});
		
		for (int i = 0; i < 100; i++) {
			numbers.add((int)(Math.random()*1000));
		}
		
		System.out.println(numbers);
		
		
		
//		headSet(toElement): 맨 앞부터 기준점까지의 모든 값들로 이루어진 부분 집합을 잔환한다
		System.out.println(numbers.headSet(900));
		
//		tailSet(FromElement): 기준점부터 맨 뒤까지의 부분집합을 반환한다
		System.out.println(numbers.tailSet(300));
		
//		subSet(from, to): 해당 범위의 부분 집합을 반환한다
		System.out.println(numbers.subSet(200, 100));
		
//		pollFirst() : 맨 앞에 값을 삭제하면서 뽑는다
//		System.out.println("맨 앞에 값을 삭제하면서 뽑는다");
//		while (numbers.pollFirst() != null) {
//			System.out.println(numbers);
//		}
		TreeSet<Integer> subset = new TreeSet<>(numbers.subSet(300, 200));
		System.out.println("subset pollFirst()");
		System.out.println(subset);
		while (subset.pollFirst() != null) {
			System.out.println(subset);
		}
		
		TreeSet<Integer> subset2 = new TreeSet<>(numbers.subSet(300, 200));
		System.out.println("subset pollLast()");
		System.out.println(subset);
		while (subset2.pollLast() != null) {
			System.out.println(subset2);
		}
		
		System.out.println("50과 가장 가까운 왼쪽값" + numbers.floor(50));
		System.out.println("50과 가장 가까운 오른쪽값" + numbers.ceiling(50));
		
		
		// TreeMap은 값과 상관없이 키값을 기준으로 정렬해서 넣는다 (값을 기준으로 잡을수는 없다)
		
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		treeMap.put("Apple", 1);
		treeMap.put("apple", 5);
		treeMap.put("cat", 15);
		treeMap.put("dog", 1);
		treeMap.put("Mango", 13);
		
		System.out.println(treeMap);
		
		// TreeSet과 유사한 메서드들이 있다
		System.out.println(treeMap.subMap("a", "d"));
	}
}
