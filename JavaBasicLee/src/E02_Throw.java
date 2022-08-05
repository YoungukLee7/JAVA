import java.io.IOException;
import java.nio.channels.UnsupportedAddressTypeException;

public class E02_Throw {
	/*
	 # throw
	 - 원하는 예외를 발생시킨다
	 - 내가 만든 기능을 가져다 사용하는 사람에게 예외 처리를 맡길 수 있다
	 
	 # throws
	 - 해당 메서드에서 예외가 발생함을 알리는 문법이다
	 - 해당 메서드 내부에서 예외가 발생할 때 추가할 수 있다
	 - 내부에서 예외를 직접 처리하지 않고 메서드를 호출하는 프로그래머에게 전달한다. 
	 
	 # 꼭 처리하지 않아도 되는 예외 (RuntimeException)
	 - RuntimeException 클래스를 상속받은 예외들은 반드시 처리하지 않아도 되는 예외이다.
	 - 예외처리를 하지 않아도 컴파일 에러(빨간줄)가 발생하지 않는다.
	 
	 # 반드시 처리해야하는 되는 예외 (Exception)
	 - Exception 클래스를 상속받은 예외들은 반드시 처리해야 하는 예외가 된다.
	 - 예외처리를 하지 않으면 컴파일이 불가능하다.
	 - 어딘가에서는 반드시 try-catch문으로 처리되어야 컴파일을 진행할 수 있다.
	 - 발생한 곳에서 바로 처리하고 싶지 않은 경우 throws로 경고하여 해당 메서드를 호출하는 곳으로 예외처리를 떠넘길 수 있다.
	 */
								// 반드시 처리해야 하는것을 이렇게 적어준다
	public static void method4() throws IOException, ClassNotFoundException {
		switch ((int)(Math.random()*5)) {
		case 0:
			throw new ArrayIndexOutOfBoundsException();
		case 1:
			throw new ArithmeticException();
		case 2:
			throw new IOException();
		case 3:
			throw new ClassNotFoundException();
		case 4:
			throw new UnsupportedAddressTypeException();
		}
	}
	public static void method3() {
		throw new NullPointerException();
	}
	public static void method2() {
		method3();
	}
	public static void method1() {
		method2();
	}
	
	public static void main(String[] args) {
		
		try {
			method1();
		} catch (Exception e) {
			System.out.println("발생한 예외의 메세지는 \"" + e.getMessage() + "\" 입니다");
			System.out.println("에외 발생 시점의 스택 정보:");
			e.printStackTrace();
		}
		
		try {
			method4();
		} catch (Exception e) {
			System.out.println(e);
		} 
		
//		throws로 부른 것들이 method4()를 부르면 따라 나온다
//		try {
//			method4();
//		} catch (ClassNotFoundException e) {
//			
//		} catch (IOException e) {
//			
//		}
		
		System.out.println("welcome");
	}
}
