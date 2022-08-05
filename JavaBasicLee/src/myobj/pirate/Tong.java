package myobj.pirate;

public class Tong {

	final static int GAME_SIZE = 20;

	boolean[] slot; // 아직 찌른적이 없다 초기값이 다 false로 시작한다.
	int[] launch = new int[2];

	public Tong() {
		// rewind(); // 리와인드를 초기화 시켜 주기 위해
	}
	
	// 새 게임 시작할때 통아저씨 감나주기 메서드
	public void rewind() {
		slot = new boolean[GAME_SIZE];
		launch[0] = (int) (Math.random() * GAME_SIZE);

		while (true) {
			launch[1] = (int) (Math.random() * GAME_SIZE);
			if (launch[0] != launch[1]) {
				break;
			}
		}
	}

	/**
	 @param slotIndex - 찌르고 싶은 번호를 매게변수로 전달해야 합니다
	 @return 당첨 번호를 선택한 경우 -1.올바르게 찌른 경우 1. 찔렀던 곳을 또 찌른 경우 0.
	 */
	public int stab(int slotIndex) {
		if (launch[0] == slotIndex || launch[1] == slotIndex) {
			return -1;
		}else if (slotIndex <0 || slotIndex >= GAME_SIZE) {
			return 0;
		}else if (!slot[slotIndex]) {
			slot[slotIndex] = true;
			return 1; 
		} else {
			System.out.println("이미 찔렀던 곳입니다.");
			return 0; 
		}
	}

	public void print() {
		for (int i = 0; i < GAME_SIZE; i++) {
			if (!slot[i]) {
				System.out.printf("[%02d]\t",i+1);
			}else {
				System.out.print("[XX]\t");
			}
			if (i %5==4) {
				System.out.println();
			}
		}
	}
}
