
public class A04_VarTypes {
	
	/*
	 #정수 타입
	 - byte	(1byte,  8bit)
	 - 2^8(256)개의 값을 저장할 수 있다
	 - byte 타입은 숫자로 표현하면 -128 ~ 127 까지의 정수를 표현할 수 있다
		 
		 0000 0000 : 0
		 0000 0001 : 1
		 0000 0010 : 2
		 ...
		 0111 1111 : 127
		 1000 0000 : -128
		 1000 0001 : -127
		 1000 0010 : -126
		 ...
		 1111 1110 : -2
		 1111 1111 : -1
		 0000 0000 : 0

	 - short(2byte, 16bit)
	 - 숫자로 2^16(65536)개 표현 할 수 있다 (숫자로 표현하면 -32768 ~ 32767)
	 
	 - char (2byte, 16bit)
	 - 숫자로 2^16(65535)개 표현 할 수 있다 (숫자로 표현하면 0 ~ 65535)
	 - 문자여서 양수만 표현 가능하다. 부호비트를 사용하지 않음
	 - 문자코드를 저장할 때 사용하는 타입이다
	 
	 - int	(4byte, 32bit)
	 - 숫자로 2^32(4,294,967,296)개 표현 할 수 있다 (숫자로 표현하면 -9223372036854775808 ~ 9223372036854775807)
	 
	 - long	(8byte, 64bit)
	 - 숫자로 2^64(아주 많음)개 표현 할 수 있다
	 
	 #실수 타입
	 
	 - float (4byte)
	 - double(8byte)
	 
	 #참/거짓 타입
	 
	 - boolean
	 - 참과 거짓을 표현할 때 사용하는 타입
	 - 변수에 저장 할 수 있는 값은 true와 false밖에 없다
	 
	 #참조형 타입 (클래스)
	 
	 -String
	 -그 외 대문자로 시작하는 모든 타입들...(내가 만들 수 있기 때문에 많다)
	 */
	
	public static void main(String[] args) {
		
		// 각 타입의 크기에 따라 최대, 최소값이 가능하기도 불가능하기도 한다
		byte b1, b2, b3;
		b1 = 127;
		b2 = -128;
		// b2 = 128;  (오류남)
		
		short s1, s2, s3;		
		s1 = 32767;
		s2 = -32768;
		// s3 = 32768; (오류남)
		
		// char타입에는 정수값을 저장하지만 출력할 때에는 문자로 출력한다
		char c1, c2;
		c1 = 65;
		c2 = 'a';
		System.out.println(c1);
		System.out.println(c2);
		
		// 그냥 소수만 적는것은 기본적으로 double타입 리터럴이다.
		// float타입 리터럴을 적기 위해서는 뒤에 F를 붙여야 한다.
		// double은 8byte고 float은 4byte이기 때문에 8byte값을 4byte에 넣으려고 할때 에러가 발생한다
		float f1 = 123.1234F;
		double d1 = 123.1234;
		
		// 그냥 정수는 기본적으로 int타입 리터럴이기 때문에 뒤에 L을 붙여야 long타입 리터럴이 된다
		// int의 범위를 벗어나는 아주 큰거나 아주 작은 리터럴을 사용하고 싶을때에는 L을 붙인다
		int i1 = 1_000_000_000;
		long l1 = 1_000_000_000L;
		
		// boolean 타입 변수에 저장 할 수 있는 값은 true와 false밖에 없다
		boolean ateLunch = false;
		boolean programer = true;
		boolean wearGlasses = true;
		
		String messageString = "환영합니다";
		System.out.println(messageString);
	}

}
