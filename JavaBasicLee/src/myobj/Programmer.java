package myobj;
			// person�� �ڽ��� Programmer�� ���°�, Programmer�� person���� ��� ���� ��
			// extends Person���� ��ӽ�Ų��
public class Programmer extends Person{
	// �Ʒ� ���α׷��� ProgrammerŬ�������� �ִ� ���α׷��̴� (Person���� ����)
	
	public int salary; // ����
	
	//@Override // �θ𿡰Լ� �����Դٰ� ǥ������ ��, @�� at�̶� �θ���
	// @Override ������̼��� �ٿ� ������ �������̵尡 �������� ���� �� ������ �߻����� �ش�
	// Override�� ���� �Ϸ��� public void sayHi()�� ���� ���ƾ� �ȴ� �ٸ��� ���� ���� �Ͱ� �ٸ�����.
	public void sayHi() { // �θ𿡰Լ� ������ ���� �ٲ� �� �ִ�
		System.out.println("�ȳ��ϼ��� ���� " + salary + " �ް� ���ϴ� " + name + "�Դϴ�.");
	}
	
	public void program(String toProgram) {
		if (salary < 500) {
			System.out.println(name + "���� " + toProgram + "��(��) ���� ������ �߽��ϴ�.");
		} else {
			System.out.println(name + "���� " + toProgram + "��(��) ������ ������ �߽��ϴ�.");
		}
	}
}
