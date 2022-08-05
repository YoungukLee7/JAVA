package quiz;

import java.util.Scanner;

import myobj.rspGame.Rule;

	/*
	 ���������� ������ ����� ���ÿ�
	 */
	public class C14_RPS {
		static Scanner sc;
		static Rule rule;

		public static void main(String[] args) {
			sc = new Scanner(System.in);
			rule = new Rule();

			int playerSelect;

			while (true) {

				System.out.println("[���� ���� �� ������ �����մϴ�!]");

				System.out.println("0. �·�");
				System.out.println("1. �ָ�");
				System.out.println("2. ����");
				System.out.println("3. ��");
				System.out.print("�÷��̾ ������ >> ");
				playerSelect = sc.nextInt();
				switch (playerSelect) {
				case 0:
					resultPrint();
					break;
				case 1:
					rule.rock();
					break;
				case 2:
					rule.scissors();
					break;
				case 3:
					rule.paper();
					break;
				default:
					System.out.println("�ٸ� ��ȣ�� �Է��Ͽ����ϴ�!");
					System.out.println("�ٽ� �Է��ϼ���!");
					break;
				}
			}
		}

		static void resultPrint() { // ������ �·�ǥ
			System.out.println("=====================================");
			System.out.println("[CPU]");
			rule.cpuScore();
			System.out.println();
			System.out.println("[Player]");
			rule.playerScore();
			System.out.println("=====================================");
		}

	}





