package myobj.yachtDice;

public class Dice {

	int[] dice; // 주사위 배열
	
	
	public int[] setting(int x) { // 게임 준비
		dice = new int[5]; // 주사위 5개 만듬
		for (int i = 0; i < dice.length; i++) { // 주사위 5개에 (1 ~ 6)랜덤으로 나오게 만듬
			dice[i] = (int)(Math.random()*6+1);
		}
		return dice;
	}
	
	public Dice() {
	}
	
	public void throwDice(int one) { // 1개 다시 던짐
		dice[one] = (int)(Math.random()*6+1);
		
		this.dice[one] = dice[one];
	}

	public void throwDice(int one, int two) { // 2개 다시 던짐
		dice[one] = (int)(Math.random()*6+1);
		dice[two] = (int)(Math.random()*6+1);
		
		this.dice[one] = dice[one];
		this.dice[two] = dice[two];
	}

	public void throwDice(int one, int two, int three) { // 3개 다시 던짐
		dice[one] = (int)(Math.random()*6+1);
		dice[two] = (int)(Math.random()*6+1);
		dice[three] = (int)(Math.random()*6+1);
		
		this.dice[one] = dice[one];
		this.dice[two] = dice[two];
		this.dice[three] = dice[three];
	}
	
	public void throwDice(int one, int two, int three, int four) { // 4개 다시 던짐
		dice[one] = (int)(Math.random()*6+1);
		dice[two] = (int)(Math.random()*6+1);
		dice[three] = (int)(Math.random()*6+1);
		dice[four] = (int)(Math.random()*6+1);
		
		this.dice[one] = dice[one];
		this.dice[two] = dice[two];
		this.dice[three] = dice[three];
		this.dice[four] = dice[four];
	}
	
	public void throwDice(int one, int two, int three, int four, int five) { // 5개 다시 던짐
		dice[one] = (int)(Math.random()*6+1);
		dice[two] = (int)(Math.random()*6+1);
		dice[three] = (int)(Math.random()*6+1);
		dice[four] = (int)(Math.random()*6+1);
		dice[five] = (int)(Math.random()*6+1);
		
		this.dice[one] = dice[one];
		this.dice[two] = dice[two];
		this.dice[three] = dice[three];
		this.dice[four] = dice[four];
		this.dice[five] = dice[five];
	}
	
	public void print(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.println("[ " + (i+1) + " ] 번째 주사위" + " [" + x[i] + "]");
		}
	}
	

}
