package quiz;

import java.util.Scanner;

public class B15_SuffleText2 {

	/*
	 * ����ڷκ��� ������ �Է¹�����
	 * �ش� ������ �������� �ڼ��� ����ϴ� ���α׷��� ����� ������
	 * ������� �л� ������ Ǭ��
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String text;

		System.out.println("������ �Է��Ͻÿ�");
		text = sc.nextLine();

		char[] shuffled_text = text.toCharArray();


		for (int i = 0; i < 1000; i++) { 
			int x = (int) (Math.random() * shuffled_text.length); 

			char temp = shuffled_text[x];
			shuffled_text[x] = shuffled_text[0]; 
			shuffled_text[0] = temp;
		}

		System.out.println(shuffled_text);
		// 1. �Է¹��� ������ char[]�� ��ȯ
		char[]original_text = text.toCharArray();
		// 2. ������ ���̿� ���� ������ boolean �迭�� ����
		// (�̾Ҵ� ���ڴ� �ٽ� ���� �ʱ����� ǥ�� �س��� �뵵)
		boolean[] pick = new boolean[original_text.length];
		// 3. ���ڿ��� ����� ���� ����
		StringBuilder shuffled_text_builder = new StringBuilder();
		// 4. ������ ���̰� 0���� �����ϸ鼭 �� ���ھ� �߰��Ѵ�
		// ���� ����� ���̰� �������� ��� ���ڸ��߰��Ϸ��� ���̹Ƿ� �ݺ��� Ż��
		while (shuffled_text_builder.length() != original_text.length) {
			// 5. ���� ��ġ(�ε���)�� �ϳ� ����
			int random_index = (int)(Math.random()*original_text.length);
			// 6. �ش� �ε����� �̾Ҵ� ���� ������ �߰����� ����
			if (!pick[random_index]) {
				shuffled_text_builder.append(original_text[random_index]);
				pick[random_index] = true;
			}
		}
		System.out.println(shuffled_text_builder);
	}
}
