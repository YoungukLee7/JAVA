package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E01_InputRightThing {
	/*
	 * ����ڷκ��� ���ڸ� �Է¹޵� ���ڸ� ����� �Է¹��������� ��� �Է¹޴� ���α׷��� �������� 
	 * (�ٸ� Ÿ�԰��� �ԷµǴ��� �������� �����ʾƾ� �մϴ�.)
	 */
	
	public static int inputInt() {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			try {
				System.out.print("inpur int >> ");
				return sc.nextInt();
			} catch (InputMismatchException e) {
				sc.nextLine(); // ��ĳ�ʿ� �����ִ� �߸� �Էµ� �ܾ ������� �Ѵ�.
			}
		}
	}
	
	public static void main(String[] args) {
		int a = inputInt();
		System.out.println(a);
	}
}
