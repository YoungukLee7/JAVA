package quiz;

import java.util.ArrayList;

public class D01_ArraysListPractice {
/*
 	# ArraysList�� 1000���� 9999�� ���� ������ 100�� �߰��� �� ������ ���Ͻÿ�
 	1. ��� ������ ���
 	2. ��� ������ ���� ū ��
 	3. ��� ������ ���� ���� ��
 	4. 77��°�� ���� ��
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
		
		System.out.println("��� : " + sum/(double)list.size());
		
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
		
		System.out.println("�ִ밪: " + max);
		System.out.println("�ּҰ�: " + min);
		
		System.out.println("77��°�� ���� ��: " + list.get(76));
		
	}
}
