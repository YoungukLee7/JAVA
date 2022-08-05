
public class B01_Operator01 {
	
	
	/*
	 	# ������ (Operator)
	 	- ����� �� ����ϴ� ��
	 	- ��� ������ (+,-,*,/,%)
	 	- �� ������ (<,>,<=,>=)
	 	- �� ������ (&&, ||, !)
	 	- ��Ʈ ������ (&, |, ^, �����ϱ� �����)
	 	
	 	# ��� ������
	 	+ : ���ϱ�
	 	- : ����
	 	* : ���ϱ�
	 	/ : ������
	 	% : ������
	 */
	
	public static void main(String[] args) {
		int a = 33, b = 8;
		double c = 33, d = 8;
		
		System.out.println(" a + b = " + (a + b));
		System.out.println(" a - b = " + (a - b));
		System.out.println(" a * b = " + a * b);
		
		// ���������� ������� �� ���Ѵ�
		System.out.println(" a / b = " + a / b);
		
		System.out.println();
		
		//������ �Ǽ��� ������ ��Ȯ�� ���� ����Ѵ�
		System.out.println(" a / c = " + a / c);
		System.out.println(" a / d = " + a / d);
		System.out.println(" c / d = " + c / d);
		
		//������ ����
		System.out.println(" a % b = " + a % b);
		
		System.out.println();
		
		// n���� ���� �������� 0���� n-1���� �ۿ� ���� �� ����
		System.out.println(" 19 % 10 = " + 19 % 10);
		System.out.println(" 20 % 10 = " + 20 % 10);
		System.out.println(" 21 % 10 = " + 21 % 10);
		System.out.println(" 22 % 10 = " + 22 % 10);
		System.out.println("���� (��� �ƴ�) : " + (a ^ b));
		
		System.out.println();
		
		// XOR �����̴� ���� �ƴ�
		
		
		// # ��� ���� �Լ���
		
		// Math.pow(a, b) : a ���� b�� ���Ѵ�
		System.out.println("���� : " + Math.pow(a, b));
		
		// ������ : Math.sqrt(a) : a�� �������� ���ؼ� ��ȯ�Ѵ�. ��Ʈ 25 = 5 
		System.out.println("������ : " + Math.sqrt(a));
		
		// ���밪 : ������ ����� ����, Math.abs(a) : a�� ���밪�� ���Ѵ�
		System.out.println("���밪 : " + Math.abs(-8));
		
		// Math.round(a) : a�� �Ҽ� ù° �ڸ����� �ݿø��� ����� ��ȯ�Ѵ� 
		System.out.println("�ݿø� : " + Math.round(1.5555));
		double result = Math.round(1.5555);
		System.out.println("�ݿø� : "+result);
		
		System.out.println();
		// Math.round()�� ���ϴ� �ڸ������� �ݿø��ϱ�
		// - �ݿø��ϰ� ���� �ڸ��� �Ҽ� ù��° �ڸ��� ���� �� �ٽ� ������
		double value = 123.77777777;
		System.out.println("�ݿø�(1) : "+ value);
		System.out.println("�ݿø�(2) : "+ value * 100);
		System.out.println("�ݿø�(3) : "+ Math.round(value * 100));
		System.out.println("�ݿø�(4) : "+ Math.round(value * 100) / 100.0);
		
		System.out.println();
		System.out.println("�ø� : " + Math.ceil(1.111));
		System.out.println("���� : " + Math.floor(1.999));
		System.out.println("�� �� �� ū ���� ��ȯ : " + Math.max(10,15));
		System.out.println("�� �� �� ū ���� ��ȯ : " + Math.max(a,b));
		System.out.println("�� �� �� ���� ���� ��ȯ : " + Math.min(-3,-55));
	}
}
