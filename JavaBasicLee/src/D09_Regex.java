import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D09_Regex {
	/*
	 # ����ǥ���� (Regular Expression)
	 - ���ڿ��� �������� �˻��� �� �ִ� ǥ����
	 - Ư�� ���α׷��� ���� �ִ� ���� �ƴ� ������ ��Ģ�̴�
	 - ������ ����ǥ���� ���ϰ� ��ġ�ϴ� ���ڿ��� �ɷ��� �� �ִ�
	 
	 # java�� ����ǥ���� Ŭ����
	 - Pattern
	 - Matcher
	 */
	public static void main(String[] args) {
		// Pattern.matches(regex,input) : input�� regex�� �ش��ϴ� ���ڿ����� �˻��ϴ� �޼���
		System.out.println(Pattern.matches("sleep", "sleep"));
		
		
		// [] : �ش� ��ġ�� �� ���ڿ� �ü��ִ� ���ڵ��� �����ϴ� ǥ����
		System.out.println(Pattern.matches("s[lhk]eep", "sleep"));
		System.out.println(Pattern.matches("s[lhk]eep", "skeep"));
		System.out.println(Pattern.matches("s[lhk]eep", "sheep"));
		System.out.println(Pattern.matches("s[lhk]ee[pkz]", "saeep"));
		System.out.println(Pattern.matches("s[lhk]ee[pkz]", "sleep"));
		System.out.println(Pattern.matches("s[lhk]ee[pkz]", "sleek"));
		System.out.println(Pattern.matches("s[lhk]ee[pkz]", "sleez"));
		// ���⵵ ���ڷ� �ν��ϱ� ������ ���� ������� ���� �ȵȴ�
		System.out.println(Pattern.matches("s[l k]ee[pkz]", "s eez"));
		System.out.println(Pattern.matches("s[l\tk]ee[pkz]", "s	eez"));
		
		// \(��������)�� ���� ǥ���Ŀ����� Ư�� �������� ���Ǳ� ������ \\�� ����� �׳� �������ø� �ǹ��Ѵ�
		System.out.println(Pattern.matches("s[lhk]ee[pkz\\\\]", "slee\\"));
		
		/*
		 [abc] : a �Ǵ� b �Ǵ� c�� ��� ���
		 [a-z] : a ���� z ���� ��� ���
		 [A-Z] : A ���� Z ���� ��� ���
		 [a-e&&c-g] : a-e �� c-g�� ��� ������Ű�� ���ڸ� ���
		 */
		
		System.out.println(Pattern.matches("s[c-kC-K]eep", "sdeep"));
		
		/*
		 # �ϳ��� ���� ���ڸ� ��Ÿ���� �͵�
		 . : ��� ���ڸ� ����Ѵ� [.]�̳� \.�� �׳� ���� ��Ÿ����
		 \d : ��� ����
		 \D : ���ڸ� ������ ����
		 \s : ��� ���� (\t,\n, ,\r)�� ���
		 \S : ������ ������ ��� ���� ���
		 \w : �Ϲ����� ���ڵ��� ��� [a-zA-Z0-9_]
		 \W : \w�� ������ ���� ���� ���
		 */
		System.out.println(Pattern.matches("s.eep", "s*eep"));
		System.out.println(Pattern.matches("s[.]eep", "s.eep"));
		System.out.println(Pattern.matches("s\\.eep", "s.eep"));
		System.out.println(Pattern.matches("\\d\\d\\d", "124"));
		System.out.println(Pattern.matches("\\d\\d\\s\\d", "12 4"));
		System.out.println(Pattern.matches("\\d...", "1lee"));
		
		/*
		 # �ش� ������ ���� �� ������ ������ �����ϴ� ���
		 .{n} : {}���� ������ n�� ��ġ�ؾ� �Ѵ�
		 .{n,m} : {}���� ������ n�� �̻� m�� ���� ��ġ�ؾ� �Ѵ�
		 .{n,} : {}���� ������ n�� �̻� ��ġ�ؾ� �Ѵ�
		 .? : ?���� ������ 0�� �Ǵ� 1�����;� �Ѵ�
		 .+ : +���� ������ �ּ� 1�� �̻� ���;� �Ѵ�
		 .* : *���� ������ 0�� �̻� ���;� �Ѵ�
		 */
		System.out.println(Pattern.matches("\\d{5}", "12345"));
		System.out.println(Pattern.matches("\\d{2,5}", "12"));
		System.out.println(Pattern.matches("\\d{2,5}", "12345"));
		System.out.println(Pattern.matches("\\d{5,}", "123456789"));
		System.out.println(Pattern.matches("abc[JQK]?", "abc"));
		System.out.println(Pattern.matches("abc[JQK]?", "abcJ"));
		System.out.println(Pattern.matches("abc[JQK]?", "abcJQ"));
		System.out.println(Pattern.matches("abc[JQK]+", "abcJQKJQK"));
		System.out.println(Pattern.matches("abc[JQK]+", "abc"));
		System.out.println(Pattern.matches("abc[JQK]*", "abc"));
		
		// ����1 : �ش� ���ڿ��� �ڵ��� ��ȣ���� �˻��� �� �ִ� ����ǥ������ ��������
		// ����2 : �ش� ���ڿ��� �̸������� �˻��� �� �ִ� ����ǥ������ ��������
		System.out.println("����1-------------------------------------------------");
		System.out.println(Pattern.matches("010-\\d{4}-\\d{4}", "010-1234-1234"));
		System.out.println("����2-------------------------------------------------");
		System.out.println(Pattern.matches(".+@[a-zA-Z]+[.][a-zA-Z]{2,3}[.]*[a-zA-Z]*", "think95@naver.com"));
		System.out.println(Pattern.matches(".+@[a-zA-Z]+[.][a-zA-Z]{2,3}[.]*[a-zA-Z]*", "k_3@korea.go.kr"));
		System.out.println(Pattern.matches(".+@[a-zA-Z]+[.][a-zA-Z]{2,3}[.]*[a-zA-Z]*", "abc@test.co.kr"));
		
		
		// ����1 : �ش� ���ڿ��� �ڵ��� ��ȣ���� �˻��� �� �ִ� ����ǥ������ ��������
		// ����2 : �ش� ���ڿ��� �̸������� �˻��� �� �ִ� ����ǥ������ ��������
		System.out.println("����1 ����� Ǯ��-------------------------------------------------");
		System.out.println(Pattern.matches("01[016-9]-\\d{3,4}-\\d{4}", "017-1234-1234"));
		System.out.println(Pattern.matches("01[016-9]-\\d{3,4}-\\d{4}", "010-123-1234"));
		System.out.println("����2 ����� Ǯ��-------------------------------------------------");
		String email = "abc@test.co.kr";
		System.out.println(Pattern.matches("\\w+@\\w+\\.[a-zA-Z]+(\\.[a-zA-Z]+)*", email));
		
		
		// Matcher Ŭ���� ����ϱ�
		String text = "apple/banana/orange/kiwi/pineapple/grape/grapeapple/mango";
		
		// 1. ����ǥ������ �������Ͽ� ���� �ν��Ͻ��� ����
		Pattern applePattern = Pattern.compile("apple");
		
		// 2. �ش� ���� �ν��Ͻ��� ���ڿ��� �˻�
		Matcher matchResult = applePattern.matcher(text);
		
		// 3. ��ġ ����� �ݺ����� Ȱ���� ��� Ž���� �� �ִ�
		while (matchResult.find()) {
			System.out.println("ã�� ��: " + matchResult.group());
			System.out.println("���� �ε���: " + matchResult.start());
			System.out.println("������ �ε���: " + matchResult.end());
		} 
		
		
		
		Pattern applePattern1 = Pattern.compile("(\\w+)(apple)");
		
		Matcher matchResult1 = applePattern1.matcher(text);
		
		while (matchResult1.find()) {
			System.out.println("Group 0 (��ü)===============================");
			System.out.println("ã�� ��: " + matchResult1.group(0));
			System.out.println("���� �ε���: " + matchResult1.start(0));
			System.out.println("������ �ε���: " + matchResult1.end(0));
			
			System.out.println("Group 1 (���� ǥ������ ù��° ��ȣ)===============");
			System.out.println("ã�� ��: " + matchResult1.group(1));
			System.out.println("���� �ε���: " + matchResult1.start(1));
			System.out.println("������ �ε���: " + matchResult1.end(1));
			
			System.out.println("Group 2 (���� ǥ������ �ι�° ��ȣ)===============");
			System.out.println("ã�� ��: " + matchResult1.group(2));
			System.out.println("���� �ε���: " + matchResult1.start(2));
			System.out.println("������ �ε���: " + matchResult1.end(2));
		} 
		
		
		
		
		
		
		
		
		
	}
}
