import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class E01_Exception {
	/*
	 # 예외
	 - 우리가 에러라고 생각했던 빨간 글씨들을 예외라고 부른다
	 - 자바의 문법을 틀리는 것은 예외가 아니라 컴파일 에러(자바 문법 오류)라고 부른다
	 - 프로그래머는 발생할 예와를 미리 예측하고 대비해 둘 수 있다.(예외 처리)
	 - 예외 발생 시 기본 동작은 프로그램의 강제 종료이다.
	 
	 # 예외 처리
	 - 예외가 발생할 가능성이 있는 코드를 try문 내부에 포함시킨다
	 - try문 내부에서 예외가 발생하지 않으면 모두 정상 실행된다
	 - try문 내부에서 예외가 발생하면 즉시 try문 실행을 중단하고 발생한 예외에 해당하는 catch문으로 넘어간다
	 - catch문은 여러번 쓸수 있다.
	 - 예외 발생시 catch문으로 발생한 예외에 대한 자세한 정보를 담고있는 인스턴스가 전달된다
	 */
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		try {
			arr[0] = 1;
			arr[12] = 100;
			arr[1] = 3;
			
			System.out.println("try문을 완전히 실행했습니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 범위를 벗어났습니다!!");
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("Hello!");
		
		//---------------------------------------------------------------------------------------------//
		System.out.println();
		
		// 예외 처리로 스캐너 사용하기
		Scanner sc = new Scanner(System.in);
		
		int num;
		try {
			System.out.print("숫자를 입력하시오 >> ");
			num = sc.nextInt();
			num = 10/num;
		}catch (InputMismatchException e) {
			System.out.println("반드시 숫자만 입력하시오.");
			
			// 어디서 에러가 발생했는지 추적해 볼수 있는 메서드 (e에 예외 정보가 들어있다)
			// e.printStackTrace();
			
			num = -1;
		}catch (ArithmeticException e) {
			System.out.println("num에는 0을 넣어서는 안된다.");
			num = -2;
		}catch (Exception e) {
			System.out.println("Exception는 모든 예외의 부모이기 때문에 나머지 모든 예외를 한번에 처리할 수 있습니다.");
			num = -3;
		}finally {
			System.out.println(" /) /) ");
			System.out.println("( . . )");
			System.out.println("(     )");
			System.out.println("이 토끼는 예외가 발생하던 안하던 무조건 등장합니다.");
		}
		System.out.println("입력하신 숫자는 : " + num);
	}
}
