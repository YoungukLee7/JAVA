package quiz;

import java.util.Arrays;

public class B15_Lotto2 {
	/*
	 1. 1 ~ 45�� �ߺ� ���� ���� ���� 7���� �����Ͽ� ��÷ ��ȣ�� ��������
	 2. ��÷�ɶ����� ��ȣ�� ������ �Ŀ� �� ȸ���� ��÷�ƴ��� ����غ�����
	 ����� Ǯ�� 2��
	 */
	public static void main(String[] args) {

		int win[] = new int[7];
		for (int i = 0; i < win.length; i++) {
			int newNum = (int) (Math.random() * 45 + 1);

			win[i] = newNum;

			for (int j = 0; j < i; j++) {
				if (newNum == win[j]) {
					--i;
					break;
				}
			}

		}
		System.out.print(Arrays.toString(win));
		// 2�� Ǯ��
		int auto_cnt = 0;
		while (true) {
			int auto[] = new int[7];

			for (int i = 0; i < auto.length; i++) {
				int newNum = (int) (Math.random() * 45 + 1);

				auto[i] = newNum;

				for (int j = 0; j < i; j++) {
					if (newNum == auto[j]) {
						--i;
						break;
					}
				}
			}
			++auto_cnt;
			// System.out.printf("�ڵ� ��ȣ", Arrays.toString(auto));

			// ��ġ�ϴ� ��ȣ ���� ����
			int cnt = 0;
			for (int i = 0; i < auto.length; i++) {
				for (int j = 0; j < win.length; j++) {
					if (auto[i] == win[j]) {
						++cnt;
						break;
					}
				}
			}
			if (cnt == 7) {
				System.out.printf("1�� ��÷! (%dȸ �õ���)\n", auto_cnt);
				System.out.println("��÷��ȣ : " + Arrays.toString(win));
				System.out.println("��÷��ȣ : " + Arrays.toString(auto));
				break;
			} else if (cnt == 6) {
				System.out.printf("2�� ��÷! (%dȸ �õ���)\n", auto_cnt);
				System.out.println("��÷��ȣ : " + Arrays.toString(win));
				System.out.println("��÷��ȣ : " + Arrays.toString(auto));
//				break;
			}
		}
	}
}
