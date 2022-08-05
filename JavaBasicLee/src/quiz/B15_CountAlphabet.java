package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class B15_CountAlphabet {

	/*
	 사용자로부터 문장을 입력받으면
	 해당 문장에 각 알파뱃이 등장한 횟수를 배열에 저장한 후
	 1회 이상 등장한 알파벳만 몇 회 등장하였는지 출력해보세요
	 (대문자, 소문자는 따로 집계해야 함)
	 */
	public static void main(String[] args) {

		int small[] = new int[26];
		int big[] = new int[26];

		Scanner sc = new Scanner(System.in);

		String alphabet;

		System.out.print("문자열을 입력하시오 ==> ");

		alphabet = sc.nextLine();

		for (int i = 0; i < alphabet.length(); i++) {

			char ch = alphabet.charAt(i);

			if (ch >= 'A' && ch <= 'Z') {

				big[ch - 'A'] = big[ch - 'A'] + 1;

			} else if (ch >= 'a' && ch <= 'z') {

				small[ch - 'a'] = small[ch - 'a'] + 1;

			}

		}
		System.out.println("===배열에 저장된 모습===");
		System.out.println(Arrays.toString(big));
		System.out.println(Arrays.toString(small));

		
		for (int i = 0; i < big.length; i++) {
			if (big[i] != 0) {
				System.out.println((char)(i+65) + "=" + big[i]);
			} if (small[i] != 0) {
				System.out.println((char)(i+97) + "=" + small[i]);
			}
		}
	}

}
