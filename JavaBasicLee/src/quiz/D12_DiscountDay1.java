package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class D12_DiscountDay1 {
	/*
	 * � ���Կ��� ���� ��縦 Ȧ����° ����Ͽ��� �����Ѵٰ� �Ѵ� 
	 * 1. �⵵�� ���� �Է��ϸ� �ش� ���� ��� ���� ��¥�� ������ִ� �޼���
	 * 2. �⵵�� �Է��ϸ� �ش� ���� ��� ���� ��¥�� ������ִ� �޼���
	 * ����� Ǯ��
	 */
	public static void printYearEventDays(int year) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E", Locale.US);
		Calendar cal = Calendar.getInstance();
		
		cal.set(year, 0, 1, 0, 0, 0);
		
		int thurCnt = 1;
		while (cal.get(Calendar.YEAR) == year) {
			// System.out.println(sdf.format(cal.getTime()));
			
			if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY) {
				
				if (thurCnt % 2 == 1) {
					System.out.println(sdf.format(cal.getTime()) + ": " + thurCnt + "��° ����������� ��� �Դϴ�.");
				}
				thurCnt++;
			};
			
			int month = cal.get(Calendar.MONTH);
			cal.add(Calendar.DATE, 1);
			
			if (month != cal.get(Calendar.MONTH)) {
				thurCnt = 1;
			}
		}
	}
	public static void printMonthEventDays(int year, int month) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E", Locale.US);
		Calendar cal = Calendar.getInstance();
		
		// 1. �� �� �� ����
		cal.set(year, month - 1, 1);
		// 2. ���� ����
		cal.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
		// 3. �� ��° �������� ����
		int max = cal.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH);
		for (int dowin = 1; dowin <= max; dowin += 2) {
			cal.set(Calendar.DAY_OF_WEEK_IN_MONTH, dowin);
			System.out.println(sdf.format(cal.getTime()) + "�� �̺�Ʈ ���Դϴ�.");
		}
		
		
		// getActualMaximum() : ���� ���¿��� �ش� �ʵ��� �ִ밪�� �����ش�
		// System.out.println(cal.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH));
	}
	public static void main(String[] args) {
		printYearEventDays(2022);
		
		printMonthEventDays(2022, 7);
	}
}
