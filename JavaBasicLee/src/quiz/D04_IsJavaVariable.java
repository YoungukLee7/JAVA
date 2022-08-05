package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class D04_IsJavaVariable {
	
	// 예약어를 제한하려면 하나하나 넣어주는 방법밖에 없다
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
	 문자열을 전달하면 해당 문자열이 자바의 변수로서 사용될 수 있는지 판별해주는 메서드를 정의해보세요
	 */
	public static boolean isJavaVar(String word) {
		// 예약어 검사
		if (keywords.contains(word)) {
			System.out.printf("%s는 등록된 예약어이므로 변수가 될수 없습니다.\n",word);
			return false;
		}
		
		
		ArrayList<Character> list = new ArrayList<>();
		for (Character ch : word.toCharArray()) {
			list.add(ch);
		}
		if (!Character.isJavaIdentifierStart(list.get(0))) {
			System.out.printf("%s는 첫번째 글자가 %c이므로 첫번째 글자가 될 수 없습니다.\n",word,list.get(0));
			return false;
		}
		for (int i = 1; i < list.size(); i++) {
			char ch = list.get(i);
			
			if (!Character.isJavaIdentifierPart(ch)) {
				System.out.printf("%s는 index %d번째 글자가 %c이므로 변수가 될 수 없습니다.\n",word,i,list.get(i));
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

	static boolean discrimination(String str) { // 판별 메서드
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
