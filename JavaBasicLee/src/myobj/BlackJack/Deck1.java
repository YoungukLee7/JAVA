package myobj.BlackJack;

abstract public class Deck1 {
	
	// abstract는 틀 짜줄때 사용 (진검다리 역할) (협업할때 많이 사용)
	abstract public void shuffle(); // 카드 섞을때
	
	abstract public Card1 draw(); // 카드 뽑을때
}
