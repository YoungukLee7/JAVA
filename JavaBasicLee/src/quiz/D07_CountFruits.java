package quiz;

import java.util.ArrayList;
import java.util.Collections;

public class D07_CountFruits {
	/*
	 �迭�� ���� ������ �������� 1000�� �߰��� �Ŀ� �� ������ �� ���� �����ߴ��� �������
	 */
	private static String[] fruitsName = {"apple","banana","orange","kiwi","graps","peach","strawberry"};
	
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		
		int cnt = 0;
		for (int i = 0; i < 1000; i++) {
			cnt++;
			fruits.add(fruitsName[(int)(Math.random()*fruitsName.length)]);
			System.out.println(cnt + "�� : " + fruits.get(i));
		}
		
		System.out.println();
		
		int sum = 0;
		for (int i = 0; i < fruitsName.length; i++) {
			int count = Collections.frequency(fruits, fruitsName[i]);
			System.out.println(fruitsName[i] + "�� ���� Ƚ��\t: " + count + "��");
			sum += count;
		}
		System.out.println();
		System.out.printf("���� Ƚ�� �� ��: %d��",sum);
	}
}
