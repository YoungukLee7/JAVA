package quiz;

import java.util.Scanner;

public class B15_CountAlphabet1 {
	/*
	 ����ڷκ��� ������ �Է¹�����
	 �ش� ���忡 �� ���Ĺ��� ������ Ƚ���� �迭�� ������ ��
	 1ȸ �̻� ������ ���ĺ��� �� ȸ �����Ͽ����� ����غ�����
	 (�빮��, �ҹ��ڴ� ���� �����ؾ� ��)
	 ����� Ǯ��
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String text;

		System.out.print("���ڿ��� �Է��Ͻÿ� ==> ");

		text = sc.nextLine();
		
		int[] lower = new int[26];
		int[] upper = new int[26];
		
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			
			if (ch >= 'A' && ch <= 'Z') {

				upper[ch - 'A']++;

			} else if (ch >= 'a' && ch <= 'z') {

				lower[ch - 'a']++;

			}
		}
		
		for (int i = 0; i < 26; i++) {
			if (lower[i] != 0) {
				System.out.printf("%c : %d\n", i + 'a',lower[i]);
			} if (upper[i] != 0) {
				System.out.printf("%c : %d\n", i + 'A',upper[i]);
			}
		}
		
	}

}
