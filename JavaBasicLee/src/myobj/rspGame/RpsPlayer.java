package myobj.rspGame;

public class RpsPlayer {

	int win;
	int lose;
	int draw;
	
	public void win(){ // ÀÌ±è
		win++;
	}
	
	public void lose() { // Áü
		lose++;
	}
	
	public void draw() { // ºñ±è
		draw++;
	}
	
	public double rate() { // ½Â·ü
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
