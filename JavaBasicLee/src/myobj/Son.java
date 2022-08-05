package myobj;

public class Son extends Player{

	public int weeklyPay;
	public String country;
	
	@Override
	public void infor(){
		System.out.println("====선수 정보====");
		System.out.println("소속 : " + team);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("국가 : " + country);
		System.out.println("포지션: " + position);
		System.out.println("주 발: " + foot);
		System.out.println("번호 : " + number);
		System.out.println("주급 : " + weeklyPay + "억");
	}
	
}
