package quiz;

public class B11_WhileQuiz {
	/*
	 while문만 사용하시오
	 
	 1. 500 ~ 1200 사이에 있는 모든 3의 배수의 총합
	 2. 30부터 1까지 한 줄에 숫자를 5개씩 출력
	 3. 1부터 200까지의 숫자중에 2의배수도 아니고 3의배수도 아닌 숫자들의 총합
	 
	 */
	public static void main(String[] args) {

//		1. 500 ~ 1200 사이에 있는 모든 3의 배수의 총합
		int i = 500;
		int sum = 0;
		while (1200 >= i) {
			if (i % 3 == 0) {
				sum += i;
			}
			++i;
		}
		System.out.println("500 ~ 1200 사이에 있는 모든 3의 배수의 총합 : " + sum);
		System.out.println();
//		2. 30부터 1까지 한 줄에 숫자를 5개씩 출력
		int i1 = 30;
		int count = 0;
		while (i1 >= 1) {

			System.out.printf("%-2d ", i1);
			if (count++ % 5 == 4) {
				System.out.println();
			}
			--i1;
		}
		System.out.println();
//		3. 1부터 200까지의 숫자중에 2의배수도 아니고 3의배수도 아닌 숫자들의 총합
		int i2 = 1;
		int sum1 = 0;
		while (i2 <= 200) {
			if (i2 % 2 != 0 && i % 3 != 0) {
				sum1 += i2;
			}
			++i2;
		}
		System.out.println("총합 : " + sum1);
	}

}
