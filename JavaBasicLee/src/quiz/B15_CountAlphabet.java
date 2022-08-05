package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class B15_CountAlphabet {

	/*
	 ����ڷκ��� ������ �Է¹�����
	 �ش� ���忡 �� ���Ĺ��� ������ Ƚ���� �迭�� ������ ��
	 1ȸ �̻� ������ ���ĺ��� �� ȸ �����Ͽ����� ����غ�����
	 (�빮��, �ҹ��ڴ� ���� �����ؾ� ��)
	 */
	public static void main(String[] args) {

		int small[] = new int[26];
		int big[] = new int[26];

		Scanner sc = new Scanner(System.in);

		String alphabet;

		System.out.print("���ڿ��� �Է��Ͻÿ� ==> ");

		alphabet = sc.nextLine();

		for (int i = 0; i < alphabet.length(); i++) {

			char ch = alphabet.charAt(i);

			if (ch >= 'A' && ch <= 'Z') {

				big[ch - 'A'] = big[ch - 'A'] + 1;

			} else if (ch >= 'a' && ch <= 'z') {

				small[ch - 'a'] = small[ch - 'a'] + 1;

			}

		}
		System.out.println("===�迭�� ����� ���===");
		System.out.println(Arrays.toString(big));
		System.out.println(Arrays.toString(small));

		
		for (int i = 0; i < big.length; i++) {
			if (big[i] != 0) {
				System.out.println((char)(i+65) + "=" + big[i]);
			} if (small[i] != 0) {
				System.out.println((char)(i+97) + "=" + small[i]);
			}
		}
	}

}
