import java.util.Arrays;

class pig{
	final static String type = "돼지";
	int gram_price;
	int gram;
	
	public pig(int gram, int gram_price) {
		this.gram = gram;
		this.gram_price = gram_price;
	}
	@Override 
	public String toString() {
		return String.format("종류 : %s\n"+"g당 가격 : %d\n" + "총 무게 : %d\n" + "가격 : %d"
				, type,gram_price,gram,gram_price*gram); // 원하는 문자열을 return해준다
	}
}
/*
# Object.toString()	
- 해당 클래스가 문자열로서 출력 되어야 할때 저절로 호출되는 메서드 
- Object는 모든 타입의 부모이기 때문에 모든 클래스에 toString()이 포함되어 있다
- 오버라이드 해서 사용하지 않으면 기본적으로 메모리상의 주소값을 문자열로 반환한다.
*/

// 해당 클래스에 toString() 메서드를 오버라이드 하면 원하는 형태로 출력 가능하다
public class C08_ToString {

	public static void main(String[] args) {
		pig meat = new pig(150, 40);
		
		// 인스턴스를 출력하려고 하면 주소값이 나온다
		// 해당 클래스에 toString() 메서드를 오버라이드 하면 원하는 형태로 출력 가능하다
		
		// 해당 인스턴스를 toString으로 문자열을 가져와서 출력하기
		System.out.println(meat.toString());
		
		// 해당 인스턴스를 그냥 출력하기
		System.out.println(meat);
		
		// println() 메서드는 사실 해당 인스턴스의 toString() 결과를 콘솔에 출력하는 메서드이다
	}
}
