package quiz;

import java.util.Scanner;

public class B15_SuffleText1 {
	/*
	 * ����ڷκ��� ������ �Է¹�����
	 * �ش� ������ �������� �ڼ��� ����ϴ� ���α׷��� ����� ������
	 * ������� Ǭ��
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String text;

		System.out.println("������ �Է��Ͻÿ�");
		text = sc.nextLine();
		
		char[] shuffled_text = text.toCharArray();
		
		System.out.println(shuffled_text);
		
		 for (int i = 0; i < 100; i++) { // 100�� ��ڴ�
			int x = (int)(Math.random() * shuffled_text.length); // ��ġ�� �������� ����
			int y = (int)(Math.random() * shuffled_text.length); // ���� y���� �������� �� �ʿ䰡 ����
			
//			char temp = shuffled_text[x];		                 
//			shuffled_text[x] = shuffled_text[0];				 // y ��� 0�� �ִ´�
//			shuffled_text[0] = temp;
			
			char temp = shuffled_text[x];		// x���� ������� ������ ������ ���´�
			shuffled_text[x] = shuffled_text[y]; // �������� ���� ��ġ���� ���� �ٲ��ش�
			shuffled_text[y] = temp; 
		}
		 System.out.println(shuffled_text);
	}

}
