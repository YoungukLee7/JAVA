package quiz;

public class A01_Memberinfo {

	public static void main(String[] args) {
		String name1 = "홍길동", name2 = "임꺽정", name3 = "김말이";
		String number1 = "010-123-1234", number2 = "010-234-2345", number3 = "010-345-3456";
		int money1 = 20, money2 = 30, money3 = 50, money4 = money1 + money2 + money3;
		int age1 = 15, age2 =20, age3 =28;
		
		
		
		System.out.println("\t    ####회비 정보####");
		System.out.println("=========================================");
		System.out.println("이름\t나이\t전화번호\t\t회비");
		System.out.println("=========================================");
		System.out.println(name1 + "\t\"" + age1 + "\"\t" + number1 + "\t￦" + money1 + ",000");
		System.out.println(name2 + "\t\"" + age2 + "\"\t" + number2 + "\t￦"+ money2 + ",000");
		System.out.println(name3 + "\t\"" + age3 + "\"\t" + number3 + "\t￦"+ money3 + ",000");
		System.out.println("-----------------------------------------");
		System.out.println("총합계\t\t\t\t￦" + money4 + ",000");
		System.out.println("=========================================");
	}

}
