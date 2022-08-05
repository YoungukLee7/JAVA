
public class C03_Constructor {

	/*
	 	# 클래스의 생성자 (Constructor)
	 	- 클래스의 이름과 똑같은 이름을 가진 매서드
	 	- 리턴 타입을 지정하지 않음
	 	- 새로운 인스턴스를 생성할 때 new와 함께 생성자를 호출한다
	 	- 내부에 생성자를 하나도 정의하지 않은 클래스는 보이지 않는 기본 생성자가 존재한다
	 		(자동 기본 생성자는 아무것도 하지 않고 인스턴스만 생성한다)
	 	- 생성자는 인스턴스 생성시 가장 먼저 호출되는 매서드이기 때문에 
			주로 인스턴스 초기화에 많이 사용된다
	 */
	public static void main(String[] args) {
		Orange o = new Orange(); // new 생성자();  기본 생성자 (매개변수가 없는 생성자)
		o.print();
		
		Orange o2 = new Orange(9999); // 매개변수가 있는 생성자
		o2.print();
		
		Orange o3 = new Orange(7000,777.777); // 매개변수가 있는 생성자 (2가지 값을 넣을 수 있다)
		o3.print();
		
		// 기본 생성자 사용을 막아놓은 클래스다
		Mango m = new Mango(3333,123);
		
		
	}
}


class Orange{
	
	int price;
	double sweet;
	
	// 기본 생성자 (매개변수가 없는 생성자)
	Orange() {
		// 생성자의 첫번째 줄에서는다른 생성자를 호출하는 것이 가능하다
		this(800);
	}
	
	// 매개변수가 있는 생성자
	Orange(int price) {
		this.price = price;
		sweet = 8.0;
	}
	
	
	Orange(int price, double sweet) { // 2가지 값을 넣을 수 있다
		this.price = price;
		this.sweet = sweet;
	}
	
	
	void print() {
		System.out.println("가격 : " + price);
		System.out.println("단맛 : " + sweet);
	}
}


// 매개변수가 있는 생성자만 정의한 틀래스
class Mango{
	int price;
	double sweet;
	
	// 내부에 생성자가 있기 때문에 자동 기본 생성자가 자동으로 정의되지 않는다
	// 망고가 있을 때 가격과 당도를 강제할 때 사용한다
	Mango(int price,int sweet) {
		this.price = price;
		this.sweet = sweet;
	}
	
	Mango(){ // 기본 생성자를 쓰고 싶으면 써주면 된다
	}
	
}

