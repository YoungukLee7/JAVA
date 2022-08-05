package quiz;

import java.util.Scanner;

public class B11_31Game {
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
		
		int personNum;
		int num;
		int i;
		int count = 0;
		char player;
		
		while (true) {
			System.out.print("게임을 할 사람들의 수를 입력 해주세요. : ");
			personNum = sc.nextInt();
			if (personNum > 1) {
				break;
			}
			System.out.print("다시 ");
		} for (i = 1; i <= personNum; i++) {
				System.out.printf("%d번 플레이어가 참여\n",i);
			}
		
		while (true) {
			System.out.println("[1]");
			System.out.println("[2]");
			System.out.println("[3]");
			System.out.print("숫자를 선택 해주세요. : ");
			num = sc.nextInt();	
			if (num == 1) {
				System.out.println("숫자 1을 선택하였습니다.");
				count += 1;
				System.out.printf("현재 값 : %d\n",count);
			} else if (num == 2) {
				System.out.println("숫자 2을 선택하였습니다.");
				count += 2;
				System.out.printf("현재 값 : %d\n",count);
			} else if (num == 3){
				System.out.println("숫자 3을 선택하였습니다.");
				count += 3;
				System.out.printf("현재 값 : %d\n",count);
			} else {
				System.out.println("\n올바른 명령이 아닙니다.\n");
			}
			if (count >= 31) {
				System.out.println("\n총 합이 31 이상입니다.\n[게임에서 지셨습니다!] ");
				break;
			}
		}
		
	}

}
