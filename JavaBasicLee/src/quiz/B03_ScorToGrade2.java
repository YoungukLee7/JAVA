package quiz;

import java.util.Scanner;

import javax.annotation.processing.RoundEnvironment;

public class B03_ScorToGrade2 {
	/*
	 점수를 세 개 입력받고 평균 점수를 낸 후
	 평균 점수에 해당하는 등급을 출력해주는 프로그램을 만들어보세요
	 
	 1. 과목은 국/영/수가 있다
	 
	 2. 90점 이상은 A
	    80점 이상은 B
	    70점 이상은 C
	    60점 이상은 D
	    그 외는 F등급이다
	    
	    3. 유효한 점수는  0 ~ 100점이다. (유효하지 않는 점수는 F등급 처리)
	    
	    4. 평균 점수는 소수 셋제자리에서 반올림하여 기록
	    
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int scoreMath, scoreKor, scoreEng, total;
		double average;
		
		System.out.println("점수를 입력하세요 > ");
		scoreKor = sc.nextInt();
		scoreEng = sc.nextInt();
		scoreMath = sc.nextInt();
		
		total = scoreMath + scoreKor + scoreEng;
		average = Math.round(total / 3.0 * 100) / 100.0;
		char garde = 'F';
		boolean arror = false;
		
		System.out.printf("총점 : %d\t평균 : %.2f\n", total, average);
		
		if (scoreKor < 0 || scoreKor > 100) {
			System.out.println("국어점수가 유효하지 않다.");
			arror = true;
		} if (scoreEng < 0 || scoreEng > 100) {
			System.out.println("영어점수가 유효하지 않다.");
			arror = true;
		} if (scoreMath < 0 || scoreMath > 100) {
			System.out.println("수학점수가 유효하지 않다.");
			arror = true;
		} if (average < 0 || average > 100) {
			System.out.println("평균점수가 유효하지 않다.");
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
		System.out.printf("당신의 등급은 '%c'입니다.\n",garde);
	}

}
