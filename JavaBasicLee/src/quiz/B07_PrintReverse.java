package quiz;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class B07_PrintReverse {
	/*
	 ����ڷκ��� ������ �Է� ������ �� ������ �Ųٷ� ����ϴ� ���α׷��� ����ÿ�
	 */
	public static void main(String[] args) {
		
		String userWrite;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��϶� > ");
		userWrite = sc.nextLine();
		
		// ���ڿ� ���� - 1 : ������ ����
		// ���ڿ� ���� - 2 : �ڿ��� 2��° ����
		// ...
		// ���ڿ� ���� - ���ڿ� ���� : ù��° ����
		System.out.println(userWrite.charAt(userWrite.length() - 1));
		System.out.println(userWrite.charAt(userWrite.length() - 2));
		
		for (int index = userWrite.length() - 1; index >=0; --index) {
			System.out.print(userWrite.charAt(index));
		}
		
		System.out.println();
		
		//		for (int i = userWrite.length()-1; i >= 0; i--) {
//			System.out.println(userWrite.charAt(i));
				
		}
	}


