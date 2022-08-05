package quiz;

public class B15_RandomScore1 {
	/*
	 1�� �л� 100���� ���� (0~100)�� �������� �����Ͽ� �迭�� ����
	 2�� �迭�� ����� ���� ���� ���� ���·� ���
	 3�� ��� �л����� ��� ������ ��� (�Ҽ� ��°�ڸ����� ���)
	 4�� �迭�� ����� ���� �� ���� ���� ������ ���� ���������� ���
	 ����� Ǯ��
	 */
	public static void main(String[] args) {

		// 1.
		int[] score = new int[100];
		for (int i = 0; i < 100; i++) {
			score[i] = (int) (Math.random() * 101);
		}
		// 2.
		for (int i = 0; i < score.length; i++) {
			System.out.println("��������������");
			System.out.printf ("�� %3d ��\n",score[i]);
			System.out.println("��������������");
		}
		// 3.
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.printf("���� : %d, ��� : %.2f\n",sum,sum/100.0);
		
		// 4.
		int best=0, worst=100;
		for (int i = 0; i < score.length; i++) {
			best = best < score[i] ? score[i] : best;
			worst = worst > score[i] ? score[i] : worst;
		}
		System.out.printf("�ִ밪 : %d, �ּҰ� : %d\n",best,worst);
	}

}
