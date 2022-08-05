package myobj;
			// person의 자식인 Programmer가 나온것, Programmer가 person에게 상속 받은 것
			// extends Person으로 상속시킨다
public class Programmer extends Person{
	// 아래 프로그램은 Programmer클래스에만 있는 프로그램이다 (Person에는 없다)
	
	public int salary; // 수입
	
	//@Override // 부모에게서 가져왔다고 표시해준 것, @는 at이라 부른다
	// @Override 어노테이션을 붙여 놓으면 오버라이드가 성립하지 않을 때 에러를 발생시켜 준다
	// Override가 가능 하려면 public void sayHi()가 완전 같아야 된다 다르면 새로 만든 것과 다름없다.
	public void sayHi() { // 부모에게서 가져온 것을 바꿀 수 있다
		System.out.println("안녕하세요 저는 " + salary + " 받고 일하는 " + name + "입니다.");
	}
	
	public void program(String toProgram) {
		if (salary < 500) {
			System.out.println(name + "씨는 " + toProgram + "을(를) 대충 만들기로 했습니다.");
		} else {
			System.out.println(name + "씨는 " + toProgram + "을(를) 열심히 만들기로 했습니다.");
		}
	}
}
