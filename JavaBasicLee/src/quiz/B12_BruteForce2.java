package quiz;

import javax.swing.text.DefaultEditorKit.InsertBreakAction;

public class B12_BruteForce2 {
	/*
	 생성된 4자리 임시 비밀번호를 맞출때까지
	 모든 비밀번호를 생성하고 대조하는 프로그램을 만들어보시오
	 강사님 풀이 다른 식으로
	 */
	public static void main(String[] args) {

		String symbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ" 
				+ "0123456789!\"#$%&'()*+,-./:;<=>?@[]^_`{|}~\\";
		
		String password = "[]a4";
		
		double max_index = Math.pow(symbols.length(),4); // 4를 제곱한 이유는 비번 4자리 여서이다
		
		/*
		 password	symbol index	index 
		 aaaa		0000			0
		 aaab		0001			1
		 aaaj		0009			9
		 aaak		000(10)			10
		 aaa}		000(90)			90
		 aaa>		000(91)			91
		 aaa?		000(92)			92
		 aaak		000(93)			93
		 aabb		0011			94
		 */
		
		/*
		 빈 문자열을 만들어 놓고 +=으로 문자열을 한글자씩 완성시키는 것은 매우 느리다
		 문자열을 한글자씩 완성시키고 싶을 때에는 StringBuilder라는 클래스를 사용한다.
		 
		 StringBuilder brute_password_builder = new StringBuilder();
		 append() : +=으로 문자를 한 글자 맨쥐에 추가하는 것과 같은 효과를 가진 메서드 (함수)
		 insert() : 해당 문자열의 맨 앞에 글자를 추가하는 메서드
		 */
		
		for (int i = 0; i < max_index; i++) {
			// 새로운StringBuilder를 생성 (스캐너 만들듯이)
			StringBuilder brute_password_builder = new StringBuilder();
			
			int brute_index = i;
			
			for (int j = 0; j < 4; j++) {
				brute_password_builder.insert(0, symbols.charAt(brute_index%symbols.length()));
				brute_index /= symbols.length();
			}
			// StringBuilder로 만들어진 결과를 문자열로 꺼내기
			String brute_password = brute_password_builder.toString();
			System.out.println(brute_password);
			
//			brute_password += symbols.charAt(i%symbols.length()); // 4번째 자리 구하는 방법
//			brute_password += symbols.charAt(i/symbols.length() % symbols.length()); // 3번째 자리 구하는 방법
//			brute_password += symbols.charAt(i/symbols.length() / symbols.length() % symbols.length()); // 2번째 자리 구하는 방법
//			brute_password += symbols.charAt(i/symbols.length() /symbols.length() /symbols.length()  % symbols.length()); // 1번째 자리 구하는 방법
//			
//			System.out.println(brute_password);
		}
		
		
	}

}
