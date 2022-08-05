package quiz;

import java.util.Scanner;

public class B02_ConditionQuiz2 {
	/*
	 1. charÇü º¯¼ö a°¡ 'q'¶Ç´Â 'Q'ÀÏ¶§ true
	 2. charÇü º¯¼ö b°¡ °ø¹éÀÌ³ª ÅÇÀÌ ¾Æ´Ò ¶§ true
	 3. charÇü º¯¼ö c°¡ '0' ~ '9'ÀÏ ¶§ true
	 4. charÇü º¯¼ö d°¡ ¿µ¹®ÀÚ(´ë¹®ÀÚ ¶Ç´Â ¼Ò¹®ÀÚ)ÀÏ ¶§ true
	 5. charÇü º¯¼ö e°¡ ÇÑ±ÛÀÏ ¶§ true
	 6. charÇü º¯¼ö f°¡ ÀÏº»¾îÀÏ ¶§ true
	 7. »ç¿ëÀÚ°¡ ÀÔ·ÂÇÑ ¹®ÀÚ¿­ÀÌ exitÀÏ ¶§ true
	 */
	public static void main(String[] args) {
		// 1. charÇü º¯¼ö a°¡ 'q'¶Ç´Â 'Q'ÀÏ¶§ true
		char a = 'q';
		System.out.println("1. ");
		System.out.println(a == 'q' || a == 'Q');
		
		// 2. charÇü º¯¼ö b°¡ °ø¹éÀÌ³ª ÅÇÀÌ ¾Æ´Ò ¶§ true
		char b = 'a';
		System.out.println("2. ");
		System.out.println(!(b == ' ' || b == '\t'));
	    System.out.println(b != ' ' || b != '\t');
		
		// 3. charÇü º¯¼ö c°¡ '0' ~ '9'ÀÏ ¶§ true
		char c = '4';
		System.out.println("3. ");
		System.out.println(c >= '0' && c <= '9');
		
		// 4. charÇü º¯¼ö d°¡ ¿µ¹®ÀÚ(´ë¹®ÀÚ ¶Ç´Â ¼Ò¹®ÀÚ)ÀÏ ¶§ true
		char d = 'A';
		System.out.println("4. ");
		System.out.println((d >= 'a' && d <= 'z') || (d >= 'A' && d <= 'Z'));
		
		// 5. charÇü º¯¼ö e°¡ ÇÑ±ÛÀÏ ¶§ true
		// ÇÑ±Û ¹üÀ§ : AC00 ~ D7A3
		char e = '¶ø';
		System.out.println("5. ");
		System.out.println(e >= 0XAC00 && e <= 0XD7A3);
		System.out.println(e >= 44032 && e <= 55203);
		System.out.println(e >= '°¡' && e <= 'ÆR');
		
		// 6. charÇü º¯¼ö f°¡ ÀÏº»¾îÀÏ ¶§ true
		// È÷¶ó°¡³ª ¹üÀ§ : 3040 ~ 309F
		char f = '¤±';
		System.out.println("6. ");
		System.out.println(f >= 0x3040 && f <= 0x309F);
		
		// 7. »ç¿ëÀÚ°¡ ÀÔ·ÂÇÑ ¹®ÀÚ¿­ÀÌ exitÀÏ ¶§ true
		Scanner sc = new Scanner(System.in);
		System.out.println("7. exit¸¦ ÀÔ·ÂÇÏ½Ã¿À > ");
		
		String name1 = sc.next();
		String name2 = "exit";
		
		System.out.println(name1.equals(name2));
		/*
		 String name1 = new Scanner(System.in).next();
		 
		 System.out.println(name1.equals("exit"));
		 */
	}

}
