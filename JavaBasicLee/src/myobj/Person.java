package myobj;

public class Person {

	public String name;
	public int age;
		
	public void sayHi() {
		if (age < 10) {
			System.out.println("안녕? 내 이름은 " + name + "이야. 나이는 " + age + "살이야");
		} else if (age < 20) {
			System.out.println("안녕하세요! 제 이름은 " + name + "입니다.");
		} else if (age < 30) {
			System.out.println("안녕하십니까! 제 이름은 " + name + "입니다.");
		}
	}
}
