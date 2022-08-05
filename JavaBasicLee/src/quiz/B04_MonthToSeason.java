package quiz;

import java.util.Scanner;

public class B04_MonthToSeason {
	/*
	 사용자로부터 몇 월인지 입력받으면 해당하는 계절을 출력해보세요
	 (반드시 switch-case문을 이용하시오)
	 */
	public static void main(String[] args) {

		System.out.println("몇 월인지 입력하시오 > ");

		int month;
		String season;

		switch (month = new Scanner(System.in).nextInt()) {
		case 1: case 2: case 12:
			season = "겨울";
			break;
		case 3: case 4: case 5:
			season = "봄";
			break;
		case 6: case 7: case 8:
			season = "여름";
			break;
		case 9: case 10: case 11:
			season = "가을";
			break;
		default:
			season = "모름";
			break;
		}
		System.out.printf("%d월은 %s 입니다.\n", month, season);
	}

}
