package quiz;

import java.util.Scanner;

public class B07_Palindrome {
	/*
	 ����ڷκ��� �ܾ �ϳ� �Է� �޾��� �� 
	 �ش� �ܾ �Ϻ��ϰ� ��Ī���� �ƴ��� �����ϴ� ���α׷��� ����� ���ÿ�
	 
	 # �¿� ��Ī�ܾ� ���� - LEVEL, ������, �Ͽ���, �ⷯ��, ABBA, MOM, DAD
	 */
	public static void main(String[] args) {
		String sen;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��϶� > ");
		sen = sc.nextLine();
		
				if(sen.length()%2!=0) {
					System.out.println("ó���Ҽ� �����ϴ�.");
				}else {
					boolean Check=false;
					for(int i=0;i<sen.length()/2;i++) {
						char a=sen.charAt(i);
						char b=sen.charAt(sen.length()-1-i);
						if(a==b)
							Check=true;
						else {
							Check=false;
							break;
						}
							
					}
					
					if(Check==true) {
						System.out.println("�¿��Ī�Դϴ�.");
					}else {
						System.out.println("�¿� ��Ī�� �ƴմϴ�.");
					}			
				}
		}
	}


