package quiz;

import java.util.Scanner;

import javax.annotation.processing.RoundEnvironment;

public class B03_ScorToGrade2 {
	/*
	 ������ �� �� �Է¹ް� ��� ������ �� ��
	 ��� ������ �ش��ϴ� ����� ������ִ� ���α׷��� ��������
	 
	 1. ������ ��/��/���� �ִ�
	 
	 2. 90�� �̻��� A
	    80�� �̻��� B
	    70�� �̻��� C
	    60�� �̻��� D
	    �� �ܴ� F����̴�
	    
	    3. ��ȿ�� ������  0 ~ 100���̴�. (��ȿ���� �ʴ� ������ F��� ó��)
	    
	    4. ��� ������ �Ҽ� �����ڸ����� �ݿø��Ͽ� ���
	    
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int scoreMath, scoreKor, scoreEng, total;
		double average;
		
		System.out.println("������ �Է��ϼ��� > ");
		scoreKor = sc.nextInt();
		scoreEng = sc.nextInt();
		scoreMath = sc.nextInt();
		
		total = scoreMath + scoreKor + scoreEng;
		average = Math.round(total / 3.0 * 100) / 100.0;
		char garde = 'F';
		boolean arror = false;
		
		System.out.printf("���� : %d\t��� : %.2f\n", total, average);
		
		if (scoreKor < 0 || scoreKor > 100) {
			System.out.println("���������� ��ȿ���� �ʴ�.");
			arror = true;
		} if (scoreEng < 0 || scoreEng > 100) {
			System.out.println("���������� ��ȿ���� �ʴ�.");
			arror = true;
		} if (scoreMath < 0 || scoreMath > 100) {
			System.out.println("���������� ��ȿ���� �ʴ�.");
			arror = true;
		} if (average < 0 || average > 100) {
			System.out.println("��������� ��ȿ���� �ʴ�.");
			arror = true;
		} if (average >= 90) {
			garde = 'A';
		} else if (average >= 80) {
			garde = 'B';
		} else if (average >= 70) {
			garde = 'C';
		} else if (average >= 60) {
			garde = 'D';
		} else {
			garde = 'F';
		}
		System.out.printf("����� ����� '%c'�Դϴ�.\n",garde);
	}

}
