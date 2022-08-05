package quiz;

import java.util.Arrays;

public class C01_Range1 {
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
 	����� Ǯ��
 */
	
	public static int[] range(int end) {
		int[] arr = new int[end];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		return arr;
	}
	
	public static int[] range(int start, int end) {
		int[] arr = new int[Math.abs(end-start)]; // start�� �� Ŭ���� �־� ���밪�� ����
		
		// start���� �� ������ 1�� ����, start���� �� ũ�� 1�� ����
		int incre = start < end ? 1 : -1;
		
		for (int i = start, index = 0; i != end; i+=incre) {
			arr[index++] = i;
		}

		return arr;
	}

	public static int length(int start, int end, int incre) {
		// diff�� ����� ������ ���� end�� �� ũ�Ƿ� incre�� ������� �Ѵٴ� ���̴�
		// diff�� ����� ������� ���� end�� �� �����Ƿ� incre�� �������� �Ѵٴ� ���̴�
		
		// end �� �̸��� ������ ã�°��̹Ƿ� incre�� ����϶����� -1�� �ؾ��ϰ�
		// incre�� ������ ������ +1�� �ؾ��Ѵ� (������ 1 �پ���� �Ѵ�)
		int diff = (end-start) + (incre > 0 ? -1 : 1);
		
		// ���̸� ��������ŭ ������ ���ڰ� � �����ϴ��� �� �� �ִ�
		int length = diff /incre;
		
		if (length < 0) {
			System.out.println("length : 0");
			return 0;
		} else {
			// ù ���ڸ� �����ϱ� ������ ������ 1 �����ؾ� �Ѵ�
			length += 1;
		}
		System.out.println("length : " + length);
		return length;
	}
	
	public static int length2(int start, int end, int incre) {
		
		int diff = end - start;
		
		int length = diff / incre;
		
		if (length <0) {
			return 0;
		}
		
		length += diff % incre == 0 ? 0 : 1;
		
		return length;
	}
	
	public static int[] range(int start, int end, int incre) {
		
		int len = length2(start, end, incre);
		int[] arr = new int[len];
		
		for (int i = 0; i < len; ++i) {
			arr[i] = start + incre * i;
		}
		return arr;
	}

	public static void main(String[] args) {
		
		/*
		 # �޼��� �����ε�
		 - �ڹٿ����� ���� �̸��� �޼��带 ������ ������ �� �ִ�
		 - �̸��� ���� �޼��忩�� �Ű������� Ÿ�� �Ǵ� ������ �ٸ��ٸ� �ٸ� �ż���� �νĵȴ�
		 */

		System.out.println("1��");
		System.out.println(Arrays.toString(range(10)));
		
		myutil.Range r = new myutil.Range(10,20);        // myutil���� �޾ƿ� ��
		myutil.Range r2 = new myutil.Range(30,10,-5);
		myutil.Range r3 = new myutil.Range(5);
		
		System.out.println(Arrays.toString(r.range));
		System.out.println(Arrays.toString(r2.range));
		System.out.println(Arrays.toString(r3.range));   // ������� myutil���� �޾ƿ� ��
		
		// forEach�� : ������ �͵��� �ϳ��� ���ʴ�� �����鼭 �ݺ��ϴ� ����
//		for (int i : range(10)) {
//			System.out.println("i : " + i);
//		}
//		
//		for (char c : "Hello".toCharArray()) {
//			System.out.println("c : " + c);
//		}
		
		System.out.println("2��");
		System.out.println(Arrays.toString(range(10, 15)));
		System.out.println(Arrays.toString(range(15, 10)));
		System.out.println("3��");
		System.out.println(Arrays.toString(range(10, 18, 2)));
		System.out.println(Arrays.toString(range(10, 19, 2)));
		System.out.println(Arrays.toString(range(19, 10, 2)));
		System.out.println(Arrays.toString(range(20, 10, -2)));
	}

}
