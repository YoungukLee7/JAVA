package myobj.rspGame;

public class RpsPlayer {

	int win;
	int lose;
	int draw;
	
	public void win(){ // �̱�
		win++;
	}
	
	public void lose() { // ��
		lose++;
	}
	
	public void draw() { // ���
		draw++;
	}
	
	public double rate() { // �·�
		if (win + lose + draw == 0) {
			return 0.0;
		}else {
			return (double)win / ( win + lose + draw ) * 100;
		}
	}
	
	public void print() { 
		System.out.printf("Win: %d, Draw: %d, Lose: %d, Rate: %.2f\n",win,draw,lose,rate());
	}
}
