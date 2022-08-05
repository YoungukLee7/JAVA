import myobj.Person;

public class C11_LocalInnerClass {

	/*
	 # 지역 내부 클래스
	 - 메서드 내부에 정의한 클래스
	 - 해당 메서드가 끝나면 수명이 다하는 클래스
	 - 해당 메서드 바깥에서는 접근할 수 없다
	 */
	
	public static void main(String[] args) {
		
		int defaultPrice = 1000;
		char defaultGrade = 'B';
		
		// 예전에 만들어 놓았던 apple클래스
		Apple a = new Apple();
		System.out.println(a);
		
		// 지역 내부 클래스 (메서드 내부의 클래스)
		class Apple{
			int price;
			char grade;
			
			public Apple() {
				price = defaultPrice;
				grade = defaultGrade;
			}
			
			@Override
			public String toString() {
				return "price : " + price + " grade : " + grade;
			}
		}
		
		// 가장 가까운 apple클래스로 생성
		Apple apple = new Apple();
		System.out.println(apple);
		
//---------------------------------------------------------------------------------------------//
		
		/*
		  # 익명 지역 내부 클래스  
		  - 메서드 내부에서 클래스를 직접 수정하며 사용하는 방식 (생성과 동시에 상속)
		  - 이름이 없기 때문에 새로운 메서드를 추가하여도 사용할 수 없다
		  - 기존의 메서드를 오버라이드 해서 사용하는 것은 가능하다
		  - 일회용 상속이라 보면 된다
		 */
		Person p = new Person() {
			
			// {}친 이유는 안치면 자식의 이름과 나이가 되버려 sayHi()를 하면 null값으로 나온다
			{
				name = "둘리";
				age = 9;
			}
			
			@Override
			public void sayHi() {
				System.out.println("익명 클래스의 sayHi()입니다.");
				punch();
			}
			
			// 단독 사용은 불가하다. 이유는 자식클래스의 이름이 없어서
			void punch() {
				System.out.println(name + "은 앞 사람을 때렸습니다~");
			}
		};
		
		p.sayHi();
	}
}
