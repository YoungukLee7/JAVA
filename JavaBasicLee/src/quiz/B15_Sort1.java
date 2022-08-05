package quiz;

import java.util.Arrays;
import java.util.Iterator;

public class B15_Sort1 {
	/*
	   ���� ���� 30�� (0 ~ 99999) �� ����ִ� �迭�� ������ ��
	   1. �ش� �迭�� ������ ���� ������ ���ʴ�� ������ ���ο� �迭�� �����غ�����
	   2. �ش� �迭�� ������ ū ������ ���ʴ�� ������ ���ο� �迭�� �����غ�����
	   ����� Ǯ��
	   ���۰˻� : ���� �˰���  
	  
	   # ���� ����
	   1. �迭 ��ü���� ���� ���� ���� ã�� �� �տ� �ִ´�
	   2. �� ���� ������ �迭 ��ü���� ���� ���� ���� ã�� �ι�° �ڸ��� �ִ´�
	   3. ...
	   
	   9 4 3 2 1
	-->1 4 3 2 9
	-->1 2 3 4 9
	-->1 2 3 4 9
	
		# ���� ����
		
	 */
	public static void main(String[] args) {
		
		int[] data = new int [10];

		for (int i = 0; i < data.length; i++) {
			data[i] = (int)(Math.random()*100000);
		}
		
//		int asc = new int[data.length];    ���� data �迭�� �ִ� ���� asc�迭�� desc�迭�� �ű�� ����̴�
//		int desc = new int[data.length];   �Ʒ� data��� ���� �κе��� �� asc�� �ٲ��ش�.
//		
//		for (int i = 0; i < asc.length; i++) {
//			asc[i] = data[i];
//			desc[i] = data[i];
//		}
		
		
		
		System.out.printf("���� : %s\n",Arrays.toString(data));
		
		//  # ���� ����
		for (int step = 0; step < data.length - 1; step++) {
			
			// 1�ܰ� : �ּҰ��� ��ġ�� ã�´�
			int min_index = step;
			
			for (int i = step+1; i < data.length; i++) {
				min_index = data[min_index] > data[i] ? i : min_index;
			}
			// 2�ܰ� : �ּҰ��� �� ��(������ �ܰ� �ε���)���� �̵���Ų��
			int temp = data[step];
			data[step] = data[min_index];
			data[min_index] = temp;
			System.out.printf("%d �ܰ�: %s\n",step,Arrays.toString(data));
			
		}
	}

}
