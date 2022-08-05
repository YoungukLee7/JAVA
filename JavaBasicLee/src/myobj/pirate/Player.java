package myobj.pirate;

public class Player {

	int win;
	int lose;
	
	public void print() {
		System.out.printf("Win: %d, Lose: %d, Rate: %.2f\n",win,lose,winRate());
	}
	
	public double winRate() { // �·� ���ϴ� ����
		if (win + lose == 0) {
			return 0.0;
		}
		
		return (double)win / ( win + lose ) * 100;
	}
	
	public void win() { // �̱� Ƚ��
		win++;
	}
	
	public void lose() { // �� Ƚ��
		lose++;
	}
}
