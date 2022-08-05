
public class C03_Constructor {

	/*
	 	# Ŭ������ ������ (Constructor)
	 	- Ŭ������ �̸��� �Ȱ��� �̸��� ���� �ż���
	 	- ���� Ÿ���� �������� ����
	 	- ���ο� �ν��Ͻ��� ������ �� new�� �Բ� �����ڸ� ȣ���Ѵ�
	 	- ���ο� �����ڸ� �ϳ��� �������� ���� Ŭ������ ������ �ʴ� �⺻ �����ڰ� �����Ѵ�
	 		(�ڵ� �⺻ �����ڴ� �ƹ��͵� ���� �ʰ� �ν��Ͻ��� �����Ѵ�)
	 	- �����ڴ� �ν��Ͻ� ������ ���� ���� ȣ��Ǵ� �ż����̱� ������ 
			�ַ� �ν��Ͻ� �ʱ�ȭ�� ���� ���ȴ�
	 */
	public static void main(String[] args) {
		Orange o = new Orange(); // new ������();  �⺻ ������ (�Ű������� ���� ������)
		o.print();
		
		Orange o2 = new Orange(9999); // �Ű������� �ִ� ������
		o2.print();
		
		Orange o3 = new Orange(7000,777.777); // �Ű������� �ִ� ������ (2���� ���� ���� �� �ִ�)
		o3.print();
		
		// �⺻ ������ ����� ���Ƴ��� Ŭ������
		Mango m = new Mango(3333,123);
		
		
	}
}


class Orange{
	
	int price;
	double sweet;
	
	// �⺻ ������ (�Ű������� ���� ������)
	Orange() {
		// �������� ù��° �ٿ����´ٸ� �����ڸ� ȣ���ϴ� ���� �����ϴ�
		this(800);
	}
	
	// �Ű������� �ִ� ������
	Orange(int price) {
		this.price = price;
		sweet = 8.0;
	}
	
	
	Orange(int price, double sweet) { // 2���� ���� ���� �� �ִ�
		this.price = price;
		this.sweet = sweet;
	}
	
	
	void print() {
		System.out.println("���� : " + price);
		System.out.println("�ܸ� : " + sweet);
	}
}


// �Ű������� �ִ� �����ڸ� ������ Ʋ����
class Mango{
	int price;
	double sweet;
	
	// ���ο� �����ڰ� �ֱ� ������ �ڵ� �⺻ �����ڰ� �ڵ����� ���ǵ��� �ʴ´�
	// ���� ���� �� ���ݰ� �絵�� ������ �� ����Ѵ�
	Mango(int price,int sweet) {
		this.price = price;
		this.sweet = sweet;
	}
	
	Mango(){ // �⺻ �����ڸ� ���� ������ ���ָ� �ȴ�
	}
	
}

