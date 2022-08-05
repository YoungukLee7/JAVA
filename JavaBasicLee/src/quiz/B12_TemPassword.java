package quiz;

public class B12_TemPassword {

	/*
	 6자리의 랜덤 임시 비밀번호를 생성하는 프로그램을 만들어 보세요
	 (비밀번호를 구성하는 문자 - 영어,숫자,특수문자)
	 숫자
	 '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
	 영어 대문자
	 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 
	 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
	 영어 소문자
	 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 
	 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
	 사용 가능한 특수문자
	 ! " # $ % & ' ( ) * + , - . / 
	 : ; < = > ? @
	  [ ] ^ _ `
	   { } ~ |
	 */
	public static void main(String[] args) {
		String symbol = "abcdefghijklmnopqrstuvwxyz" + "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789"
				+ "!\"#$%&'()*+,-./:;<=>?@[＼]^_`{|}~\\";

		System.out.println(symbol);
		System.out.println(symbol.length());

		String temp_password = "";

		for (int i = 0; i < 6; i++) {
			int random_index = (int) (Math.random() * symbol.length());
			char random_char = symbol.charAt(random_index);
			temp_password += random_char;

		}
		System.out.println("생성된 임시 비밀번호: " + temp_password);
	}

}
