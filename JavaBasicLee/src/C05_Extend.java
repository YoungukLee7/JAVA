// ���� ���� Person�� �ִٸ� import���� �� ����� �Ѵ�
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
	 # Ŭ���� ���
	 - �̹� ������� �ִ� Ŭ������ �����޾Ƽ� ����ϴ� ����
	 - �ڽ� Ŭ������ �θ� Ŭ������ ��� �ڿ��� �״�� ����� �� �ִ�
	 - �ڽ� Ŭ������ �θ� Ŭ������ ���� ����� ���� �߰��� �� �ִ�
	 - �ڽ� Ŭ������ �θ� Ŭ�������Լ� ���� ���� �ż��带 ������� ���ļ� ����� �� �ִ� (�������̵� : ¢ ���)
	 - �ڽ� Ŭ������ ���� ���� �θ��� �����ڸ� ȣ���ؾ� �Ѵ�
	 - 
	 
	 # super (�θ�) (this (�ڽ�))
	 - �ڽ� Ŭ������ ������ �ν��Ͻ��� ���ο� �ΰ��� �ν��Ͻ��� ���ÿ� ���Ѵ�
	 - this�� ���� �ν��Ͻ� �� �ڽ� Ŭ������ �κ��� ���Ѵ�
	 - super�� ���� �ν��Ͻ� �� �θ� Ŭ������ �κ��� ���Ѵ�
	 - this()�� ���� Ŭ������ �����ڸ� �ǹ��ϵ��� super()�� �θ� Ŭ������ �����ڸ� �ǹ��Ѵ�
	 */
	
	public static void main(String[] args) {
		Person dooly = new Person();
		dooly.name = "�Ѹ�";
		dooly.age = 7;
		
		Person chuksu = new Person();
		chuksu.name = "ö��";
		chuksu.age = 23;
		
		Police popo = new Police();
		popo.setName("������");
		popo.setAge(18);
		
		Programmer coder = new Programmer();
		coder.name = "���ڴ�";
		coder.age = 25;
		
		// Person�� �䱸�ϴ� �ڸ��� �ڽ� Ŭ������ Police�� Programmer���� �� �� �ִ� (��ü�� ������)
		// ��ü�� ������ : ������ �����̱⵵ ����̱⵵ �ϴ�. ���α׷��Ӵ� ���α׷��� �̸鼭 ����̱⵵ �Ѵ�
		// ()�ȿ� Person�� ���� �ϴµ� Police�� Programmer�� Person�� �� �ֱ� ������ �����ϴ�
//		dooly.sayHi(coder);
//		dooly.sayHi(popo);
//		dooly.sayHi(chuksu);
//		chuksu.sayHi(dooly);
		
		Programmer p2 = new Programmer();
		
		p2.name = "��뿹";
		p2.age = 23;
		p2.salary = 700;
		p2.sayHi();
		p2.program("/�¶��� ���� ����Ʈ/");
		
		// Person�� name, age�� Police�� name, age�� ��� ������ �ִ�
		Police p3 = new Police();
		p3.name = "������";
		p3.age = 20;
		p3.setName("������");
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
		young.name = "�̿���";
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
  ��������
  - myobj ��Ű���� ��� ���迡 �ִ� Ŭ�������� ������ ������
  - �θ� Ŭ���� , �ڽ� Ŭ����, �������̵带 ����� ��
 */


