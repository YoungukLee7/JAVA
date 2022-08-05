import java.util.Date;

public class D11_Date {
	/*
	 # java.util.Date
	 - �ڹٿ��� �ð� �� ��¥�� �ٷ�� Ŭ����
	 - ������ ���� �Ǿ �޼���� �� ������� �ʴ´�
	 - �ַ� �ð� ���� ��Ƴ��� �뵵�� ����Ѵ�
	 */
	public static void main(String[] args) {
		// System.currentTimeMillis() : ������ ���н� Ÿ���� ���Ѵ�
		// ���н� Ÿ�� - 1970�� 1��1�� ���ķ� �ð��� �󸶳� �귶������ 1/1000�ʷ� ����
		System.out.println("���� �ð�: " + System.currentTimeMillis() + "ms");
		System.out.println("���� �ð�: " + System.currentTimeMillis() / 1000 + " s");
		System.out.println("���� �ð�: " + System.currentTimeMillis() / 1000 / 60 + " m");
		System.out.println("���� �ð�: " + System.currentTimeMillis() / 1000 / 60 / 60 + " h");
		System.out.println("���� �ð�: " + System.currentTimeMillis() / 1000 / 60 / 60 / 24+ " days");
		System.out.println("���� �ð�: " + System.currentTimeMillis() / 1000 / 60 / 60 / 24 / 365 + " years");
		
		// �ڵ� ����ð� �����ϱ�
		long begin = System.currentTimeMillis();
		
		for (int i = 0; i >= 0; i+=2000) {
			System.out.println(i);
		}
		System.out.println("����ð�: " + (System.currentTimeMillis() - begin) + "ms");
		
		Date now = new Date();
		System.out.println(now);

		// Date Ŭ������ ���� �޼������ ���̻� �ڹٰ� �������� �ʴ´�
		Date date = new Date(125,0,23);
		
		System.out.println("data: " + date);
		System.out.println("���� �ð��� date�� ����� �ð����� �� �ΰ���?" + now.after(date));
		System.out.println("���� �ð��� date�� ����� �ð����� �� �ΰ���?" + now.before(date));
		
		//�ð� �� ��¥�� �ٷ궧 longŸ���� �䱸�ϴ� �Ķ���ʹ� ��κ� ���н� Ÿ���� �ǹ��Ѵ�
		date.setTime(432422892L);
		System.out.println(date);
	}
}