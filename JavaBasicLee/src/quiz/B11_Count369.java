package quiz;

import java.util.Scanner;

public class B11_Count369 {
/*
   사용자로부터 정수를 하나 입력받고
   해당 숫자까지 369 게임이 진행된다면 박수를 총 몇번 쳐야 하는지 출력하여 보시오
 */
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	int user_input;
	int count = 0;

	System.out.print("정수를 하나 입력하시오.");
	user_input = sc.nextInt();
	
	for (int i = 1; i <= user_input; i++) {
		int a = i/10; // 10의 자리 구분
		int b = i%10; // 1의 자리 구분
		
		if ( a == 3 || a == 6 || a == 9 ) {
			if ( b == 3 || b == 6 || b == 9 ) { 
				count += 2; // 10의 자리와 1의 자리가 다 369에 해당되면 박수 2번
				
				continue; // 위가 해당 없으면 다음것으로 넘어감
			}
			count++;
		}
		
		else if ( b == 3 || b == 6 || b == 9 ) 
			count++;
			else {
			}
	}
	System.out.println(count + "번 입니다.");
}
}
