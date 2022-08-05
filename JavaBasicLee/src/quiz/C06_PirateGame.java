package quiz;

import java.util.Arrays;
import java.util.Scanner;

import pirateGame.Player;


public class C06_PirateGame {

	/*
	  통아저씨 게임을 만들어보세요
	  
	  1. 게임이 시작되면 플래이어가 몇명인지 정한다
	  
	  2. 여러 플래이어가 돌아가면서 원하는 위치에 칼을 찌른다
	  
	  3. 칼을 찌를 수 있는 홈은 20개가 있고 그 중 2개가 꽝이 된다. (꽝의 위치는 매 판마다 랜덤으로 설정)
	  
	  4. 잘못된 곳을 칼로 찌른 플레이어는 게임에서 패배한다
	  
	  5. 게임은 계속 이어서 플레이 할 수 있고 , 각 플레이어의 전적도 누적 집계되어야 한다
	  
	 
	 */
	
	public static void main(String[] args) {

		// 게임 인원
		int play;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("플레이 할 인원이 모두 몇 명입니까? : ");
			play = sc.nextInt();

			if (play >= 2) {
				break;
			}
			System.out.println("플레이 할 인원을 다시 입력하세요.");
		}

		System.out.println(play + "명이 등록되었습니다.");
		// 게임 인원 끝

		// 게임 한판이 끝나도 다시 게임 할 수 있게
		while (true) {

			int win = 0;
			int lose = 0;

			Player player = new Player(win, lose);

			// 게임 시작
			
			System.out.println("[게임이 시작되었습니다!]");

			String[] pirateGame = new String[20]; // 20개의 홈을 만든다

			for (int i = 0; i < 20; i++) {
				pirateGame[i] = (i + 1) + "번째 홈입니다.";
			}

			System.out.print(Arrays.toString(pirateGame));
			System.out.println();

			int x;
			int y;

			for (int i = 0; i < 100; i++) {
				x = (int) (Math.random() * 20);
				y = (int) (Math.random() * 20);

				pirateGame[x] = "꽝입니다.";
				pirateGame[y] = "꽝입니다.";
				if (x != y) {
					break;
				}
			}

			System.out.print(Arrays.toString(pirateGame));
			System.out.println();

			int current_player = 0;

			int[] sameNumber = new int[20]; // 중복을 확인하기 위해 만듬

			for (int i = 0; i < sameNumber.length; i++) {
				System.out.printf("칼로 찌를 곳을 선택해 주세요. %d플레이어님 : ", current_player);
				int choose = sc.nextInt();
				
				sameNumber[i] = choose;
				for (int j = 0; j < i; j++) {
					if (choose == sameNumber[j]) {
						System.out.println("이미 고른 곳입니다. 다시 고르세요.");
						current_player -= 1;
						break;
					}

				}
				if (pirateGame[choose - 1] == "꽝입니다.") {
					System.out.printf("해적이 나왔습니다! %d플레이어님이 게임에서 패배하였습니다~\n", current_player);
					System.out.println();
					break;
				}
				current_player = (current_player + 1) % play;
			}

		}

	}

}
