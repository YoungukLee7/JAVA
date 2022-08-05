
public class B05_Operator3 {
	/*
	 # ���� ������
	 = : ������ ������ �������� ���� �����Ѵ�
	 
	 # ���� ���� ������
	 - �ش� ������ ���� ������Ű�� ����
	 - +=, -=, *=, /= ...
	 
	 # ���� ������
	 - �ش� ������ ���� 1�� ������Ű�� ����
	 - ++ , --�� ��ġ�� ���� ����� �޶����� (2������ �ִ�)
	 - ++ , --�� �ڿ� ���̸� �ش� ���� ��� ����� ������ �Ŀ� ���� ���Ѵ�
	 - ++ , --�� �տ� ���̸� �ش� ���� ����� �����ϱ� ���� ���� ���Ѵ�
	 */
	public static void main(String[] args) {
		
		int num = 100;
		num = num + 5;
		
		num += 5; // num = num + 5;
		num *= 2; // num = num * 5;
		num /= 5; // num = num / 5;
		num %= 10; // num = num % 5;
		
		System.out.println(num);
		
		System.err.println("=========================");
		
		// ���� ���� ������ �̷��� �� ����
		num = 999;
	
		num += 3;
		System.out.println(num);
		num *= 3;
		System.out.println(num);
		num /= 5;
		System.out.println(num);
		num -= 10;
		System.out.println(num);
		num %= 30;
		System.out.println(num);
		
		// ���� ������
		System.err.println("=========================");
		
		num = 10;
		num++; // num = num + 1 �Ǵ� num += 1
		System.out.println(num);
		++num;
		System.out.println(num);
		num --; // num = num - 1 �Ǵ� num -= 1
		--num;
		System.out.println(num);
		
		System.err.println("=========================");
		
		num = 20;
		System.out.println(num++);
		System.out.println(num);
		System.out.println(++num);
		
		System.err.println("=========================");
		
		num = 20;
		System.out.println(num--);
		System.out.println(num);
		System.out.println(--num);
	}

}
