import Police.Police;
import myobj.Defender;
import myobj.Person;
//import myobj.*; 를 하면 myobj패키지에 있는 모든것이 따라온다.

public class C06_Polymorphism {

	/*
	 # 객체의 다양성
	 - 객체는 다양한 형태를 지닐 수 있다
	 - 경찰은 경찰이기도 사람이기도 하다 (업 캐스팅)
	 - 사람은 사람이지만 경찰이 아닐수도 있다 (다운 캐스팅)
	 
	 # 업 캐스팅
	 - 자식 타입는 부모 타입의 모든것을 보유하고 있다
	 - 자식 타입은 언제든지 별다른 문제없이 부모 타입이 될수 있다
	 
	 # 다운 캐스팅
	 - 부모 타입은 타입 캐스팅을 통해 자식 타입이 될 수 있다
	 - 하지만 원래 자식 타입이였다가 업캐스팅 된 경우가 아니라면 애러가 발생한다
	 */
	public static void main(String[] args) {
		// 업 캐스팅
		Person p;
		
		p = new Person();
		p = new Police(); // 자식 타입은 언제든지 별도의 타입 캐스팅 없이 부모타입이 될 수 있다
		
		
		// 다운 캐스팅
		Person person;
		Police popo;
		
		// 원래 Person이던 인스턴스를 다운 캐스팅 하면 애러가 발생한다
		person = new Person();
//		popo = (Police)person; // 에러 발생 원인 class myobj.Person cannot be cast to class Police.Police
		
		// 원래 Police였다가 Person이 된 인스턴스를 다운 캐스팅 하는 것은 가능하다
		person = new Police(); // 이것을 써줘서 아래가 동작할 수 있다 이것을 주석 처리하면 오류가 난다
		popo = (Police) person;
		
		popo.name = "김체포";
		popo.sayHi();
		
		Person p10 = new Person();
		
		// 업캐스팅이 된 자식 인스턴스는 자식 클래스에만 가지고 있는 기능을 사용할 수 없다
		Person p11 = new Defender();
		
//		p11.bash();  p11은 원래 bash를 가지고 있지만 사용할 수 없는 상태이다
		
//		업캐스팅 된 상태에서는 부모타입의 자원만 그대로 사용 할 수 있다
		p11.name = "강철방패";
		p11.age = 33;
		
//		(중요) 업 캐스팅 된 상태에서도 오버라이딩 된 매서드는 자신의 것으로 사용된다.
		p11.sayHi();

//		자식 클래스에만 보유한 것을 다시 사용하기 위해선 다운 캐스팅이 필요하다
		((Defender)p11).bash();
		((Defender)p11).block();
		
		// 업캐스팅이 되지 않은 상태에서는 원래의 기능을 사용할 수 있다
		Defender d1 = new Defender();
		d1.name = "김방패";
		d1.sayHi();
		d1.bash();
		d1.block();
	}
}
 




