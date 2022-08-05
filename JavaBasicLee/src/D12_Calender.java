import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class D12_Calender {
	/*
	 # java.util.Calender
	 - �޷��� ������ Ŭ����
	 - ��¥ �� �ð��� ���� ��� �� �� �ִ� �پ��� ��ɵ��� ���ִ�
	 - ������ ��� getInstance()��� ����ƽ �޼��带 ����Ѵ�
	 - Ÿ������ ������ �ٸ� ������ �ð��� �˼� �ִ�
	 
	 # getTime()
	 Calendar now = Calendar.getInstance(); �̷��� �ϰ� now���� ����Ʈ �ϸ� ���� ���� ���·� ���´�
	 getTime()�� �Ͽ� ���� ���� ����� (�ٸ� ����� ����)
	 */
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		System.out.println(now);
		
		// get(field) : �ش� �ν��Ͻ����� ���ϴ� �ʵ��� ���� ���� �� �ִ�
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH) + 1); // ���� 0�� 1���̴�
		System.out.println(now.get(Calendar.DATE));
		System.out.println(now.get(Calendar.HOUR)); // HOUR: 12�� ����
		System.out.println(now.get(Calendar.HOUR_OF_DAY)); // HOUR_OF_DAY: 24�� ����
		System.out.println(now.get(Calendar.SECOND)); 
		System.out.println(now.get(Calendar.MILLISECOND)); 
		System.out.println(now.get(Calendar.DAY_OF_WEEK)); // DAY_OF_WEEK: ����. 1~7���� �ְ� �Ͽ����� 1
		
		// add(field, value): �ش� �ʵ忡 ���� ���� (���� �Է½� ���� ����)
		now.add(Calendar.HOUR, 20);
		now.add(Calendar.DATE, -300);
		
		// set(field, value): �ش� �ʵ尪 ����
		now.set(Calendar.MONTH, 0);
		now.set(Calendar.MONTH, -3);
		
		Calendar cal2 = Calendar.getInstance();
		
		cal2.set(2022, 6, 50, 13, 50, 55);
		
		System.out.println("now�� cal2���� ���� �ð��Դϱ�? " + now.after(cal2));
		System.out.println("now�� cal2���� ���� �ð��Դϱ�? " + now.before(cal2));
		
		
		System.out.printf("%d�� %d�� %d�� %d:%d:%d\n", 
				now.get(Calendar.YEAR),
				now.get(Calendar.MONTH) + 1,
				now.get(Calendar.DATE),
				now.get(Calendar.HOUR),
				now.get(Calendar.MINUTE),
				now.get(Calendar.SECOND));
		
		// Date�� ���� ����ϱ� ���� Ŭ����
		// �� �����ϸ� ���� ���� �ش� ���� ǥ���� �� �ִ� (Locale  Ŭ����)
		
		//===========================================================================================================
		
		Calendar now2 = Calendar.getInstance(TimeZone.getTimeZone("Europe/Dublin"));
		
		System.out.println("������ ��¥: " + now2.get(Calendar.DATE));
		System.out.println("������ �ð�: " + now2.get(Calendar.HOUR_OF_DAY));
		
		// SimpleDateFormat : Date�� ���� ����ϱ� ���� Ŭ����
		
		// �� �����ϸ� ���� ���� �ش� ���� ǥ���� �� �ִ� (LocaleŬ���� Ȱ��)
		SimpleDateFormat myDateFormat = new SimpleDateFormat("yyyy�� MM�� dd�� HH:mm:ss.SSS a EEEE",Locale.CANADA);
		
		
		// Ÿ������ �����ϸ� ���ϴ� ������ �ð����� ����� �� �ִ�
		myDateFormat.setTimeZone(TimeZone.getTimeZone("Europe/Dublin"));
		/*
		 # SimpleDateFormat�� ���� ���ڵ�
		 y: ��
		 M: ��
		 d: ��
		 D: �� (1 ~ 365)
		 H: 24��
		 h: 12��
		 m: ��
		 s: ��
		 S: �и���
		 E: ����
		 a: ����/����
		 */
		
		// �ð��� �����ϱ� (TimeZone)
		
		// ��� ������ id�� ����
//		for (String id : TimeZone.getAvailableIDs()) {
//			System.out.println(id);
//		}
		
		
		
		// SimpleDateFormat���� DateŸ�� �Ǵ� ���н�Ÿ���� �����ؾ� �Ѵ�
		// Calender�� getTime() �Ǵ� getTimeMillis() �޼��带 Ȱ���Ѵ�
		String formatResult = myDateFormat.format(Calendar.getInstance().getTime());
		String formatResult1 = myDateFormat.format(1112312312312L);
		
		System.out.println(formatResult);
		System.out.println(formatResult1);
		
		
		
		String formatResult2 = myDateFormat.format(now2.getTime());
		System.out.println(formatResult2);
	}
}
