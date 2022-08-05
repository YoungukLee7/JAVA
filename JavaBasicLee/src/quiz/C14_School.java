package quiz;

import myobj.student.Student;
import myobj.student.NetworkStudent;
import myobj.student.ProgrammingStudent;

import java.util.Arrays;

import myobj.student.Average;
import myobj.student.GradeCard;
import myobj.student.MachinelearningStudent;

public class C14_School {
	/*
	 	1. 프로그래밍 반 학생들은 각자의 국어,영어,수학, 프로그래밍 언어,자료구조,운영체제 점수가 있다
	 	2. 네트워크반 학생들은 각자의 국어,영어,리눅스,네트워크,CCNA점수가 있다
	 	3. 머신러닝 학생들은 각자의 국어,영어,수학,통계학,프로그래밍 언어 점수가 있다
	 	4. 100명의 학생을 랜덤으로 생성한다.
		   모든 학생의 반,과목별 점수, 이름은 랜덤으로 생성되어야 하고,
		   학번은 중복없이 순차적으로 셍성되어야 한다.
		5. 성적표 출력 메서드를 통해 각 학생의 [이름/각 과목 점수/총점/평균]을 볼 수 있어야 한다
	 */
	
	static void printAverage(Average[] arr) {
		for(Average obj : arr) {
			System.out.println(obj);
			System.out.println("총 합: " + obj.sum());
			System.out.printf("평균 : %.2f\n" + obj.avg());
		}
	};
	
	
	static void printGradeCard(GradeCard[] arr) {
		for (GradeCard objCard : arr) {
			objCard.printGradeCard();
		}
	}
	
	public static void main(String[] args) {
		Student[] students = new Student[100];
		
		for (int i = 0; i < 100; i++) {
			
			switch ((int)(Math.random()*3)) {
			case 0:
				students[i] = new ProgrammingStudent();
				break;
			case 1:
				students[i] = new NetworkStudent();
				break;
			case 2:
				students[i] = new MachinelearningStudent();
				break;
			}
		}
		printGradeCard(students);
		printAverage(students);
	}
}


