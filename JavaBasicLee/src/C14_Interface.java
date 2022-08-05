
public class C14_Interface {

	/*
	 # �������̽� (Interface)
	 - �ڹ��� Ŭ������ ����� �ѹ��� ������ ������ ����
	 - �ش� Ŭ������ �������� ���¸� �ο��ϱ� ���ؼ��� �������̽��� ����ؾ� �Ѵ�
	 - �������̽� ���ο� �����ϴ� ��� �޼���� �ڵ����� abstrack public�� �ȴ�
	 - �������̽� ���ο� �����ϴ� ������ �ڵ����� final static�� �ȴ�
	 - �������̽��� �ν��Ͻ�ȭ �� �� ����
	 - �������̽� ������ �޼��� �տ� default�� ���̸� �������̵� ���� �ʾ������� �⺻ ������ ���� �Ҽ� �ִ�
	 */
	
	
	public static void main(String[] args) {
		Human h1 = new Human();
		Runner r1 = h1;
		Swimmer s1 = h1;
		
		h1.run();
		h1.swim();
		
		System.out.println(h1);
		
		r1.run();
		s1.swim();
	}
}


interface Runner{
	int a = 10;
	
	// �������̵� ���� �ʾ��� ���� �⺻ ������ ������ ���� �� �ִ�
	default void run() {
		System.out.println("run() �̱���");
	}
}

interface Breedable{
	void feed();
	
	void sit();
	
	void standup();
}


interface Swimmer{
	// default�� �������� �ʴ� ��� �ݵ�� �����ؾ� �ϴ� abstract �޼��尡 �ȴ�.
	void swim();
}

class Human implements Runner,Swimmer{
	@Override
	public void swim() {
		
	}
	
	@Override
	public void run() {
		
	}
}

class Bear implements Runner,Swimmer,Breedable{
	@Override
	public void swim() {
		
	}
	
	@Override
	public void run() {
		
	}

	@Override
	public void feed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void standup() {
		// TODO Auto-generated method stub
		
	}
}

class Shark implements Swimmer{
	@Override
	public void swim() {
		
	}
	
}




















