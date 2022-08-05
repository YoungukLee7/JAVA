package myobj.pirate;

public class Tong {

	final static int GAME_SIZE = 20;

	boolean[] slot; // ���� ����� ���� �ʱⰪ�� �� false�� �����Ѵ�.
	int[] launch = new int[2];

	public Tong() {
		// rewind(); // �����ε带 �ʱ�ȭ ���� �ֱ� ����
	}
	
	// �� ���� �����Ҷ� ������� �����ֱ� �޼���
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
	 @param slotIndex - ��� ���� ��ȣ�� �ŰԺ����� �����ؾ� �մϴ�
	 @return ��÷ ��ȣ�� ������ ��� -1.�ùٸ��� � ��� 1. �񷶴� ���� �� � ��� 0.
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
			System.out.println("�̹� �񷶴� ���Դϴ�.");
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
