package quiz;

import java.util.Scanner;

public class B02_ConditionQuiz2 {
	/*
	 1. char형 변수 a가 'q'또는 'Q'일때 true
	 2. char형 변수 b가 공백이나 탭이 아닐 때 true
	 3. char형 변수 c가 '0' ~ '9'일 때 true
	 4. char형 변수 d가 영문자(대문자 또는 소문자)일 때 true
	 5. char형 변수 e가 한글일 때 true
	 6. char형 변수 f가 일본어일 때 true
	 7. 사용자가 입력한 문자열이 exit일 때 true
	 */
	public static void main(String[] args) {
		// 1. char형 변수 a가 'q'또는 'Q'일때 true
		char a = 'q';
		System.out.println("1. ");
		System.out.println(a == 'q' || a == 'Q');
		
		// 2. char형 변수 b가 공백이나 탭이 아닐 때 true
		char b = 'a';
		System.out.println("2. ");
		System.out.println(!(b == ' ' || b == '\t'));
	    System.out.println(b != ' ' || b != '\t');
		
		// 3. char형 변수 c가 '0' ~ '9'일 때 true
		char c = '4';
		System.out.println("3. ");
		System.out.println(c >= '0' && c <= '9');
		
		// 4. char형 변수 d가 영문자(대문자 또는 소문자)일 때 true
		char d = 'A';
		System.out.println("4. ");
		System.out.println((d >= 'a' && d <= 'z') || (d >= 'A' && d <= 'Z'));
		
		// 5. char형 변수 e가 한글일 때 true
		// 한글 범위 : AC00 ~ D7A3
		char e = '랍';
		System.out.println("5. ");
		System.out.println(e >= 0XAC00 && e <= 0XD7A3);
		System.out.println(e >= 44032 && e <= 55203);
		System.out.println(e >= '가' && e <= '힣');
		
		// 6. char형 변수 f가 일본어일 때 true
		// 히라가나 범위 : 3040 ~ 309F
		char f = 'ㅁ';
		System.out.println("6. ");
		System.out.println(f >= 0x3040 && f <= 0x309F);
		
		// 7. 사용자가 입력한 문자열이 exit일 때 true
		Scanner sc = new Scanner(System.in);
		System.out.println("7. exit를 입력하시오 > ");
		
		String name1 = sc.next();
		String name2 = "exit";
		
		System.out.println(name1.equals(name2));
		/*
		 String name1 = new Scanner(System.in).next();
		 
		 System.out.println(name1.equals("exit"));
		 */
	}

}
