package quiz;

import java.util.Calendar;

public class D12_DiscountDay {
	/*
	 * 어떤 가게에서 할인 행사를 홀수번째 목요일에만 진행한다고 한다 
	 * 1. 년도와 월을 입력하면 해당 월의 모든 할인 날짜를 출력해주는 메서드
	 * 2. 년도를 입력하면 해당 년의 모든 할인 날짜를 출력해주는 메서드
	 */
	public static void main(String[] args) {

		Discount discount = new Discount();

		System.out.println("2023년 7월===============================");
		discount.discountYearMonth(2023, 7);
		
		System.out.println("2023년==================================");
		discount.discountYear(2023);
	}
}



class Discount {

	Calendar now;

	int year;
	int month;

	public void discountYearMonth(int year, int month) {
		now = Calendar.getInstance();

		for (int i = 1; i < 32; i++) {
			now.set(year, month - 1, i);
			if (now.get(Calendar.DAY_OF_WEEK) == 5 && now.get(Calendar.DATE) % 2 != 0) {
				System.out.printf("%d년 %d월 %d일 목요일\n", now.get(Calendar.YEAR), now.get(Calendar.MONTH) + 1, now.get(Calendar.DATE));
			}
		}
	}

	public void discountYear(int year) {
		now = Calendar.getInstance();

		for (int i = 0; i < 12; i++) {
			for (int j = 1; j < 32; j++) {
				now.set(year, i, j);
				if (now.get(Calendar.DAY_OF_WEEK) == 5 && now.get(Calendar.DATE) % 2 != 0) {
					System.out.printf("%d년 %d월 %d일 목요일\n", now.get(Calendar.YEAR), now.get(Calendar.MONTH) + 1, now.get(Calendar.DATE));
				}
			}
		}
	}
}
















