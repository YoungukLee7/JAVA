import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class D10_Tree {
	/*
	 # TreeSet , TreeMap
	 - Tree: �����͸� �߰��ϸ鼭 �ڱ� �ڸ��� ã�ư��� �ڷᱸ����� (������ å ���� ���)
	 - �����͸� �߰��ϴ� ���ÿ� �̸� ������ �Ǿ��ֱ� ������ �߰��� ������ �ʿ䰡 ����
	 - �߰��� ������ �ؾ��ϱ� ������ Hash���ٴ� ������ �ۿ� ����
	 - ������ �Ǿ��ֱ� ������ Hash�ʹ� �ٸ��� index�� ����� �� �ִ�
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
												// ������������ �ٲٱ�
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
		
		
		
//		headSet(toElement): �� �պ��� ������������ ��� ����� �̷���� �κ� ������ ��ȯ�Ѵ�
		System.out.println(numbers.headSet(900));
		
//		tailSet(FromElement): ���������� �� �ڱ����� �κ������� ��ȯ�Ѵ�
		System.out.println(numbers.tailSet(300));
		
//		subSet(from, to): �ش� ������ �κ� ������ ��ȯ�Ѵ�
		System.out.println(numbers.subSet(200, 100));
		
//		pollFirst() : �� �տ� ���� �����ϸ鼭 �̴´�
//		System.out.println("�� �տ� ���� �����ϸ鼭 �̴´�");
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
		
		System.out.println("50�� ���� ����� ���ʰ�" + numbers.floor(50));
		System.out.println("50�� ���� ����� �����ʰ�" + numbers.ceiling(50));
		
		
		// TreeMap�� ���� ������� Ű���� �������� �����ؼ� �ִ´� (���� �������� �������� ����)
		
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		treeMap.put("Apple", 1);
		treeMap.put("apple", 5);
		treeMap.put("cat", 15);
		treeMap.put("dog", 1);
		treeMap.put("Mango", 13);
		
		System.out.println(treeMap);
		
		// TreeSet�� ������ �޼������ �ִ�
		System.out.println(treeMap.subMap("a", "d"));
	}
}
