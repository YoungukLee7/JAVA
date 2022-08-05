package Police;

import myobj.Person;

public class Police extends Person{

	public String name;
	public int age;
	
	public void hi() {
		this.sayHi(); // Person에 있는 sayHi를 보여준다. this.sayHi();는 이곳 Police에 있는 sayHi를 보여준다
	}
	//@Override
	public void sayHi() {
		System.out.println("안녕하십니까~ " + name + "입니다.");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		super.age = age;
	}
}
