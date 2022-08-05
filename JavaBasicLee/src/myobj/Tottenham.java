package myobj;

public class Tottenham { // 토트넘 선수를 토트넘이라고 하기 위해선 토트넘 선수 정보에 토트넘 구단을 넣어주거나 토트넘 구단에 토트넘 선수를 넣어준다
	
	public String name;
	public String hometown;
	public int foundation;
	
//	선수[] 선수들 = new 선수[] {new 해리캐인(), new 손흥민()};
//  구단[] 라이벌 = 아스날
 	
	public void infor(){
		System.out.println("Tottenham=========================");
		System.out.println("연고지:\t" + hometown);
		System.out.println("창단:\t" + foundation + "년");
 		System.out.println("홈구장:\t" + name);
 	}
	
	
}
