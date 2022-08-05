package quiz;

public class B02_ConditionQuiz {
	/*
	 (�˸��� �� ������ ����ÿ�)
	 
	 1. int�� ���� a�� 10���� ũ�� 20���� ���� �� true
	 2. int�� ���� b�� ¦���� �� true
	 3. int�� ���� c�� 7�� ����� �� true
	 4. int�� ���� hour�� 0�̸� 24�̻��� �ƴϰ�, 12�̻��� �� true
	 5. int�� ���� d�� e�� ���̰� 30�϶� true
	 6. int�� ���� year�� 400���� ������ �������ų�
	 �Ǵ� 4�� ������ �������� 100���� ������ �������� ���� �� true
	 7. �μ��� ö������ 2�� ������ true
	 8. �μ��� ö������ ������ 3�� ������ true
	 9.boolean �� ���� powerOn�� false�϶� true
	 10. ���ڿ� �������� str�� "yes"�϶� true
	 */
	public static void main(String[] args) {
	// 1. int�� ���� a�� 10���� ũ�� 20���� ���� �� true
		int a = -5;
		System.out.println("1. ");
		System.out.println(a > 10 && a < 20);
		
	// 2. int�� ���� b�� ¦���� �� true
		int b = 34;
		System.out.println("2. ");
		System.out.println( b % 2 == 0);
		
	// 3. int�� ���� c�� 7�� ����� �� true
		int c = 14;
		System.out.println("3. ");
		System.out.println( c % 7 == 0);
		
	// 4. int�� ���� hour�� 0�̸� 24�̻��� �ƴϰ�, 12�̻��� �� true
		int hour = 23;
		System.out.println("4. ");
		System.out.println(!(hour < 0 || hour >= 24) && hour >= 12);
	//	System.out.println(hour < 24 && hour >= 12);
	//	System.out.println(!(hour < 0) && !(hour >= 24) && hour >= 12);
		
	// 5. int�� ���� d�� e�� ���̰� 30�϶� true
		int d =10, e = 40;
		System.out.println("5. ");
		System.out.println( e - d == 30 || d - e == 30);
	//	System.out.println(Math.abs(d - e) == 30);
		
	// 6. int�� ���� year�� 400���� ������ �������ų� �Ǵ� 4�� ������ �������� 100���� ������ �������� ���� �� true
		int year = 800;
		System.out.println("6. ");
		System.out.printf("%d���� 2���� �Ϸ� �� �ִ� ���ΰ���? ", year);
		System.out.println( year % 400 == 0 || year % 4 == 0 && !(year % 100 == 0));
	//	System.out.println( year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
		
	// 7. �μ��� ö������ 2�� ������ true
		int minsoo_age = 15, chalsoo_age = 13;
		System.out.println("7. ");
		System.out.println(minsoo_age == (chalsoo_age + 2));
		
	// 8. �μ��� ö������ ������ 3�� ������ true
		int minsoo_Birth = 11, chalsoo_Birth = 2;
		System.out.println("8. ");
		System.out.println((minsoo_Birth + 12)%12 == (chalsoo_Birth - 3 + 12)%12);
	//	System.out.println(chalsoo_Birth - minsoo_Birth == 3 || minsoo_Birth - chalsoo_Birth == 9);
	//	System.out.println((minsoo_Birth + 3) % 12 == chalsoo_Birth);
	//	System.out.println((chalsoo_Birth - 3 + 12) % 12 == minsoo_Birth);
		
	// 9.boolean �� ���� powerOn�� false�϶� true
		boolean powerOn = false;
		System.out.println("9. ");
		System.out.println(powerOn == false);
	//	System.out.println(!powerOn);
	
	// 10. ���ڿ� �������� str�� "yes"�϶� true
		
		System.out.println("10. ");
		
		String str1 = "yes";
		String str2 = "yes";
		String str3 = new String("yes");
		
		System.out.println("--------------");
		System.out.println(str1 == "yes");
		System.out.println(str2 == "yes");
		
		// ������ �ִ� �ּҰ��� ������ �� (���� ��ü�� ����Ű�� �ִ��� ��)
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str2 == str3);
		
		// ���� ���� ���� �� (������ �ִ� ���� ���� ������ ��)
		System.out.println(str1.equals(str3));
		
		
	/* # ������ ������ ==���� ���ϸ� �ּҰ��� ���� ���Ѵ�
	 	- �׳� String str1 = "yes";
		      String str2 = "yes"; �̷��� ������ �ָ� str1, str2�� "yes"�� ����ִ� 
		      �ּҰ� �� �־� ���� ���ٰ� ��������
		      (String str3 = new String("yes");) ��ó�� ���ο� ������ ������ְų� 
		      scanner�� �Է��ϸ� ���ο� "yes"�� ������� �ٸ��ٰ� ���´�
		- ���� ���� �������� ���� ������ �ش� ������ ������ �����ִ� equals()�� ����Ѵ�
	 
	 */
	}

}
