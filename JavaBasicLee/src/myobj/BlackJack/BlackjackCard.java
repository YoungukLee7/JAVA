package myobj.BlackJack;

public class BlackjackCard extends Card1{

	private final static char[] SUITS = { '��', '��', '��', '��' };
		
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
	
	public void reverse() { // ī�� �޸�
		visible = !visible;
	}
	
	@Override  //  ī�� ���� ���� ���� ���� ���
	public String toString() {
		return String.format("shape: %c%s\tvalue: %d\n", SUITS[suit],NUMBERS[num],VALUES[num]);
	}
	
	
	@Override
	public int getValue() {
		return VALUES[num];
	}

	@Override
	public String getCardShape() {
		if (visible) { // ī�� �Ѵ� ���̴� ���� �̰�����
			return String.format("%c%s", SUITS[suit],NUMBERS[num]);
		}else { // visible�� false�� �Ʒ��� �߰�
			return "[�޸�]";
		}
	}

	
	
	
}
