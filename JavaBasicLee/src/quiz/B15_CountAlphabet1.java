package quiz;

import java.util.Scanner;

public class B15_CountAlphabet1 {
	/*
	 사용자로부터 문장을 입력받으면
	 해당 문장에 각 알파뱃이 등장한 횟수를 배열에 저장한 후
	 1회 이상 등장한 알파벳만 몇 회 등장하였는지 출력해보세요
	 (대문자, 소문자는 따로 집계해야 함)
	 강사님 풀이
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String text;

		System.out.print("문자열을 입력하시오 ==> ");

		text = sc.nextLine();
		
		int[] lower = new int[26];
		int[] upper = new int[26];
		
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			
			if (ch >= 'A' && ch <= 'Z') {

				upper[ch - 'A']++;

			} else if (ch >= 'a' && ch <= 'z') {

				lower[ch - 'a']++;

			}
		}
		
		for (int i = 0; i < 26; i++) {
			if (lower[i] != 0) {
				System.out.printf("%c : %d\n", i + 'a',lower[i]);
			} if (upper[i] != 0) {
				System.out.printf("%c : %d\n", i + 'A',upper[i]);
			}
		}
		
	}

}
