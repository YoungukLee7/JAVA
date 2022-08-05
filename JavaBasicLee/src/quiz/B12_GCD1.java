package quiz;

import java.util.Random;

public class B12_GCD1 {
	/*
 	랜덤으로 생성된 두 숫자의 최대공약수를 구하시오
 	강사님 풀이
 */
	public static void main(String[] args) {

		// Integer.MAX_VALUE : 정수의 최대값 (4byte 정수의 최대 양수값) 음수는 안나옴
		int a = (int)(Math.random() * Integer.MAX_VALUE);
		int b = (int)(Math.random() * Integer.MAX_VALUE);
		
//		Random random = new Random();
//		int a = Math.abs(random.nextInt());
//		int b = Math.abs(random.nextInt());
		
		int min = Math.min(a, b);
		
		/*
		 # 삼항 연산자
		 
		 - 비교 ? 예 : 아니오
		 
		 */
		min = a < b ? a:b;
		
		int gcd = 1;
		
		for (int i = min; i > 0; i--) {
			if (a%i == 0 && b%i == 0) {
				System.out.println("최대 공약수 : " + i);
				gcd = i;
				break;
			}
		}
		System.out.printf("%d와 %d의 최대공약수는 %d입니다.\n",a,b,gcd);
	}

}
