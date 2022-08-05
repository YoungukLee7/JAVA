
public class A03_Variable {

	/*
	 # 변수 (Variable)
	 - 프로그래밍 언어에서 데이터를 저장할 수 있는 공간
	 - 자바에서는 변수를 반드시 선언한 뒤에 사용해야 한다
	 - 같은 이름의 변수는 같은 {} 내부에서 다시 선언할 수 없다
	 - 값을 한번도 대입한적 없는 변수는 사용하면 에러가 발생한다
	   (초기화 하지 않은 변수는 사용할 수 없다)
	 
	 # 변수의 선언 (declare, declaration)
	 타입 변수명;
	 - 타입 : 해당 변수에 저장할 데이터의 타입을 지정한다 (int - 정수, String - 문자열...)
	 - 변수명: 사용하고 싶은 변수의 이름을 지정한다
	 
	 # 대입 연산
	 	우리가 알고있던 =의 의미 : 원쪽의 값과 오른쪽의 값이 서로 같다라는 뜻
 	 프로그래밍 언어에서 =의 의미 : 왼쪽의 변수에 오른쪽의 값을 넣으라는 뜻
	 */
	
	public static void main(String[] args) {
	
		// 선언한 후에 값을 대입
		int age;
		age = 28;
		
		{
			// {} 내부에서 선언한 변수는 해당 {}를 벗어나면서 사라진다
			int apple = 300;
			System.out.println("사과는: " + apple);
		}
		
		// 원래는 같은 이름의 변수를 사용할 수 없지만 다른 {} 임으로 사용할 수 있다.
		String apple = "사과";
		System.out.println(apple);
		
		// 선언과 동시에 값을 대입
		String movie = "마블", hobby = "농구";
		
		
		System.out.println("당신이 가장 좋아하는 영화: " + movie);
		System.out.println("당신의 취미: " + hobby);
		System.out.println("당신의 나이: " + age);
		
		/* 초기화 하지 않은 변수는 사용할 수 없다
		int price;
		System.out.println("가격 : " + price);
		*/
	}

}
