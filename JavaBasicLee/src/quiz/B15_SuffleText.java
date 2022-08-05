package quiz;

import java.util.Scanner;

public class B15_SuffleText {

	/*
	 * 사용자로부터 문장을 입력받으면
	 * 해당 문장을 랜덤으로 뒤섞어 출력하는 프로그램을 만들어 보세요
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input;

		System.out.println("문장을 입력하시오");
		input = sc.nextLine();

		char[] word = input.toCharArray();

		for (int i = 0; i < word.length; i++) {
			char random_index = (char) (Math.random() * word.length);
			word[i] = word[random_index];
			System.out.print(word[i]); 
		}
	}

}
