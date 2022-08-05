package quiz;

import java.util.Arrays;
import java.util.function.BiConsumer;

public class B15_Lotto {

	/*
	 1. 1 ~ 45의 중복 없는 랜덤 숫자 7개를 생성하여 당첨 번호를 만들어보세요
	 2. 당첨될때까지 번호를 생성한 후에 몇 회만에 당첨됐는지 출력해보세요
	 
	 */
	public static void main(String[] args) {
		
		int cnt = 0;
		
		int[] number = new int[7];
		
		for (int i = 0; i < number.length; i++) {
			number[i] = (int)(Math.random()*45)+1;
			for (int j = 0; j < i; j++) {
				if (number[i] == number[j]) {
					--i;
					break;
				}
			}
		}
		System.out.print(Arrays.toString(number) + "\n");
		
		
		int[] same_number = new int[7];
		
		while (true) {
			for (int i = 0; i < same_number.length; i++) {
				same_number[i] = (int)(Math.random()*45)+1;
				for (int j = 0; j < i; j++) {
					if (same_number[i] == same_number[j]) {
						--i;
						break;
					} if (Arrays.toString(same_number) == Arrays.toString(number)) {
						break;
					} else {
						cnt++;
					}
				}
			}
			System.out.print(Arrays.toString(same_number) + "\n");
		}
	}

}
