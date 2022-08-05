package quiz;

public class B02_ConditionQuiz {
	/*
	 (알맞은 비교 연산을 만드시오)
	 
	 1. int형 변수 a가 10보다 크고 20보다 작을 때 true
	 2. int형 변수 b가 짝수일 때 true
	 3. int형 변수 c가 7의 배수일 때 true
	 4. int형 변수 hour가 0미만 24이상이 아니고, 12이상일 때 true
	 5. int형 변수 d와 e의 차이가 30일때 true
	 6. int형 변수 year가 400으로 나누어 떨어지거나
	 또는 4로 나누어 떨어지고 100으로 나누어 떨러지지 않을 때 true
	 7. 민수가 철수보다 2살 많으면 true
	 8. 민수가 철수보다 생일이 3달 빠르면 true
	 9.boolean 형 변수 powerOn이 false일때 true
	 10. 문자열 참조변수 str이 "yes"일때 true
	 */
	public static void main(String[] args) {
	// 1. int형 변수 a가 10보다 크고 20보다 작을 때 true
		int a = -5;
		System.out.println("1. ");
		System.out.println(a > 10 && a < 20);
		
	// 2. int형 변수 b가 짝수일 때 true
		int b = 34;
		System.out.println("2. ");
		System.out.println( b % 2 == 0);
		
	// 3. int형 변수 c가 7의 배수일 때 true
		int c = 14;
		System.out.println("3. ");
		System.out.println( c % 7 == 0);
		
	// 4. int형 변수 hour가 0미만 24이상이 아니고, 12이상일 때 true
		int hour = 23;
		System.out.println("4. ");
		System.out.println(!(hour < 0 || hour >= 24) && hour >= 12);
	//	System.out.println(hour < 24 && hour >= 12);
	//	System.out.println(!(hour < 0) && !(hour >= 24) && hour >= 12);
		
	// 5. int형 변수 d와 e의 차이가 30일때 true
		int d =10, e = 40;
		System.out.println("5. ");
		System.out.println( e - d == 30 || d - e == 30);
	//	System.out.println(Math.abs(d - e) == 30);
		
	// 6. int형 변수 year가 400으로 나누어 떨어지거나 또는 4로 나누어 떨어지고 100으로 나누어 떨러지지 않을 때 true
		int year = 800;
		System.out.println("6. ");
		System.out.printf("%d년은 2월이 하루 더 있는 해인가요? ", year);
		System.out.println( year % 400 == 0 || year % 4 == 0 && !(year % 100 == 0));
	//	System.out.println( year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
		
	// 7. 민수가 철수보다 2살 많으면 true
		int minsoo_age = 15, chalsoo_age = 13;
		System.out.println("7. ");
		System.out.println(minsoo_age == (chalsoo_age + 2));
		
	// 8. 민수가 철수보다 생일이 3달 빠르면 true
		int minsoo_Birth = 11, chalsoo_Birth = 2;
		System.out.println("8. ");
		System.out.println((minsoo_Birth + 12)%12 == (chalsoo_Birth - 3 + 12)%12);
	//	System.out.println(chalsoo_Birth - minsoo_Birth == 3 || minsoo_Birth - chalsoo_Birth == 9);
	//	System.out.println((minsoo_Birth + 3) % 12 == chalsoo_Birth);
	//	System.out.println((chalsoo_Birth - 3 + 12) % 12 == minsoo_Birth);
		
	// 9.boolean 형 변수 powerOn이 false일때 true
		boolean powerOn = false;
		System.out.println("9. ");
		System.out.println(powerOn == false);
	//	System.out.println(!powerOn);
	
	// 10. 문자열 참조변수 str이 "yes"일때 true
		
		System.out.println("10. ");
		
		String str1 = "yes";
		String str2 = "yes";
		String str3 = new String("yes");
		
		System.out.println("--------------");
		System.out.println(str1 == "yes");
		System.out.println(str2 == "yes");
		
		// 가지고 있는 주소값이 같은지 비교 (같은 객체를 가리키고 있는지 비교)
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str2 == str3);
		
		// 실제 값을 통한 비교 (가지고 있는 실제 값이 같은지 비교)
		System.out.println(str1.equals(str3));
		
		
	/* # 참조형 변수는 ==으로 비교하면 주소값을 통해 비교한다
	 	- 그냥 String str1 = "yes";
		      String str2 = "yes"; 이렇게 선언해 주면 str1, str2에 "yes"가 들어있는 
		      주소가 들어가 있어 서로 같다고 나오지만
		      (String str3 = new String("yes");) 이처럼 새로운 변수를 만들어주거나 
		      scanner에 입력하면 새로운 "yes"가 만들어져 다르다고 나온다
		- 실제 값이 동일한지 비교할 때에는 해당 참조형 변수에 딸려있는 equals()를 사용한다
	 
	 */
	}

}
