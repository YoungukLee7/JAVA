package quiz;

import java.util.Scanner;

public class B11_Count3692 {
	/*
	   사용자로부터 정수를 하나 입력받고
	   해당 숫자까지 369 게임이 진행된다면 박수를 총 몇번 쳐야 하는지 출력하여 보시오
	   문자열로 푸는법 아직 안배운 버전 (미완성)
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;

		while (true) {
			System.out.printf("숫자를 입력 >> ");
			num = sc.nextInt();

			for (int i = 1; i < num; i++) {
				Integer number = i;
				
				if (number.equals(3) || number.equals(6) || number.equals(9)) {
					
				}
				
				
			}
		}
	}

}
