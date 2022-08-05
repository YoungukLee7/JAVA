
public class E03_CustomException {
	/*
	 # 원하는 예외를 직접 만들어서 사용하기
	 - Exception을 상속 받으면 반드시 처리해야 하는 예외
	 - RuntimeException을 상속 받으면 반드시 처리할 필요는 없는 녜외
	 */
	public static void playCat(Cat cat) throws NotPlayableCatException {
		
		// A instanceof B : A가 B의 인스턴스인지 검사하는 비교 연산자
		if (cat instanceof RussianBlueCat) {
			throw new NotPlayableCatException();
		}else {
			System.out.println("고양이와 놀아줬습니다.");
		}
	}
	
	public static void main(String[] args) {
		try {
			playCat(new Cat());
			playCat(new PersianCat());
			playCat(new RussianBlueCat());
		} catch (Exception e) {
			
		}
	}
}

class Cat{}
class PersianCat extends Cat{}
class RussianBlueCat extends Cat{}
									// RuntimeException 이라 적으면 main에 try-catch를 할 필요 없다. 
									// 그리고 러시안블루는 예외처리로 보여준다
class NotPlayableCatException extends Exception{
	public NotPlayableCatException() {
		super("놀줄 모르는 고양이 익셉션");
	}
}