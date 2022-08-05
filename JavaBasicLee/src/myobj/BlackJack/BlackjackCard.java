package myobj.BlackJack;

public class BlackjackCard extends Card1{

	private final static char[] SUITS = { '◆', '♥', '♣', '♠' };
		
	private final static String[] NUMBERS = 
		{ "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	
	private final static int[] VALUES = 
		{11,2,3,4,5,6,7,8,9,10,10,10,10};
	
	
	private int suit;
	private int num;
	
	
	public BlackjackCard(int suit, int num) {
		this.suit = suit;
		this.num = num;
	}
	
	public void reverse() { // 카드 뒷면
		visible = !visible;
	}
	
	@Override  //  카드 들어가는 것을 보기 위해 사용
	public String toString() {
		return String.format("shape: %c%s\tvalue: %d\n", SUITS[suit],NUMBERS[num],VALUES[num]);
	}
	
	
	@Override
	public int getValue() {
		return VALUES[num];
	}

	@Override
	public String getCardShape() {
		if (visible) { // 카드 둘다 보이는 것은 이것으로
			return String.format("%c%s", SUITS[suit],NUMBERS[num]);
		}else { // visible가 false면 아래가 뜨게
			return "[뒷면]";
		}
	}

	
	
	
}
