import java.lang.invoke.CallSite;

public class D04_WrapperClass {
	/*
	 # WrapperClass
	 - 기본 타입들을 참조형 타입으로 사용하기 위해 감싸놓은 클래스들
	 - 각 기본 타입들에 대한 유용한 기능들이 모여있다
	 
	 # 기본형 타입들
	 - byte, short, char, int, long, float, double, boolean
	
	# 참조형 타입들
	 - Byte, Short, Character, Integer, Long, Float, Double, Boolean
	 */
	public static void main(String[] args) {
		/*
		 # parsing
		 - 문자열을 해당 타입 값으로 변환하는 것
		 - 각 Wrapper 클래스에 알밪는 메서드가 존재한다
		 */
		int num = Integer.parseInt("55551234");
		System.out.println(num);
		num = Integer.parseInt("1000101010", 2); // radix : 진법
		System.out.println(num);
		num = Integer.parseInt("김철수/101011/A+", 4, 10, 10);
		System.out.println(num);
		
		float value = Float.parseFloat("123.12345678");
		System.out.println(value);
		
		boolean isParsing = Boolean.parseBoolean("true"); // true 아니면 다 false나옴
		System.out.println(isParsing);
		boolean isParsing1 = Boolean.parseBoolean("abcd");
		System.out.println(isParsing1);
		
		/*
		 # toString
		 - 각 타입의 값을 문자열로 변환하는 기능
		 */
		String data = Integer.toString(12345678);
		System.out.println(data);
		String data1 = Integer.toString(12345678,2); // 2진법
		System.out.println(data1);
		String data2 = Integer.toString(12345678,16); // 16진법
		System.out.println(data2);
		
		
		// 각 타입의 상수들
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE / 8 + "bytes");
		
		System.out.println(Character.MAX_CODE_POINT);
		System.out.println(Character.MAX_RADIX);
		System.out.println((int)Character.MAX_VALUE);
		System.out.println((int)Character.MIN_VALUE);
		System.out.println(Character.SIZE / 8 + "bytes");
		
		
		// Character에는 문자를 편하게 다룰 수 있는 메서드들이 많이 있다
		System.out.println(Character.isAlphabetic('김')); // 문자인지 확인
		System.out.println(Character.isAlphabetic('3')); // 문자인지 확인
		System.out.println(Character.isAlphabetic('_')); // 문자인지 확인
		
		// 해당 문자의 타입을 알려주는 메서드
		System.out.println(Character.getType('A'));
		System.out.println(Character.UPPERCASE_LETTER);
		
		// 공백이면 true인 메서드
		System.out.println( Character.isSpaceChar(' '));
		System.out.println( Character.isSpaceChar('\t'));
		System.out.println( Character.isSpaceChar('\n'));
		
		// 대/소문자를 구분해주는 메서드
		System.out.println("A는 대문자입니까? ");
		System.out.println( Character.isUpperCase('A'));
		System.out.println("a는 소문자입니까? ");
		System.out.println( Character.isLowerCase('a'));
		
		// 숫자 문자인지 구분해주는 메서드
		System.out.println("0은 숫자인가요? " + Character.isDigit('0'));
		System.out.println("A는 문자인가요? " + Character.isDigit('A'));
		
		// 자바의 변수명 첫번째로 사용할 수 있는 문자인지 구분해주는 메서드
		System.out.println( Character.isJavaIdentifierStart('$'));
		System.out.println( Character.isJavaIdentifierStart('_'));
		System.out.println( Character.isJavaIdentifierStart(' '));
		System.out.println( Character.isJavaIdentifierStart('1'));
		
		
	}
}
