package quiz;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

/*
 # 다음 메서드를 정의하고 올바르게 동작하는지 테스트 해보세요
 1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
 2. 전달한 숫자가 3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
 3. 숫자를 하나 전달하면 문자열 "짝수입니다" 또는 "홀수입니다"를 반환하는 함수
 4. 숫자를 전달하면 해당 숫자의 모든 약수를 배열 형태로 반환하는 함수
 5. 전달한 정수가 소수라면 true를 반환, 아니면 false를 반환하는 함수
 6. 숫자를 전달하면 해당 숫자의 팩토리얼 결과를 반환하는 함수
 	factorial : (n)*(n-1)*(n-2)...3*2*1
 */
public class C01_MethodQuiz {

	public static boolean alphabet(char a) {
		boolean real = true;
		if (a >= 'a' && a <= 'z' || a >= 'A' && a <= 'Z') {
			return true;
		} else {
			return false;

		}

	}

	public static boolean three_number(int a) {
		if (a % 3 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void choose(int a) {
		if ( a % 2 == 0) {
			System.out.println("짝수입니다");
			return;
		} else {
			System.out.println("홀수입니다");
		} return;
	}
	
	// 4. 숫자를 전달하면 해당 숫자의 모든 약수를 배열 형태로 반환하는 함수
	public static int[] number_array(int a) {
		int[] num = new int [a];
		int cnt = 0;
		for(int i = 1; i <= a; i++){
			if(a % i == 0){
				num[i-1] = i;
				cnt++;
		    }
		}
		
		int[] yaksu = new int[cnt];
		
		int index = 0;
		for (int i = 0; i < a; ++i) {
			if (num[i] != 0) {
				yaksu[index++] = num[i];
			}
		}
		
		return yaksu;
	}
	
	public static boolean prime_number(int a) {
		int count = 0;
		for (int i = 2; i <= a; i++) {
			if ( a % i == 0) {
				count++;
			}
		}
		if (count == 1) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("1번");
		System.out.println(alphabet('A'));
		
		System.out.println("2번");
		System.out.println(three_number(12));
		
		System.out.println("3번");
		choose(19);
		
		System.out.println("4번");
		System.out.println(Arrays.toString(number_array(50)));
		
		System.out.println("5번");
		System.out.println(prime_number(15));
		
		
	}
	
}
