package quiz;

import java.util.Scanner;

import javax.management.Query;

public class B07_CountAlphabet2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str, query;

		System.out.print("������ �Է��Ͻÿ� : ");
		str = sc.nextLine();
		System.out.print("���ĺ��� �Է��Ͻÿ� : ");
		query = sc.next();

		if (query.length() > 1) {
			System.out.println("�ϳ��� �Է��ض�");
			return;
		}

		// ����ڰ� �˻���� �ҹ��ڸ� �Է��ߴٸ� �빮�ڸ� q2�� �߰��Ѵ�
		char q1 = query.charAt(0);
		char q2;
		// ����ڰ� �˻���� �빮�ڸ� �Է��ߴٸ� �ҹ��ڸ� q2�� �߰��Ѵ�

		if (q1 >= 'a' && q1 <= 'z') {
			q2 = (char) (q1 - 32);
		}
		if (q1 >= 'A' && q1 <= 'Z') {
			q2 = (char) (q1 + 32);
		} else {
			System.out.println("�˻���� ��� �����մϴ�");
			return;
		}

		int cnt = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch == q1 || ch == q2) { // ||�� user_not_input�� ���� �����ϰ� ���ش�
				++cnt;
			}
		}
		System.out.printf("%s���� %c �Ǵ� %c�� %d�� �����մϴ�.\n", str, q1, q2, cnt);
	}
}