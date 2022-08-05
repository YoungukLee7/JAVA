import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D08_String {
	/*
	 # String
	 */
	public static void main(String[] args) {
		String fruits = "apple/banana/kiwi/graps/orange/watermelon/pineapple";
		
		// split(delimiter) : 문자열을 원하는 기준으로 자른 문자열 배열을 반환한다
		String[] split = fruits.split("/");
		System.out.println(Arrays.toString(split));
		
		// join(delimiter, CharSequence...) : 뒤에 나열한 문자열을 모두 연결한다
		String join = String.join(",", "tiger","lion","bear","panda");
		System.out.println(join);
		
		// join(delimiter, iterable) : 배열(또는 리스트 등)의 모든 문자열을 연결한다
		join = String.join("/",split);
		System.out.println(join);
		
		// comtains(seq) : 해당 문자열이 포함되어 있는지 검사한다
		System.out.println("orange가 있나요? : " + fruits.contains("orange"));
		System.out.println("peach가 있나요? : " + fruits.contains("peach"));
		
		// startsWith(seq) : 해당 문자열로 시작하는지를 검사한다
		String ur1 = "http://www.naver.com";
		System.out.println("www로 시작하나요? : " + ur1.startsWith("www"));
		System.out.println("http로 시작하나요? : " + ur1.startsWith("http"));
		System.out.println("https로 시작하나요? : " + ur1.startsWith("https"));
		
		// endsWith(seq) : 해당 문자열로 끝나는지를 검사한다
		String fileName = "screenshot.pdf";
		System.out.println(".pdf로 끝나나요? : " + fileName.endsWith(".pdf"));
		System.out.println(".jpg로 끝나나요? : " + fileName.endsWith(".jpg"));
		System.out.println(".gif로 끝나나요? : " + fileName.endsWith(".gif"));
		
		// replace(old, new) : 문자열을 교체한 새로운 문자열을 반환한다
		String email = "billgates@maicrosoft.com";
		String replaced = email.replace("maicrosoft.com", "naver.com");
		System.out.println(email);
		System.out.println(replaced);
		
		// substring(start) : 문자열을 start 위치부터 자른 결과를 반환한다
		System.out.println( email.substring(5));
		
		// substring(start, end) : 문자열을 start 위치부터 end 미만까지 자른 결과를 반환한다
		System.out.println("자른 것: " + email.substring(5,10));
		
		// toUpperCase() : 문자열의 알파벳을 모두 대 문자로 변환한 인스턴스를 반환한다
		System.out.println(email.toUpperCase());
		
		// toLowerCase() : 문자열의 알파벳을 모두 소문자로 변환한 인스턴스를 반환한다
		System.out.println(email.toUpperCase().toLowerCase().toUpperCase().toLowerCase());
		
		// 위에 것들 응용 : 결과에다 .찍고 추가한다
		char[] arr = email.substring(10).toUpperCase().toCharArray();
		System.out.println(arr);
		
		// indexOf(seq) : 원하는 문자열이  몇 번째 인덱스에 있는지 반환한다
		System.out.println("@의 위치: " + email.indexOf("@"));
		
		// indexOf(seq, from) : from부터 원하는 문자열을 검색하여 인덱스를 반환한다
		String test = "apple@naver.com, abc@yahoo.co.kr, ddd@hanmail.net";
		
		System.out.println(test.indexOf('@',0));
		System.out.println(test.indexOf('@',6));
		System.out.println(test.indexOf('@',21));
		
		fruits = "apple/banana/kiwi/graps/orange/watermelon/pineapple" + 
				"apple/banana/kiwi/graps/orange/watermelon/pineapple" + 
				"apple/banana/kiwi/graps/orange/watermelon/pineapple";
		
		// 연습문제: fruits에서 모든 "apple"의 인덱스를 찾아 출력해보세요
		System.out.println("연습문제");
		
		Set<Integer> count = new HashSet();
		
		for (int i = 0; i < fruits.length(); i++) {
			if (fruits.indexOf("apple", i) < 0) {
				break;
			}
			count.add(fruits.indexOf("apple", i));
		}
		System.out.println("apple이 있는 인덱스: " + count);
		
		int index = -1, i = 0;
		while ((index = fruits.indexOf("apple", index + 1)) != -1) {
			System.out.printf("%d번째 apple의 위치 : %d\n",i++,index);
		}
		
		String wordNumber = "_ _ _ _ _ _ _";
		System.out.println(wordNumber.substring(0,2));
		// String.format(format,args...) : 원하는 문자열을 서식을 이용해 생성할 수 있다
	}
}

















