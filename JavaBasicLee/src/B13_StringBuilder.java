
public class B13_StringBuilder {

	public static void main(String[] args) {

		StringBuilder brute_password_builder = new StringBuilder("123");
		
		// java.lang�� ������ �� �ִ� ��ĳ�ʴ� util�̶� insert���� ����Ѵ�.
		
		// append(value) : �� �ڿ� �ش� ���� �߰��Ѵ�
		brute_password_builder.append('z');
		brute_password_builder.append('a');
		brute_password_builder.append('a');
		brute_password_builder.append('a');
		
		System.out.println(brute_password_builder);
		
		// insert(index, value) : ���ϴ� ��ġ�� �ش� ���� �߰��Ѵ�
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
