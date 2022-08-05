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
	 	1. ���α׷��� �� �л����� ������ ����,����,����, ���α׷��� ���,�ڷᱸ��,�ü�� ������ �ִ�
	 	2. ��Ʈ��ũ�� �л����� ������ ����,����,������,��Ʈ��ũ,CCNA������ �ִ�
	 	3. �ӽŷ��� �л����� ������ ����,����,����,�����,���α׷��� ��� ������ �ִ�
	 	4. 100���� �л��� �������� �����Ѵ�.
		   ��� �л��� ��,���� ����, �̸��� �������� �����Ǿ�� �ϰ�,
		   �й��� �ߺ����� ���������� �ļ��Ǿ�� �Ѵ�.
		5. ����ǥ ��� �޼��带 ���� �� �л��� [�̸�/�� ���� ����/����/���]�� �� �� �־�� �Ѵ�
	 */
	
	static void printAverage(Average[] arr) {
		for(Average obj : arr) {
			System.out.println(obj);
			System.out.println("�� ��: " + obj.sum());
			System.out.printf("��� : %.2f\n" + obj.avg());
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


