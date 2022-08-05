import myobj.Person;

public class C11_LocalInnerClass {

	/*
	 # ���� ���� Ŭ����
	 - �޼��� ���ο� ������ Ŭ����
	 - �ش� �޼��尡 ������ ������ ���ϴ� Ŭ����
	 - �ش� �޼��� �ٱ������� ������ �� ����
	 */
	
	public static void main(String[] args) {
		
		int defaultPrice = 1000;
		char defaultGrade = 'B';
		
		// ������ ����� ���Ҵ� appleŬ����
		Apple a = new Apple();
		System.out.println(a);
		
		// ���� ���� Ŭ���� (�޼��� ������ Ŭ����)
		class Apple{
			int price;
			char grade;
			
			public Apple() {
				price = defaultPrice;
				grade = defaultGrade;
			}
			
			@Override
			public String toString() {
				return "price : " + price + " grade : " + grade;
			}
		}
		
		// ���� ����� appleŬ������ ����
		Apple apple = new Apple();
		System.out.println(apple);
		
//---------------------------------------------------------------------------------------------//
		
		/*
		  # �͸� ���� ���� Ŭ����  
		  - �޼��� ���ο��� Ŭ������ ���� �����ϸ� ����ϴ� ��� (������ ���ÿ� ���)
		  - �̸��� ���� ������ ���ο� �޼��带 �߰��Ͽ��� ����� �� ����
		  - ������ �޼��带 �������̵� �ؼ� ����ϴ� ���� �����ϴ�
		  - ��ȸ�� ����̶� ���� �ȴ�
		 */
		Person p = new Person() {
			
			// {}ģ ������ ��ġ�� �ڽ��� �̸��� ���̰� �ǹ��� sayHi()�� �ϸ� null������ ���´�
			{
				name = "�Ѹ�";
				age = 9;
			}
			
			@Override
			public void sayHi() {
				System.out.println("�͸� Ŭ������ sayHi()�Դϴ�.");
				punch();
			}
			
			// �ܵ� ����� �Ұ��ϴ�. ������ �ڽ�Ŭ������ �̸��� ���
			void punch() {
				System.out.println(name + "�� �� ����� ���Ƚ��ϴ�~");
			}
		};
		
		p.sayHi();
	}
}
