package quiz;

import java.util.Arrays;

public class B15_Lotto2 {
	/*
	 1. 1 ~ 45의 중복 없는 랜덤 숫자 7개를 생성하여 당첨 번호를 만들어보세요
	 2. 당첨될때까지 번호를 생성한 후에 몇 회만에 당첨됐는지 출력해보세요
	 강사님 풀이 2번
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
		// 2번 풀이
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
			// System.out.printf("자동 번호", Arrays.toString(auto));

			// 일치하는 번호 개수 세기
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
				System.out.printf("1등 당첨! (%d회 시도함)\n", auto_cnt);
				System.out.println("당첨번호 : " + Arrays.toString(win));
				System.out.println("당첨번호 : " + Arrays.toString(auto));
				break;
			} else if (cnt == 6) {
				System.out.printf("2등 당첨! (%d회 시도함)\n", auto_cnt);
				System.out.println("당첨번호 : " + Arrays.toString(win));
				System.out.println("당첨번호 : " + Arrays.toString(auto));
//				break;
			}
		}
	}
}
