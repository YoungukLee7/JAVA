package quiz;

import java.util.Arrays;

public class C01_MethodQuiz1 {
	/*
	 # ���� �޼��带 �����ϰ� �ùٸ��� �����ϴ��� �׽�Ʈ �غ�����
	 1. ������ ���ڰ� ���ĺ��̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	 2. ������ ���ڰ� 3�� ����̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	 3. ���ڸ� �ϳ� �����ϸ� ���ڿ� "¦���Դϴ�" �Ǵ� "Ȧ���Դϴ�"�� ��ȯ�ϴ� �Լ�
	 4. ���ڸ� �����ϸ� �ش� ������ ��� ����� �迭 ���·� ��ȯ�ϴ� �Լ�
	 5. ������ ������ �Ҽ���� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	 6. ���ڸ� �����ϸ� �ش� ������ ���丮�� ����� ��ȯ�ϴ� �Լ�
	 	factorial : (n)*(n-1)*(n-2)...3*2*1
	 	����� Ǯ��
	 */
	
	public static boolean isalphabet(char ch) {
		return (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z');
	}
	
	public static boolean isTriple(int num) {
		return num % 3 == 0;
	}
	
	public static String holjjak(int num) {
		return num % 2 == 0 ? "¦���Դϴ�" : "Ȧ���Դϴ�";
	}
	
	public static int yaksuCnt(int num) { // ��� ������ ���� �Լ�
		int cnt = 0;
		//1�̶� �ڱ� �ڽ��� �����ϰ� ���� ����
		for (int i = 2; i < num; i++) {
			if (num % i ==0) {
				++cnt;
			}
		}
		return cnt + 2;
	}
	
	public static int[] yaksu(int num) { // ��� �迭�� �����Ͽ� ��ȯ�ϴ� �Լ�(�ż���) 
		int[] yaksu = new int [yaksuCnt(num)];
		
		int index = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i ==0) {
				yaksu[index++] = i;
			}
		}
		return yaksu;
	}
	
	public static boolean isprime (int num) {
		double sqrt = Math.sqrt(num);   // �Ҽ����� Ȯ���Ҷ� ������ �Ⱥ��� ���ݸ� ������ Math.sqrt ���ش�
		for (int i = 2; i < num; i++) { 
			if (num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	 // ��� �Լ���� �Ѵ� (recursive)
	// - �ڱ� �ڽ��� �ҷ��� ����ϴ� �Լ�
	// - Ż�ⱸ�� ����� ���� ������ ����ؼ� ȣ���ϴ� ���� �����÷ο츦 ����Ų��
	// - ���� �����÷ο� : �ѹ��� �ʹ� ���� �Լ��� ȣ���ؼ� �߻��ϴ� �ַ�
	// - ������ �Ϲ� �Լ��� ���� ���������� �ݵ�� �ʿ��� ��찡 �����Ѵ�
	// - ���� �������� ���� ������ ��� �̰��� ����Ѵ�
	public static int refac(int num) { 

		System.out.printf("refac(%d)\n",num);
		
		if (num < 1) { 
			return -1; // ���ϰ��� -1�� �ؼ� �߸��� �Է��� �ߴٰ� ǥ���Ѵ�
		}else if (num == 1) { 
			return 1;
		} else {
			return num * refac(num - 1); // refac(num - 1) �ذ� �ȵǼ� �ݺ��Ѵ� -6000���� �ݺ��ϸ� ���� �����÷ο� �߻�
		}
	}
	
	public static int factorial(int num) {
		int f = num;
		
		System.out.printf("%d x ",num);
		for (int i = num - 1; i > 1; --i) {
			System.out.printf("%d x ",i);
			f *= i;
		}
		System.out.printf("1 = %d\n",f);
		
		return f;
	}
	
	public static void main(String[] args) {

		System.out.println("1��");
		System.out.println(isalphabet('A'));
		
		System.out.println("2��");
		System.out.println(isTriple('9'));
		
		System.out.println("3��");
		System.out.println(holjjak('6'));
		
		System.out.println("4��");
		System.out.println(yaksuCnt(50));
		System.out.println(Arrays.toString(yaksu(50)));
		
		System.out.println("5��");
		System.out.println(isprime(623987753));
		
		System.out.println("6��");
		System.out.println(factorial(9));
		
		System.out.println(refac(9));
	}

}
