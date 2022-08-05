package quiz;

import java.util.Scanner;

public class B11_WhilePrime1 {
	/*
	 ����ڷκ��� ����(���)�� �Է� ������ 1���� �Է��� ���� ���̿� �����ϴ� ��� �Ҽ��� ����Ͻÿ�
	 ����ڰ� ������ �Է¹޴� ��� �ٽ� ����� �Է��ϰ� �����
	 
	 # �Ҽ� : ������ �������� ���� 1�� �ڱ� �ڽŹۿ� ���� ��
	 ex) 2 3 5 7 11 13 17 19
	 
	 while���� �̿��Ͽ� Ǯ��ÿ�
	 ������� Ǭ ��� count��� boolean�� �̿�
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int bound;
		
		System.out.print("���ڸ� �Է����ּ��� >> ");
		bound = sc.nextInt();
				
		int num = 2;
		while (num <= bound) {
         boolean prime = true;
         
         int chk = 2;
         double sqrt = Math.sqrt(num);
         while (chk <= sqrt) {
			if (num % chk == 0) {
				prime = false;
				break;
			}
			++chk;
		}
         if (prime) {
			System.out.print(num + " ");
		}
         ++num;
	}
	}
}
