package myobj.student;

public class ProgrammingStudent extends Student{

	// 1. 프로그래밍 반 학생들은 각자의 국어,영어,수학,프로그래밍 언어,자료구조,운영체제 점수가 있다
	private int kor;
	private int eng;
	private int math;
	private int pl;
	private int ds;
	private int os;
	
	
	private final static String GROUP_NAME = "프로그래밍"; // 프로그래밍 반
	private final static int SUBJECT_COUNT = 6; // 과목 6개
	
	// 점수 랜덤
	public ProgrammingStudent() {
		// super(); 이것이 생략되어있음 있는걸 까먹으면 안됨 
		kor  = (int)(Math.random() * 101);
		eng  = (int)(Math.random() * 101);
		math = (int)(Math.random() * 101);
		pl   = (int)(Math.random() * 101);
		ds   = (int)(Math.random() * 101);
		os   = (int)(Math.random() * 101);
	}
	
	@Override
	public int sum() {
		return kor + eng + math + pl + ds + os;
	}

	@Override
	public double avg() {
		return sum() / (double) SUBJECT_COUNT;
	}

	@Override
	public void printGradeCard() {
		System.out.printf("[%s]\n"
				+ "%s {%d}\n"
				+ "KOR\t: %d\n"
				+ "ENG\t: %d\n"
				+ "MATH\t: %d\n"
				+ "P.L\t: %d\n"
				+ "D.S\t: %d\n"
				+ "O.S\t: %d\n"
				+ "총점\t: %d\n"
				+ "평균\t: %.2f\n",GROUP_NAME,name,stuNum,kor, eng, math, pl, ds, os,sum(),avg());
	}

}
