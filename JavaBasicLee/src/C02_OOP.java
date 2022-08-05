import java.security.PKCS12Attribute;

public class C02_OOP {

	/*
	  # ��ü ���� ���α׷��� (object oriented programming)
	  - ���� �����ϴ� ��� �͵��� ������ �Լ��� ǥ���Ϸ��� ���α׷��� �����
	  - ���� �����ϴ� ��� ���� ��ü��� �Ѵ�
	  - ������ �Լ��� ���к��ϰ� ����ϴ� �ͺ��� ���ǿ� �����ϴ� ��ü ������
	  	��� ǥ���ϴ� ���� �����ڵ��� ȿ���� ���δ�
	  - �ش� ��ü�� �����ϴ� ������ �ɹ�,�ʵ�(field),�Ӽ� ������ �θ���
	  - �ش� ��ü�� �ʵ带 ��ȭ��Ű�� ��ü ������ �Լ����� �ż����� �θ���
	  
	  ex : ���
	  - ����� ���� : ũ��,�絵,����,Į�θ�,���,������...
	  - ����� �ż��� (������ ��ȭ��Ű�� �͵�)
	  	����� �Դ´� : ũ�Ⱑ �پ���, Į�θ��� ��������, ���� ����� Į�θ��� ����
	  	����� ������ : ����� ũ��� �浵�� �˸´� �������� ���Ѵ�
	  	����� �����Ѵ� : ����� ��������� õõ�� �����Ѵ�
	  	
	  	# Ŭ���� (class)
	  	- ������ ��ü�� ���α׷��� ���� ǥ���� ����
	  	- Ŭ������ �ش� ��ü�� ���赵 ������ �Ѵ�
	  	- Ŭ������ ������ ���������� ��ü�� ����
	  	- Ŭ������ �̿��� ���� ��ü ��ü�� �ν��Ͻ�(instance) ��� �θ���
	  	- Ŭ������ �̿��� �ν��Ͻ��� ������ ������ new�� ����Ѵ�
	  	- ��� Ŭ������ ������ ���� Ÿ���Դϴ�.
	  	- ���� ��Ű�� ���ο��� ������ �̸��� Ŭ������ ������ �� ����
	 */
	public static void main(String[] args) {
//		// ��� Ŭ������ ��� �ν��Ͻ� ����
//		Apple a1 = new Apple();
//		Apple a2 = new Apple();
//		
//		// .�� �� �ش� �ν��Ͻ��� �ʵ尪�� ����� �� �ִ�
//		a1.size = 20;
//		a1.sweet = 8;
//		a1.calorie = 200.0;
//		a1.color = "������";
//		
//		for (int i = 0; i < 5; i++) {
//			a1.eat();
//		}
//		
//		a2.eat();
//		
//		System.out.println("a1�� size: " + a1.size );
//		System.out.println("a1�� �絵: " + a1.sweet );
//		System.out.println("a1�� Į�θ�: " + a1.calorie );
//		System.out.println("a2�� Į�θ�: " + a2.calorie );
//		
//		a2.setColor("Black");
//		
//		a1.info();
//		a2.info();
		
		// Jewelry �ν��Ͻ� ���� (�����ϸ� Jewelry�ȿ� �ִ� �ʵ尪�� ����� �� �ִ�)
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
	
	String[] name = {"���̾�", "���", "�����̾�"};
	String[] color = {"�Ͼ��","������","�Ķ���"};
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
		System.out.println("---�� ������ ����---");
		System.out.println("�̸�\t: " + name[name_jew]);
		System.out.println("ũ��\t: " + size);
		System.out.println("��ġ\t: " + value);
		System.out.println("�浵\t: " + hardness);
		System.out.println("����\t: " + color[name_jew]);
	}
}


class Apple{ // �̷��� ���� ��ٸ���
	/*
	 # �ν��Ͻ� ����
	 - Ŭ���� ���ο� ������ ����
	 - �� �ν��Ͻ����� �ٸ� ���� ������ �ִ� ����
	 - aka.,�ʵ�,�Ӽ�,�ɹ�,����
	 */
	int size;
	int sweet;
	double calorie;
	String color;
	
	/*
	 # �ν��Ͻ� �ż���
	 - Ŭ���� ���ο� ������ �Լ�
	 - �ַ� �ش� �ν��Ͻ� ������ Ȱ���ϰų� ��ȭ��Ű�� ������ �Ѵ�
	 
	 # this
	 - ���� �ν��Ͻ� �ڱ� �ڽ��� ����Ű�� ����
	 - ������ �����ϴ�
	 
	 */
	void eat() {
		this.size--;
		this.calorie -= 5;
	}
	// # this�� �� ����ϴ� ���
	// �ʵ��� �Ű��������� ������ �̸��� ������ this�� ����� �ݵ�� ��������� �Ѵ�
	void setColor(String color) {
		this.color = color;
	}
	
	void info() {
		System.out.println("---�� ����� ����---");
		System.out.println("ũ��\t: " + size);
		System.out.println("�絵\t: " + sweet);
		System.out.println("Į�θ�\t: " + calorie);
		System.out.println("����\t: " + color);
	}
}
/*
 �������� : ���ǿ� �����ϴ� ��ü�� �����Ͽ� Ŭ������ �ϳ� ������ ��
 			�ν��Ͻ��� �����ϰ� ������ ����غ�����
 			(�� �ν��Ͻ� ���� 3���̻� , �ν��Ͻ� �޼��� 2���̻�,���� ����, ���� ����)
 			
 �������� : �������� ������� Ŭ������ ������ �߰��ϱ�
 
 */


