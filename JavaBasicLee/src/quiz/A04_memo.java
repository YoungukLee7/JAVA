package quiz;

public class A04_memo {

	public static void main(String[] args) {
	String name = "홍길동", number = "010-1234-1234", blood = "O";
	int age = 20;
	double heght = 178.5, weght = 75;
	
	System.out.println("==========출력 결과==========");
	System.out.println("이름\t: " + name);
	System.out.println("나이\t: " + age);
	System.out.println("Tel\t: " + number);
	System.out.println("키\t: " + heght);
	System.out.printf("몸무게\t\t: %.0f\n" , weght);
	System.out.println("혈액형\t\t: " + blood);
	}

}
