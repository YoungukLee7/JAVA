package quiz;

import java.util.Arrays;
import java.util.Scanner;

import myobj.yachtDice.Dice;
import myobj.yachtDice.Score;

/*
 * # YachtDice ������ ��������
 1. �÷��̾�� 5���� �ֻ����� ������. (�ֻ����� ���� 1~6)
 
 2. 5���� �ֻ��� �� ����� ���� ������ �����ؾ� �Ѵ�.
 (1) Ǯ�Ͽ콺 (���� ���� 2��/3��) 11133, 31313, 65556
 (2) ���� ��Ʈ����Ʈ (1234/2345/3456) 42131, 65431
 (3) ���� ��Ʈ����Ʈ (12345/23456) 53421
 (4) 4 ���̽� (���� ���� 4��) 44441, 63666
 (6) Yacht (���� ���� 5��) 44444,22222
 (7) �ƹ��͵� �������� ���� ��� �ֻ��� �� ���� ������ �ȴ�.
 
 3. �÷��̾�� �ٽ� ������ ���� �ֻ����� ������ ��� �ٽ� ���� �� �ִ� (��ȸ 2��)
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

		System.out.println("[YachtDice] ������ �����մϴ�!");
		System.out.println("�ֻ����� �������ϴ�~");
		startDice = dice.setting(0);
		dice.print(startDice);
		score.count(startDice);
		int turn = 0;
		while (turn < 2) {
				System.out.print("�ٽ� ������ ���� ���� �ֽ��ϱ�? >> ");
				int num = sc.nextInt() - 1;
				int num1 = sc.nextInt() - 1;
				int num2 = sc.nextInt() - 1;
				dice.throwDice(num,num1,num2);
				dice.print(startDice);
				score.count(startDice);
			turn++;

		}
		System.out.println("[2��] �� ����Ͽ����ϴ�.");

	}
}