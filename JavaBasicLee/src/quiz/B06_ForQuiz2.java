package quiz;

public class B06_ForQuiz2 {
	/*
	 1. 100���� 300������ ������ ���غ�����
	 2. 1���� 2000 ������ 7�� ����� ����غ��ÿ�
	 3. 1000���� 1500���� 10�� ����� ���ٿ� 10���� ��µǵ��� ����� ������
	 */
	public static void main(String[] args) {
	//	1. 100���� 300������ ������ ���غ�����
		int sum = 0;
		for (int i = 100; i <= 300; ++i) {
			sum += i;
		}
		System.out.printf("100���� 300���� �� : %d\n", sum);
	//	2. 1���� 2000 ������ 7�� ����� ����غ��ÿ�
		
		for (int i = 1, count = 1; i <= 2000; ++i) {
			if (i%7==0) {
				System.out.printf("%d�� ° 7�� ����� ��� : %d\n",count++, i);
			}
		}
	//	3. 1000���� 1500���� 10�� ����� ���ٿ� 10���� ��µǵ��� ����� ������	
			for (int i = 1000, count = 0; i <= 1500; ++i) {
				if (i % 10==0) {
					System.out.printf("%-6d",i);
					
					if (count++ % 10 == 9) {
						System.out.println("\n");
					}
				}
	}
	}
}
