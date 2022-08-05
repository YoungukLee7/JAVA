package quiz;

import java.util.Scanner;

/*
 사용자가 문장을 입력했을 때 해당 문장에 알파벳 e가 몇 번 등장하는지 알려주는 프로그램을 만들어보세요
 (대/소문자 모두 써야함)
 */
public class B07_CountE {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String check;
		int count = 0; // 문자열에서 몇 번쨰에 등장하는지 알려고 넣었다

		System.out.print("문장을 입력하시오 : ");
		check = sc.nextLine();

		for (int i = 0; i < check.length(); i++) {

			char word = check.charAt(i); // 문자열 하나하나씩 비교하기 위해 쓴다.

			if (word == 'e' || word == 'E') {
				count++; // 계속 발견하게 되면 늘어나야 하기 때문에 하나씩 늘어나게 한다
				System.out.printf("알파벳 e/E가 문자열 %d에서 총 %d번째 등장합니다.\n", i, count);
			}
		}
		System.out.printf("%s중 e/E가 총 %d번 등장합니다.",check,count);
	}
}
