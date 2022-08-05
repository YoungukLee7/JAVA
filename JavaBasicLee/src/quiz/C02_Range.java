package quiz;

import java.util.Arrays;

/*
 	1. �ִ밪�� �Ű������� ������ 0���� �ִ밪 �̸��� ��� ���� �����ϴ� int�迭�� �����Ͽ� ��ȯ�ϴ�
 	range �ż��带 ����� ������
 	
 	ex) range(10)�� ��� -> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 	
 	2. �ּҰ��� �ִ밪�� �Ű������� ���޹�����
 		�ּҰ����� �ִ밪 �̸��� ��� ���� �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ� 
 		range �޼��带 ����� ������
 		
 	ex) range(10,15)�� ��� -> [10,11,12,13,14]
 	ex) range(15,10)�� ��� -> [15,14,13,12,11]
 	
 	3. �ּҰ��� �ִ밪�� �������� �Ű������� ���� ������
 		�ּҰ����� �ִ밪 �̸����� ��������ŭ �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ�
 		range �޼��带 ����� ������
 		
 	ex) range(30,40,3)�� ��� -> [30,33,36,39]
 	ex) range(40,45,5)�� ��� -> [40]
 	ex) range(40,30,-2)�� ��� -> [40,38,36,34,32]
 */
public class C02_Range {

	public static void main(String[] args) {
		// 1.
		Range r1 = new Range(10);
		// 2.
		Range r2 = new Range(10,15);
		Range r = new Range(15,10);
	}
}


class Range{
	Range(int a){
		int[] num = new int[a];
		for (int i = a-1; i >= 0; i--) {
			num[i] = i; 
		}
		System.out.println(Arrays.toString(num));
	}
	
	
	Range(int a,int b) {
		if ( a > b ) {
			int index = 0;
			int[] num = new int[a-b];
			for (int i = a; i > b; i--) {
				num[index++] = i; 
			}
			System.out.println(Arrays.toString(num));
		} else {
			int index = 0;
			int[] num = new int[b-a];
			for (int i = a; i < b; i++) {
				num[index++] = i; 
			}
			System.out.println(Arrays.toString(num));
		}
		
		
	}
	
}
