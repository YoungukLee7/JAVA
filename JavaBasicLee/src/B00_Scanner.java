/*
 # import
 - 다른 패키지에 저장되어 있는 클래스를 패키지명을 생략하고 사용하기 위한 문법
 
 import quiz.A00_Rabbit;
 - 이렇게 하면 알아서 찾아준다
 */

import java.util.Scanner;

/*
	 # java.util.Scanner 클래스
	 
	  - 프로그램으로 입력을 받을 수 있는 기능들이 모여있는 클래스
	  - 어느 곳으로 부터 입력 받을지 결정한 뒤 스캐너를 생성하여 사용한다
	  - 첫 글자가 대문자면 클래스일 확률이 높다
	  - 콘솔로부터 입력 받을 때는 System.in을 스캐너에 전달한다.
 */

public class B00_Scanner {
	public static void main(String[] args) {
		
		// 사실 우리는 다른 패키지에 만들었던 것들을 가져다 사용할 수 있다
		// quiz.A00_Rabbit.main(null);
		
		// 같은 패키지에 속해있는 다른 클래스는 패키지명을 생략하고 사용할 수 있다
		// A06_Print.main(null);
		
		// Ctrl + Shift + o 클릭시 위에 import java.util.Scanner; 자동 생성
		// import를 통해 패키지명을 생략하고 사용할 수 있다
		
		// System.in 으로 입력받는 새로운 스캐너를 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오 >> ");
		double input = sc. nextDouble();
		int input2 = sc. nextInt();
		
		System.out.printf("입력받은 값은 %.1f입니다.\n", input);
		System.out.printf("입력받은 값2은 %d입니다.\n", input2);
		
		/*
		 1. next타입()
		 
	  	- 입력된 값들 중 다음 값을 하나만 꺼낸 뒤 해당 타입으로 변환해서 가져온다
	  	- 통로에서 꺼낸 값이 해당 타입이 될 수 없다면 에러가 발생한다.
	  	- 값을 구분할 때 공백, \t, \n을 기준으로 값을 구분한다
	  	- 통로에 아무 값도 없다면 프로그램을 거기서 멈추고 새로운 값을 기다린다
	 	
	 	2. next()
	 	
	 	- 입력된 값들 중 다음 값을 하나 문자열 타입으로 꺼낸다
	  	- 타입을 바꾸지 않고 무조건 String으로 가져온다
	  	- 값을 구분할 때 공백, \t, \n을 기준으로 값을 구분한다
	  	- 통로에 아무 값도 없다면 프로그램을 거기서 멈추고 새로운 값을 기다린다
	 
	 		System.out.print("아무거나 하나 입력해보세요 > ");
	 		String input = sc.next();
	 
	 		System.out.println(%s,input);
	 
	 	3. nextLine()
	 	
	 	- 입력된 값을 모두 문자열 타입으로 꺼낸다
	 	- 오직 \n 만을 기준으로 값을 구분한다 (한 줄을 통째로 입력받기 위해 사용한다)
	 	- 통로에 아무 값도 없다면 프로그램을 거기서 먼푸고 새로눈 값을 기다린다
	 
	 		System.out.print("아무거나 하나 입력해보세요 > ");
	 		String input = sc.nextLine();
	 
	 		System.out.println(%s,input);
		 */
	}

}
