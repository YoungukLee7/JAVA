package myobj.BlackJack;

import java.util.Arrays;

public class Card {

	int[] card = new int[21];
	int[][] plusCard = { card };

	static String[] CARD_KINDS = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	static String[] CARD_SHAPE = { "��", "��", "��", "��" };

	public int[] card() { // card�迭 �����ִ� �޼���
		return card;
		
	}

	public int[] game(int index) { // ó�� ī�� 2���� �������� �̾� �����ϴ� �޼���
		// [0,0,0,0,0,0]���� ����
		Arrays.fill(card, 0);
		for (int i = 0; i < index; i++) {
			randomCard(i);
		}
		return card;
	}

	void randomCard(int index) { // ī�带 �������� �̴� �޼���
		card[index] = (int) (Math.random() * 13);
	}

	public int[] bonusCard(int index) { // �߰��� ������ �������� ī�带 �ִ� �޼���
		randomCard(index);

		return card;
	}

	public int plus() { // ī�� �� �� �޼���
		int sum = 0;
		for (int i = 0; i < card.length; i++) {
			sum += card[i];
		}
		return sum;
	}

	

	
}

	
	
	
	
	
	
	
	
	
	
	
	

