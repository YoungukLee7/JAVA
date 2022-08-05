package quiz;

import java.util.Arrays;
import java.util.Scanner;

import pirateGame.Player;


public class C06_PirateGame {

	/*
	  ������� ������ ��������
	  
	  1. ������ ���۵Ǹ� �÷��̾ ������� ���Ѵ�
	  
	  2. ���� �÷��̾ ���ư��鼭 ���ϴ� ��ġ�� Į�� ���
	  
	  3. Į�� � �� �ִ� Ȩ�� 20���� �ְ� �� �� 2���� ���� �ȴ�. (���� ��ġ�� �� �Ǹ��� �������� ����)
	  
	  4. �߸��� ���� Į�� � �÷��̾�� ���ӿ��� �й��Ѵ�
	  
	  5. ������ ��� �̾ �÷��� �� �� �ְ� , �� �÷��̾��� ������ ���� ����Ǿ�� �Ѵ�
	  
	 
	 */
	
	public static void main(String[] args) {

		// ���� �ο�
		int play;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("�÷��� �� �ο��� ��� �� ���Դϱ�? : ");
			play = sc.nextInt();

			if (play >= 2) {
				break;
			}
			System.out.println("�÷��� �� �ο��� �ٽ� �Է��ϼ���.");
		}

		System.out.println(play + "���� ��ϵǾ����ϴ�.");
		// ���� �ο� ��

		// ���� ������ ������ �ٽ� ���� �� �� �ְ�
		while (true) {

			int win = 0;
			int lose = 0;

			Player player = new Player(win, lose);

			// ���� ����
			
			System.out.println("[������ ���۵Ǿ����ϴ�!]");

			String[] pirateGame = new String[20]; // 20���� Ȩ�� �����

			for (int i = 0; i < 20; i++) {
				pirateGame[i] = (i + 1) + "��° Ȩ�Դϴ�.";
			}

			System.out.print(Arrays.toString(pirateGame));
			System.out.println();

			int x;
			int y;

			for (int i = 0; i < 100; i++) {
				x = (int) (Math.random() * 20);
				y = (int) (Math.random() * 20);

				pirateGame[x] = "���Դϴ�.";
				pirateGame[y] = "���Դϴ�.";
				if (x != y) {
					break;
				}
			}

			System.out.print(Arrays.toString(pirateGame));
			System.out.println();

			int current_player = 0;

			int[] sameNumber = new int[20]; // �ߺ��� Ȯ���ϱ� ���� ����

			for (int i = 0; i < sameNumber.length; i++) {
				System.out.printf("Į�� � ���� ������ �ּ���. %d�÷��̾�� : ", current_player);
				int choose = sc.nextInt();
				
				sameNumber[i] = choose;
				for (int j = 0; j < i; j++) {
					if (choose == sameNumber[j]) {
						System.out.println("�̹� �� ���Դϴ�. �ٽ� ������.");
						current_player -= 1;
						break;
					}

				}
				if (pirateGame[choose - 1] == "���Դϴ�.") {
					System.out.printf("������ ���Խ��ϴ�! %d�÷��̾���� ���ӿ��� �й��Ͽ����ϴ�~\n", current_player);
					System.out.println();
					break;
				}
				current_player = (current_player + 1) % play;
			}

		}

	}

}
