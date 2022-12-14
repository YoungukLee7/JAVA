package quiz;

import java.util.Arrays;
import java.util.Scanner;

import javax.management.ValueExp;

import myobj.BlackJack.BlackjackDeck;
import myobj.BlackJack.Card1;
import myobj.BlackJack.Deck1;
import myobj.BlackJack.Player1;

/*
# 블랙잭을 만들어 보세요
1. 컴퓨터(딜러)와 사람 (플레이어)이 카드를 뽑는다
2. 처음에는 둘 모두 2장씩 받는다. 이 때 딜러의 카드는 한장 가려놓는다.
3. 플레이어는 카드를 받은 후 상황을 보고 뽑을지(hit)
   여기서 멈출지(stand)를 결정할 수 있다
4. 플레이어가 멈추면 딜러가 가려져있던 카드를 오픈하고 규칙에 따라 카드를 계속 뽑는다.
	 (딜러는 가지고 있는 카드 합이 16이하일 때 무조건 뽑고 , 17이상이면 무조건 멈춰야한다)
5. 플레이어의 카드 합이 딜러보다 높으면 승리한다.
	 플레이어 카드 합이 정확하게 21이면 만들수 있는 쵀대값으로 더 뽑지 않는다 (블랙잭)
	 플레이어의 카드 합이 21보다 크면 패베한다 (버스트)
6. A는 1로 쓸수도 있고 11로 쓸수도 있다
# 참고자료
https://www.247blackjack.com/
강사님 풀이
*/
public class C13_BlackJack1 {

	Deck1 deck1;
	
	Player1 dealer;
	Player1 player;

	Card1[] playerCards;
	Card1[] dealerCards;
	
	int playerCardIndex;
	int dealerCardIndex;
	
	
	public C13_BlackJack1() {
		
		deck1 = new BlackjackDeck(3);
		
		playerCards = new Card1[21]; // 21넘으면 지는거니까 가장 낮게 나올것을 예상하고 21로 범위지정
		dealerCards = new Card1[21];
		
		dealer = new Player1();
		dealer.setMoney(10000000);
		
		
		player = new Player1();
		player.setMoney(3000);
	}
	
	private int calcScore(Card1[] card1s) { // 뽑은 카드 점수 계산 메서드 
 		int valueSum = 0;
		
 		int aceCnt = 0;
 		
		for (int i = 0; card1s[i] != null; i++) {
			Card1 card1 = card1s[i];
			int value = card1.getValue();
			
			valueSum += card1.getValue();
			
			// A가 몇개있는지 세어야 한다
			if (value == 11) {
				aceCnt++;
			}
		}
		
		// 현재 합이 21을 초과하면서 A를 가지고 있다면 10을 뺄수 있다
			while (valueSum > 21 && aceCnt > 0) {
				valueSum -= 10;
				--aceCnt;
			}
		
		
		return valueSum;
	}
	
	private void dealerDraw() {
		dealerCards[dealerCardIndex++] = deck1.draw();
	}

	private void playerDraw() {
		playerCards[playerCardIndex++] = deck1.draw();
	}
	
	private void print() {
		System.out.print("dealer Cards : ");
		
		for (int i = 0; dealerCards[i] != null; i++) {
			System.out.print(dealerCards[i].getCardShape() + " ");
		}
		System.out.println();
		
		System.out.print("player Cards : ");
		
		for (int i = 0; playerCards[i] != null; i++) {
			System.out.print(playerCards[i].getCardShape() + " ");
		}
		System.out.printf("(%d)\n",calcScore(playerCards));
	}
	
	
	public void start() {
		
		Scanner sc = new Scanner(System.in);
		
		// 카드 섞고
		deck1.shuffle();
		
		// 딜러꺼 2장
		dealerDraw();
		dealerDraw();
		dealerCards[0].reverse();
		
//		(아래것을 위에 것 처럼 만듬)
//		dealerCards[dealerCardIndex] = deck1.draw();
//		dealerCardIndex++;
//		dealerCards[dealerCardIndex] = deck1.draw();
//		dealerCardIndex++;
		
		// 플레이어꺼 2장
		playerDraw();
		playerDraw();
		
		
		while (true) {
			
			print();
			System.out.println("1. Hit\t2. Stand : ");
			int select = sc.nextInt();
			
			if (select == 2) {
				break;
			}else if (select == 1) {
				playerDraw();
				
				// 뽑았는데 카드의 합이 21초과라면 간제로 게임 종료
				if (calcScore(playerCards) > 21) {
					break;
				} 
				
			}else {
				System.out.println("올바른 번호를 입력해주세요");
			}
		}
		
		print();
		
		// 딜러의 카드를 뽑으면서 누가 이겼는지 체크해야함
		
		int playerValue = calcScore(playerCards);
		
		if (playerValue > 21) {
			System.out.println("플레이어의 버스트입니다");
			player.lose();
			return;
		}
		
		System.out.println("이제 딜러가 카드를 뽑습니다");
		dealerCards[0].reverse();
		
		while (calcScore(dealerCards) < 17) {
			dealerDraw();
		}
		
		print();
		
		int dealerValue = calcScore(dealerCards);
		
		if (dealerValue > 21) {
			System.out.println("플레이어의 승리");
			player.win();
		}else if (playerValue < dealerValue) {
			System.out.println("딜러의 승리");
			player.lose();
		}else if (playerValue > dealerValue) {
			System.out.println("플레이어의 승리");
			player.win();
		}else {
			System.out.println("무승부입니다.");
			player.draw();
		}
		
		
//		System.out.println(Arrays.toString(dealerCards));
//		System.out.println(calcScore(dealerCards));
//		System.out.println(Arrays.toString(playerCards));
//		System.out.println(calcScore(playerCards));
	}
	
	public static void main(String[] args) {
		 new C13_BlackJack1().start();
	}
}
