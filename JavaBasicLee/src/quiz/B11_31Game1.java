package quiz;

import java.util.Scanner;

public class B11_31Game1 {
	/*
	 31게임을 만들어보세요
	 
	 1. 처음 프로그램을 실행하면 몇 명으로 시작할 지 선택한다
	 (인원은 최소 2명 이상이여야 한다) 
	 
	 2. 여러 플레이어가 번갈아가면서 숫자를 선택한다
	 (숫자는 1, 2, 3만 선택 가능하다)
	 
	 3. 누적된 숫자가 31 이상일 때 그 사람이 패배한다.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int max_Player;
		
		while (true) {
			System.out.print("몇 명? : ");
			max_Player = sc.nextInt();
			
			if (max_Player >= 2) {
				break;
			}
			System.out.println("다시 제대로 ");
		}
		
		System.out.println("플레이러는 " + max_Player + "명 입니다.");
		
		// 게임 프로그램
		
		int num = 0;
		int current_player = 0;
		
		while (true) {
			int user_num= -1; // 일부로 유효하지 않은 값을 넣어논것 아래 프로그램이 돌아가도록
			while (user_num <1 || user_num > 3) {
				System.out.printf("%d플레이어님 숫자를 입력하시오 >> ",current_player);
				user_num = sc.nextInt();
			}
			
			num += user_num;
			
			if (num >= 31) {
				System.out.printf("플레이어%d님의 패베!",current_player);
				break;
			}
			System.out.println("현재 숫자는" + num + "입니다.");
			current_player = (current_player + 1) % max_Player;
		}
	}

}
