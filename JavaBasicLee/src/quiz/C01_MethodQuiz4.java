package quiz;

import java.util.Arrays;
import java.util.Random;

import javax.swing.text.DefaultEditorKit.InsertBreakAction;

public class C01_MethodQuiz4 {
	/*
	 * 1. ����� ������ �ٱ����� ũ�⸦ �����ϸ� �ʿ��� �ٱ����� ������ �����ϴ� �޼���
	 * 
	 * 2. ���ڿ��� �����ϸ� �ش� ���ڿ��� �������� �ڼ��� ����� ��ȯ�ϴ� �޼��� (StringBuilder ���)
	 * 
	 * 3. ���ڿ��� �����ϸ� �ش� ���ڿ��� �Ųٷ��� ���ڿ��� ��ȯ�ϴ� �޼��� (StringBuilder ���)
	 * 
	 * 4. �޼��带 ȣ���ϸ� 1 ~ 45 ������ �ߺ����� ���� 8���� �̷���� �迭�� ��ȯ�ϴ� �޼���
	 * ����� Ǯ��
	 */
	
	// 1.
	public static int getBasketCount(int apple, int basketSize) {
		if (apple < 0) {
			return -2;
		} else if (basketSize <= 0) {
			return -1;
		} else if (apple % basketSize == 0) {
			return apple / basketSize;
		} else {
			return apple / basketSize + 1;
		}
	}

	
	// 2. builder ���
	public static String builderShuffle(String str) {
		// ���ο� StringBuilder�� ���鶧 ���ڿ��� ������ �� �ִ�
		StringBuilder builder = new StringBuilder(str);
		Random ran = new Random();

		for (int i = 0; i < 100; ++i) {
			int random_index = ran.nextInt(builder.length());

			// builder.charAt(index) : �ش� �ε����� ���ڸ� �ϳ� ������
			// builder.setCharAt(index, char) : �ش� �ε����� ������ ���ڷ� ������
			char temp = builder.charAt(0);
			builder.setCharAt(0, builder.charAt(random_index));
			builder.setCharAt(random_index, temp);
		}

		return builder.toString();
	}

	
	// 2. �׳� ǰ
	public static String strShuffle(String str) {
		Random ran = new Random();

		// ���ڿ� -> char[]�� �ٲٱ�
		char[] arr = str.toCharArray();

		for (int i = 0; i < 100; ++i) {
			int random_index = ran.nextInt(arr.length);

			char temp = arr[0];
			arr[0] = arr[random_index];
			arr[random_index] = temp;
		}

		// �� ���� ���� char[]�� ���ڿ��� ��ȯ�Ͽ� ����
		return new String(arr);
	}

	// 3. builder ��� �ȹ�������
	public static String strReverse(String str) {
		StringBuilder builder = new StringBuilder(str);
		// builder.reverse() : ������ ����ִ� ������ �Ųٷ� �ٲ۴�
		return builder.reverse().toString();
	}
	
	// 3. builder ��� ��������
	public static String strreverse(String str) {
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			builder.insert(0,str.charAt(i));
		}
		return builder.toString();
	}
	
	// 4.
	public static int[] genNum() {
		Random ran = new Random();
		int[] lotto = new int[8];
		
		for (int i = 0; i < lotto.length; i++) {
			int ranNum = ran.nextInt(45) +1;
			lotto[i] = ranNum;
			
			for (int j = 0; j < i; j++) {
				if (lotto[j] == ranNum) {
					--i;
					break;
				}
			}
		}
		return lotto;
	} 
	
	
	
	public static void main(String[] args) {
		// 1.
		int basketCount = getBasketCount(12, 4);
		switch (basketCount) {
		case -2:
			System.out.println("����� ������ �̻��մϴ�.");
			break;
		case -1:
			System.out.println("�ٱ��� ������ �̻��մϴ�.");
			break;
		default:
			System.out.println("�ʿ��� �ٱ��ϴ� " + basketCount + "�� �Դϴ�.");
			break;
		}

		// 2. builder ���
		System.out.println(builderShuffle("hello world!"));
		// 2. �׳� ǰ
		System.out.println(strShuffle("hello world!"));
		// 3. builder ��� �ȹ���
		System.out.println(strReverse("hello world!"));
		// 3. builder ��� ����
		System.out.println(strreverse("hello world!"));
		// 4. �׳� ǰ
		System.out.println(Arrays.toString(genNum()));
	}

}


