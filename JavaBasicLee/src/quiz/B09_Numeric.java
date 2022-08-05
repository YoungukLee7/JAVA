package quiz;

import java.util.Scanner;

public class B09_Numeric {
/*
 	 사용자가 어떤 문자열을 입력했을 때
 	 해당 문자열이 모두 숫자로만 구성되어 있는지 검사해보시오
 */
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean number_only = true;
		
		System.out.print("문자열을 입력하시오");
		String user_input = sc.next();
		
		for (int i = 0; i < user_input.length(); ++i) {
			
			char word = user_input.charAt(i);
			
			// 숫자가 아닌 문자가 발견된다면 false 로 바뀌고 반복을 중단한다
			if (word < '0' || word > '9') {
				number_only = false;
				break;
			} 
		}
		System.out.println("숫자로만 구성되어 있습니까? : " + number_only);
	}
}
