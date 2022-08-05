package quiz;

import java.util.Arrays;

public class C01_MethodQuiz2 {

	/*
	 1. ����� ������ �ٱ����� ũ�⸦ �����ϸ� �ʿ��� �ٱ����� ������ �����ϴ� �ż���
	 2. ���ڿ��� �����ϸ� �ش� ���ڿ��� �������� �ڼ��� ����� ��ȯ�ϴ� �ż���
	 (StringBuilder ���)
	 3. ���ڿ��� �����ϸ� �ش� ���ڿ��� �Ųٷ��� ���ڿ��� ��ȯ�ϴ� �ż���
	 (StringBuilder ���)
	 4. �ż��带 ȣ���ϸ� 1 ~ 45 ������ �ߺ����� ���� 8���� �̷���� �迭�� ��ȯ�ϴ� �ż���
	 */
	
	public static int basket(int apple, int basket_size) {
		int basket = apple / basket_size;
		if (apple % basket_size ==0) {
			System.out.printf("����� ������ %d���̰� %d���� �ٱ��ϰ� �ʿ��ϴ�.",apple,basket);
			return basket;
		} else {
			System.out.printf("����� ������ %d���̰� %d���� �ٱ��ϰ� �ʿ��ϴ�.",apple,basket+1);
			return basket;
		}
	}
	
	public static char[] random(String word) {
		char[] random_word = word.toCharArray();
		
		for (int i = 0; i < random_word.length; i++) {
			int x = (int)(Math.random()*random_word.length);
			
			char temp = random_word[0];
			random_word[0] = random_word[x];
			random_word[x] = temp;
		}
		return random_word;
	}
	
	public static String back_start(String word) {
		String result = "";
		for (int i = word.length()-1; i >= 0; i--) {
			result = result + word.charAt(i);
		}
		return result;
	}
	
	public static int[] random_lotto(String lotto) {
		int ball[] = new int[8];
		for (int i = 0; i < ball.length; i++) {
			ball[i] = (int) (Math.random() * 45 + 1);
			
			for (int j = 0; j < i; j++) {
				if (ball[i] == ball[j]) {
					--i;
					break;
				}
			}
		}
		return ball;
	}
	
	public static void main(String[] args) {
		// 1��
		basket(22, 10);
		System.out.println();
		// 2��
		System.out.println(random("abcdefg"));
		// 3��
		String result = back_start("abcdefg");
		System.out.println(result);
		// 4��
		System.out.println(Arrays.toString(random_lotto("lotto")));
	}

}
