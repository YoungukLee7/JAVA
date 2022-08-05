package quiz;

import java.util.Calendar;

public class D12_DiscountDay {
	/*
	 * � ���Կ��� ���� ��縦 Ȧ����° ����Ͽ��� �����Ѵٰ� �Ѵ� 
	 * 1. �⵵�� ���� �Է��ϸ� �ش� ���� ��� ���� ��¥�� ������ִ� �޼���
	 * 2. �⵵�� �Է��ϸ� �ش� ���� ��� ���� ��¥�� ������ִ� �޼���
	 */
	public static void main(String[] args) {

		Discount discount = new Discount();

		System.out.println("2023�� 7��===============================");
		discount.discountYearMonth(2023, 7);
		
		System.out.println("2023��==================================");
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
				System.out.printf("%d�� %d�� %d�� �����\n", now.get(Calendar.YEAR), now.get(Calendar.MONTH) + 1, now.get(Calendar.DATE));
			}
		}
	}

	public void discountYear(int year) {
		now = Calendar.getInstance();

		for (int i = 0; i < 12; i++) {
			for (int j = 1; j < 32; j++) {
				now.set(year, i, j);
				if (now.get(Calendar.DAY_OF_WEEK) == 5 && now.get(Calendar.DATE) % 2 != 0) {
					System.out.printf("%d�� %d�� %d�� �����\n", now.get(Calendar.YEAR), now.get(Calendar.MONTH) + 1, now.get(Calendar.DATE));
				}
			}
		}
	}
}
















