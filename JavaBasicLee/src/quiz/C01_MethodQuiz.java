package quiz;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

/*
 # ���� �޼��带 �����ϰ� �ùٸ��� �����ϴ��� �׽�Ʈ �غ�����
 1. ������ ���ڰ� ���ĺ��̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
 2. ������ ���ڰ� 3�� ����̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
 3. ���ڸ� �ϳ� �����ϸ� ���ڿ� "¦���Դϴ�" �Ǵ� "Ȧ���Դϴ�"�� ��ȯ�ϴ� �Լ�
 4. ���ڸ� �����ϸ� �ش� ������ ��� ����� �迭 ���·� ��ȯ�ϴ� �Լ�
 5. ������ ������ �Ҽ���� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
 6. ���ڸ� �����ϸ� �ش� ������ ���丮�� ����� ��ȯ�ϴ� �Լ�
 	factorial : (n)*(n-1)*(n-2)...3*2*1
 */
public class C01_MethodQuiz {

	public static boolean alphabet(char a) {
		boolean real = true;
		if (a >= 'a' && a <= 'z' || a >= 'A' && a <= 'Z') {
			return true;
		} else {
			return false;

		}

	}

	public static boolean three_number(int a) {
		if (a % 3 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void choose(int a) {
		if ( a % 2 == 0) {
			System.out.println("¦���Դϴ�");
			return;
		} else {
			System.out.println("Ȧ���Դϴ�");
		} return;
	}
	
	// 4. ���ڸ� �����ϸ� �ش� ������ ��� ����� �迭 ���·� ��ȯ�ϴ� �Լ�
	public static int[] number_array(int a) {
		int[] num = new int [a];
		int cnt = 0;
		for(int i = 1; i <= a; i++){
			if(a % i == 0){
				num[i-1] = i;
				cnt++;
		    }
		}
		
		int[] yaksu = new int[cnt];
		
		int index = 0;
		for (int i = 0; i < a; ++i) {
			if (num[i] != 0) {
				yaksu[index++] = num[i];
			}
		}
		
		return yaksu;
	}
	
	public static boolean prime_number(int a) {
		int count = 0;
		for (int i = 2; i <= a; i++) {
			if ( a % i == 0) {
				count++;
			}
		}
		if (count == 1) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("1��");
		System.out.println(alphabet('A'));
		
		System.out.println("2��");
		System.out.println(three_number(12));
		
		System.out.println("3��");
		choose(19);
		
		System.out.println("4��");
		System.out.println(Arrays.toString(number_array(50)));
		
		System.out.println("5��");
		System.out.println(prime_number(15));
		
		
	}
	
}
