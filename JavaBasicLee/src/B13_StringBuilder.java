
public class B13_StringBuilder {

	public static void main(String[] args) {

		StringBuilder brute_password_builder = new StringBuilder("123");
		
		// java.lang은 생략할 수 있다 스캐너는 util이라 insert문을 써야한다.
		
		// append(value) : 맨 뒤에 해당 값을 추가한다
		brute_password_builder.append('z');
		brute_password_builder.append('a');
		brute_password_builder.append('a');
		brute_password_builder.append('a');
		
		System.out.println(brute_password_builder);
		
		// insert(index, value) : 원하는 위치에 해당 값을 추가한다
		brute_password_builder.insert(0, 'z');
		brute_password_builder.insert(0, 'a');
		brute_password_builder.insert(0, 'a');
		brute_password_builder.insert(0, 'a');
		
		System.out.println(brute_password_builder);
		
		StringBuilder builder1 = new StringBuilder("abc");
		
		builder1.insert(1, 123);
		System.out.println(builder1);
	}

}
