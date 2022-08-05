package quiz;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class B07_PrintReverse {
	/*
	 사용자로부터 문장을 입력 받으면 그 문장을 거꾸로 출력하는 프로그램을 만드시오
	 */
	public static void main(String[] args) {
		
		String userWrite;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문장을 입력하라 > ");
		userWrite = sc.nextLine();
		
		// 문자열 길이 - 1 : 마지막 글자
		// 문자열 길이 - 2 : 뒤에서 2번째 글자
		// ...
		// 문자열 길이 - 문자열 길이 : 첫번째 글자
		System.out.println(userWrite.charAt(userWrite.length() - 1));
		System.out.println(userWrite.charAt(userWrite.length() - 2));
		
		for (int index = userWrite.length() - 1; index >=0; --index) {
			System.out.print(userWrite.charAt(index));
		}
		
		System.out.println();
		
		//		for (int i = userWrite.length()-1; i >= 0; i--) {
//			System.out.println(userWrite.charAt(i));
				
		}
	}


