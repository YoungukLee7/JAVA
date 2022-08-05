import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import Police.Police;

public class D06_Comparator {
	/*
	 # Comparable
	 - 이 인터페이스를 구현한 클래스는 서로 크기 비교가 가능한 클래스가 된다
	 
	 # Comparator
	 - 이 인터페이스를 구현한 클래스는 크기 비교의 기준이 된다
	 */
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
		numbers.add(1);
		numbers.add(3);
		numbers.add(7);
		numbers.add(-5);
		numbers.add(-11);
		numbers.add(-8);
		// 숫자는 비교 기준이 명확하여 알아서 오름차순으로 정렬한다.
		Collections.sort(numbers);
		System.out.println(numbers);
		
		ArrayList<Grape> grapes = new ArrayList<>();
		
		grapes.add(new Grape(3000, 33, 1, "칠레"));
		grapes.add(new Grape(2800, 55, 2, "프랑스"));
		grapes.add(new Grape(3200, 28, 3, "프랑스"));
		grapes.add(new Grape(3200, 31, 1, "칠레"));
		grapes.add(new Grape(3200, 41, 1, "우루과이"));
		grapes.add(new Grape(3300, 50, 1, "스페인"));
		grapes.add(new Grape(3330, 51, 0, "우루과이"));
		
		System.out.println(grapes);
		
		// 포도 클래스는 비교의 기준이 없어 sort()에 빨간줄이 쳐진다 (가격으로 할지 색으로 할지 나라로 할지 정해지지 않았다)
		// Intrger에는 sort의 기준이 있지만, Grape class에는 기준을 직접 작성해야 한다
		
		// compareTo를 해주면 sort()를 사용할 수 있다
		Collections.sort(grapes);
		System.out.println(grapes);
		
		
		// 다른 Comparator 사용하기 (연습문제 1,2번)
		Collections.sort(grapes, new 포도분류기());
		System.out.println(grapes);
		
	}
}

// implements Comparable를 달아줘서 사용
class Grape implements Comparable<Grape>{
	static String[] colors = {"0x48258A","0X00C72E","0x48258A","0X00C72E","0x48258A","0X00C72E"};
	
	int price;
	int qty;
	int color;
	String origin;
	
	public Grape(int price, int qty, int color, String origin) {
		this.price = price; 
		this.qty = qty; 
		this.color = color; 
		this.origin = origin; 
	}
	@Override
	public String toString() {
		return String.format("%d/%d/%s/%s", price,qty,colors[color],origin);
	}
	@Override
	public int compareTo(Grape o) {
		/*
		 compareTo의 규칙
		 - 현재 인스턴스와 매개변수로 전달되는 다음 인스턴스를 비교한다
		 - 두 인스턴스의 비교 결과에 따라 알맞은 정수를 리턴해야 한다
		 - 현재 인스턴스가 매개변수로 전달된 인스턴스보다 왼쪽에 있어야 한다면 -1을 리턴해야 한다 (또는 음수)
		 - 현재 인스턴스가 매개변수로 전달된 인스턴스보다 오른쪽에 있어야 한다면 1을 리턴해야 한다 (또는 양수)
		 - 두 인스턴스의 크기가 같다면 0을 리턴해야 한다
		 */
		
//		밑에 있는 것은 qty를 내림차순한 것
//		Grape g = (Grape)o;
		
//		if ( this.qty > g.qty) {
//			return -1;
//		}else if (this.qty < g.qty) {
//			return 1;
//		}else {
//			return 0;
//		}
		
		// 연습문제: 포도를 정렬했을 때 가격 기준으로 오름차순 정렬될 수 있도록 바꿔보세요
		// 연습문제2: 가격이 같을때에는 개수를 기준으로 내림차순 정렬될 수 있도록 바꿔보세요
//		Grape g = (Grape) o;
//
//		if (this.price == g.price) {
//			if (this.qty > g.qty) {
//				return -1;
//			} else if (this.qty < g.qty) {
//				return 1;
//			} else {
//				return 0;
//			}
//		}
//		if (this.price < g.price) {
//			return -1;
//		} else if (this.price > g.price) {
//			return 1;
//		} else {
//			return 0;
//		}
		// 심화문제 : 원산지 기준으로 오름차순 정렬
		
		// Integer, String 등의 기본 클래스들은 Comparable이 구현되어 있기 때문에 직접 구현할 필요가 없다.
		// Grape g = (Grape) o;
		// return this.origin.compareTo(g.origin);
		// 내림차순 정렬 
		// return this.origin.compareTo(g.origin) * - 1;
		// return origin - o.origin;
		Grape g = (Grape) o;

		int len1 = origin.length();
		int len2 = g.origin.length();

		int len = len1 < len2 ? len1 : len2;

		for (int i = 0; i < origin.length(); i++) {
			char ch1 = origin.charAt(i);
			char ch2 = g.origin.charAt(i);

			if (ch1 > ch2) {
				return 1;
			} else if (ch1 < ch2) {
				return -1;
			}
		}

		if (len1 < len2) {
			return -1;
		} else if (len1 > len2) {
			return 1;
		}

		return 0;
	}
}


class 포도분류기 implements Comparator<Grape>{

	@Override // 연습문제 1,2번
	public int compare(Grape g1, Grape g2) {
		return g1.price != g2.price ? g1.price - g2.price : (g2.qty - g1.qty);
	}
	
}











