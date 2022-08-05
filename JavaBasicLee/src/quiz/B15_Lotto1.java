package quiz;

import java.util.Arrays;

public class B15_Lotto1 {
	/*
	 1. 1 ~ 45�� �ߺ� ���� ���� ���� 7���� �����Ͽ� ��÷ ��ȣ�� ��������
	 2. ��÷�ɶ����� ��ȣ�� ������ �Ŀ� �� ȸ���� ��÷�ƴ��� ����غ�����
	 ����� Ǯ�� 1��
	 */
	public static void main(String[] args) {

		int win[] = new int[7];
		for (int i = 0; i < win.length; i++) {
			int newNum = (int) (Math.random() * 45 + 1);
			System.out.printf("���� ���� ��ȣ�� %d�Դϴ�.\n", newNum);
			System.out.printf("%d��° ���ڸ� �̴� �� �Դϴ�.\n", i);

			win[i] = newNum;

			for (int j = 0; j < i; j++) {
				System.out.printf("������ ���� ���ڸ� �������Դϴ�.win[%d] : %d\n", j, win[j]);
				if (newNum == win[j]) {
					System.out.printf("�ߺ��� ã�ҽ��ϴ�!! %d��° ���ڸ� �ٽ� �Ȱڽ��ϴ�.\n", i);
					--i;
					break;
				}
			}

		}
		// Arrays.toString(arr) : ������ �迭�� ���� ���� ���ڿ��� ����� ��ȯ�Ѵ�
		System.out.print(Arrays.toString(win));
	}

}
