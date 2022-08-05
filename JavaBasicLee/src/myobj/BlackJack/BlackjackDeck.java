package myobj.BlackJack;

import java.util.Arrays;


public class BlackjackDeck extends Deck1 {

	
	Card1[] cards;
	int size;
	
	int index;
	
	
	public BlackjackDeck(int size) { // ī�� �ġ
		this.size = size;
		this.cards = new Card1[52 * size];
		
		for (int i = 0; i < size; i++) {
			for (int suit = 0; suit < 4; suit++) {
				for (int num = 0; num < 13; num++) {
//					�ּ�ó�� �� ���� ī�尡 �� ����� ������ Ȯ���� ���� (�ؿ� main�� Ȯ����)
//					System.out.printf("[%d] %s\t [index:%d]\n",i ,new BlackjackCard(suit, num),
//							i * 52 + suit * 13 + num);
					cards[i * 52 + suit * 13 + num] = new BlackjackCard(suit, num);
				}
			}
		}
		shuffle();
	}
	
	
	@Override
	public void shuffle() {
		for (int i = 0,len = 200*size; i < len; i++) {
			int ranIndex = (int)(Math.random()*cards.length);
			Card1 temp = cards[0];
			cards[0] = cards[ranIndex];
			cards[ranIndex] = temp;
		}
	}

	@Override
	public Card1 draw() {
		return cards[index++];
	}
	
	public static void main(String[] args) {
//		new BlackjackDeck(2); //ī�尡 �� ����� ������ Ȯ���� ����
		System.out.println(Arrays.toString(new BlackjackDeck(2).cards)); //ī�尡 �� ������ Ȯ���غ� ��
	}

}
