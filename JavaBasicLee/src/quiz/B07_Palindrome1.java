package quiz;

import java.awt.Checkbox;
import java.util.Scanner;

public class B07_Palindrome1 {
	/*
	 ����ڷκ��� �ܾ �ϳ� �Է� �޾��� �� 
	 �ش� �ܾ �Ϻ��ϰ� ��Ī���� �ƴ��� �����ϴ� ���α׷��� ����� ���ÿ�
	 
	 # �¿� ��Ī�ܾ� ���� - LEVEL, ������, �Ͽ���, �ⷯ��, ABBA, MOM, DAD
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String word;

		System.out.println("������ �Է��϶� > ");
		word = sc.nextLine();
		int pass = 0;
		int to_pass = word.length()/2;
		
		for (int i = 0; i < word.length()/2; i++) {

			char front_ch = word.charAt(i);
			char back_ch = word.charAt(word.length() - 1 - i);

			System.out.println("���� ���� : " + front_ch);
			System.out.println("���� ���� : " + back_ch);
			
			if (front_ch == back_ch) {
				++pass;
				System.out.println("��ġ");
				System.out.println("===========================");
			} else {
				System.out.println("����ġ");
				System.out.println("===========================");
			}
		}
			System.out.printf("�¿� ��Ī�� �Ǳ����� �ʿ��� ��ġ�� %d�� �Դϴ�.\n", to_pass);
			System.out.printf("%d���� ���ڰ� ��ġ�մϴ�.\n", pass);
			
			if (to_pass == pass) {
				System.out.println("�¿��Ī�Դϴ�.");
			} else {
				System.out.println("�¿� ��Ī�� �ƴմϴ�.");
			}
		} 
	}


