
public class C10_InnerClass {
	
	// 참조형 변수타입의 초기값은 null이다
	private String s1,s2,s3;
	// 같은 패키지 안에 class Apple이 있으니까 사용할 수 있다
	private Apple a1,a2,a3;
	// 기본형 변수타입의 초기값은 0이다
	private int a,b,c;
	
	private static int d,e,f;
	
	// 클래스 내부의 static클래스
	static class Orange{
		int price;
		int sweet;
		
		public Orange() {
//			static은 인스턴스가 생기기 전에도 사용 가능하여 a,b를 사용할 수 없다
//			price = a;
//			sweet = b;
//			같은 static 이여서 d,e,f 는 사용 가능하다. 혹은 그냥  100,200을 넣어도 된다
			price = d;
			sweet = e;
		}
		
		@Override
		public String toString() {
			return "가격 : " + price + ", 당도 : " + sweet;
		}
	}
	
	
	// 클래스 내부의 클래스
	class Sagwa {
		int price;
		int sweet;
		
		// 클래스 내부의 클래스에서는 바깥 클래스의 private 자원들을 사용할 수 있다
		// 같은 클래스 내부이기 때문에 private 자원도 사용할 수 있다
		public Sagwa() {
			price = a;
			sweet = b;
		}
		
		@Override
		public String toString() {
			return "가격 : " + price + ", 당도 : " + sweet;
		}
	}

	/*
	 # 클래스 내부에 클래스를 사용하기
	 - 클래스 내부에도 클래스를 정의하고 사용할 수 있다
	 - 클래스 내부에 존재하는 클래스는 바깥쪽 클래스의 인스턴스가 존재해야 사용할 수 있다
	 */
	
	public static void main(String[] args) {
		// main이기 때문에 클래스를 불러와야 사용할 수 있다
		C10_InnerClass instance = new C10_InnerClass();

		instance.a = 100;
		instance.b = 200;

		// private을 붙여도 사용 가능
		System.out.println(instance.s1);
		System.out.println(instance.s2);
		System.out.println(instance.s3);

		System.out.println(instance.a1);
		System.out.println(instance.a2);
		System.out.println(instance.a3);

		// 클래스 내부의 클래스로 인스턴스 생성하기
		C10_InnerClass.Sagwa apple = instance.new Sagwa();

		System.out.println(apple);

		// 바깥 클래스의 영향을 계속 받는다
		instance.a = 300;
		instance.b = 400;

		C10_InnerClass.Sagwa apple2 = instance.new Sagwa();

		System.out.println(apple2);

		// 클래스 내부의 스태틱 클래스로 인스턴스 생성하기
		C10_InnerClass.Orange orange = new C10_InnerClass.Orange();

		System.out.println(orange);
		
		C10_InnerClass.d = 50;
		C10_InnerClass.e = 60;
		
		C10_InnerClass.Orange orange2 = new C10_InnerClass.Orange();

		// 어느 시점에 만들어 졌는가에 따라 값이 변하지 않는다 (아무리 스태틱이여도)
		System.out.println(orange);
		System.out.println(orange2);
	}

}
