package quiz;

import myobj.yacht.YachtDice;

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

public class C06_YachtDice1 {

	
	public static void main(String[] args) {
		YachtDice yacht = new YachtDice();
		
		
		System.out.println(yacht);
		yacht.reroll("123");
		System.out.println(yacht);
		yacht.reroll("345");
		System.out.println(yacht);
		yacht.reroll("135"); // 2번 바뀌어서 더이상 안바뀜
		System.out.println(yacht);
	}
}
