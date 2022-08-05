package quiz;

import java.util.Arrays;
import java.util.function.BiConsumer;

public class B15_Lotto {

	/*
	 1. 1 ~ 45�� �ߺ� ���� ���� ���� 7���� �����Ͽ� ��÷ ��ȣ�� ��������
	 2. ��÷�ɶ����� ��ȣ�� ������ �Ŀ� �� ȸ���� ��÷�ƴ��� ����غ�����
	 
	 */
	public static void main(String[] args) {
		
		int cnt = 0;
		
		int[] number = new int[7];
		
		for (int i = 0; i < number.length; i++) {
			number[i] = (int)(Math.random()*45)+1;
			for (int j = 0; j < i; j++) {
				if (number[i] == number[j]) {
					--i;
					break;
				}
			}
		}
		System.out.print(Arrays.toString(number) + "\n");
		
		
		int[] same_number = new int[7];
		
		while (true) {
			for (int i = 0; i < same_number.length; i++) {
				same_number[i] = (int)(Math.random()*45)+1;
				for (int j = 0; j < i; j++) {
					if (same_number[i] == same_number[j]) {
						--i;
						break;
					} if (Arrays.toString(same_number) == Arrays.toString(number)) {
						break;
					} else {
						cnt++;
					}
				}
			}
			System.out.print(Arrays.toString(same_number) + "\n");
		}
	}

}
