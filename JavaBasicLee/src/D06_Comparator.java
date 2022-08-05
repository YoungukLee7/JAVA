import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import Police.Police;

public class D06_Comparator {
	/*
	 # Comparable
	 - �� �������̽��� ������ Ŭ������ ���� ũ�� �񱳰� ������ Ŭ������ �ȴ�
	 
	 # Comparator
	 - �� �������̽��� ������ Ŭ������ ũ�� ���� ������ �ȴ�
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
		// ���ڴ� �� ������ ��Ȯ�Ͽ� �˾Ƽ� ������������ �����Ѵ�.
		Collections.sort(numbers);
		System.out.println(numbers);
		
		ArrayList<Grape> grapes = new ArrayList<>();
		
		grapes.add(new Grape(3000, 33, 1, "ĥ��"));
		grapes.add(new Grape(2800, 55, 2, "������"));
		grapes.add(new Grape(3200, 28, 3, "������"));
		grapes.add(new Grape(3200, 31, 1, "ĥ��"));
		grapes.add(new Grape(3200, 41, 1, "������"));
		grapes.add(new Grape(3300, 50, 1, "������"));
		grapes.add(new Grape(3330, 51, 0, "������"));
		
		System.out.println(grapes);
		
		// ���� Ŭ������ ���� ������ ���� sort()�� �������� ������ (�������� ���� ������ ���� ����� ���� �������� �ʾҴ�)
		// Intrger���� sort�� ������ ������, Grape class���� ������ ���� �ۼ��ؾ� �Ѵ�
		
		// compareTo�� ���ָ� sort()�� ����� �� �ִ�
		Collections.sort(grapes);
		System.out.println(grapes);
		
		
		// �ٸ� Comparator ����ϱ� (�������� 1,2��)
		Collections.sort(grapes, new �����з���());
		System.out.println(grapes);
		
	}
}

// implements Comparable�� �޾��༭ ���
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
		 compareTo�� ��Ģ
		 - ���� �ν��Ͻ��� �Ű������� ���޵Ǵ� ���� �ν��Ͻ��� ���Ѵ�
		 - �� �ν��Ͻ��� �� ����� ���� �˸��� ������ �����ؾ� �Ѵ�
		 - ���� �ν��Ͻ��� �Ű������� ���޵� �ν��Ͻ����� ���ʿ� �־�� �Ѵٸ� -1�� �����ؾ� �Ѵ� (�Ǵ� ����)
		 - ���� �ν��Ͻ��� �Ű������� ���޵� �ν��Ͻ����� �����ʿ� �־�� �Ѵٸ� 1�� �����ؾ� �Ѵ� (�Ǵ� ���)
		 - �� �ν��Ͻ��� ũ�Ⱑ ���ٸ� 0�� �����ؾ� �Ѵ�
		 */
		
//		�ؿ� �ִ� ���� qty�� ���������� ��
//		Grape g = (Grape)o;
		
//		if ( this.qty > g.qty) {
//			return -1;
//		}else if (this.qty < g.qty) {
//			return 1;
//		}else {
//			return 0;
//		}
		
		// ��������: ������ �������� �� ���� �������� �������� ���ĵ� �� �ֵ��� �ٲ㺸����
		// ��������2: ������ ���������� ������ �������� �������� ���ĵ� �� �ֵ��� �ٲ㺸����
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
		// ��ȭ���� : ������ �������� �������� ����
		
		// Integer, String ���� �⺻ Ŭ�������� Comparable�� �����Ǿ� �ֱ� ������ ���� ������ �ʿ䰡 ����.
		// Grape g = (Grape) o;
		// return this.origin.compareTo(g.origin);
		// �������� ���� 
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


class �����з��� implements Comparator<Grape>{

	@Override // �������� 1,2��
	public int compare(Grape g1, Grape g2) {
		return g1.price != g2.price ? g1.price - g2.price : (g2.qty - g1.qty);
	}
	
}











