package quiz;

import java.util.Scanner;

import javax.sql.rowset.JoinRowSet;

public class B10_Prime1 {
	/*
	 ����ڷκ��� ����(���)�� �Է� ������ 1���� �Է��� ���� ���̿� �����ϴ� ��� �Ҽ��� ����Ͻÿ�
	 ����ڰ� ������ �Է¹޴� ��� �ٽ� ����� �Է��ϰ� �����
	 
	 # �Ҽ� : ������ �������� ���� 1�� �ڱ� �ڽŹۿ� ���� ��
	 ex) 2 3 5 7 11 13 17 19
	 
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		for (;;) {
			System.out.println("2�̻��� ���ڸ� �Է����ּ��� >> ");
			num = sc.nextInt();
			
			if (num >2 ) {
			System.out.println("�� �Ͽ����ϴ�");
				break;
			}
			System.out.println("�ٽ� �Է��ϼ���");
		}
//		Scanner sc = new Scanner(System.in);
//		
//		int num;
//		
//		System.out.println("2�̻��� ���ڸ� �Է����ּ��� >> ");
//		for (num = sc.nextInt(); num < 2; num = sc.nextInt()) {
//			System.out.println("�ٽ� �Է��Ͻÿ�" + num);
//			System.out.println("2�̻��� ���ڸ� �Է����ּ��� >> ");
//		}
//		System.out.print("���ڰ� ����� �ԷµǾ����ϴ�. ");
		
		/*
			 1. 1���� �ڱ� �ڽű��� ������ �� ����� 2����� �Ҽ���
			 2. 2���� �ڱ� �ڽ� �ٷ� ������ �ϴ����� ����� 0���� �Ҽ���
			 3. 2���� �ش� ������ �����ٱ��� ������ �� ����� 0����� �Ҽ���.
			 4. �Է� ���� 100�̶� ������ ����� 1 2 4 5 10 20 25 50 100 �̸� 
			  - ��� 10�� ����ϸ� �Ǵϱ� �̰��� ��Ʈ 10�̶�� �Ѵ�
			 5. �ڵ��� ������ boolean���� Ǭ ����� �ִ�.
		 */
		
//		����ڷκ��� ����(���)�� �Է� ������ 1���� �Է��� ���� ���̿� �����ϴ� ��� �Ҽ��� ����Ͻÿ�
		for (int i = 2; i <= num; i++) {
			int cnt = 0;
			double sqrt = Math.sqrt(i); // �̸� ����� �ָ� �� ����
			for (int test = 2; test < sqrt; test++) {
				if (i % test==0) {
					++cnt;
					break;
				}
			}
			if (cnt == 0) {
				System.out.printf("%d�� �Ҽ��Դϴ�.\n",i);
			} 
			cnt = 0;
		}
		
	}

}
