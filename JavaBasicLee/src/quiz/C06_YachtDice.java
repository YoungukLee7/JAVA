package quiz;

import java.util.Arrays;
import java.util.Scanner;

import myobj.yachtDice.Dice;
import myobj.yachtDice.Score;

/*
 * # YachtDice 게임을 만들어보세요
 1. 플레이어는 5개의 주사위를 던진다. (주사위의 눈은 1~6)
 
 2. 5개의 주사위 눈 결과를 통해 다음을 구분해야 한다.
 (1) 풀하우스 (같은 눈이 2개/3개) 11133, 31313, 65556
 (2) 스몰 스트레이트 (1234/2345/3456) 42131, 65431
 (3) 라지 스트레이트 (12345/23456) 53421
 (4) 4 다이스 (같은 숫자 4개) 44441, 63666
 (6) Yacht (같은 숫자 5개) 44444,22222
 (7) 아무것도 만족하지 못한 경우 주사위 눈 합이 점수가 된다.
 
 3. 플레이어는 다시 던지고 싶은 주사위를 여러개 골라서 다시 던질 수 있다 (기회 2번)
 */
public class C06_YachtDice {

	static Dice dice;
	static Scanner sc;
	static Score score;
	static int[] startDice;
	
	
	public static void main(String[] args) {
		dice = new Dice();
		sc = new Scanner(System.in);
		score = new Score();

		System.out.println("[YachtDice] 게임을 시작합니다!");
		System.out.println("주사위를 던졌습니다~");
		startDice = dice.setting(0);
		dice.print(startDice);
		score.count(startDice);
		int turn = 0;
		while (turn < 2) {
				System.out.print("다시 던지고 싶은 곳이 있습니까? >> ");
				int num = sc.nextInt() - 1;
				int num1 = sc.nextInt() - 1;
				int num2 = sc.nextInt() - 1;
				dice.throwDice(num,num1,num2);
				dice.print(startDice);
				score.count(startDice);
			turn++;

		}
		System.out.println("[2턴] 다 사용하였습니다.");

	}
}