package quiz;

import java.util.Scanner;

import myobj.pirate.Player;
import myobj.pirate.Tong;

public class C06_PirateGame1 {

	/*
	  통아저씨 게임을 만들어보세요
	  
	  1. 게임이 시작되면 플래이어가 몇명인지 정한다
	  
	  2. 여러 플래이어가 돌아가면서 원하는 위치에 칼을 찌른다
	  
	  3. 칼을 찌를 수 있는 홈은 20개가 있고 그 중 2개가 꽝이 된다. (꽝의 위치는 매 판마다 랜덤으로 설정)
	  
	  4. 잘못된 곳을 칼로 찌른 플레이어는 게임에서 패배한다
	  
	  5. 게임은 계속 이어서 플레이 할 수 있고 , 각 플레이어의 전적도 누적 집계되어야 한다
	  
	  강사님 풀이
	 */
	
	static int playerNum;
	static Player[] players;
	static Tong tong;
	static Scanner sc;
	
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		tong = new Tong();
		
		System.out.print("플레이어 수 >> ");
		playerNum = sc.nextInt();
		
		// Player를 여러 명 담을 수 있는 배열을 생성 (배열 안의 매용은 비어있다)
		players = new Player[playerNum];
		
		// Player 인스턴스를 생성해 배열 추가한다
		for (int i = 0; i < players.length; i++) {
			players[i] = new Player();
		}
		
		while (true) {
			System.out.println("1. 새게임");
			System.out.println("2. 전적 보기");
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
		// 새로 시작
		tong.rewind();
		
		int turn = 0;
		while (true) {
			int currentPlayer = turn % playerNum;
			
			tong.print();
			System.out.printf("[%d턴]Player %d의 차례 >>", turn + 1, currentPlayer +1 );
			int slotIndex = sc.nextInt() - 1;
			
			switch (tong.stab(slotIndex)) {
			case 1:
				turn++;
				break;
			case 0:
				System.out.println("다른 곳을 선택하세요.");
				break;
			case -1:
				System.out.printf("해적 아저씨가 날라갔습니다. Player %d님의 패배~\n ",currentPlayer+1);
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
