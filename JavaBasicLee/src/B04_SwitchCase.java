
public class B04_SwitchCase {
	/*
	 * # Switch-Case문 
	 * - ()안의 연산 결과에 따라 실행할 코드를 결정하는 문법 
	 * - ()안에 boolean타입 대신 다른 타입을 사용한다
	 * - case가 소수이면 쓸만 하지만 많으면 쓰기 힘들다 
	 * - if문으로 완벽하게 대체 가능하여 많이 사용하지 않는다 
	 * - break문을 안쓰면 break문을 만날떄 까지 내려가면서 모든 case를 실행합니다 
	 * - default는 if문의 else같은 역할을 한다
	 */
	public static void main(String[] args) {

		int num = 23;

		switch (num) {
		case 0:
			System.out.println("num이 0입니다");
			break;
		case 1:
			System.out.println("num이 1입니다");
			break;
		case 2: case 3: case 4:
			System.out.println("num이 2 or 3 or 4입니다");
			break;
		default:
			System.out.println("위의 case가 모두 해당 하지 않아 실행됩니다.");
			break;
		}
	}

}
