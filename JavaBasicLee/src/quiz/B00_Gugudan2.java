package quiz;

import java.util.Scanner;

public class B00_Gugudan2 {

	public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ��? ");
		int dan = sc. nextInt();
		
		//inputStream ����ֱ�
		String trash = sc. nextLine();
		System.out.println("�����ִ� ��� : " + trash);
		
		System.out.print("����� �̸� : ");
		String name = sc. nextLine();
		System.out.println("�̸� : " + name);
		
		System.out.printf("%d x 1 = %d\n", dan, dan * 1);
		System.out.printf("%d x 2 = %d\n", dan, dan * 2);
		System.out.printf("%d x 3 = %d\n", dan, dan * 3);
		System.out.printf("%d x 4 = %d\n", dan, dan * 4);
		System.out.printf("%d x 5 = %d\n", dan, dan * 5);
		System.out.printf("%d x 6 = %d\n", dan, dan * 6);
		System.out.printf("%d x 7 = %d\n", dan, dan * 7);
		System.out.printf("%d x 8 = %d\n", dan, dan * 8);
		System.out.printf("%d x 9 = %d\n", dan, dan * 9);
	}

}
