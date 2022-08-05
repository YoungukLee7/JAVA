import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class D12_Calender {
	/*
	 # java.util.Calender
	 - 달력을 구현한 클래스
	 - 날짜 및 시간을 쉽게 계산 할 수 있는 다양한 기능들이 모여있다
	 - 생성자 대신 getInstance()라는 스태틱 메서드를 사용한다
	 - 타임존을 설정해 다른 국가의 시간도 알수 있다
	 
	 # getTime()
	 Calendar now = Calendar.getInstance(); 이렇게 하고 now값을 프린트 하면 보기 힘든 형태로 나온다
	 getTime()을 하여 보기 좋게 만든다 (다른 기능은 없다)
	 */
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		System.out.println(now);
		
		// get(field) : 해당 인스턴스에서 원하는 필드의 값을 꺼낼 수 있다
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH) + 1); // 월은 0이 1월이다
		System.out.println(now.get(Calendar.DATE));
		System.out.println(now.get(Calendar.HOUR)); // HOUR: 12시 기준
		System.out.println(now.get(Calendar.HOUR_OF_DAY)); // HOUR_OF_DAY: 24시 기준
		System.out.println(now.get(Calendar.SECOND)); 
		System.out.println(now.get(Calendar.MILLISECOND)); 
		System.out.println(now.get(Calendar.DAY_OF_WEEK)); // DAY_OF_WEEK: 요일. 1~7까지 있고 일요일이 1
		
		// add(field, value): 해당 필드에 값을 더함 (음수 입력시 값이 갑소)
		now.add(Calendar.HOUR, 20);
		now.add(Calendar.DATE, -300);
		
		// set(field, value): 해당 필드값 수정
		now.set(Calendar.MONTH, 0);
		now.set(Calendar.MONTH, -3);
		
		Calendar cal2 = Calendar.getInstance();
		
		cal2.set(2022, 6, 50, 13, 50, 55);
		
		System.out.println("now가 cal2보다 뒤의 시간입니까? " + now.after(cal2));
		System.out.println("now가 cal2보다 앞의 시간입니까? " + now.before(cal2));
		
		
		System.out.printf("%d년 %d월 %d일 %d:%d:%d\n", 
				now.get(Calendar.YEAR),
				now.get(Calendar.MONTH) + 1,
				now.get(Calendar.DATE),
				now.get(Calendar.HOUR),
				now.get(Calendar.MINUTE),
				now.get(Calendar.SECOND));
		
		// Date를 쉽게 출력하기 위한 클래스
		// 언어를 지정하면 요일 등을 해당 언어로 표현할 수 있다 (Locale  클래스)
		
		//===========================================================================================================
		
		Calendar now2 = Calendar.getInstance(TimeZone.getTimeZone("Europe/Dublin"));
		
		System.out.println("더블린의 날짜: " + now2.get(Calendar.DATE));
		System.out.println("더블린의 시간: " + now2.get(Calendar.HOUR_OF_DAY));
		
		// SimpleDateFormat : Date를 쉽게 출력하기 위한 클래스
		
		// 언어를 지정하면 요일 등을 해당 언어로 표현할 수 있다 (Locale클래스 활용)
		SimpleDateFormat myDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss.SSS a EEEE",Locale.CANADA);
		
		
		// 타임존을 설장하면 원하는 국가의 시간으로 출력할 수 있다
		myDateFormat.setTimeZone(TimeZone.getTimeZone("Europe/Dublin"));
		/*
		 # SimpleDateFormat의 서식 문자들
		 y: 년
		 M: 월
		 d: 일
		 D: 일 (1 ~ 365)
		 H: 24시
		 h: 12시
		 m: 분
		 s: 초
		 S: 밀리초
		 E: 요일
		 a: 오전/오후
		 */
		
		// 시간대 변경하기 (TimeZone)
		
		// 사용 가능한 id들 보기
//		for (String id : TimeZone.getAvailableIDs()) {
//			System.out.println(id);
//		}
		
		
		
		// SimpleDateFormat에는 Date타입 또는 유닉스타임을 전달해야 한다
		// Calender의 getTime() 또는 getTimeMillis() 메서드를 활용한다
		String formatResult = myDateFormat.format(Calendar.getInstance().getTime());
		String formatResult1 = myDateFormat.format(1112312312312L);
		
		System.out.println(formatResult);
		System.out.println(formatResult1);
		
		
		
		String formatResult2 = myDateFormat.format(now2.getTime());
		System.out.println(formatResult2);
	}
}
