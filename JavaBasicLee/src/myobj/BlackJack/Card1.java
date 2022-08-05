package myobj.BlackJack;

abstract public class Card1 {

	protected boolean visible = true; // 카드 보이는것은 true
	
	abstract public void reverse(); // 카드 안보이는 것
	
	// abstract는 틀 짜줄때 사용 (진검다리 역할) (협업할때 많이 사용)
	abstract public int getValue(); // 카드 점수 계산할 때 사용

	abstract public String getCardShape(); // 카드 모양을 출력할 때 사용
		
	
	
}
