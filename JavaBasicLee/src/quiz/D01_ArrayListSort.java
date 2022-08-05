package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class D01_ArrayListSort {

	
	public static void main(String[] args) {
		// ���ڿ��� ������������ �����ϴ� ����
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("monkey");
		animals.add("zibra");
		animals.add("lion");
		animals.add("giraffe");
		
		// Collections.sort(list) : ����Ʈ�� ������ ������������ �������ִ� �޼���
		Collections.sort(animals);

		System.out.println(animals);
		// Collections.reverse(list) : ����Ʈ�� ������ �Ųٷ� �������ִ� �޼���
		Collections.reverse(animals);;
		
		System.out.println(animals);
		
		/*
		 �������� : ArrayList�� 100���� ���� �������� ä�� �� ����Ʈ�� ������ ������������ �����Ͽ� ����غ�����
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
