
public class A02_ASCII {
	
	/*
	 # ASCII 코드
	 - 숫자 0 ~ 127번까지 대응하는 문자들를 ASCII 코드라고 한다
	 - 'A' -> 65, 'a' -> 97, '0' -> 48 (외우기)
	 */
	public static void main(String[] args) {
	
	/*
	 모든 데이터는 실제로 0과1로 변환되어 저장된다
	 문자는 바로 0과 1로 변환할 수 없기 때문에 문자에 해당하는 숫자값이 존재한다
	 
	 그 값들 중 0 ~ 127번 까지를 ASCII 코드라고 한다
	 65 - 'A'
	 97 - 'a'
	 
	 10진법 : 10 ---encoding----> 2진법 : 1010
	    A -> 65 ---encoding----> 0100 0001
	    B -> 66 ---encoding----> 0100 0010
	  
	  0100 0001 ---decoding---> A 
	  0100 0010 ---decoding---> B 
	    
	 */
		
	System.out.println("abcdefg!!");
	System.out.println('0'); // 문자 0 - 실제로는 48이라는 값을 가지고 있음
	System.out.println(0); // 숫자 0 - 실제로도 0
	
	// 문자 타입 리터럴의 실제 값을 보고 싶다면 앞에 (int)를 붙인다
	System.out.println((int)'0');
	System.out.println((int)'A');
	
	// 숫자 타입 리터럴의 문자 형태를 보고 싶다면 앞에 (char)를 붙인다
	System.out.println((char)97);
	System.out.println((char)122);
	
	// 문자 타입 리터럴도 실제로는 숫자값(코드값)을 가지고 있어 계산 가능하다
	System.out.println('A' + 100); // 결과는 기본적으로 숫자다
	System.out.println((char)('A' + 20)); // A로부터 20번째 뒤에 있는 문자를 찾는 방법
	System.out.println((char)('Z' - 13)); // Z로부터 13번째 앞에 있는 문자를 찾는 방법
	System.out.println('A' - 'a'); // 대문자와 소문자의 거리 (대문자와 소문자를 변환하기 위한 거리)
	System.out.println((char)('k' + ('A' - 'a'))); // 소문자 k를 대문자 K로 변환
	System.out.println('L' - 'A'); // 몇 번째 알파벳인지 알아낼 수 있음
	
	// 문자열은 문자가 여러개 저장될 수 있는 타입이기 때문에 숫자코드로 변환할 수 없다
	System.out.println("A" + 10);
	
	
	}

}
