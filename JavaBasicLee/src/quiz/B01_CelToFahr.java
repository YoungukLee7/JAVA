package quiz;

import java.util.Scanner;

public class B01_CelToFahr {
	
	/*
	 사용자로부터 섭씨(℃) 온도를 입력받으면 화씨(℉)로 몇 도인지 알려주는 프로그램을 만들어보세요
	 (온도 변환 공식은 구글링 할 것)
	 */
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("섭씨(℃) 온도를 입력하시오 : ");
	double c_temperature = sc.nextDouble();
	double f_temperature = c_temperature * 1.8 + 32;
	
	System.out.println("화씨(℉) : " + f_temperature + "℉");
	
	/*
	 Scanner sc = new Scanner(System.in);
	 
	 double c_temperature, f_temperature;
	 System.out.print("섭씨(℃) 온도를 입력하시오 : ");
	 
	 c_temperature = sc.nextDouble();
	 f_temperature = (c_temperature * 1.8) + 32;
	 
	 System.out.printf("섭씨 %.1℉는 화씨 %.1f℉입니다.\n" ,c_temperature, f_temperature;
	 */
	}

}
