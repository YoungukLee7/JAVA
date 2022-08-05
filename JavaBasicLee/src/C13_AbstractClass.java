
public class C13_AbstractClass {

	/*
	 # �߻� Ŭ���� (Abstract Class)
	 - �޼����� ���¸� ������ ���� �ش� �޼����� �ϼ��� �ڽ� Ŭ�������� �̷�� Ŭ����
	 - �ڽ� Ŭ������ �߻� Ŭ������ ��ӹ����� �ݵ�� �߻� �޼��带 �������̵� �ؾ� �Ѵ�
	 - �߻� �޼��带 ������ Ŭ����
	 
	 # �߻� �޼��� (Abstract method)
	 - ���� �Ǿ� �ְ� ������ ���� �޼���
	 - �տ� Abstract�� �پ� �ִ� �޼���� body�� ���� �߰��� �� ����
	 - �ݵ�� ��ӹ��� �� �ڽ� Ŭ�������� �������̵��ؼ� �����ؾ� �Ѵ�
	 - Abstract �޼��带 �������� ���� Ŭ������ �ν��Ͻ��� ������ �� ����
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
		 	myobj��Ű���� ���⼺�� Ȱ���� �� �ִ� abstract class�� �ϳ� �����غ�����
		 */
		
	}
	
	public static void unitAttack(Unit unit) {
		unit.attack();
	}
}

// class �տ��� abstract�� �ٿ��� �Ѵ� 
abstract class Unit{
	int attack;
	int hp;
	
	// abstract�� ���̸� �ڽ� Ŭ������ �� �޼��带 �ݵ�� �����ؾ� �Ѵ� (��� �������� �߰� �����)
	// abstract�� ���ϸ� �׳� �������� ����Ǿ� ������ (�θ� Ŭ������ ������ �����Ѵ�)
	abstract void attack();
	
//	void attack() {
//		System.out.println("��� ������ ������ ������� ������ �ؾ� �մϴ�.");
//	}
}


class Mage extends Unit{
	public Mage() {
		attack = 30;
		hp = 20;
	}
	
	@Override
	void attack() {
		System.out.println("���� ������ �Ͽ����ϴ�. ������ : " + attack);
	}
}

class SwardMan extends Unit{
	public SwardMan() {
		attack = 10;
		hp = 50;
	}
	// �������̵� �ϸ� �ڽ� �޼��带 ����
	@Override
	void attack() {
		slash();
	}
	
	void slash() {
		System.out.println("Į�� �ֵѷ���. ������: " + attack);
	}
}

class Archer extends Unit{
	double accuracy; // Ȱ ���߷�
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
			System.out.println("Ȱ�� ���� �ߴ�. ������: " + attack);
		}else {
			System.out.println("Ȱ�� ���������ϴ�...");
		}
	}
	
}












