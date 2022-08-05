package quiz;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

import myobj.rps.Shape;

/*
���������� ������ ����� ���ÿ�
����� Ǯ��
*/
public class C14_RPS1 {

	
	public static void main(String[] args) {
//		Shape com = Shape.random();
//		
//		// 0�� ���� 1�� ���� 2�� ���ڱ�
//		// �̷����� ����ڰ� �ܿ��� �ϴ� ���� �����ѹ���� �Ѵ�
//		// �����ѹ��� ������ ����ڸ� �˰� �ִ� �����̱� ������ �� ���� ���´� �ƴϴ�
//		Shape user =Shape.random();
//		
//		System.out.println("com: " + com.getName());
//		System.out.println("user: " + user.getName());
//		
//		int result = Shape.versus(com, user);
//		
//		System.out.println(result);
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			Boolean error = false;
			Shape com = Shape.random();
			Shape user;
			System.out.print("����(0),����(1),��(2)�� �����Ͻÿ� >> ");
			switch (sc.nextInt()) {
			case 0:
				user = Shape.SCISSORS;
				break;
			case 1:
				user = Shape.ROCK;
				break;
			case 2:
				user = Shape.PAPER;
				break;
			default:
				System.out.println("�ٽ� �����ϼ���");
				user = null;
				error = true;
				break;
			}
			if (error) {
				// continue�� �̿��ؼ� while�� �� ������ ���ư���
				continue;
			}
			System.out.printf("com: %s\tuser: %s\n",com.getName(),user.getName());
			switch (Shape.versus(com, user)) {
			case 1:
				System.out.println("��ǻ�Ͱ� �̰���ϴ�");
				break;
			case 0:
				System.out.println("�����ϴ�");
				break;
			case -1:
				System.out.println("����� �̰���ϴ�");
				break;
			} 
		}
	}
}
