package quiz;

import java.util.Random;

public class C01_MethodQuiz3 {
	/*
	 1. 사과의 개수와 바구니의 크기를 전달하면 필요한 바구니의 개수를 리턴하는 매서드
	 2. 문자열을 전달하면 해당 문자열을 랜덤으로 뒤섰은 결과를 반환하는 매서드
	 (StringBuilder 사용)
	 3. 문자열을 전달하면 해당 문자열을 거꾸로한 문자열을 반환하는 매서드
	 (StringBuilder 사용)
	 4. 매서드를 호출하면 1 ~ 45 사이의 중복없는 숫자 8개로 이루어진 배열을 반환하는 매서드
	 강사님 풀이
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
		
		// 새로운 StringBuilder를 만들때 문자열을 전달할 수 있다
		StringBuilder builder = new StringBuilder();
		Random ran = new Random();
		
		for (int i = 0; i < 100; i++) {
			int random_index = ran.nextInt(builder.length());
			
			// builder.charAt(index) : 해당 인덱스의 문자를 하나 꺼내옴
			// builder.setcharAt(index, char) : 해당 인덱스를 전달한 문자로 수정함
			char temp = builder.charAt(0);
			builder.setCharAt(0, builder.charAt(random_index));
			builder.setCharAt(random_index, temp);
		}
		// builder를 .toString()으로 바꿔서 한거임
		return builder.toString();
	}
	
	public static String strShuffle(String str) {
		Random ran = new Random();
		
		// 문자열 -> char[]로 바꾸기
		char[] arr = str.toCharArray();
		
		for (int i = 0; i < str.length(); i++) {
			int random_index = ran.nextInt(arr.length);
			
			char temp = arr[0];
			arr[0] = arr[random_index];
			arr[random_index] = temp;
			
		}
		// 다 섞은 다음 char[]을  문자열로 변환하여 리턴
		return new String(arr);
	}
	
	public static void main(String[] args) {

		// 1.
		int basketCount = getBasketCount(12, 8);
		switch (basketCount) {
		case -2:
			System.out.println("사과의 개수가 잘못된 경우");
			break;
		case -1:
			System.out.println("바구니의 개수가 잘못된 경우");
			break;
		default:
			System.out.println("필요한 바구니는 " + basketCount + "개 입니다.");
			break;
		}
		
		// 2.
		System.out.println(builderShuffle("hello word!"));
		System.out.println(strShuffle("hello word!"));
		// 3.
		// 4.
		
	}

}
