package myobj.yacht;

import java.util.Arrays;

public class YachtDice {

	final static int GAME_SIZE = 5;
	final static int DICE_FACES = 6;
	
	private int life = 2;
	private int[] dices;
	private int[] count = new int[DICE_FACES];
	private String made;
	
	// 5개의 주사위를 굴려서 랜덤으로 1~6이 나오게 하는 메서드
	public YachtDice() { 
		dices = new int[GAME_SIZE];
		for (int i = 0; i < dices.length; i++) { 
			roll(i); // 랜덤 사용
		}
		check();
		
	}
	
	// 개수를 새 놓는 count 배열에 원하는 숫자가 있는지 체크하는 메서드
	boolean numberContains(int num) {
		return count[num -1] > 0;
	}
	
	// 개수를 새 놓는 count 배열에 원하는 횟수만큼 등장한 숫자가 있는지 체크하는 메서드
	boolean countContain(int cnt) {
		for (int i = 0; i < count.length; i++) {
			if (count[i] == cnt) {
				return true;
			}
		}
		return false;
	}
	
	// "245"라고 전달 받으면 2번째 4번째 5번째 주사위를 다시 던질 예정
	public void reroll(String idxs) {
		if (life < 1) {
			return;
		}
		for (int i = 0; i < idxs.length(); i++) {
			int index = idxs.charAt(i) - '0'; // index에 숫자를 집어 넣기 위해서 - '0'를 한다.
			if (index < 0 || index > GAME_SIZE) {
				continue; 
			}
			roll(index - 1);
		}
		life--;
		check();
	}
	
	// 현재 dices의 값으로 어떤 숫자가 몇개 있는지 세는 메서드
	void count() {
		// Arrays.fill(arr,val) : 배열을 원하는 값으로 한번에 가득 채우는 함수
		// [0,0,0,0,0,0]으로 만듬
		Arrays.fill(count, 0); 
		for (int i = 0; i < dices.length; i++) {
			count[dices[i]-1]++;
		}
		
	}
	// 현재 dices의 값을 통해 족보를 구분하는 메서드
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
	
	// 원하는 번째 주사위를 다시 굴리는 메서드,
	void roll(int index) { 
		dices[index] = (int)(Math.random()*6+1);
	}
	
	
	// 해당 클래스에 toString() 메서드를 오버라이드 하면 원하는 형태로 출력 가능하다
	@Override
	public String toString() {
		// String.format() : printf()처럼 문자열을 생성하고 싶을때 사용하는 함수
		return String.format("현재 주사위 : %s\n" + "현재 상태 : %s", Arrays.toString(dices),made); // 원하는 문자열을 return해준다
	}
	
	
}
