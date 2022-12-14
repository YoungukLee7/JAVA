
public class C14_Interface {

	/*
	 # 인터페이스 (Interface)
	 - 자바의 클래스는 상속을 한번에 여러게 받을수 없다
	 - 해당 클래스에 여러가지 형태를 부여하기 위해서는 인터페이스를 사용해야 한다
	 - 인터페이스 내부에 선언하는 모든 메서드는 자동으로 abstrack public이 된다
	 - 인터페이스 내부에 선언하는 변수는 자동으로 final static이 된다
	 - 인터페이스는 인스턴스화 할 수 없다
	 - 인터페이스 내부의 메서드 앞에 default를 붙이면 오버라이드 하지 않았을때의 기본 동작을 정의 할수 있다
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
	
	// 오버라이드 하지 않았을 때의 기본 동작을 구현해 놓을 수 있다
	default void run() {
		System.out.println("run() 미구현");
	}
}

interface Breedable{
	void feed();
	
	void sit();
	
	void standup();
}


interface Swimmer{
	// default를 구현하지 않는 경우 반드시 구현해야 하는 abstract 메서드가 된다.
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




















