package quiz;

import java.util.Scanner;

/*
 ����ڰ� ������ �Է����� �� �ش� ���忡 ���ĺ� e�� �� �� �����ϴ��� �˷��ִ� ���α׷��� ��������
 (��/�ҹ��� ��� �����)
 */
public class B07_CountE {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String check;
		int count = 0; // ���ڿ����� �� ������ �����ϴ��� �˷��� �־���

		System.out.print("������ �Է��Ͻÿ� : ");
		check = sc.nextLine();

		for (int i = 0; i < check.length(); i++) {

			char word = check.charAt(i); // ���ڿ� �ϳ��ϳ��� ���ϱ� ���� ����.

			if (word == 'e' || word == 'E') {
				count++; // ��� �߰��ϰ� �Ǹ� �þ�� �ϱ� ������ �ϳ��� �þ�� �Ѵ�
				System.out.printf("���ĺ� e/E�� ���ڿ� %d���� �� %d��° �����մϴ�.\n", i, count);
			}
		}
		System.out.printf("%s�� e/E�� �� %d�� �����մϴ�.",check,count);
	}
}
