
public class C01_Method {

	/*
	 
	 # 함수 (Function)
	 - 기능을 미리 정의해두고 나중에 가져다 쓰는 것
	 - 함수를 정의한 시점에는 실행되지 않고 나중에 호출되었을 때 실행된다
	 - 미리 정의된 함수 이름 뒤에 ()를 붙여 해당 함수를 호출할 수 있다
	 - 나중에 재사용 할 가능성이 있는 기능들을 함수로 만들어두면 작업의 반복을 줄일 수 있다
	 - 자바에서 함수는 반드시 클래스 내부에서 선언해야 한다 (다른 함수 내부에는 선언할 수 없다)
	 - 클래스 내부에 선언된 함수는 매서드라고 한다 
	 
	 # 함수의 리턴 (return)
	 - 함수를 정의할 때 함수명 앞에 해당 함수가 반드시 반환하는 값의 타입을 지정할 수 있다
	 - 리턴 타입에 void를 적으면 해당 함수는 값을 반환하지 않는다는 것을 의미한다.
	 - 해당 함수를 호출하면 호출한 자리에 함수의 실행 결과가 반환(return)된다.
	 - 함수 내부에서 return을 만나면 해당 함수를 즉시 종료한다.
	
	 # 함수의 매개변수 (argument) args 라고 하는 이유
	 - 함수를 호출할 때 ()에 전달하는 값을 인자라고 한다.
	 - 함수를 정의할 때 ()에 선언하는 인자값을 받을 수 있는 변수를 매개변수 라고 한다.
	 
	 */
	
	                        // 매개변수
	public static int plus(int a , int b) {
		int num = a + b;
		
		return num;
	}

	
	public static void printRabbit(int num) {
		System.out.println("===================");
		System.out.println("       /)/)        ");
		System.out.println("      (  ..)       ");
		System.out.println("      (   >♡       ");
		if (num % 2==0) {
			return; // (int num)에 짝수로 나누어 떨어지는 값이 들어오면 앞에 있는 토끼까지만 보여준다.
					// 그 외의 값이 들어오면 아래까지 다 보여준다. 
		}
		System.out.println(" Have a Good Time. ");
		System.out.println("===================");
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("프로그램 실행");
		
		for (int i = 0; i < 10; i++) {
			printRabbit(i); // 호출 할때마다 토끼 그림이 나온다
		}
		
		
		int result = plus(10, 20);
		System.out.println(result);
	}

}
