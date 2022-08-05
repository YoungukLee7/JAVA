package quiz;

import java.util.Arrays;

public class B15_Lotto1 {
	/*
	 1. 1 ~ 45의 중복 없는 랜덤 숫자 7개를 생성하여 당첨 번호를 만들어보세요
	 2. 당첨될때까지 번호를 생성한 후에 몇 회만에 당첨됐는지 출력해보세요
	 강사님 풀이 1번
	 */
	public static void main(String[] args) {

		int win[] = new int[7];
		for (int i = 0; i < win.length; i++) {
			int newNum = (int) (Math.random() * 45 + 1);
			System.out.printf("새로 뽑은 번호는 %d입니다.\n", newNum);
			System.out.printf("%d번째 숫자를 뽑는 중 입니다.\n", i);

			win[i] = newNum;

			for (int j = 0; j < i; j++) {
				System.out.printf("이전에 뽑은 숫자를 검토중입니다.win[%d] : %d\n", j, win[j]);
				if (newNum == win[j]) {
					System.out.printf("중복을 찾았습니다!! %d번째 숫자를 다시 뽁겠습니다.\n", i);
					--i;
					break;
				}
			}

		}
		// Arrays.toString(arr) : 전달한 배열을 보기 좋은 문자열로 만들어 변환한다
		System.out.print(Arrays.toString(win));
	}

}
