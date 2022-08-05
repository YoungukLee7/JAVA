package quiz;

import java.util.Arrays;

public class C01_MethodQuiz2 {

	/*
	 1. 사과의 개수와 바구니의 크기를 전달하면 필요한 바구니의 개수를 리턴하는 매서드
	 2. 문자열을 전달하면 해당 문자열을 랜덤으로 뒤섰은 결과를 반환하는 매서드
	 (StringBuilder 사용)
	 3. 문자열을 전달하면 해당 문자열을 거꾸로한 문자열을 반환하는 매서드
	 (StringBuilder 사용)
	 4. 매서드를 호출하면 1 ~ 45 사이의 중복없는 숫자 8개로 이루어진 배열을 반환하는 매서드
	 */
	
	public static int basket(int apple, int basket_size) {
		int basket = apple / basket_size;
		if (apple % basket_size ==0) {
			System.out.printf("사과의 개수는 %d개이고 %d개의 바구니가 필요하다.",apple,basket);
			return basket;
		} else {
			System.out.printf("사과의 개수는 %d개이고 %d개의 바구니가 필요하다.",apple,basket+1);
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
		// 1번
		basket(22, 10);
		System.out.println();
		// 2번
		System.out.println(random("abcdefg"));
		// 3번
		String result = back_start("abcdefg");
		System.out.println(result);
		// 4번
		System.out.println(Arrays.toString(random_lotto("lotto")));
	}

}
