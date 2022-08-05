package quiz;

import java.time.chrono.HijrahChronology;
import java.util.Scanner;

public class B07_CountAlphabet {
	/*
	 * 사용자가 문장과 검색하고 싶은 알파벳을 입력하면 해당 문장에 알파벳이 몇 번 등장하는지 알려주는 프로그램을 만들어보세요 (대/소문자 모두
	 * 대/소문자 모두 세어야함)
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String sentence, word;
		int count = 0;

		System.out.print("문장을 입력하시오 : ");
		sentence = sc.nextLine();
		System.out.print("알파벳을 입력하시오 : ");
		word = sc.next();

		char user_input = word.charAt(0);
		char user_not_input;

		if (user_input >= 'a' && user_input <= 'z') {
			user_not_input = (char) (user_input - 32); // (대문자 만들기) 위의 if조건이 true면 자동 실행된다
		} else if (user_input >= 'A' && user_input <= 'Z') {
			user_not_input = (char) (user_input + 32); // (소문자 만들기) 위의 if조건이 true면 자동 실행된다
		} else {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		
		
		for (int i = 0; i < sentence.length(); i++) {

			char ch = sentence.charAt(i);

			if (ch == user_input || ch == user_not_input) { // ||로 user_not_input도 같이 실행하게 해준다
				System.out.printf("%d줄에 소문자 %c가 %d번 등장합니다.\n", i, ch, ++count);
			}
		}
	}

}
