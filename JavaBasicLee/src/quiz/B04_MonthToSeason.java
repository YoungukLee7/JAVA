package quiz;

import java.util.Scanner;

public class B04_MonthToSeason {
	/*
	 ����ڷκ��� �� ������ �Է¹����� �ش��ϴ� ������ ����غ�����
	 (�ݵ�� switch-case���� �̿��Ͻÿ�)
	 */
	public static void main(String[] args) {

		System.out.println("�� ������ �Է��Ͻÿ� > ");

		int month;
		String season;

		switch (month = new Scanner(System.in).nextInt()) {
		case 1: case 2: case 12:
			season = "�ܿ�";
			break;
		case 3: case 4: case 5:
			season = "��";
			break;
		case 6: case 7: case 8:
			season = "����";
			break;
		case 9: case 10: case 11:
			season = "����";
			break;
		default:
			season = "��";
			break;
		}
		System.out.printf("%d���� %s �Դϴ�.\n", month, season);
	}

}
