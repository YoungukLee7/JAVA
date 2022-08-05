package quiz;

import java.util.Scanner;

public class B03_ScorToGrade {
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
		
		double scoreMath, scoreKor, scoreEng;
		
		System.out.println("점수를 입력하세요 > ");
		scoreMath = sc.nextDouble();
		scoreKor = sc.nextDouble();
		scoreEng = sc.nextDouble();
		
		double average = (scoreMath + scoreKor + scoreEng) / 3;
		String garde = "유효하지 않은 점수입니다. F등급";
		
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
			System.out.printf("평균.2%f점 A등급",average);
		} else if (average >= 80) {
			System.out.printf("평균%.2f점 B등급",average);
		} else if (average >= 70) {
			System.out.printf("평균%.2f점 C등급",average);
		} else if (average >= 60) {
			System.out.printf("평균%.2f점 D등급",average);
		} else {
			System.out.printf("평균%.2f점 그 외는 F등급이다",average);
		}				
	}
}
