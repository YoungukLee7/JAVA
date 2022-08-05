package myobj.pirate;

public class Player {

	int win;
	int lose;
	
	public void print() {
		System.out.printf("Win: %d, Lose: %d, Rate: %.2f\n",win,lose,winRate());
	}
	
	public double winRate() { // ½Â·ü ±¸ÇÏ´Â °ø½Ä
		if (win + lose == 0) {
			return 0.0;
		}
		
		return (double)win / ( win + lose ) * 100;
	}
	
	public void win() { // ÀÌ±ä È½¼ö
		win++;
	}
	
	public void lose() { // Áø È½¼ö
		lose++;
	}
}
