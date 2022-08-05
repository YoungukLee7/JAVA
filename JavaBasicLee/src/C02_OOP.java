import java.security.PKCS12Attribute;

public class C02_OOP {

	/*
	  # 객체 지향 프로그래밍 (object oriented programming)
	  - 세상에 존재하는 모든 것들을 변수와 함수로 표현하려는 프로그래밍 방법론
	  - 세상에 존재하는 모든 것을 객체라고 한다
	  - 변수와 함수를 무분별하게 사용하는 것보다 현실에 존재하는 객체 단위로
	  	묶어서 표현하는 것이 개발자들의 효율을 높인다
	  - 해당 객체를 구성하는 변수를 맴버,필드(field),속성 등으로 부른다
	  - 해당 객체의 필드를 변화시키는 객체 내부의 함수들을 매서드라고 부른다
	  
	  ex : 사과
	  - 사과의 변수 : 크기,당도,색깔,칼로리,등급,원산지...
	  - 사과의 매서드 (변수를 변화시키는 것들)
	  	사과를 먹는다 : 크기가 줄어든다, 칼로리가 떨어진다, 먹은 사람의 칼로리가 증가
	  	사과를 던진다 : 사과의 크기와 경도에 알맞는 데미지를 가한다
	  	냉장고에 보관한다 : 사과의 유통기한이 천천히 감소한다
	  	
	  	# 클래스 (class)
	  	- 현실의 객체를 프로그래밍 언어로 표현한 문법
	  	- 클래스는 해당 객체의 설계도 역할을 한다
	  	- 클래스는 정의한 시점에서는 실체가 없다
	  	- 클래스를 이용해 찍어내는 실체 객체를 인스턴스(instance) 라고 부른다
	  	- 클래스를 이용해 인스턴스를 생성할 때에는 new를 사용한다
	  	- 모든 클래스는 참조형 변수 타입입니다.
	  	- 같은 패키지 내부에는 동일한 이름의 클래스를 정의할 수 없다
	 */
	public static void main(String[] args) {
//		// 사과 클래스로 사과 인스턴스 생성
//		Apple a1 = new Apple();
//		Apple a2 = new Apple();
//		
//		// .을 찍어서 해당 인스턴스의 필드값을 사용할 수 있다
//		a1.size = 20;
//		a1.sweet = 8;
//		a1.calorie = 200.0;
//		a1.color = "빨간색";
//		
//		for (int i = 0; i < 5; i++) {
//			a1.eat();
//		}
//		
//		a2.eat();
//		
//		System.out.println("a1의 size: " + a1.size );
//		System.out.println("a1의 당도: " + a1.sweet );
//		System.out.println("a1의 칼로리: " + a1.calorie );
//		System.out.println("a2의 칼로리: " + a2.calorie );
//		
//		a2.setColor("Black");
//		
//		a1.info();
//		a2.info();
		
		// Jewelry 인스턴스 생성 (생성하면 Jewelry안에 있는 필드값을 사용할 수 있다)
		Jewelry diamond = new Jewelry(1000);
		diamond.name_jew = 0;
		diamond.info();
		diamond.processing();
		diamond.info();
		Jewelry ruby = new Jewelry(3);
		ruby.name_jew = 1;
		ruby.info();
		Jewelry sapphire = new Jewelry(200);
		sapphire.name_jew = 2;
		sapphire.info();
		sapphire.sell();
		sapphire.info();
		
		
	}
}

class Jewelry{
	
	String[] name = {"다이아", "루비", "사파이어"};
	String[] color = {"하얀색","빨간색","파란색"};
	int name_jew;
	int value;
	int hardness;
	int size;
	
	
	Jewelry() {
	}
	
	Jewelry(int value) {
		this.value = value;
		hardness = 10;
		size = 10;
	}
	
	void processing(){
		size /= 2;
		value += 100;
	}
	
	void sell() {
		value-=10;
	}
	
	void info() {
		System.out.println("---이 보석의 정보---");
		System.out.println("이름\t: " + name[name_jew]);
		System.out.println("크기\t: " + size);
		System.out.println("가치\t: " + value);
		System.out.println("경도\t: " + hardness);
		System.out.println("색깔\t: " + color[name_jew]);
	}
}


class Apple{ // 미래의 값을 기다린다
	/*
	 # 인스턴스 변수
	 - 클래스 내부에 선언한 변수
	 - 각 인스턴스마다 다른 값을 가질수 있는 변수
	 - aka.,필드,속성,맴버,상태
	 */
	int size;
	int sweet;
	double calorie;
	String color;
	
	/*
	 # 인스턴스 매서드
	 - 클래스 내부에 선언한 함수
	 - 주로 해당 인스턴스 변수를 활용하거나 변화시키는 역할을 한다
	 
	 # this
	 - 현재 인스턴스 자기 자신을 가르키는 문법
	 - 생략이 가능하다
	 
	 */
	void eat() {
		this.size--;
		this.calorie -= 5;
	}
	// # this를 꼭 써야하는 경우
	// 필드명과 매개변수명이 동일한 이름을 가질때 this를 사용해 반드시 구분해줘야 한다
	void setColor(String color) {
		this.color = color;
	}
	
	void info() {
		System.out.println("---이 사과의 정보---");
		System.out.println("크기\t: " + size);
		System.out.println("당도\t: " + sweet);
		System.out.println("칼로리\t: " + calorie);
		System.out.println("색깔\t: " + color);
	}
}
/*
 연습문제 : 현실에 존재하는 객체를 참고하여 클래스를 하나 생성한 후
 			인스턴스를 생성하고 정보를 출력해보세요
 			(단 인스턴스 변수 3개이상 , 인스턴스 메서드 2개이상,과일 금지, 물통 금지)
 			
 연습문제 : 연습으로 만들었던 클래스에 생성자 추가하기
 
 */


