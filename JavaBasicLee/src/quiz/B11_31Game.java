package quiz;

import java.util.Scanner;

public class B11_31Game {
	/*
	 31������ ��������
	 
	 1. ó�� ���α׷��� �����ϸ� �� ������ ������ �� �����Ѵ�
	 (�ο��� �ּ� 2�� �̻��̿��� �Ѵ�) 
	 
	 2. ���� �÷��̾ �����ư��鼭 ���ڸ� �����Ѵ�
	 (���ڴ� 1, 2, 3�� ���� �����ϴ�)
	 
	 3. ������ ���ڰ� 31 �̻��� �� �� ����� �й��Ѵ�.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int personNum;
		int num;
		int i;
		int count = 0;
		char player;
		
		while (true) {
			System.out.print("������ �� ������� ���� �Է� ���ּ���. : ");
			personNum = sc.nextInt();
			if (personNum > 1) {
				break;
			}
			System.out.print("�ٽ� ");
		} for (i = 1; i <= personNum; i++) {
				System.out.printf("%d�� �÷��̾ ����\n",i);
			}
		
		while (true) {
			System.out.println("[1]");
			System.out.println("[2]");
			System.out.println("[3]");
			System.out.print("���ڸ� ���� ���ּ���. : ");
			num = sc.nextInt();	
			if (num == 1) {
				System.out.println("���� 1�� �����Ͽ����ϴ�.");
				count += 1;
				System.out.printf("���� �� : %d\n",count);
			} else if (num == 2) {
				System.out.println("���� 2�� �����Ͽ����ϴ�.");
				count += 2;
				System.out.printf("���� �� : %d\n",count);
			} else if (num == 3){
				System.out.println("���� 3�� �����Ͽ����ϴ�.");
				count += 3;
				System.out.printf("���� �� : %d\n",count);
			} else {
				System.out.println("\n�ùٸ� ����� �ƴմϴ�.\n");
			}
			if (count >= 31) {
				System.out.println("\n�� ���� 31 �̻��Դϴ�.\n[���ӿ��� ���̽��ϴ�!] ");
				break;
			}
		}
		
	}

}
