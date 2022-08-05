package quiz;

import java.util.Scanner;

public class B03_AppleQuiz {
	/*
	 문제 : 사과를 10개씩 담을 수 있는 바구니가 있다
	 사과의 개수를 입력하면 사과를 모두 담기 위해 필요한
	 바구니의 개수를 알려주는 프로그램을 만들어보세요
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("구매 할 사과의 개수 > ");
		
		final int BASKET_SIZE = 10; //상수
		int apple_count = scanner.nextInt();
		int apple_basket;
		

		if(apple_count < 0) {
			// 사과의 개수가 비정상일 때
			System.out.println("잘못된 입력 값이다");
		} else  {
			// 사과의 개수가 정상일 때
			if (apple_count % BASKET_SIZE == 0)  {
				apple_basket = apple_count / BASKET_SIZE;
			} else {
				apple_basket = apple_count / BASKET_SIZE + 1;
			}
			System.out.printf("%d개의 사과는 %d개 바구니에 줄 수 있다.", apple_count, apple_basket );
		}
	}

}
