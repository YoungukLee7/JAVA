package quiz;

import java.util.Scanner;

import javax.management.Query;

public class B07_CountAlphabet2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str, query;

		System.out.print("문장을 입력하시오 : ");
		str = sc.nextLine();
		System.out.print("알파벳을 입력하시오 : ");
		query = sc.next();

		if (query.length() > 1) {
			System.out.println("하나만 입력해라");
			return;
		}

		// 사용자가 검색어로 소문자를 입력했다면 대문자를 q2에 추가한다
		char q1 = query.charAt(0);
		char q2;
		// 사용자가 검색어로 대문자를 입력했다면 소문자를 q2에 추가한다

		if (q1 >= 'a' && q1 <= 'z') {
			q2 = (char) (q1 - 32);
		}
		if (q1 >= 'A' && q1 <= 'Z') {
			q2 = (char) (q1 + 32);
		} else {
			System.out.println("검색어는 영어만 가능합니다");
			return;
		}

		int cnt = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch == q1 || ch == q2) { // ||로 user_not_input도 같이 실행하게 해준다
				++cnt;
			}
		}
		System.out.printf("%s에서 %c 또는 %c는 %d번 등장합니다.\n", str, q1, q2, cnt);
	}
}