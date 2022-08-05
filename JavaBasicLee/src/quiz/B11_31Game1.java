package quiz;

import java.util.Scanner;

public class B11_31Game1 {
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
		
		int max_Player;
		
		while (true) {
			System.out.print("�� ��? : ");
			max_Player = sc.nextInt();
			
			if (max_Player >= 2) {
				break;
			}
			System.out.println("�ٽ� ����� ");
		}
		
		System.out.println("�÷��̷��� " + max_Player + "�� �Դϴ�.");
		
		// ���� ���α׷�
		
		int num = 0;
		int current_player = 0;
		
		while (true) {
			int user_num= -1; // �Ϻη� ��ȿ���� ���� ���� �־��� �Ʒ� ���α׷��� ���ư�����
			while (user_num <1 || user_num > 3) {
				System.out.printf("%d�÷��̾�� ���ڸ� �Է��Ͻÿ� >> ",current_player);
				user_num = sc.nextInt();
			}
			
			num += user_num;
			
			if (num >= 31) {
				System.out.printf("�÷��̾�%d���� �к�!",current_player);
				break;
			}
			System.out.println("���� ���ڴ�" + num + "�Դϴ�.");
			current_player = (current_player + 1) % max_Player;
		}
	}

}
