package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.swing.ListCellRenderer;

public class D01_ArraysListPractice1 {
	/*
 	# ArraysList�� 1000���� 9999�� ���� ������ 100�� �߰��� �� ������ ���Ͻÿ�
 	1. ��� ������ ���
 	2. ��� ������ ���� ū ��
 	3. ��� ������ ���� ���� ��
 	4. 77��°�� ���� ��
 	����� Ǯ�� �� �߰� ����
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
		
		System.out.println("�ִ밪: " + max);
		System.out.println("�ּҰ�: " + min);
		
		// ------------------------------------------------------------------------//
		
		// �迭�� Collections �Ұ����ϴ�.
		System.out.println("Collections�� ���� �ִ밪: " + Collections.max(list));
		System.out.println("Collections�� ���� �ּҰ�: " + Collections.min(list));
		
		// ����Ʈ�� �迭�� ��ȯ�ϱ�
		
		// 1. ���� ���� �迭�� �̸� �����Ѵ�
		Integer[] arr = new Integer[list.size()];
		// 2. toArray() �޼��忡 �̸� ������ �迭�� �����Ѵ�
		list.toArray(arr);
		System.out.println(Arrays.toString(arr));
		
		// �迭�� ����Ʈ�� ��ȯ�ϱ�
		List<Integer> list1 = Arrays.asList(arr);
		System.out.println(list1);
		
		// ����Ʈ�� ��ȯ�� �迭�� �÷����̱� ������ �ٽ� ArrayList�� ��ȯ�� �� �ִ�
		Collection<Integer> c = new ArrayList<>(list);
		List<Integer> l = new ArrayList<>(list);
		ArrayList<Integer> l2 = new ArrayList<>(list);
		
		// ����Ʈ�� ��ȯ�� ����� �����ص� ���� �迭���� ������ ��ġ�� �ʴ´�
		for (int i = 0; i < l2.size(); i++) {
			if (l2.get(i) > 1100) {
				l2.remove(i--);
			}
		}
		System.out.println(l2);
		// �迭 ������ �״�� �ִ�
		System.out.println(Arrays.toString(arr));
	}
}
