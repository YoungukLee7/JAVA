package quiz;

public class B10_Gugudan {
/*
   	1. 구구단을 다음과 같이 가로로 출력해보세요
   	
   	2단: 2x1=2 2x2=4 ...
   	3단: 3x1=3 3x2=6 ...
   	4단: ...
   	
   	2. 1. 구구단을 다음과 같이 세로로 출력해보세요
   	2단     3단    4단   ...
   	2x1=2  3x1=3  ...  ...
   	2x2=4  3x2=6
 */
public static void main(String[] args) {

	// 1번
	for (int dan = 2; dan <= 9; dan++) {
		System.out.printf("%d단: ", dan);
		for (int gub = 1; gub <= 9; gub++) {
			System.out.printf("%dx%d=%-2d ", dan, gub, dan * gub);
		}
		System.out.println();
	}
	System.out.println();
	
	// 2번
	for (int gob = 0; gob <= 9; gob++) {
		for (int dan = 2; dan <= 9; dan++) {
			if (gob == 0) {
				System.out.printf("%d단\t",dan);
			} else {
				System.out.printf("%dx%d=%d\t", dan, gob, dan * gob);
			}
		}
		System.out.println();
	}
}
}
