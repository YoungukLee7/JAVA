package quiz;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class D07_CountFruits1 {
	/*
	 �迭�� ���� ������ �������� 1000�� �߰��� �Ŀ� �� ������ �� ���� �����ߴ��� �������
	 ����� Ǯ��
	 */
	private static String[] fruitNames = {"apple","banana","orange","kiwi","graps","peach","strawberry"};
	
	public static void main(String[] args) {
		HashMap<String, Integer> fruitCountMap = new HashMap<>();
		String[] fruits = new String[1000];
		
		for (int i = 0; i < fruits.length; i++) {
			fruits[i] = fruitNames[(int)(Math.random()*fruitNames.length)];
		}
		
		for (String fruit : fruits) {
			// Map���� ���� �̸��� �ش��ϴ� ���� ������ ������
			// �ش� ���� �̸��� ��ϵ����� �ʴٸ� null�� ���´ٴ� ���� �̿��Ѵ�
//			Integer cnt = fruitCountMap.get(fruit);
			// ���� ���� ª��
			Integer cnt = fruitCountMap.putIfAbsent(fruit,1);
			
			// �Ʒ����� ª��
			if (cnt != null) {
				fruitCountMap.put(fruit, cnt + 1);
			}
			
			// cnt�� null�̶�� ó�� ���� �����̹Ƿ� ���� 1�� ����Ѵ�
//			if (cnt == null) {
//				fruitCountMap.put(fruit, 1);
//			}else {
//				fruitCountMap.put(fruit, cnt + 1);
//			}
		}
		
		System.out.println(fruitCountMap);
	}
}
