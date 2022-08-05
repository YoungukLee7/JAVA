package myobj.yachtDice;

public class Score {

	int score;

	public void count(int[] startDice) {
		int sum = startDice[0] + startDice[1] + startDice[2] + startDice[3] + startDice[4];
		for (int i = 0; i < startDice.length; i++) {
			if (startDice[i] == 1 && startDice[i] == 2 && startDice[i] == 3 && startDice[i] == 4 && startDice[i] == 5 || 
				startDice[i] == 2 && startDice[i] == 3 && startDice[i] == 4 && startDice[i] == 5 && startDice[i] == 6	) {
				System.out.println("[라지 스트레이트]");
			}else if (startDice[i] == 1 && startDice[i] == 2 && startDice[i] == 3 && startDice[i] == 4 || 
				      startDice[i] == 2 && startDice[i] == 3 && startDice[i] == 4 && startDice[i] == 5 ||
				      startDice[i] == 3 && startDice[i] == 4 && startDice[i] == 5 && startDice[i] == 6) {
					  System.out.println("[스몰 스트레이트]");
			}else {
				System.out.println("주사위 총 합 : " + sum);
			}
		}
		
		int[] count = new int[6];
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		int cnt4 = 0;
		int cnt5 = 0;
		int cnt6 = 0;
		for (int i = 0; i < startDice.length; i++) {
			if (startDice[i] == 1) {
				cnt1++;
			}else if (startDice[i] == 2) {
				cnt2++;
			}else if (startDice[i] == 3) {
				cnt3++;
			}else if (startDice[i] == 4) {
				cnt4++;
			}else if (startDice[i] == 5) {
				cnt5++;
			}else if (startDice[i] == 6) {
				cnt6++;
			}
		}
		count[0] = cnt1;
		count[1] = cnt2;
		count[2] = cnt3;
		count[3] = cnt4;
		count[4] = cnt5;
		count[5] = cnt6;
		
		for (int i = 0; i < count.length; i++) {
			if (count[i] == 5) {
				System.out.println("[Yacht]");
			}else if (count[i] == 4) {
				System.out.println("[4 다이스]");
			}else if (count[i] == 3) {
				for (int j = 0; j < count.length; j++) {
					if (count[j] == 2) {
						System.out.println("[풀 하우스]");
				}
				}
			}
		}
		
	}

}
