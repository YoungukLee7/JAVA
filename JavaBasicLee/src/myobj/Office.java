package myobj;

public class Office extends Tottenham{

	// Joe Lewis, Daniel Levy, Fabio Paratici, Hugo Lloris, Harry Kane
	public String name;
	public int age;
	
	@Override
	public void infor(){
		System.out.println("====�繫��====");
		System.out.println("������ :\t" + name + " ���� :\t" + age);
		System.out.println("ȸ�� :\t" + name + " ���� :\t" + age);
		System.out.println("���� :\t" + name + " ���� :\t" + age);
		System.out.println("���� :\t" + name + " ���� :\t" + age);
		System.out.println("������ :\t" + name + " ���� :\t" + age);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}
