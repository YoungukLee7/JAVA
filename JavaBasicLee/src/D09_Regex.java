import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D09_Regex {
	/*
	 # 정규표현식 (Regular Expression)
	 - 문자열을 패턴으로 검사할 수 있는 표현식
	 - 특정 프로그래밍 언어에만 있는 것이 아닌 공통의 규칙이다
	 - 정의한 정규표현식 패턴과 일치하는 문자열을 걸러낼 수 있다
	 
	 # java의 정규표현식 클래스
	 - Pattern
	 - Matcher
	 */
	public static void main(String[] args) {
		// Pattern.matches(regex,input) : input이 regex에 해당하는 문자열인지 검사하는 메서드
		System.out.println(Pattern.matches("sleep", "sleep"));
		
		
		// [] : 해당 위치의 한 문자에 올수있는 문자들을 정의하는 표현식
		System.out.println(Pattern.matches("s[lhk]eep", "sleep"));
		System.out.println(Pattern.matches("s[lhk]eep", "skeep"));
		System.out.println(Pattern.matches("s[lhk]eep", "sheep"));
		System.out.println(Pattern.matches("s[lhk]ee[pkz]", "saeep"));
		System.out.println(Pattern.matches("s[lhk]ee[pkz]", "sleep"));
		System.out.println(Pattern.matches("s[lhk]ee[pkz]", "sleek"));
		System.out.println(Pattern.matches("s[lhk]ee[pkz]", "sleez"));
		// 띄어쓰기도 문자로 인식하기 때문에 보기 좋으라고 띄어쓰면 안된다
		System.out.println(Pattern.matches("s[l k]ee[pkz]", "s eez"));
		System.out.println(Pattern.matches("s[l\tk]ee[pkz]", "s	eez"));
		
		// \(역슬래시)는 정규 표현식에서도 특수 문법으로 사용되기 때문에 \\를 적어야 그냥 역슬래시를 의미한다
		System.out.println(Pattern.matches("s[lhk]ee[pkz\\\\]", "slee\\"));
		
		/*
		 [abc] : a 또는 b 또는 c를 모두 허용
		 [a-z] : a 부터 z 까지 모두 허용
		 [A-Z] : A 부터 Z 까지 모두 허용
		 [a-e&&c-g] : a-e 와 c-g를 모두 만족시키는 문자를 허용
		 */
		
		System.out.println(Pattern.matches("s[c-kC-K]eep", "sdeep"));
		
		/*
		 # 하나로 여러 문자를 나타내는 것들
		 . : 모든 문자를 허용한다 [.]이나 \.은 그냥 점을 나타낸다
		 \d : 모든 숫자
		 \D : 숫자를 제외한 모든것
		 \s : 모든 공백 (\t,\n, ,\r)을 허용
		 \S : 공백을 제외한 모든 것을 허용
		 \w : 일반적인 문자들을 허용 [a-zA-Z0-9_]
		 \W : \w을 제외한 모즌 것을 허용
		 */
		System.out.println(Pattern.matches("s.eep", "s*eep"));
		System.out.println(Pattern.matches("s[.]eep", "s.eep"));
		System.out.println(Pattern.matches("s\\.eep", "s.eep"));
		System.out.println(Pattern.matches("\\d\\d\\d", "124"));
		System.out.println(Pattern.matches("\\d\\d\\s\\d", "12 4"));
		System.out.println(Pattern.matches("\\d...", "1lee"));
		
		/*
		 # 해당 패턴이 적용 될 문자의 개수를 지정하는 방법
		 .{n} : {}앞의 패턴이 n개 일치해야 한다
		 .{n,m} : {}앞의 패턴이 n개 이상 m개 이하 일치해야 한다
		 .{n,} : {}앞의 패턴이 n개 이상 일치해야 한다
		 .? : ?앞의 패턴이 0번 또는 1번나와야 한다
		 .+ : +앞의 패턴이 최소 1번 이상 나와야 한다
		 .* : *앞의 패턴이 0번 이상 나와야 한다
		 */
		System.out.println(Pattern.matches("\\d{5}", "12345"));
		System.out.println(Pattern.matches("\\d{2,5}", "12"));
		System.out.println(Pattern.matches("\\d{2,5}", "12345"));
		System.out.println(Pattern.matches("\\d{5,}", "123456789"));
		System.out.println(Pattern.matches("abc[JQK]?", "abc"));
		System.out.println(Pattern.matches("abc[JQK]?", "abcJ"));
		System.out.println(Pattern.matches("abc[JQK]?", "abcJQ"));
		System.out.println(Pattern.matches("abc[JQK]+", "abcJQKJQK"));
		System.out.println(Pattern.matches("abc[JQK]+", "abc"));
		System.out.println(Pattern.matches("abc[JQK]*", "abc"));
		
		// 연습1 : 해당 문자열이 핸드폰 번호인지 검사할 수 있는 정규표현식을 만들어보세요
		// 연습2 : 해당 문자열이 이메일인지 검사할 수 있는 정규표현식을 만들어보세요
		System.out.println("연습1-------------------------------------------------");
		System.out.println(Pattern.matches("010-\\d{4}-\\d{4}", "010-1234-1234"));
		System.out.println("연습2-------------------------------------------------");
		System.out.println(Pattern.matches(".+@[a-zA-Z]+[.][a-zA-Z]{2,3}[.]*[a-zA-Z]*", "think95@naver.com"));
		System.out.println(Pattern.matches(".+@[a-zA-Z]+[.][a-zA-Z]{2,3}[.]*[a-zA-Z]*", "k_3@korea.go.kr"));
		System.out.println(Pattern.matches(".+@[a-zA-Z]+[.][a-zA-Z]{2,3}[.]*[a-zA-Z]*", "abc@test.co.kr"));
		
		
		// 연습1 : 해당 문자열이 핸드폰 번호인지 검사할 수 있는 정규표현식을 만들어보세요
		// 연습2 : 해당 문자열이 이메일인지 검사할 수 있는 정규표현식을 만들어보세요
		System.out.println("연습1 강사님 풀이-------------------------------------------------");
		System.out.println(Pattern.matches("01[016-9]-\\d{3,4}-\\d{4}", "017-1234-1234"));
		System.out.println(Pattern.matches("01[016-9]-\\d{3,4}-\\d{4}", "010-123-1234"));
		System.out.println("연습2 강사님 풀이-------------------------------------------------");
		String email = "abc@test.co.kr";
		System.out.println(Pattern.matches("\\w+@\\w+\\.[a-zA-Z]+(\\.[a-zA-Z]+)*", email));
		
		
		// Matcher 클래스 사용하기
		String text = "apple/banana/orange/kiwi/pineapple/grape/grapeapple/mango";
		
		// 1. 정규표현식을 컴파일하여 패턴 인스턴스를 생성
		Pattern applePattern = Pattern.compile("apple");
		
		// 2. 해당 패턴 인스턴스로 문자열을 검사
		Matcher matchResult = applePattern.matcher(text);
		
		// 3. 매치 결과를 반복문을 활용해 모두 탐색할 수 있다
		while (matchResult.find()) {
			System.out.println("찾은 것: " + matchResult.group());
			System.out.println("시작 인덱스: " + matchResult.start());
			System.out.println("마지막 인덱스: " + matchResult.end());
		} 
		
		
		
		Pattern applePattern1 = Pattern.compile("(\\w+)(apple)");
		
		Matcher matchResult1 = applePattern1.matcher(text);
		
		while (matchResult1.find()) {
			System.out.println("Group 0 (전체)===============================");
			System.out.println("찾은 것: " + matchResult1.group(0));
			System.out.println("시작 인덱스: " + matchResult1.start(0));
			System.out.println("마지막 인덱스: " + matchResult1.end(0));
			
			System.out.println("Group 1 (정규 표현식의 첫번째 괄호)===============");
			System.out.println("찾은 것: " + matchResult1.group(1));
			System.out.println("시작 인덱스: " + matchResult1.start(1));
			System.out.println("마지막 인덱스: " + matchResult1.end(1));
			
			System.out.println("Group 2 (정규 표현식의 두번째 괄호)===============");
			System.out.println("찾은 것: " + matchResult1.group(2));
			System.out.println("시작 인덱스: " + matchResult1.start(2));
			System.out.println("마지막 인덱스: " + matchResult1.end(2));
		} 
		
		
		
		
		
		
		
		
		
	}
}
