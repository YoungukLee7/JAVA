package quiz;

import java.awt.Checkbox;
import java.util.Scanner;

public class B07_Palindrome1 {
	/*
	 사용자로부터 단어를 하나 입력 받았을 때 
	 해당 단어가 완벽하게 대칭인지 아닌지 구분하는 프로그램을 만들어 보시오
	 
	 # 좌우 대칭단어 예시 - LEVEL, 스위스, 일요일, 기러기, ABBA, MOM, DAD
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String word;

		System.out.println("문장을 입력하라 > ");
		word = sc.nextLine();
		int pass = 0;
		int to_pass = word.length()/2;
		
		for (int i = 0; i < word.length()/2; i++) {

			char front_ch = word.charAt(i);
			char back_ch = word.charAt(word.length() - 1 - i);

			System.out.println("앞쪽 문자 : " + front_ch);
			System.out.println("뒤쪽 문자 : " + back_ch);
			
			if (front_ch == back_ch) {
				++pass;
				System.out.println("일치");
				System.out.println("===========================");
			} else {
				System.out.println("불일치");
				System.out.println("===========================");
			}
		}
			System.out.printf("좌우 대칭이 되기위해 필요한 일치는 %d개 입니다.\n", to_pass);
			System.out.printf("%d개의 문자가 일치합니다.\n", pass);
			
			if (to_pass == pass) {
				System.out.println("좌우대칭입니다.");
			} else {
				System.out.println("좌우 대칭이 아닙니다.");
			}
		} 
	}


