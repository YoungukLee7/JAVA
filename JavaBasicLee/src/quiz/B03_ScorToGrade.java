package quiz;

import java.util.Scanner;

public class B03_ScorToGrade {
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
		
		double scoreMath, scoreKor, scoreEng;
		
		System.out.println("������ �Է��ϼ��� > ");
		scoreMath = sc.nextDouble();
		scoreKor = sc.nextDouble();
		scoreEng = sc.nextDouble();
		
		double average = (scoreMath + scoreKor + scoreEng) / 3;
		String garde = "��ȿ���� ���� �����Դϴ�. F���";
		
		  if (scoreMath < 0) {
			System.out.println(garde);
		} else if (scoreMath > 100) {
			System.out.println(garde);
		} else if (scoreKor < 0) {
			System.out.println(garde);
		} else if (scoreKor > 100) {
			System.out.println(garde);
		} else if (scoreEng < 0) {
			System.out.println(garde);
		} else if (scoreEng > 100) {
			System.out.println(garde);
		} else if (average < 0) {
			System.out.println(garde);
		} else if (average > 100) {
			System.out.println(garde);
		} else if (average >= 90) {
			System.out.printf("���.2%f�� A���",average);
		} else if (average >= 80) {
			System.out.printf("���%.2f�� B���",average);
		} else if (average >= 70) {
			System.out.printf("���%.2f�� C���",average);
		} else if (average >= 60) {
			System.out.printf("���%.2f�� D���",average);
		} else {
			System.out.printf("���%.2f�� �� �ܴ� F����̴�",average);
		}				
	}
}
