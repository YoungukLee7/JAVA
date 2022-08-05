package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class D04_IsJavaVariable {
	
	// ���� �����Ϸ��� �ϳ��ϳ� �־��ִ� ����ۿ� ����
	public static HashSet<String> keywords = new HashSet<>();
	
	static {
		keywords.add("int");
		keywords.add("assert");
		keywords.add("break");
		keywords.add("continue");
		keywords.add("byte");
		keywords.add("switch");
		keywords.add("case");
		keywords.add("if");
		keywords.add("public");
	}
	
	/*
	 ���ڿ��� �����ϸ� �ش� ���ڿ��� �ڹ��� �����μ� ���� �� �ִ��� �Ǻ����ִ� �޼��带 �����غ�����
	 */
	public static boolean isJavaVar(String word) {
		// ����� �˻�
		if (keywords.contains(word)) {
			System.out.printf("%s�� ��ϵ� ������̹Ƿ� ������ �ɼ� �����ϴ�.\n",word);
			return false;
		}
		
		
		ArrayList<Character> list = new ArrayList<>();
		for (Character ch : word.toCharArray()) {
			list.add(ch);
		}
		if (!Character.isJavaIdentifierStart(list.get(0))) {
			System.out.printf("%s�� ù��° ���ڰ� %c�̹Ƿ� ù��° ���ڰ� �� �� �����ϴ�.\n",word,list.get(0));
			return false;
		}
		for (int i = 1; i < list.size(); i++) {
			char ch = list.get(i);
			
			if (!Character.isJavaIdentifierPart(ch)) {
				System.out.printf("%s�� index %d��° ���ڰ� %c�̹Ƿ� ������ �� �� �����ϴ�.\n",word,i,list.get(i));
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {

		System.out.println("name_king\t: " + discrimination("name_king"));
		System.out.println("nameKing\t: " + discrimination("nameKing"));
		System.out.println("1name_king\t: " + discrimination("1name_king"));
		System.out.println("name king\t: " + discrimination("name king"));
		System.out.println("abc3\t\t: " + discrimination("abc3"));
		isJavaVar("break");
		isJavaVar("int");
	}

	static boolean discrimination(String str) { // �Ǻ� �޼���
		if (!Character.isJavaIdentifierStart(str.charAt(0))) {
			return false;
		}
		for (int i = 1; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!Character.isJavaIdentifierPart(ch)) {
				return false;
			}
		}
		return true;
	}
}
