package myobj;

public class Son extends Player{

	public int weeklyPay;
	public String country;
	
	@Override
	public void infor(){
		System.out.println("====���� ����====");
		System.out.println("�Ҽ� : " + team);
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("���� : " + country);
		System.out.println("������: " + position);
		System.out.println("�� ��: " + foot);
		System.out.println("��ȣ : " + number);
		System.out.println("�ֱ� : " + weeklyPay + "��");
	}
	
}
