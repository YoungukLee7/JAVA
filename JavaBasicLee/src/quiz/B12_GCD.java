package quiz;

public class B12_GCD {
/*
 	랜덤으로 생성된 두 숫자의 최대공약수를 구하시오
 */
public static void main(String[] args) {

	// 1 ~ 100 랜덤

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
					System.out.printf("%d는 공약수입니다. \n",gcd);
					System.out.printf("%d는 최대공약수입니다. \n",Math.max(gcd,gcd));
				}
			}
		}
	}
	
}

}
