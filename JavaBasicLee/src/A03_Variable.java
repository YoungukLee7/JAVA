
public class A03_Variable {

	/*
	 # ���� (Variable)
	 - ���α׷��� ���� �����͸� ������ �� �ִ� ����
	 - �ڹٿ����� ������ �ݵ�� ������ �ڿ� ����ؾ� �Ѵ�
	 - ���� �̸��� ������ ���� {} ���ο��� �ٽ� ������ �� ����
	 - ���� �ѹ��� �������� ���� ������ ����ϸ� ������ �߻��Ѵ�
	   (�ʱ�ȭ ���� ���� ������ ����� �� ����)
	 
	 # ������ ���� (declare, declaration)
	 Ÿ�� ������;
	 - Ÿ�� : �ش� ������ ������ �������� Ÿ���� �����Ѵ� (int - ����, String - ���ڿ�...)
	 - ������: ����ϰ� ���� ������ �̸��� �����Ѵ�
	 
	 # ���� ����
	 	�츮�� �˰��ִ� =�� �ǹ� : ������ ���� �������� ���� ���� ���ٶ�� ��
 	 ���α׷��� ���� =�� �ǹ� : ������ ������ �������� ���� ������� ��
	 */
	
	public static void main(String[] args) {
	
		// ������ �Ŀ� ���� ����
		int age;
		age = 28;
		
		{
			// {} ���ο��� ������ ������ �ش� {}�� ����鼭 �������
			int apple = 300;
			System.out.println("�����: " + apple);
		}
		
		// ������ ���� �̸��� ������ ����� �� ������ �ٸ� {} ������ ����� �� �ִ�.
		String apple = "���";
		System.out.println(apple);
		
		// ����� ���ÿ� ���� ����
		String movie = "����", hobby = "��";
		
		
		System.out.println("����� ���� �����ϴ� ��ȭ: " + movie);
		System.out.println("����� ���: " + hobby);
		System.out.println("����� ����: " + age);
		
		/* �ʱ�ȭ ���� ���� ������ ����� �� ����
		int price;
		System.out.println("���� : " + price);
		*/
	}

}