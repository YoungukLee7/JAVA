package quiz;

import java.util.Iterator;
import java.util.Scanner;

public class B06_ForQuiz {
	/*
	 1. 100부터 300까지의 총합을 구해보세요
	 2. 1부터 2000 사이의 7의 배수만 출력해보시오
	 3. 1000부터 1500까지 10의 배수가 한줄에 10개씩 출력되도록 만들어 보세요
	 */
	public static void main(String[] args) {
		
		// 1. 100부터 300까지의 총합을 구해보세요
		
		int plus = 0;
		
		for (int i = 100; i <= 300; i++) {
			plus += i;
		}
		System.out.printf("100부터 300까지 합 : %d\n", plus);
		
		// 2. 1부터 2000 사이의 7의 배수만 출력해보시오
		
		for (int i = 1; i <= 2000; i++) {
			if (i%7==0) {
				System.out.printf("7의 배수만 출력 : %d\n", i);
			}	
		}
		
		// 3. 1000부터 1500까지 10의 배수가 한줄에 10개씩 출력되도록 만들어 보세요
		int x = 0;
		for (int i = 1000; i <= 1500; i++) {

			if (i % 10 == 0) {
				System.out.printf("10의 배수가 한줄에 10개씩 : %d, ", i);
				if (x % 10 == 9) {
					System.out.println();
				}
				x++;
			}
		}
	}
}
