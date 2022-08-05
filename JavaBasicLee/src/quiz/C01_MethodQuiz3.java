package quiz;

import java.util.Random;

public class C01_MethodQuiz3 {
	/*
	 1. ����� ������ �ٱ����� ũ�⸦ �����ϸ� �ʿ��� �ٱ����� ������ �����ϴ� �ż���
	 2. ���ڿ��� �����ϸ� �ش� ���ڿ��� �������� �ڼ��� ����� ��ȯ�ϴ� �ż���
	 (StringBuilder ���)
	 3. ���ڿ��� �����ϸ� �ش� ���ڿ��� �Ųٷ��� ���ڿ��� ��ȯ�ϴ� �ż���
	 (StringBuilder ���)
	 4. �ż��带 ȣ���ϸ� 1 ~ 45 ������ �ߺ����� ���� 8���� �̷���� �迭�� ��ȯ�ϴ� �ż���
	 ����� Ǯ��
	 StringBuilder random = new StringBuilder("123");
	 */
	
	public static int getBasketCount(int apple, int basketSize) {
		if (apple < 0) {
			return -2;
		} else if (basketSize < 0) {
			return -1;
		} else if (apple % basketSize == 0) {
			return apple / basketSize;
		} else {
			return apple / basketSize + 1;
		}
	}
	
	public static String builderShuffle(String str) {
		
		// ���ο� StringBuilder�� ���鶧 ���ڿ��� ������ �� �ִ�
		StringBuilder builder = new StringBuilder();
		Random ran = new Random();
		
		for (int i = 0; i < 100; i++) {
			int random_index = ran.nextInt(builder.length());
			
			// builder.charAt(index) : �ش� �ε����� ���ڸ� �ϳ� ������
			// builder.setcharAt(index, char) : �ش� �ε����� ������ ���ڷ� ������
			char temp = builder.charAt(0);
			builder.setCharAt(0, builder.charAt(random_index));
			builder.setCharAt(random_index, temp);
		}
		// builder�� .toString()���� �ٲ㼭 �Ѱ���
		return builder.toString();
	}
	
	public static String strShuffle(String str) {
		Random ran = new Random();
		
		// ���ڿ� -> char[]�� �ٲٱ�
		char[] arr = str.toCharArray();
		
		for (int i = 0; i < str.length(); i++) {
			int random_index = ran.nextInt(arr.length);
			
			char temp = arr[0];
			arr[0] = arr[random_index];
			arr[random_index] = temp;
			
		}
		// �� ���� ���� char[]��  ���ڿ��� ��ȯ�Ͽ� ����
		return new String(arr);
	}
	
	public static void main(String[] args) {

		// 1.
		int basketCount = getBasketCount(12, 8);
		switch (basketCount) {
		case -2:
			System.out.println("����� ������ �߸��� ���");
			break;
		case -1:
			System.out.println("�ٱ����� ������ �߸��� ���");
			break;
		default:
			System.out.println("�ʿ��� �ٱ��ϴ� " + basketCount + "�� �Դϴ�.");
			break;
		}
		
		// 2.
		System.out.println(builderShuffle("hello word!"));
		System.out.println(strShuffle("hello word!"));
		// 3.
		// 4.
		
	}

}
