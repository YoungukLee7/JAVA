package quiz;

public class B10_Gugudan {
/*
   	1. �������� ������ ���� ���η� ����غ�����
   	
   	2��: 2x1=2 2x2=4 ...
   	3��: 3x1=3 3x2=6 ...
   	4��: ...
   	
   	2. 1. �������� ������ ���� ���η� ����غ�����
   	2��     3��    4��   ...
   	2x1=2  3x1=3  ...  ...
   	2x2=4  3x2=6
 */
public static void main(String[] args) {

	// 1��
	for (int dan = 2; dan <= 9; dan++) {
		System.out.printf("%d��: ", dan);
		for (int gub = 1; gub <= 9; gub++) {
			System.out.printf("%dx%d=%-2d ", dan, gub, dan * gub);
		}
		System.out.println();
	}
	System.out.println();
	
	// 2��
	for (int gob = 0; gob <= 9; gob++) {
		for (int dan = 2; dan <= 9; dan++) {
			if (gob == 0) {
				System.out.printf("%d��\t",dan);
			} else {
				System.out.printf("%dx%d=%d\t", dan, gob, dan * gob);
			}
		}
		System.out.println();
	}
}
}
