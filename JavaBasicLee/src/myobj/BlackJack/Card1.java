package myobj.BlackJack;

abstract public class Card1 {

	protected boolean visible = true; // ī�� ���̴°��� true
	
	abstract public void reverse(); // ī�� �Ⱥ��̴� ��
	
	// abstract�� Ʋ ¥�ٶ� ��� (���˴ٸ� ����) (�����Ҷ� ���� ���)
	abstract public int getValue(); // ī�� ���� ����� �� ���

	abstract public String getCardShape(); // ī�� ����� ����� �� ���
		
	
	
}
