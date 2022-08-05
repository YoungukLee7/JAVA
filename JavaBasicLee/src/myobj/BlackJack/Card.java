package myobj.BlackJack;

import java.util.Arrays;

public class Card {

	int[] card = new int[21];
	int[][] plusCard = { card };

	static String[] CARD_KINDS = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	static String[] CARD_SHAPE = { "◆", "♥", "♣", "♠" };

	public int[] card() { // card배열 보여주는 메서드
		return card;
		
	}

	public int[] game(int index) { // 처음 카드 2개를 랜덤으로 뽑아 시작하는 메서드
		// [0,0,0,0,0,0]으로 만듬
		Arrays.fill(card, 0);
		for (int i = 0; i < index; i++) {
			randomCard(i);
		}
		return card;
	}

	void randomCard(int index) { // 카드를 랜덤으로 뽑는 메서드
		card[index] = (int) (Math.random() * 13);
	}

	public int[] bonusCard(int index) { // 추가로 뽑을때 랜덤으로 카드를 주는 메서드
		randomCard(index);

		return card;
	}

	public int plus() { // 카드 총 합 메서드
		int sum = 0;
		for (int i = 0; i < card.length; i++) {
			sum += card[i];
		}
		return sum;
	}

	

	
}

	
	
	
	
	
	
	
	
	
	
	
	

