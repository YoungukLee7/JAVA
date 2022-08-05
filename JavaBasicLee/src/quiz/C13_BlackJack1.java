package quiz;

import java.util.Arrays;
import java.util.Scanner;

import javax.management.ValueExp;

import myobj.BlackJack.BlackjackDeck;
import myobj.BlackJack.Card1;
import myobj.BlackJack.Deck1;
import myobj.BlackJack.Player1;

/*
# ������ ����� ������
1. ��ǻ��(����)�� ��� (�÷��̾�)�� ī�带 �̴´�
2. ó������ �� ��� 2�徿 �޴´�. �� �� ������ ī��� ���� �������´�.
3. �÷��̾�� ī�带 ���� �� ��Ȳ�� ���� ������(hit)
   ���⼭ ������(stand)�� ������ �� �ִ�
4. �÷��̾ ���߸� ������ �������ִ� ī�带 �����ϰ� ��Ģ�� ���� ī�带 ��� �̴´�.
	 (������ ������ �ִ� ī�� ���� 16������ �� ������ �̰� , 17�̻��̸� ������ ������Ѵ�)
5. �÷��̾��� ī�� ���� �������� ������ �¸��Ѵ�.
	 �÷��̾� ī�� ���� ��Ȯ�ϰ� 21�̸� ����� �ִ� ���밪���� �� ���� �ʴ´� (����)
	 �÷��̾��� ī�� ���� 21���� ũ�� �к��Ѵ� (����Ʈ)
6. A�� 1�� ������ �ְ� 11�� ������ �ִ�
# �����ڷ�
https://www.247blackjack.com/
����� Ǯ��
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
		
		playerCards = new Card1[21]; // 21������ ���°Ŵϱ� ���� ���� ���ð��� �����ϰ� 21�� ��������
		dealerCards = new Card1[21];
		
		dealer = new Player1();
		dealer.setMoney(10000000);
		
		
		player = new Player1();
		player.setMoney(3000);
	}
	
	private int calcScore(Card1[] card1s) { // ���� ī�� ���� ��� �޼��� 
 		int valueSum = 0;
		
 		int aceCnt = 0;
 		
		for (int i = 0; card1s[i] != null; i++) {
			Card1 card1 = card1s[i];
			int value = card1.getValue();
			
			valueSum += card1.getValue();
			
			// A�� ��ִ��� ����� �Ѵ�
			if (value == 11) {
				aceCnt++;
			}
		}
		
		// ���� ���� 21�� �ʰ��ϸ鼭 A�� ������ �ִٸ� 10�� ���� �ִ�
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
		
		// ī�� ����
		deck1.shuffle();
		
		// ������ 2��
		dealerDraw();
		dealerDraw();
		dealerCards[0].reverse();
		
//		(�Ʒ����� ���� �� ó�� ����)
//		dealerCards[dealerCardIndex] = deck1.draw();
//		dealerCardIndex++;
//		dealerCards[dealerCardIndex] = deck1.draw();
//		dealerCardIndex++;
		
		// �÷��̾ 2��
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
				
				// �̾Ҵµ� ī���� ���� 21�ʰ���� ������ ���� ����
				if (calcScore(playerCards) > 21) {
					break;
				} 
				
			}else {
				System.out.println("�ùٸ� ��ȣ�� �Է����ּ���");
			}
		}
		
		print();
		
		// ������ ī�带 �����鼭 ���� �̰���� üũ�ؾ���
		
		int playerValue = calcScore(playerCards);
		
		if (playerValue > 21) {
			System.out.println("�÷��̾��� ����Ʈ�Դϴ�");
			player.lose();
			return;
		}
		
		System.out.println("���� ������ ī�带 �̽��ϴ�");
		dealerCards[0].reverse();
		
		while (calcScore(dealerCards) < 17) {
			dealerDraw();
		}
		
		print();
		
		int dealerValue = calcScore(dealerCards);
		
		if (dealerValue > 21) {
			System.out.println("�÷��̾��� �¸�");
			player.win();
		}else if (playerValue < dealerValue) {
			System.out.println("������ �¸�");
			player.lose();
		}else if (playerValue > dealerValue) {
			System.out.println("�÷��̾��� �¸�");
			player.win();
		}else {
			System.out.println("���º��Դϴ�.");
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
