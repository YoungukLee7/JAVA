package quiz;

import java.util.Scanner;

public class B07_Palindrome {
	/*
	 사용자로부터 단어를 하나 입력 받았을 때 
	 해당 단어가 완벽하게 대칭인지 아닌지 구분하는 프로그램을 만들어 보시오
	 
	 # 좌우 대칭단어 예시 - LEVEL, 스위스, 일요일, 기러기, ABBA, MOM, DAD
	 */
	public static void main(String[] args) {
		String sen;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문장을 입력하라 > ");
		sen = sc.nextLine();
		
				if(sen.length()%2!=0) {
					System.out.println("처리할수 없습니다.");
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
						System.out.println("좌우대칭입니다.");
					}else {
						System.out.println("좌우 대칭이 아닙니다.");
					}			
				}
		}
	}


