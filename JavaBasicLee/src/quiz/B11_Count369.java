package quiz;

import java.util.Scanner;

public class B11_Count369 {
/*
   ����ڷκ��� ������ �ϳ� �Է¹ް�
   �ش� ���ڱ��� 369 ������ ����ȴٸ� �ڼ��� �� ��� �ľ� �ϴ��� ����Ͽ� ���ÿ�
 */
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	int user_input;
	int count = 0;

	System.out.print("������ �ϳ� �Է��Ͻÿ�.");
	user_input = sc.nextInt();
	
	for (int i = 1; i <= user_input; i++) {
		int a = i/10; // 10�� �ڸ� ����
		int b = i%10; // 1�� �ڸ� ����
		
		if ( a == 3 || a == 6 || a == 9 ) {
			if ( b == 3 || b == 6 || b == 9 ) { 
				count += 2; // 10�� �ڸ��� 1�� �ڸ��� �� 369�� �ش�Ǹ� �ڼ� 2��
				
				continue; // ���� �ش� ������ ���������� �Ѿ
			}
			count++;
		}
		
		else if ( b == 3 || b == 6 || b == 9 ) 
			count++;
			else {
			}
	}
	System.out.println(count + "�� �Դϴ�.");
}
}
