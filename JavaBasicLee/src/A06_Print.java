
public class A06_Print {
	/*
	 # 콘솔에 편리하게 출력하기 위한 함수들
	 1. print()
	 - ()안에 전달한 데이터를 콘솔에 출력한다
	 2.println()
	 - ()안에 전달한 데이터를 콘솔에 출력하면서 줄을 자동으로 바꿔준다
	 - ()에 전달한 값 맨 뒤에 '\n'을 추가하여 출력한다.
	 - ()에 아무것도 전달하지 않으면 '\n'만 출력된다.
	 3.printf()
	 - print format
	 - 서식을 이용해 원하는 출력 형태를 미리 만들어 둘 수 있는 출력 함수
	 - 서식 문자 자리에 값을 순서대로 채워서 사용한다
	 - \n이 자동으로 추가되지 않으므로 주의해야 한다
	 - 출력의 형태를 미리 만들고, 서식 문자 자리에 값을 순서대로 채워서 출력한다
	 - 문자열을 +로 이어붙이는 것 보다 서식을 사용하는 것이 편리할 때가 있다
	 - 줄을 자동으로 바꿔주지 않으므로 '\n'을 빼먹지 않도록 주의해야 한다 
	 
	 0100101001010110111 - 2진수
	 010/010/100/101/011/011 - 8진수 (2진수에서 3개씩 나누면 8진수가 된다)
	 01/0010/1001/0101/1011 - 16진수 (2진수에서 4개씩 나누면 16진수가 된다)
	 
	 */
	public static void main(String[] args) {
		
		System.out.print("Hello world!");
		System.out.println("Hello world!");
		System.out.println("Hello world!");
	
		int year = 2022, month = 4, day = 13, hour = 14, minute = 24, second = 55;
		
		System.out.println("오늘은 " + year + "년 " + month + "월 " + day + "일이고, " 
		+ "현재 시간은 "+ hour + "시 "+minute + "분 "+second + "초 입니다.");
		
		System.out.printf("오늘은 %d년 %d월 %d일이고, 현재 시간은 %d시 %d분 %d초 입니다.\n",
				year, month, day, hour, minute, second);
		
		System.out.printf("오늘은 %d/ %d 입니다.\n",4, 13);
		System.out.println("==================================");
		
		/* #서식 문자의 종류
		  %d    : 해당 자리에 전달한 정수값을 10진수로 출력해준다 (decimal)
		  %x	: 해당 자리에 전달한 정수값을 16진수로 출력해준다 (hexa decimal) (소문자)
		  %X 	: 해당 자리에 전달한 정수값을 16진수로 출력해준다 (hexa decimal) (대문자)
		  $o    : 해당 자리에 전달한 정수값을 8진수로 출력해준다
		  %s    : 해당 자리에 문자열을 전달할 수 있다 (String)
		  %c    : 해당 자리에 문자를 전달할 수 있다 (char)
		  %f    : 해당 자리에 실수를 전달할 수 있다 (float,double)
		  %%	: 그냥 %를 출력하고 싶을 때 사용
		 */

		System.out.printf("30(10진수) : %d\n", 30);
		System.out.printf("30(16진수) : %x\n", 30);
		System.out.printf("30(16진수) : %X\n", 30);
		System.out.printf("30(8진수) : %o\n", 30);
		System.out.printf("오늘은 '%s' 입니다.\n", "목요일");
		System.out.printf("오늘은 '%c요일' 입니다.\n", '金');
		System.out.printf("오늘의 온도: %f℃\n", 27.8);
		System.out.printf("오늘의 온도: %.4f℃\n", 27.8);
		System.out.printf("오늘의 온도: %.3f℃\n", 27.8);
		System.out.printf("오늘의 온도: %.2f℃\n", 27.8);
		System.out.printf("오늘의 온도: %.1f℃\n", 27.8);
		System.out.printf("오늘의 온도: %.0f℃\n", 27.8);
		System.out.println("==================================");
		
		/* 
	 	# 서식 문자 옵션들 (* %d에서만 사용할 수 있는)
	 	- 서식 문자의 %와 문자 사이에 넣어서 사용한다
	 
	 	%숫자d	: 자릿수를 숫자만큼 자릿수를 확보한 뒤 오른쪽 정렬하여 출력
	 	%-숫자d	: 자릿수를 숫자만큼 자릿수를 확보한 뒤 원쪽 정렬하여 출력
	 	%0숫자d	: 자릿수를 숫자만큼 자릿수를 확보한 뒤 빈칸에 0을 채워서 출력 (%d, %f)
	 	%.숫자f	: 실수의 소수점 아래 자릿수를 설정한다
		 */
		
		System.out.printf("%5d\n", 1234);
		System.out.printf("%10d\n", 1234);
		System.out.printf("%15d\n", 1234);
		
		System.out.printf("%-5s : 10\n", "score");
		System.out.printf("%-10s : 10\n", "score");
		System.out.printf("%-15s : 10\n", "score");
		System.out.printf("%-20s : 10\n", "score");
		System.out.printf("%-25s : 10\n", "score");
		
		System.out.printf("%04d\n",15);
		System.out.printf("%04d\n",3);
		
		//서식문자 옵션들은 조합해서 사용할 수 있다
		System.out.printf("%010.3f\n",123.555555555);
		
	}

}
