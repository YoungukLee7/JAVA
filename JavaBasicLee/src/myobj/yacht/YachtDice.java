package myobj.yacht;

import java.util.Arrays;

public class YachtDice {

	final static int GAME_SIZE = 5;
	final static int DICE_FACES = 6;
	
	private int life = 2;
	private int[] dices;
	private int[] count = new int[DICE_FACES];
	private String made;
	
	// 5���� �ֻ����� ������ �������� 1~6�� ������ �ϴ� �޼���
	public YachtDice() { 
		dices = new int[GAME_SIZE];
		for (int i = 0; i < dices.length; i++) { 
			roll(i); // ���� ���
		}
		check();
		
	}
	
	// ������ �� ���� count �迭�� ���ϴ� ���ڰ� �ִ��� üũ�ϴ� �޼���
	boolean numberContains(int num) {
		return count[num -1] > 0;
	}
	
	// ������ �� ���� count �迭�� ���ϴ� Ƚ����ŭ ������ ���ڰ� �ִ��� üũ�ϴ� �޼���
	boolean countContain(int cnt) {
		for (int i = 0; i < count.length; i++) {
			if (count[i] == cnt) {
				return true;
			}
		}
		return false;
	}
	
	// "245"��� ���� ������ 2��° 4��° 5��° �ֻ����� �ٽ� ���� ����
	public void reroll(String idxs) {
		if (life < 1) {
			return;
		}
		for (int i = 0; i < idxs.length(); i++) {
			int index = idxs.charAt(i) - '0'; // index�� ���ڸ� ���� �ֱ� ���ؼ� - '0'�� �Ѵ�.
			if (index < 0 || index > GAME_SIZE) {
				continue; 
			}
			roll(index - 1);
		}
		life--;
		check();
	}
	
	// ���� dices�� ������ � ���ڰ� � �ִ��� ���� �޼���
	void count() {
		// Arrays.fill(arr,val) : �迭�� ���ϴ� ������ �ѹ��� ���� ä��� �Լ�
		// [0,0,0,0,0,0]���� ����
		Arrays.fill(count, 0); 
		for (int i = 0; i < dices.length; i++) {
			count[dices[i]-1]++;
		}
		
	}
	// ���� dices�� ���� ���� ������ �����ϴ� �޼���
	void check() {
		count();
		
		if (countContain(5)) {
			made = "Yacht";
		}else if (countContain(4)) {
			made = "4 dice";
		}else if (countContain(3) && countContain(2)) {
			made = "full house";
		}else if (numberContains(2) && numberContains(3) && numberContains(4) && 
				numberContains(5) && (numberContains(1) || numberContains(6))) {
			made = "Large straight";
		}else if (numberContains(3) && numberContains(4) 
				&& ((numberContains(1) && numberContains(2))
				|| (numberContains(2) && numberContains(5))
				|| (numberContains(5) && numberContains(6)))) {
				made = "Small straight";
		}else {
			made = "" + (dices[0] + dices[1] + dices[2] + dices[3] + dices[4]);
		}
	}
	
	// ���ϴ� ��° �ֻ����� �ٽ� ������ �޼���,
	void roll(int index) { 
		dices[index] = (int)(Math.random()*6+1);
	}
	
	
	// �ش� Ŭ������ toString() �޼��带 �������̵� �ϸ� ���ϴ� ���·� ��� �����ϴ�
	@Override
	public String toString() {
		// String.format() : printf()ó�� ���ڿ��� �����ϰ� ������ ����ϴ� �Լ�
		return String.format("���� �ֻ��� : %s\n" + "���� ���� : %s", Arrays.toString(dices),made); // ���ϴ� ���ڿ��� return���ش�
	}
	
	
}
