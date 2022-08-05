
public class C13_AbstractClass {

	/*
	 # 추상 클래스 (Abstract Class)
	 - 메서드의 형태만 선언해 놓고 해당 메서드의 완성은 자식 클래스에게 미루는 클래스
	 - 자식 클래스는 추상 클래스를 상속받으면 반드시 추상 메서드를 오버라이드 해야 한다
	 - 추상 메서드를 포함한 클래스
	 
	 # 추상 메서드 (Abstract method)
	 - 선언만 되어 있고 몸통은 없는 메서드
	 - 앞에 Abstract가 붙어 있는 메서드는 body를 직접 추가할 수 없다
	 - 반드시 상속받은 후 자식 클래스에서 오버라이드해서 구현해야 한다
	 - Abstract 메서드를 구현하지 않은 클래스는 인스턴스를 생성할 수 없다
	 */
	
	public static void main(String[] args) {
//		SwardMan unit1 = new SwardMan();
//		Archer unit2 = new Archer();
		
//		unit1.slash();
//		
//		for (int i = 0; i < 10; i++) {
//			unit2.shot();
//		}
		
		unitAttack(new SwardMan());
		unitAttack(new Archer());
		unitAttack(new Mage());
		
		/*
		 	myobj패키지에 다향성을 활용할 수 있는 abstract class를 하나 정의해보세요
		 */
		
	}
	
	public static void unitAttack(Unit unit) {
		unit.attack();
	}
}

// class 앞에도 abstract를 붙여야 한다 
abstract class Unit{
	int attack;
	int hp;
	
	// abstract를 붙이면 자식 클래스는 이 메서드를 반드시 구현해야 한다 (라고 빨간줄이 뜨게 만든다)
	// abstract를 안하면 그냥 오류없이 실행되어 버린다 (부모 클래스의 어택을 실행한다)
	abstract void attack();
	
//	void attack() {
//		System.out.println("모든 유닛은 각자의 방법으로 공격을 해야 합니다.");
//	}
}


class Mage extends Unit{
	public Mage() {
		attack = 30;
		hp = 20;
	}
	
	@Override
	void attack() {
		System.out.println("마법 공격을 하였습니다. 데미지 : " + attack);
	}
}

class SwardMan extends Unit{
	public SwardMan() {
		attack = 10;
		hp = 50;
	}
	// 오버라이드 하면 자식 메서드를 쓴다
	@Override
	void attack() {
		slash();
	}
	
	void slash() {
		System.out.println("칼을 휘둘렀다. 데미지: " + attack);
	}
}

class Archer extends Unit{
	double accuracy; // 활 명중률
	public Archer() {
		attack = 8;
		hp = 30;
		accuracy = 0.88;
	}
	
	
	@Override
	void attack() {
		shot();
	}
	
	void shot() {
		if (Math.random() < accuracy) {
			System.out.println("활이 명중 했다. 데미지: " + attack);
		}else {
			System.out.println("활이 빗나갔습니다...");
		}
	}
	
}












