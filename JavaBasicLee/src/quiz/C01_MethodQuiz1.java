package quiz;

import java.util.Arrays;

public class C01_MethodQuiz1 {
	/*
	 # 다음 메서드를 정의하고 올바르게 동작하는지 테스트 해보세요
	 1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
	 2. 전달한 숫자가 3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
	 3. 숫자를 하나 전달하면 문자열 "짝수입니다" 또는 "홀수입니다"를 반환하는 함수
	 4. 숫자를 전달하면 해당 숫자의 모든 약수를 배열 형태로 반환하는 함수
	 5. 전달한 정수가 소수라면 true를 반환, 아니면 false를 반환하는 함수
	 6. 숫자를 전달하면 해당 숫자의 팩토리얼 결과를 반환하는 함수
	 	factorial : (n)*(n-1)*(n-2)...3*2*1
	 	강사님 풀이
	 */
	
	public static boolean isalphabet(char ch) {
		return (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z');
	}
	
	public static boolean isTriple(int num) {
		return num % 3 == 0;
	}
	
	public static String holjjak(int num) {
		return num % 2 == 0 ? "짝수입니다" : "홀수입니다";
	}
	
	public static int yaksuCnt(int num) { // 약수 개수를 세는 함수
		int cnt = 0;
		//1이랑 자기 자신을 제외하고 개수 측정
		for (int i = 2; i < num; i++) {
			if (num % i ==0) {
				++cnt;
			}
		}
		return cnt + 2;
	}
	
	public static int[] yaksu(int num) { // 약수 배열을 생성하여 반환하는 함수(매서드) 
		int[] yaksu = new int [yaksuCnt(num)];
		
		int index = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i ==0) {
				yaksu[index++] = i;
			}
		}
		return yaksu;
	}
	
	public static boolean isprime (int num) {
		double sqrt = Math.sqrt(num);   // 소수인지 확인할때 끝가지 안보고 절반만 보려고 Math.sqrt 써준다
		for (int i = 2; i < num; i++) { 
			if (num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	 // 재귀 함수라고 한다 (recursive)
	// - 자기 자신을 불러서 사용하는 함수
	// - 탈출구를 만들어 놓지 않으면 계속해서 호출하다 스택 오버플로우를 일으킨다
	// - 스택 오버플로우 : 한번에 너무 많은 함수를 호출해서 발생하는 애러
	// - 성능은 일반 함수에 비해 떨어지지만 반드시 필요한 경우가 존재한다
	// - 끝이 정해지지 않은 로직의 경우 이것을 사용한다
	public static int refac(int num) { 

		System.out.printf("refac(%d)\n",num);
		
		if (num < 1) { 
			return -1; // 리턴값을 -1로 해서 잘못된 입력을 했다고 표시한다
		}else if (num == 1) { 
			return 1;
		} else {
			return num * refac(num - 1); // refac(num - 1) 해결 안되서 반복한다 -6000까지 반복하며 스택 오버플로우 발생
		}
	}
	
	public static int factorial(int num) {
		int f = num;
		
		System.out.printf("%d x ",num);
		for (int i = num - 1; i > 1; --i) {
			System.out.printf("%d x ",i);
			f *= i;
		}
		System.out.printf("1 = %d\n",f);
		
		return f;
	}
	
	public static void main(String[] args) {

		System.out.println("1번");
		System.out.println(isalphabet('A'));
		
		System.out.println("2번");
		System.out.println(isTriple('9'));
		
		System.out.println("3번");
		System.out.println(holjjak('6'));
		
		System.out.println("4번");
		System.out.println(yaksuCnt(50));
		System.out.println(Arrays.toString(yaksu(50)));
		
		System.out.println("5번");
		System.out.println(isprime(623987753));
		
		System.out.println("6번");
		System.out.println(factorial(9));
		
		System.out.println(refac(9));
	}

}
