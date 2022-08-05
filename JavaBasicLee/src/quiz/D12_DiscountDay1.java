package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class D12_DiscountDay1 {
	/*
	 * 어떤 가게에서 할인 행사를 홀수번째 목요일에만 진행한다고 한다 
	 * 1. 년도와 월을 입력하면 해당 월의 모든 할인 날짜를 출력해주는 메서드
	 * 2. 년도를 입력하면 해당 년의 모든 할인 날짜를 출력해주는 메서드
	 * 강사님 풀이
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
					System.out.println(sdf.format(cal.getTime()) + ": " + thurCnt + "번째 목요일임으로 행사 입니다.");
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
		
		// 1. 년 월 일 설정
		cal.set(year, month - 1, 1);
		// 2. 요일 설정
		cal.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
		// 3. 몇 번째 요일인지 설정
		int max = cal.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH);
		for (int dowin = 1; dowin <= max; dowin += 2) {
			cal.set(Calendar.DAY_OF_WEEK_IN_MONTH, dowin);
			System.out.println(sdf.format(cal.getTime()) + "는 이벤트 날입니다.");
		}
		
		
		// getActualMaximum() : 현재 상태에서 해당 필드의 최대값을 구해준다
		// System.out.println(cal.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH));
	}
	public static void main(String[] args) {
		printYearEventDays(2022);
		
		printMonthEventDays(2022, 7);
	}
}
