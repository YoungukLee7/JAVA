package quiz;

import java.util.Arrays;
import java.util.Scanner;

import myobj.BlackJack.Card;

/*
  # ������ ����� ������
  1. ��ǻ��(����)�� ��� (�÷��̾�)�� ī�带 �̴´�
  2. ó������ �� ��� 2�徿 �޴´�. �� �� ������ ī��� ���� �������´�.
  3. �÷��̾�� ī�带 ���� �� ��Ȳ�� ���� ������(hit)
     ���⼭ ������(stand)�� ������ �� �ִ�
  4. �÷��̾ ���߸� ������ �������ִ� ī�带 �����ϰ� ��Ģ�� ���� ī�带 ��� �̴´�.
  	 (������ ������ �ִ� ī�� ���� 16������ �� ������ �̰� , 17�̻��̸� ������ ������Ѵ�)
  5. �÷��̾��� ī�� ���� �������� ������ �¸��Ѵ�.
  	 �÷��̾� ī�� ���� ��Ȯ�ϰ� 21�̸� ����� �ִ� ���밪���� �� ���� �ʴ´� (����)
  	 �÷��̾��� ī�� ���� 21���� ũ�� �к��Ѵ� (����Ʈ)
  6. A�� 1�� ������ �ְ� 11�� ������ �ִ�
  # �����ڷ�
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

//		boolean end = false;  while()�ȿ� !end�� ����ϰ� ������ ������ end = true;�� ����
		int cnt = 0;
		loop: while (true) {

			System.out.println("[�Ʒ����� �Ѱ����� �����ϼ���.]");
			System.out.println("1. hit");
			System.out.println("2. stand");
			System.out.print(">> ");

			switch (sc.nextInt()) {
			case 1:
				userCard.bonusCard(2 + cnt);
				show();

				if (userCard.plus() == 21) {
					System.out.println("[����!!]");
				}
				if (userCard.plus() > 21) {
					System.out.println("[ī���� ���� 21�� �Ѱ���ϴ�!!]");
					System.out.println("[���� ����!!]");
					System.out.println("[�÷��̾� �й�!!]");
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
					System.out.println("[cpu ī�� �� ���� 21�� �Ѿ����ϴ�!!]");
					System.out.println("[cpu�� �й��Ͽ����ϴ�!!]");
					break loop;
				}

				show();
				if (userCard.plus() > 21) {
					System.out.println("[ī���� ���� 21�� �Ѱ���ϴ�!!]");
					System.out.println("[���� ����!!]");
					System.out.println("[�÷��̾� �й�!!]");
					break loop;
				}else if (cpuCard.plus() == userCard.plus()) {
					System.out.println("[����!!]");
					break loop;
				} else if (cpuCard.plus() > userCard.plus()) {
					System.out.println("[cpu�� �̰���ϴ�!!]");
					break loop;
				} else if (cpuCard.plus() < userCard.plus()) {
					System.out.println("[�÷��̾ �̰���ϴ�!!]");
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
		System.out.println("�� ��: " + cpuCard.plus());
		System.out.print("user : ");
		System.out.println(Arrays.toString(userCard.card()));
		System.out.println("�� ��: " + userCard.plus());
	}
}
