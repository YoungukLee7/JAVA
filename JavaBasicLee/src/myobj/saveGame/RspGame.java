package myobj.saveGame;

public class RspGame {
	
	final public static RspGame ROCK = new RspGame(0);
	final public static RspGame SCISSORS = new RspGame(1);
	final public static RspGame PAPER = new RspGame(2);
	
	final private  static RspGame[] rspGame= {ROCK,SCISSORS,PAPER};
	final private  static String[] rspGameName= {"¡÷∏‘","∞°¿ß","∫∏"};
	int rsp;
	
	private RspGame(int rsp) {
		this.rsp = rsp;
	}
	
	public static RspGame random() {
		return rspGame[(int)(Math.random()*rspGame.length)];
	}
	
	public int getRsp() {
		return rsp;
	}
	
	public String getRspGameName() {
		return rspGameName[rsp];
	}
	
	public static int check(RspGame p, RspGame c) {
		int left = p.getRsp();
		int right = c.getRsp();
		if (left == right) {
			return 0;
		}else if ((left + 1) % 3 == right) {
			return 1;
		}else {
			return -1;
		}
	}
}
