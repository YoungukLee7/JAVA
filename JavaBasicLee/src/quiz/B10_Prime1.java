package quiz;

import java.util.Scanner;

import javax.sql.rowset.JoinRowSet;

public class B10_Prime1 {
	/*
	 사용자로부터 숫자(양수)를 입력 받으면 1부터 입력한 숫자 사이에 존재하는 모든 소수를 출력하시오
	 사용자가 음수로 입력받는 경우 다시 제대로 입력하게 만들기
	 
	 # 소수 : 나누어 떨어지는 수가 1과 자기 자신밖에 없는 수
	 ex) 2 3 5 7 11 13 17 19
	 
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		for (;;) {
			System.out.println("2이상의 숫자를 입력해주세요 >> ");
			num = sc.nextInt();
			
			if (num >2 ) {
			System.out.println("잘 하였습니다");
				break;
			}
			System.out.println("다시 입력하세요");
		}
//		Scanner sc = new Scanner(System.in);
//		
//		int num;
//		
//		System.out.println("2이상의 숫자를 입력해주세요 >> ");
//		for (num = sc.nextInt(); num < 2; num = sc.nextInt()) {
//			System.out.println("다시 입력하시오" + num);
//			System.out.println("2이상의 숫자를 입력해주세요 >> ");
//		}
//		System.out.print("숫자가 제대로 입력되었습니다. ");
		
		/*
			 1. 1부터 자기 자신까지 나눴을 때 약수가 2개라면 소수다
			 2. 2부터 자기 자신 바로 전까지 니눴을때 약수가 0개면 소수다
			 3. 2부터 해당 숫자의 제곱근까지 나눴을 때 약수가 0개라면 소수다.
			 4. 입력 값이 100이라 했을때 약수는 1 2 4 5 10 20 25 50 100 이면 
			  - 가운데 10만 사용하면 되니까 이것을 루트 10이라고 한다
			 5. 핸드폰 사진에 boolean으로 푼 방법이 있다.
		 */
		
//		사용자로부터 숫자(양수)를 입력 받으면 1부터 입력한 숫자 사이에 존재하는 모든 소수를 출력하시오
		for (int i = 2; i <= num; i++) {
			int cnt = 0;
			double sqrt = Math.sqrt(i); // 미리 계산해 주면 더 좋다
			for (int test = 2; test < sqrt; test++) {
				if (i % test==0) {
					++cnt;
					break;
				}
			}
			if (cnt == 0) {
				System.out.printf("%d는 소수입니다.\n",i);
			} 
			cnt = 0;
		}
		
	}

}
