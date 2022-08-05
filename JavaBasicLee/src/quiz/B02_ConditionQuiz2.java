package quiz;

import java.util.Scanner;

public class B02_ConditionQuiz2 {
	/*
	 1. char�� ���� a�� 'q'�Ǵ� 'Q'�϶� true
	 2. char�� ���� b�� �����̳� ���� �ƴ� �� true
	 3. char�� ���� c�� '0' ~ '9'�� �� true
	 4. char�� ���� d�� ������(�빮�� �Ǵ� �ҹ���)�� �� true
	 5. char�� ���� e�� �ѱ��� �� true
	 6. char�� ���� f�� �Ϻ����� �� true
	 7. ����ڰ� �Է��� ���ڿ��� exit�� �� true
	 */
	public static void main(String[] args) {
		// 1. char�� ���� a�� 'q'�Ǵ� 'Q'�϶� true
		char a = 'q';
		System.out.println("1. ");
		System.out.println(a == 'q' || a == 'Q');
		
		// 2. char�� ���� b�� �����̳� ���� �ƴ� �� true
		char b = 'a';
		System.out.println("2. ");
		System.out.println(!(b == ' ' || b == '\t'));
	    System.out.println(b != ' ' || b != '\t');
		
		// 3. char�� ���� c�� '0' ~ '9'�� �� true
		char c = '4';
		System.out.println("3. ");
		System.out.println(c >= '0' && c <= '9');
		
		// 4. char�� ���� d�� ������(�빮�� �Ǵ� �ҹ���)�� �� true
		char d = 'A';
		System.out.println("4. ");
		System.out.println((d >= 'a' && d <= 'z') || (d >= 'A' && d <= 'Z'));
		
		// 5. char�� ���� e�� �ѱ��� �� true
		// �ѱ� ���� : AC00 ~ D7A3
		char e = '��';
		System.out.println("5. ");
		System.out.println(e >= 0XAC00 && e <= 0XD7A3);
		System.out.println(e >= 44032 && e <= 55203);
		System.out.println(e >= '��' && e <= '�R');
		
		// 6. char�� ���� f�� �Ϻ����� �� true
		// ���󰡳� ���� : 3040 ~ 309F
		char f = '��';
		System.out.println("6. ");
		System.out.println(f >= 0x3040 && f <= 0x309F);
		
		// 7. ����ڰ� �Է��� ���ڿ��� exit�� �� true
		Scanner sc = new Scanner(System.in);
		System.out.println("7. exit�� �Է��Ͻÿ� > ");
		
		String name1 = sc.next();
		String name2 = "exit";
		
		System.out.println(name1.equals(name2));
		/*
		 String name1 = new Scanner(System.in).next();
		 
		 System.out.println(name1.equals("exit"));
		 */
	}

}
