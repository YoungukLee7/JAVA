package quiz;

import java.util.Scanner;

public class B15_SuffleText1 {
	/*
	 * 사용자로부터 문장을 입력받으면
	 * 해당 문장을 랜덤으로 뒤섞어 출력하는 프로그램을 만들어 보세요
	 * 강사님이 푼것
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String text;

		System.out.println("문장을 입력하시오");
		text = sc.nextLine();
		
		char[] shuffled_text = text.toCharArray();
		
		System.out.println(shuffled_text);
		
		 for (int i = 0; i < 100; i++) { // 100번 썩겠다
			int x = (int)(Math.random() * shuffled_text.length); // 위치를 랜덤으로 정함
			int y = (int)(Math.random() * shuffled_text.length); // 굳이 y까지 랜덤으로 할 필요가 없다
			
//			char temp = shuffled_text[x];		                 
//			shuffled_text[x] = shuffled_text[0];				 // y 대신 0을 넣는다
//			shuffled_text[0] = temp;
			
			char temp = shuffled_text[x];		// x값이 사라지기 때문에 저장해 놓는다
			shuffled_text[x] = shuffled_text[y]; // 랜덤으로 정한 위치들을 서로 바꿔준다
			shuffled_text[y] = temp; 
		}
		 System.out.println(shuffled_text);
	}

}
