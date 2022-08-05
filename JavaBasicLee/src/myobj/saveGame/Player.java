package myobj.saveGame;


public class Player {

	int win;
	int lose;
	int draw;
 	
	public void win() {
		win++;
	}

	public void lose() {
		lose++;
	}

	public void draw() {
		draw++;
	}

	
	public String saveData() {
		
		String i = "win: " + win + " draw: " + draw + " lose: " + lose + "\n";
		
		return i;
	}
}
	


