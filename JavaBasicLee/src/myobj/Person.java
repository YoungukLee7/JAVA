package myobj;

public class Person {

	public String name;
	public int age;
		
	public void sayHi() {
		if (age < 10) {
			System.out.println("�ȳ�? �� �̸��� " + name + "�̾�. ���̴� " + age + "���̾�");
		} else if (age < 20) {
			System.out.println("�ȳ��ϼ���! �� �̸��� " + name + "�Դϴ�.");
		} else if (age < 30) {
			System.out.println("�ȳ��Ͻʴϱ�! �� �̸��� " + name + "�Դϴ�.");
		}
	}
}
