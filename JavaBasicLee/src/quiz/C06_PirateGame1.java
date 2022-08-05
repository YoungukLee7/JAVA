package quiz;

import java.util.Scanner;

import myobj.pirate.Player;
import myobj.pirate.Tong;

public class C06_PirateGame1 {

	/*
	  ������� ������ ��������
	  
	  1. ������ ���۵Ǹ� �÷��̾ ������� ���Ѵ�
	  
	  2. ���� �÷��̾ ���ư��鼭 ���ϴ� ��ġ�� Į�� ���
	  
	  3. Į�� � �� �ִ� Ȩ�� 20���� �ְ� �� �� 2���� ���� �ȴ�. (���� ��ġ�� �� �Ǹ��� �������� ����)
	  
	  4. �߸��� ���� Į�� � �÷��̾�� ���ӿ��� �й��Ѵ�
	  
	  5. ������ ��� �̾ �÷��� �� �� �ְ� , �� �÷��̾��� ������ ���� ����Ǿ�� �Ѵ�
	  
	  ����� Ǯ��
	 */
	
	static int playerNum;
	static Player[] players;
	static Tong tong;
	static Scanner sc;
	
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		tong = new Tong();
		
		System.out.print("�÷��̾� �� >> ");
		playerNum = sc.nextInt();
		
		// Player�� ���� �� ���� �� �ִ� �迭�� ���� (�迭 ���� �ſ��� ����ִ�)
		players = new Player[playerNum];
		
		// Player �ν��Ͻ��� ������ �迭 �߰��Ѵ�
		for (int i = 0; i < players.length; i++) {
			players[i] = new Player();
		}
		
		while (true) {
			System.out.println("1. ������");
			System.out.println("2. ���� ����");
			System.out.println("> ");
			
			switch(sc.nextInt()) {
			case 1:
				game();
				break;
			case 2:
				record();
				break;
			default:
				break;
			}
		}
		
	}
	static void record() {
		for (int i = 0; i < playerNum; i++) {
			System.out.println("[Player " + (i+1) + "]");
			players[i].print();
			
		}
	}
	
	static void game() {
		// ���� ����
		tong.rewind();
		
		int turn = 0;
		while (true) {
			int currentPlayer = turn % playerNum;
			
			tong.print();
			System.out.printf("[%d��]Player %d�� ���� >>", turn + 1, currentPlayer +1 );
			int slotIndex = sc.nextInt() - 1;
			
			switch (tong.stab(slotIndex)) {
			case 1:
				turn++;
				break;
			case 0:
				System.out.println("�ٸ� ���� �����ϼ���.");
				break;
			case -1:
				System.out.printf("���� �������� ���󰬽��ϴ�. Player %d���� �й�~\n ",currentPlayer+1);
				for (int i = 0; i < playerNum; i++) {
					if (i == currentPlayer) {
						players[i].lose();
					} else {
						players[i].win();
					}
				}
				return;
			}
		}
	}
}
