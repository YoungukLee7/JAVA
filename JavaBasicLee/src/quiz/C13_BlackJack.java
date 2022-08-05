package quiz;

import java.util.Arrays;
import java.util.Scanner;

import myobj.BlackJack.Card;

/*
  # 블랙잭을 만들어 보세요
  1. 컴퓨터(딜러)와 사람 (플레이어)이 카드를 뽑는다
  2. 처음에는 둘 모두 2장씩 받는다. 이 때 딜러의 카드는 한장 가려놓는다.
  3. 플레이어는 카드를 받은 후 상황을 보고 뽑을지(hit)
     여기서 멈출지(stand)를 결정할 수 있다
  4. 플레이어가 멈추면 딜러가 가려져있던 카드를 오픈하고 규칙에 따라 카드를 계속 뽑는다.
  	 (딜러는 가지고 있는 카드 합이 16이하일 때 무조건 뽑고 , 17이상이면 무조건 멈춰야한다)
  5. 플레이어의 카드 합이 딜러보다 높으면 승리한다.
  	 플레이어 카드 합이 정확하게 21이면 만들수 있는 쵀대값으로 더 뽑지 않는다 (블랙잭)
  	 플레이어의 카드 합이 21보다 크면 패베한다 (버스트)
  6. A는 1로 쓸수도 있고 11로 쓸수도 있다
  # 참고자료
  https://www.247blackjack.com/
 */
public class C13_BlackJack {

	static Card userCard;
	static Card cpuCard;
	static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		cpuCard = new Card();
		userCard = new Card();

		cpuCard.game(2);
		userCard.game(2);

		show();

//		boolean end = false;  while()안에 !end를 사용하고 끝내고 싶을때 end = true;를 쓴다
		int cnt = 0;
		loop: while (true) {

			System.out.println("[아래에서 한가지를 선택하세요.]");
			System.out.println("1. hit");
			System.out.println("2. stand");
			System.out.print(">> ");

			switch (sc.nextInt()) {
			case 1:
				userCard.bonusCard(2 + cnt);
				show();

				if (userCard.plus() == 21) {
					System.out.println("[블랙잭!!]");
				}
				if (userCard.plus() > 21) {
					System.out.println("[카드의 합이 21을 넘겼습니다!!]");
					System.out.println("[게임 오버!!]");
					System.out.println("[플레이어 패배!!]");
					break loop;
				}
				break;
			case 2:
				int count = 0;
				while (cpuCard.plus() <= 16) {
					cpuCard.bonusCard(2 + count);
					count++;
				}

				if (cpuCard.plus() > 21) {
					show();
					System.out.println("[cpu 카드 총 합이 21을 넘었습니다!!]");
					System.out.println("[cpu가 패배하였습니다!!]");
					break loop;
				}

				show();
				if (userCard.plus() > 21) {
					System.out.println("[카드의 합이 21을 넘겼습니다!!]");
					System.out.println("[게임 오버!!]");
					System.out.println("[플레이어 패배!!]");
					break loop;
				}else if (cpuCard.plus() == userCard.plus()) {
					System.out.println("[동점!!]");
					break loop;
				} else if (cpuCard.plus() > userCard.plus()) {
					System.out.println("[cpu가 이겼습니다!!]");
					break loop;
				} else if (cpuCard.plus() < userCard.plus()) {
					System.out.println("[플레이어가 이겼습니다!!]");
					break loop;
				}
				break;
			default:
				break;
			}
			cnt++;
		}
	}

	static void show() {
		System.out.print("cpu : ");
		System.out.println(Arrays.toString(cpuCard.card()));
		System.out.println("총 합: " + cpuCard.plus());
		System.out.print("user : ");
		System.out.println(Arrays.toString(userCard.card()));
		System.out.println("총 합: " + userCard.plus());
	}
}
