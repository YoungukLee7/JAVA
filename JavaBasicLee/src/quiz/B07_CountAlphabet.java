package quiz;

import java.time.chrono.HijrahChronology;
import java.util.Scanner;

public class B07_CountAlphabet {
	/*
	 * ����ڰ� ����� �˻��ϰ� ���� ���ĺ��� �Է��ϸ� �ش� ���忡 ���ĺ��� �� �� �����ϴ��� �˷��ִ� ���α׷��� �������� (��/�ҹ��� ���
	 * ��/�ҹ��� ��� �������)
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String sentence, word;
		int count = 0;

		System.out.print("������ �Է��Ͻÿ� : ");
		sentence = sc.nextLine();
		System.out.print("���ĺ��� �Է��Ͻÿ� : ");
		word = sc.next();

		char user_input = word.charAt(0);
		char user_not_input;

		if (user_input >= 'a' && user_input <= 'z') {
			user_not_input = (char) (user_input - 32); // (�빮�� �����) ���� if������ true�� �ڵ� ����ȴ�
		} else if (user_input >= 'A' && user_input <= 'Z') {
			user_not_input = (char) (user_input + 32); // (�ҹ��� �����) ���� if������ true�� �ڵ� ����ȴ�
		} else {
			System.out.println("�߸��� �Է��Դϴ�.");
			return;
		}
		
		
		for (int i = 0; i < sentence.length(); i++) {

			char ch = sentence.charAt(i);

			if (ch == user_input || ch == user_not_input) { // ||�� user_not_input�� ���� �����ϰ� ���ش�
				System.out.printf("%d�ٿ� �ҹ��� %c�� %d�� �����մϴ�.\n", i, ch, ++count);
			}
		}
	}

}
