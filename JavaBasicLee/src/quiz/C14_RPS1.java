package quiz;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

import myobj.rps.Shape;

/*
가위바위보 게임을 만들어 보시오
강사님 풀이
*/
public class C14_RPS1 {

	
	public static void main(String[] args) {
//		Shape com = Shape.random();
//		
//		// 0은 바위 1은 가위 2는 보자기
//		// 이런것을 계발자가 외워야 하는 것을 매직넘버라고 한다
//		// 매직넘버는 개발한 당사자만 알고 있는 숫자이기 때문에 썩 좋은 형태는 아니다
//		Shape user =Shape.random();
//		
//		System.out.println("com: " + com.getName());
//		System.out.println("user: " + user.getName());
//		
//		int result = Shape.versus(com, user);
//		
//		System.out.println(result);
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			Boolean error = false;
			Shape com = Shape.random();
			Shape user;
			System.out.print("가위(0),바위(1),보(2)를 선택하시오 >> ");
			switch (sc.nextInt()) {
			case 0:
				user = Shape.SCISSORS;
				break;
			case 1:
				user = Shape.ROCK;
				break;
			case 2:
				user = Shape.PAPER;
				break;
			default:
				System.out.println("다시 선택하세요");
				user = null;
				error = true;
				break;
			}
			if (error) {
				// continue를 이용해서 while문 맨 꼭대기로 돌아간다
				continue;
			}
			System.out.printf("com: %s\tuser: %s\n",com.getName(),user.getName());
			switch (Shape.versus(com, user)) {
			case 1:
				System.out.println("컴퓨터가 이겼습니다");
				break;
			case 0:
				System.out.println("비겼습니다");
				break;
			case -1:
				System.out.println("당신이 이겼습니다");
				break;
			} 
		}
	}
}
