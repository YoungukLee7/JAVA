package quiz;

import java.util.Scanner;

public class B15_SuffleText {

	/*
	 * ����ڷκ��� ������ �Է¹�����
	 * �ش� ������ �������� �ڼ��� ����ϴ� ���α׷��� ����� ������
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input;

		System.out.println("������ �Է��Ͻÿ�");
		input = sc.nextLine();

		char[] word = input.toCharArray();

		for (int i = 0; i < word.length; i++) {
			char random_index = (char) (Math.random() * word.length);
			word[i] = word[random_index];
			System.out.print(word[i]); 
		}
	}

}
