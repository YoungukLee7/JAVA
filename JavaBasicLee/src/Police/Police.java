package Police;

import myobj.Person;

public class Police extends Person{

	public String name;
	public int age;
	
	public void hi() {
		this.sayHi(); // Person�� �ִ� sayHi�� �����ش�. this.sayHi();�� �̰� Police�� �ִ� sayHi�� �����ش�
	}
	//@Override
	public void sayHi() {
		System.out.println("�ȳ��Ͻʴϱ�~ " + name + "�Դϴ�.");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		super.age = age;
	}
}
