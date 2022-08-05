
public class B01_Operator01 {
	
	
	/*
	 	# 연산자 (Operator)
	 	- 계산할 떄 사용하는 것
	 	- 산술 연산자 (+,-,*,/,%)
	 	- 비교 연산자 (<,>,<=,>=)
	 	- 논리 연산자 (&&, ||, !)
	 	- 비트 연산자 (&, |, ^, 이해하기 어려움)
	 	
	 	# 산술 연산자
	 	+ : 더하기
	 	- : 뼤기
	 	* : 곱하기
	 	/ : 나누기
	 	% : 나머지
	 */
	
	public static void main(String[] args) {
		int a = 33, b = 8;
		double c = 33, d = 8;
		
		System.out.println(" a + b = " + (a + b));
		System.out.println(" a - b = " + (a - b));
		System.out.println(" a * b = " + a * b);
		
		// 정수끼리의 나누기는 몫만 구한다
		System.out.println(" a / b = " + a / b);
		
		System.out.println();
		
		//정수와 실수를 나누면 정확한 값을 계산한다
		System.out.println(" a / c = " + a / c);
		System.out.println(" a / d = " + a / d);
		System.out.println(" c / d = " + c / d);
		
		//나머지 연산
		System.out.println(" a % b = " + a % b);
		
		System.out.println();
		
		// n으로 나눈 나머지는 0부터 n-1까지 밖에 나올 수 없다
		System.out.println(" 19 % 10 = " + 19 % 10);
		System.out.println(" 20 % 10 = " + 20 % 10);
		System.out.println(" 21 % 10 = " + 21 % 10);
		System.out.println(" 22 % 10 = " + 22 % 10);
		System.out.println("제곱 (사실 아님) : " + (a ^ b));
		
		System.out.println();
		
		// XOR 연산이다 제곱 아님
		
		
		// # 산술 연산 함수들
		
		// Math.pow(a, b) : a 제곱 b를 구한다
		System.out.println("제곱 : " + Math.pow(a, b));
		
		// 제곱근 : Math.sqrt(a) : a의 제곱근을 구해서 반환한다. 루트 25 = 5 
		System.out.println("제곱근 : " + Math.sqrt(a));
		
		// 절대값 : 무조건 양수로 나옴, Math.abs(a) : a의 절대값을 구한다
		System.out.println("절대값 : " + Math.abs(-8));
		
		// Math.round(a) : a를 소수 첫째 자리에서 반올림한 결과를 반환한다 
		System.out.println("반올림 : " + Math.round(1.5555));
		double result = Math.round(1.5555);
		System.out.println("반올림 : "+result);
		
		System.out.println();
		// Math.round()로 원하는 자릿수에서 반올림하기
		// - 반올림하고 싶은 자리를 소수 첫번째 자리로 만든 후 다시 나눈다
		double value = 123.77777777;
		System.out.println("반올림(1) : "+ value);
		System.out.println("반올림(2) : "+ value * 100);
		System.out.println("반올림(3) : "+ Math.round(value * 100));
		System.out.println("반올림(4) : "+ Math.round(value * 100) / 100.0);
		
		System.out.println();
		System.out.println("올림 : " + Math.ceil(1.111));
		System.out.println("내림 : " + Math.floor(1.999));
		System.out.println("둘 중 더 큰 숫자 반환 : " + Math.max(10,15));
		System.out.println("둘 중 더 큰 숫자 반환 : " + Math.max(a,b));
		System.out.println("둘 중 더 작은 숫자 반환 : " + Math.min(-3,-55));
	}
}
