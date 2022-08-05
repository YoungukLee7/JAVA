
public class C04_Static {

	/*
	 # static (정적 영역,클래스 영역) (반대 개념은 인스턴스 영역)
	 - 같은 클래스의 모든 인스턴스가 공동으로 사용하는 영역을 정적 영역이라고 한다
	 - 앞에 static이 붙은 자원(필드,메서드)은 모든 인스턴스가 공동으로 사용하는 자원이 된다
	 - static영역의 자원은 아무리 인스턴스가 많아도 클래스당 하나이기 때문에
	 	클래스 이름에 .을 짝고 사용할 수 있다 h1.wedth++; 과 PlayingCard.wedth++; 는 같지만 앞에 쓴 것은 권장하지 않는다
	 - static영역의 자원은 인스턴스가 생기기 전에도 사용 할 수 있다
	 PlayingCard h1 = new PlayingCard(1, 1); 이것이 생기기 전에도 static쓸수 있다
	 - static 메서드는 인스턴스가 생기기 전에도 사용 가능해서 인스턴스 변수를 사용할 수 없다
	 - static 필드만 사용하는 메서드는 static 메서드로 만드는 것이 좋다
	 - 인스턴스 변수를 활용하는 메서드는 반드시 인스턴스 메서드여야 한다
	 */
	public static void main(String[] args) {
		System.out.println(PlayingCard.height);
		PlayingCard.changeSize(0, 0);
		
		PlayingCard h1 = new PlayingCard(1, 1);
		PlayingCard s1 = new PlayingCard(1, 1);
		PlayingCard d10 = new PlayingCard(1, 10);
		
		
		for (int i = 0; i < 10; i++) {
			PlayingCard.wedth++;
			h1.print();
			s1.print();
			d10.print();
		}
		
		
		System.out.println(h1.wedth);
		System.out.println(s1.wedth);
		System.out.println(d10.wedth);
		
		
		
	}
}

class PlayingCard{
	// 모든 인스턴스가 함께 사용할 값 (스태틱 영역,클래스 영역,정적 영역) 카드 넓이 높이는 안달라짐 (static을 붙인다)
	static int wedth = 0;
	static int height = 200;
	
	static char[] suits = {'♥', '♠','◆','♣'};
	
	// 각 인스턴스가 자기만의 공간을 가지고 사용 할 값(인스턴스 영역) 카드 숫자나 모양은 달라짐
	int suit;
	int num;
	
	public static void changeSize(int wedth,int height) {
		// this는 인스턴스가 생겼을 때 자기 자신을 의미 함으로 ,static에서는 사용할 수 업다
		PlayingCard.wedth = wedth;
		PlayingCard.height = height;
		
		System.out.println("바뀐 너비 : " + PlayingCard.wedth);
		System.out.println("바뀐 높이 : " + PlayingCard.height);
//		System.out.println("현재 카드 문양: " + suits[suit]);  // 인스턴스 영역이여서 쓸 수 없다 
//		철저하게 static영역만 사용 가능 카드로서 정해져 있는것은 가능하지만 suit는 만들어져야 알 수 있다
	}
	
	public PlayingCard(int suit, int num) {
		this.suit = suit;
		this.num = num;
	}
	
	public void print() {
		System.out.print("┌───");
		for (int i = 0; i < wedth; i++) {
			System.out.print("─");
		}
		System.out.println("─┐");
		
		System.out.printf("│ %c%2d", suits[suit], num);
		
		for (int i = 0; i < wedth; i++) {
			System.out.print(' ');
		}
		System.out.println("│");
		
		System.out.print("└──");
		for (int i = 0; i < wedth; i++) {
			System.out.print("─");
		}
		System.out.println("──┘");
	}
}
// 연습문제 static 자원을 포함한 클래스를 하나 정의해보세요. (너비/높이,카드 모양 금지)
class Tourist{
	
	int date; // 방문일자
	int countryNum; // 방문한국가번호
	int landMarkNum; // 방문한랜드마크번호
	int corrosion; // 부식
	int naturalDisasters; // 자연재해
	
	static String[] completion = {"1889", "124", "80", "1653", "1931"}; // 완공 시기
	static String[] country = {"프랑스","중국","이탈리아","인도","브라질"}; // 나라
	static String[] name = {"에펠탑","만리장성","콜로세움","타지마할","예수상"}; // 랜드마크 이름
	
	void info(){
		System.out.println("방문일자 : " + date);
		System.out.println("방문한국가번호 : " + countryNum);
		System.out.printf("나라 : %s 완공 : %s년 랜드마크 : %s",country[countryNum],completion[countryNum],name[countryNum]);
		System.out.println("부식 : " + corrosion);
		System.out.println("자연재해로 인한 파괴 : " + naturalDisasters);
	}
	
	Tourist(int year) {
		this(year, 0);
	}
	
	Tourist(int year , int naturalDisasters){
		corrosion -= year * 10;
		naturalDisasters *= 100;
	}
	
	
}

class SolidR4{
	// 클래스 영역, 정적 요소 (공통으로 들어갈 것)
	static int 가격 = 8000;
	static int 드리프트 = 90;
	static int acc = 49;
	static int 코너링 = 556;
	static int 부스터시간 = 440;
	static int 부스터바꿈 = 200;
	static String category = "스피드 카트/ 일반";
	static String description = "레이스용 바디입니다.";
	
	static String[] color = {"빨간색", "노란색", "초록색", "파란색", "검은색", "흰색", "핑크색"};
	
	// 인스턴스 영역 (개별 다를 것)
	String enginePatch;
	String kit;
	String handle;
	String wheel;
	String owner;
	int paint;
	
}