package quiz;

public class A01_Memberinfo {

	public static void main(String[] args) {
		String name1 = "ȫ�浿", name2 = "�Ӳ���", name3 = "�踻��";
		String number1 = "010-123-1234", number2 = "010-234-2345", number3 = "010-345-3456";
		int money1 = 20, money2 = 30, money3 = 50, money4 = money1 + money2 + money3;
		int age1 = 15, age2 =20, age3 =28;
		
		
		
		System.out.println("\t    ####ȸ�� ����####");
		System.out.println("=========================================");
		System.out.println("�̸�\t����\t��ȭ��ȣ\t\tȸ��");
		System.out.println("=========================================");
		System.out.println(name1 + "\t\"" + age1 + "\"\t" + number1 + "\t��" + money1 + ",000");
		System.out.println(name2 + "\t\"" + age2 + "\"\t" + number2 + "\t��"+ money2 + ",000");
		System.out.println(name3 + "\t\"" + age3 + "\"\t" + number3 + "\t��"+ money3 + ",000");
		System.out.println("-----------------------------------------");
		System.out.println("���հ�\t\t\t\t��" + money4 + ",000");
		System.out.println("=========================================");
	}

}
