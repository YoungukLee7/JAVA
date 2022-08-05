package quiz;

import java.util.Scanner;

import myobj.rspGame.Rule;

	/*
	 가위바위보 게임을 만들어 보시오
	 */
	public class C14_RPS {
		static Scanner sc;
		static Rule rule;

		public static void main(String[] args) {
			sc = new Scanner(System.in);
			rule = new Rule();

			int playerSelect;

			while (true) {

				System.out.println("[가위 바위 보 게임을 시작합니다!]");

				System.out.println("0. 승률");
				System.out.println("1. 주먹");
				System.out.println("2. 가위");
				System.out.println("3. 보");
				System.out.print("플레이어가 고르세요 >> ");
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
					System.out.println("다른 번호를 입력하였습니다!");
					System.out.println("다시 입력하세요!");
					break;
				}
			}
		}

		static void resultPrint() { // 각각의 승률표
			System.out.println("=====================================");
			System.out.println("[CPU]");
			rule.cpuScore();
			System.out.println();
			System.out.println("[Player]");
			rule.playerScore();
			System.out.println("=====================================");
		}

	}





