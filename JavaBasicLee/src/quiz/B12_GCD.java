package quiz;

public class B12_GCD {
/*
 	�������� ������ �� ������ �ִ������� ���Ͻÿ�
 */
public static void main(String[] args) {

	// 1 ~ 100 ����

	int a = (int) (Math.random() * 100 + 1);
	int b = (int) (Math.random() * 100 + 1);
	System.out.println(a);
	System.out.println(b);

	int min = Math.min(a, b);
	
	int gcd;
		
	for (int i = 1; i <= a; i++) {
		if (a % i == 0) {
			for (int i1 = 1; i1 <= b; i1++) {
				if (b % i1 == 0) {
				}
				if (i == i1) {
					gcd = i;
					System.out.printf("%d�� ������Դϴ�. \n",gcd);
					System.out.printf("%d�� �ִ������Դϴ�. \n",Math.max(gcd,gcd));
				}
			}
		}
	}
	
}

}
