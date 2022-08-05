package myobj;

public class Office extends Tottenham{

	// Joe Lewis, Daniel Levy, Fabio Paratici, Hugo Lloris, Harry Kane
	public String name;
	public int age;
	
	@Override
	public void infor(){
		System.out.println("====사무실====");
		System.out.println("구단주 :\t" + name + " 나이 :\t" + age);
		System.out.println("회장 :\t" + name + " 나이 :\t" + age);
		System.out.println("단장 :\t" + name + " 나이 :\t" + age);
		System.out.println("주장 :\t" + name + " 나이 :\t" + age);
		System.out.println("부주장 :\t" + name + " 나이 :\t" + age);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}
