import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D08_String {
	/*
	 # String
	 */
	public static void main(String[] args) {
		String fruits = "apple/banana/kiwi/graps/orange/watermelon/pineapple";
		
		// split(delimiter) : ���ڿ��� ���ϴ� �������� �ڸ� ���ڿ� �迭�� ��ȯ�Ѵ�
		String[] split = fruits.split("/");
		System.out.println(Arrays.toString(split));
		
		// join(delimiter, CharSequence...) : �ڿ� ������ ���ڿ��� ��� �����Ѵ�
		String join = String.join(",", "tiger","lion","bear","panda");
		System.out.println(join);
		
		// join(delimiter, iterable) : �迭(�Ǵ� ����Ʈ ��)�� ��� ���ڿ��� �����Ѵ�
		join = String.join("/",split);
		System.out.println(join);
		
		// comtains(seq) : �ش� ���ڿ��� ���ԵǾ� �ִ��� �˻��Ѵ�
		System.out.println("orange�� �ֳ���? : " + fruits.contains("orange"));
		System.out.println("peach�� �ֳ���? : " + fruits.contains("peach"));
		
		// startsWith(seq) : �ش� ���ڿ��� �����ϴ����� �˻��Ѵ�
		String ur1 = "http://www.naver.com";
		System.out.println("www�� �����ϳ���? : " + ur1.startsWith("www"));
		System.out.println("http�� �����ϳ���? : " + ur1.startsWith("http"));
		System.out.println("https�� �����ϳ���? : " + ur1.startsWith("https"));
		
		// endsWith(seq) : �ش� ���ڿ��� ���������� �˻��Ѵ�
		String fileName = "screenshot.pdf";
		System.out.println(".pdf�� ��������? : " + fileName.endsWith(".pdf"));
		System.out.println(".jpg�� ��������? : " + fileName.endsWith(".jpg"));
		System.out.println(".gif�� ��������? : " + fileName.endsWith(".gif"));
		
		// replace(old, new) : ���ڿ��� ��ü�� ���ο� ���ڿ��� ��ȯ�Ѵ�
		String email = "billgates@maicrosoft.com";
		String replaced = email.replace("maicrosoft.com", "naver.com");
		System.out.println(email);
		System.out.println(replaced);
		
		// substring(start) : ���ڿ��� start ��ġ���� �ڸ� ����� ��ȯ�Ѵ�
		System.out.println( email.substring(5));
		
		// substring(start, end) : ���ڿ��� start ��ġ���� end �̸����� �ڸ� ����� ��ȯ�Ѵ�
		System.out.println("�ڸ� ��: " + email.substring(5,10));
		
		// toUpperCase() : ���ڿ��� ���ĺ��� ��� �� ���ڷ� ��ȯ�� �ν��Ͻ��� ��ȯ�Ѵ�
		System.out.println(email.toUpperCase());
		
		// toLowerCase() : ���ڿ��� ���ĺ��� ��� �ҹ��ڷ� ��ȯ�� �ν��Ͻ��� ��ȯ�Ѵ�
		System.out.println(email.toUpperCase().toLowerCase().toUpperCase().toLowerCase());
		
		// ���� �͵� ���� : ������� .��� �߰��Ѵ�
		char[] arr = email.substring(10).toUpperCase().toCharArray();
		System.out.println(arr);
		
		// indexOf(seq) : ���ϴ� ���ڿ���  �� ��° �ε����� �ִ��� ��ȯ�Ѵ�
		System.out.println("@�� ��ġ: " + email.indexOf("@"));
		
		// indexOf(seq, from) : from���� ���ϴ� ���ڿ��� �˻��Ͽ� �ε����� ��ȯ�Ѵ�
		String test = "apple@naver.com, abc@yahoo.co.kr, ddd@hanmail.net";
		
		System.out.println(test.indexOf('@',0));
		System.out.println(test.indexOf('@',6));
		System.out.println(test.indexOf('@',21));
		
		fruits = "apple/banana/kiwi/graps/orange/watermelon/pineapple" + 
				"apple/banana/kiwi/graps/orange/watermelon/pineapple" + 
				"apple/banana/kiwi/graps/orange/watermelon/pineapple";
		
		// ��������: fruits���� ��� "apple"�� �ε����� ã�� ����غ�����
		System.out.println("��������");
		
		Set<Integer> count = new HashSet();
		
		for (int i = 0; i < fruits.length(); i++) {
			if (fruits.indexOf("apple", i) < 0) {
				break;
			}
			count.add(fruits.indexOf("apple", i));
		}
		System.out.println("apple�� �ִ� �ε���: " + count);
		
		int index = -1, i = 0;
		while ((index = fruits.indexOf("apple", index + 1)) != -1) {
			System.out.printf("%d��° apple�� ��ġ : %d\n",i++,index);
		}
		
		String wordNumber = "_ _ _ _ _ _ _";
		System.out.println(wordNumber.substring(0,2));
		// String.format(format,args...) : ���ϴ� ���ڿ��� ������ �̿��� ������ �� �ִ�
	}
}

















