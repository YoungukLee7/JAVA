package quiz;

public class B12_TemPassword {

	/*
	 6�ڸ��� ���� �ӽ� ��й�ȣ�� �����ϴ� ���α׷��� ����� ������
	 (��й�ȣ�� �����ϴ� ���� - ����,����,Ư������)
	 ����
	 '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
	 ���� �빮��
	 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 
	 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
	 ���� �ҹ���
	 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 
	 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
	 ��� ������ Ư������
	 ! " # $ % & ' ( ) * + , - . / 
	 : ; < = > ? @
	  [ ] ^ _ `
	   { } ~ |
	 */
	public static void main(String[] args) {
		String symbol = "abcdefghijklmnopqrstuvwxyz" + "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789"
				+ "!\"#$%&'()*+,-./:;<=>?@[��]^_`{|}~\\";

		System.out.println(symbol);
		System.out.println(symbol.length());

		String temp_password = "";

		for (int i = 0; i < 6; i++) {
			int random_index = (int) (Math.random() * symbol.length());
			char random_char = symbol.charAt(random_index);
			temp_password += random_char;

		}
		System.out.println("������ �ӽ� ��й�ȣ: " + temp_password);
	}

}
