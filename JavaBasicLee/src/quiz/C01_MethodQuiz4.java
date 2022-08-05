package quiz;

import java.util.Arrays;
import java.util.Random;

import javax.swing.text.DefaultEditorKit.InsertBreakAction;

public class C01_MethodQuiz4 {
	/*
	 * 1. 사과의 개수와 바구니의 크기를 전달하면 필요한 바구니의 개수를 리턴하는 메서드
	 * 
	 * 2. 문자열을 전달하면 해당 문자열을 랜덤으로 뒤섞은 결과를 반환하는 메서드 (StringBuilder 사용)
	 * 
	 * 3. 문자열을 전달하면 해당 문자열을 거꾸로한 문자열을 반환하는 메서드 (StringBuilder 사용)
	 * 
	 * 4. 메서드를 호출하면 1 ~ 45 사이의 중복없는 숫자 8개로 이루어진 배열을 반환하는 메서드
	 * 강사님 풀이
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

	
	// 2. builder 사용
	public static String builderShuffle(String str) {
		// 새로운 StringBuilder를 만들때 문자열을 전달할 수 있다
		StringBuilder builder = new StringBuilder(str);
		Random ran = new Random();

		for (int i = 0; i < 100; ++i) {
			int random_index = ran.nextInt(builder.length());

			// builder.charAt(index) : 해당 인덱스의 문자를 하나 꺼내옴
			// builder.setCharAt(index, char) : 해당 인덱스를 전달한 문자로 수정함
			char temp = builder.charAt(0);
			builder.setCharAt(0, builder.charAt(random_index));
			builder.setCharAt(random_index, temp);
		}

		return builder.toString();
	}

	
	// 2. 그냥 품
	public static String strShuffle(String str) {
		Random ran = new Random();

		// 문자열 -> char[]로 바꾸기
		char[] arr = str.toCharArray();

		for (int i = 0; i < 100; ++i) {
			int random_index = ran.nextInt(arr.length);

			char temp = arr[0];
			arr[0] = arr[random_index];
			arr[random_index] = temp;
		}

		// 다 섞은 다음 char[]을 문자열로 변환하여 리턴
		return new String(arr);
	}

	// 3. builder 사용 안배운것으로
	public static String strReverse(String str) {
		StringBuilder builder = new StringBuilder(str);
		// builder.reverse() : 빌더에 들어있는 내용을 거꾸로 바꾼다
		return builder.reverse().toString();
	}
	
	// 3. builder 사용 배운것으로
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
			System.out.println("사과의 개수가 이상합니다.");
			break;
		case -1:
			System.out.println("바구니 개수가 이상합니다.");
			break;
		default:
			System.out.println("필요한 바구니는 " + basketCount + "개 입니다.");
			break;
		}

		// 2. builder 사용
		System.out.println(builderShuffle("hello world!"));
		// 2. 그냥 품
		System.out.println(strShuffle("hello world!"));
		// 3. builder 사용 안배운것
		System.out.println(strReverse("hello world!"));
		// 3. builder 사용 배운것
		System.out.println(strreverse("hello world!"));
		// 4. 그냥 품
		System.out.println(Arrays.toString(genNum()));
	}

}


