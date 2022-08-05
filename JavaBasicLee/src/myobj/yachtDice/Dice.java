package myobj.yachtDice;

public class Dice {

	int[] dice; // �ֻ��� �迭
	
	
	public int[] setting(int x) { // ���� �غ�
		dice = new int[5]; // �ֻ��� 5�� ����
		for (int i = 0; i < dice.length; i++) { // �ֻ��� 5���� (1 ~ 6)�������� ������ ����
			dice[i] = (int)(Math.random()*6+1);
		}
		return dice;
	}
	
	public Dice() {
	}
	
	public void throwDice(int one) { // 1�� �ٽ� ����
		dice[one] = (int)(Math.random()*6+1);
		
		this.dice[one] = dice[one];
	}

	public void throwDice(int one, int two) { // 2�� �ٽ� ����
		dice[one] = (int)(Math.random()*6+1);
		dice[two] = (int)(Math.random()*6+1);
		
		this.dice[one] = dice[one];
		this.dice[two] = dice[two];
	}

	public void throwDice(int one, int two, int three) { // 3�� �ٽ� ����
		dice[one] = (int)(Math.random()*6+1);
		dice[two] = (int)(Math.random()*6+1);
		dice[three] = (int)(Math.random()*6+1);
		
		this.dice[one] = dice[one];
		this.dice[two] = dice[two];
		this.dice[three] = dice[three];
	}
	
	public void throwDice(int one, int two, int three, int four) { // 4�� �ٽ� ����
		dice[one] = (int)(Math.random()*6+1);
		dice[two] = (int)(Math.random()*6+1);
		dice[three] = (int)(Math.random()*6+1);
		dice[four] = (int)(Math.random()*6+1);
		
		this.dice[one] = dice[one];
		this.dice[two] = dice[two];
		this.dice[three] = dice[three];
		this.dice[four] = dice[four];
	}
	
	public void throwDice(int one, int two, int three, int four, int five) { // 5�� �ٽ� ����
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
			System.out.println("[ " + (i+1) + " ] ��° �ֻ���" + " [" + x[i] + "]");
		}
	}
	

}
