package quiz;

import java.util.Scanner;

public class B15_SuffleText2 {

	/*
	 * 사용자로부터 문장을 입력받으면
	 * 해당 문장을 랜덤으로 뒤섞어 출력하는 프로그램을 만들어 보세요
	 * 강사님이 학생 것으로 푼것
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String text;

		System.out.println("문장을 입력하시오");
		text = sc.nextLine();

		char[] shuffled_text = text.toCharArray();


		for (int i = 0; i < 1000; i++) { 
			int x = (int) (Math.random() * shuffled_text.length); 

			char temp = shuffled_text[x];
			shuffled_text[x] = shuffled_text[0]; 
			shuffled_text[0] = temp;
		}

		System.out.println(shuffled_text);
		// 1. 입력받은 문장을 char[]로 변환
		char[]original_text = text.toCharArray();
		// 2. 문장의 길이와 같은 길이의 boolean 배열을 생성
		// (뽑았던 문자는 다시 뽑지 않기위해 표시 해놓는 용도)
		boolean[] pick = new boolean[original_text.length];
		// 3. 문자열을 만들기 위한 도구
		StringBuilder shuffled_text_builder = new StringBuilder();
		// 4. 빌더는 길이가 0으로 시작하면서 한 문자씩 추가한다
		// 원래 문장과 길이가 같아지면 모든 문자를추가완료한 것이므로 반복문 탈출
		while (shuffled_text_builder.length() != original_text.length) {
			// 5. 랜덤 위치(인덱스)를 하나 선택
			int random_index = (int)(Math.random()*original_text.length);
			// 6. 해당 인덱스가 뽑았던 적이 있으면 추가하지 않음
			if (!pick[random_index]) {
				shuffled_text_builder.append(original_text[random_index]);
				pick[random_index] = true;
			}
		}
		System.out.println(shuffled_text_builder);
	}
}
