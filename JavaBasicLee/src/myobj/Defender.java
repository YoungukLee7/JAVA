package myobj;

public class Defender extends Person{

	@Override
	public void sayHi() {
		System.out.println(name + "���� ���и� ���� �εηȽ��ϴ�.");
	}
	
	public void block() {
		System.out.println(name + "���� ���з� ȭ���� ���ҽ��ϴ�.");
	}
	
	public void bash() {
		System.out.println(name + "���� ���з� �տ� �ִ� ����� ���Ƚ��ϴ�.");
	}
	
}
