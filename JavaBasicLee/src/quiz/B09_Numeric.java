package quiz;

import java.util.Scanner;

public class B09_Numeric {
/*
 	 ����ڰ� � ���ڿ��� �Է����� ��
 	 �ش� ���ڿ��� ��� ���ڷθ� �����Ǿ� �ִ��� �˻��غ��ÿ�
 */
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean number_only = true;
		
		System.out.print("���ڿ��� �Է��Ͻÿ�");
		String user_input = sc.next();
		
		for (int i = 0; i < user_input.length(); ++i) {
			
			char word = user_input.charAt(i);
			
			// ���ڰ� �ƴ� ���ڰ� �߰ߵȴٸ� false �� �ٲ�� �ݺ��� �ߴ��Ѵ�
			if (word < '0' || word > '9') {
				number_only = false;
				break;
			} 
		}
		System.out.println("���ڷθ� �����Ǿ� �ֽ��ϱ�? : " + number_only);
	}
}
