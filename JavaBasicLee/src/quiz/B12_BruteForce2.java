package quiz;

import javax.swing.text.DefaultEditorKit.InsertBreakAction;

public class B12_BruteForce2 {
	/*
	 ������ 4�ڸ� �ӽ� ��й�ȣ�� ���⶧����
	 ��� ��й�ȣ�� �����ϰ� �����ϴ� ���α׷��� �����ÿ�
	 ����� Ǯ�� �ٸ� ������
	 */
	public static void main(String[] args) {

		String symbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ" 
				+ "0123456789!\"#$%&'()*+,-./:;<=>?@[]^_`{|}~\\";
		
		String password = "[]a4";
		
		double max_index = Math.pow(symbols.length(),4); // 4�� ������ ������ ��� 4�ڸ� �����̴�
		
		/*
		 password	symbol index	index 
		 aaaa		0000			0
		 aaab		0001			1
		 aaaj		0009			9
		 aaak		000(10)			10
		 aaa}		000(90)			90
		 aaa>		000(91)			91
		 aaa?		000(92)			92
		 aaak		000(93)			93
		 aabb		0011			94
		 */
		
		/*
		 �� ���ڿ��� ����� ���� +=���� ���ڿ��� �ѱ��ھ� �ϼ���Ű�� ���� �ſ� ������
		 ���ڿ��� �ѱ��ھ� �ϼ���Ű�� ���� ������ StringBuilder��� Ŭ������ ����Ѵ�.
		 
		 StringBuilder brute_password_builder = new StringBuilder();
		 append() : +=���� ���ڸ� �� ���� ���㿡 �߰��ϴ� �Ͱ� ���� ȿ���� ���� �޼��� (�Լ�)
		 insert() : �ش� ���ڿ��� �� �տ� ���ڸ� �߰��ϴ� �޼���
		 */
		
		for (int i = 0; i < max_index; i++) {
			// ���ο�StringBuilder�� ���� (��ĳ�� �������)
			StringBuilder brute_password_builder = new StringBuilder();
			
			int brute_index = i;
			
			for (int j = 0; j < 4; j++) {
				brute_password_builder.insert(0, symbols.charAt(brute_index%symbols.length()));
				brute_index /= symbols.length();
			}
			// StringBuilder�� ������� ����� ���ڿ��� ������
			String brute_password = brute_password_builder.toString();
			System.out.println(brute_password);
			
//			brute_password += symbols.charAt(i%symbols.length()); // 4��° �ڸ� ���ϴ� ���
//			brute_password += symbols.charAt(i/symbols.length() % symbols.length()); // 3��° �ڸ� ���ϴ� ���
//			brute_password += symbols.charAt(i/symbols.length() / symbols.length() % symbols.length()); // 2��° �ڸ� ���ϴ� ���
//			brute_password += symbols.charAt(i/symbols.length() /symbols.length() /symbols.length()  % symbols.length()); // 1��° �ڸ� ���ϴ� ���
//			
//			System.out.println(brute_password);
		}
		
		
	}

}
