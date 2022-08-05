package quiz;

public class B15_RandomScore {

	/*
	 1�� �л� 100���� ���� (0~100)�� �������� �����Ͽ� �迭�� ����
	 2�� �迭�� ����� ���� ���� ���� ���·� ���
	 3�� ��� �л����� ��� ������ ��� (�Ҽ� ��°�ڸ����� ���)
	 4�� �迭�� ����� ���� �� ���� ���� ������ ���� ���������� ���
	 */
	public static void main(String[] args) {

		int sum = 0;
		int max = 0;
		int min = 100;
//		 1�� �л� 100���� ���� (0~100)�� �������� �����Ͽ� �迭�� ����
		int[] student = new int[100];
		for (int i = 0; i < student.length; i++) {
			student[i] = (int) (Math.random() * 100);
			if (max < student[i]) {
				max = student[i];
			}

			if (min > student[i]) {
				min = student[i];
			}
			sum += student[i];
//		 2�� �迭�� ����� ���� ���� ���� ���·� ���
			System.out.printf("student[%2d] : %d\n", i, student[i]);
		}
//		 3�� ��� �л����� ��� ������ ��� (�Ҽ� ��°�ڸ����� ���)
		System.out.printf("������� : %.2f\n", sum / 100.0);
//		 4�� �迭�� ����� ���� �� ���� ���� ������ ���� ���������� ���
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
	}

}
