// 만약 같은 Person이 있다면 import문을 꼭 써줘야 한다
import Police.Police;
import myobj.HarryKane;
import myobj.Office;
import myobj.Person;
import myobj.Player;
import myobj.Programmer;
import myobj.Son;
import myobj.Tottenham;


public class C05_Extend {

	/*
	 # 클래스 상속
	 - 이미 만들어져 있는 클래스를 물려받아서 사용하는 문법
	 - 자식 클래스는 부모 클래스의 모든 자원을 그대로 사용할 수 있다
	 - 자식 클래스는 부모 클래스에 없던 기능을 새로 추가할 수 있다
	 - 자식 클래스는 부모 클래스에게서 물려 받은 매서드를 마음대로 고쳐서 사용할 수 있다 (오버라이드 : 짖 밟다)
	 - 자식 클래스는 가장 먼저 부모의 생성자를 호출해야 한다
	 - 
	 
	 # super (부모) (this (자식))
	 - 자식 클래스로 생성된 인스턴스는 내부에 두가지 인스턴스를 동시에 지닌다
	 - this는 현재 인스턴스 중 자식 클래스의 부분을 뜻한다
	 - super는 현재 인스턴스 중 부모 클래스의 부분을 뜻한다
	 - this()가 현재 클래스의 생성자를 의미하듯이 super()는 부모 클래스의 생성자를 의미한다
	 */
	
	public static void main(String[] args) {
		Person dooly = new Person();
		dooly.name = "둘리";
		dooly.age = 7;
		
		Person chuksu = new Person();
		chuksu.name = "철수";
		chuksu.age = 23;
		
		Police popo = new Police();
		popo.setName("김포포");
		popo.setAge(18);
		
		Programmer coder = new Programmer();
		coder.name = "김코더";
		coder.age = 25;
		
		// Person을 요구하는 자리에 자식 클래스인 Police와 Programmer등이 들어갈 수 있다 (객체의 다형성)
		// 객체의 다형성 : 경찰은 경찰이기도 사람이기도 하다. 프로그래머는 프로그래머 이면서 사람이기도 한다
		// ()안에 Person이 들어가야 하는데 Police와 Programmer는 Person에 들어가 있기 때문에 가능하다
//		dooly.sayHi(coder);
//		dooly.sayHi(popo);
//		dooly.sayHi(chuksu);
//		chuksu.sayHi(dooly);
		
		Programmer p2 = new Programmer();
		
		p2.name = "김노예";
		p2.age = 23;
		p2.salary = 700;
		p2.sayHi();
		p2.program("/온라인 교육 사이트/");
		
		// Person의 name, age와 Police의 name, age를 모두 가지고 있다
		Police p3 = new Police();
		p3.name = "김형사";
		p3.age = 20;
		p3.setName("이형사");
		p3.setAge(55);
		p3.sayHi();
		p3.hi();
		System.out.println();
		
		Tottenham spurs = new Tottenham();
		spurs.name = "Tottenham Hotspur stadium";
		spurs.hometown = "London";
		spurs.foundation = 1882;
		spurs.infor();
		
		System.out.println();
		Player young = new Player();
		young.name = "이영욱";
		young.age = 27;
		young.position = "Midfielder";
		young.foot = "right food";
		young.number = 9;
		young.team = "MU";
		young.infor();
		
		System.out.println();
		HarryKane kane = new HarryKane();
		kane.country = "England";
		kane.team = "Tottenham";
		kane.name = "Harry Kane";
		kane.age = 28;
		kane.position = "Striker";
		kane.foot = "right food";
		kane.number = 10;
		kane.weeklyPay = 6;
		kane.infor();
		
		System.out.println();
		Son sonny = new Son();
		sonny.country = "Korea";
		sonny.team = "Tottenham";
		sonny.name = "Son Heung-Min";
		sonny.age = 29;
		sonny.position = "Forward";
		sonny.foot = "both food";
		sonny.number = 7;
		sonny.weeklyPay = 3;
		sonny.infor();
	}
}

/*
  연습문제
  - myobj 패키지에 상속 관계에 있는 클래스들을 정의해 보세요
  - 부모 클래스 , 자식 클래스, 오버라이드를 사용할 것
 */


