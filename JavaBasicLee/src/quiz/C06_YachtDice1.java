package quiz;

import myobj.yacht.YachtDice;

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

public class C06_YachtDice1 {

	
	public static void main(String[] args) {
		YachtDice yacht = new YachtDice();
		
		
		System.out.println(yacht);
		yacht.reroll("123");
		System.out.println(yacht);
		yacht.reroll("345");
		System.out.println(yacht);
		yacht.reroll("135"); // 2�� �ٲ� ���̻� �ȹٲ�
		System.out.println(yacht);
	}
}
