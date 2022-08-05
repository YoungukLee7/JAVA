package myobj.student;

public class MachinelearningStudent extends Student{

	// 3. 머신러닝 학생들은 각자의 국어,영어,수학,통계학,프로그래밍 언어 점수가 있다
	private int kor;
	private int eng;
	private int math;
	private int statistics;
	private int programmingLanguage;
	
	
	private final static String GROUP_NAME = "머신러닝"; // 프로그래밍 반
	private final static int SUBJECT_COUNT = 5; // 과목 5개
	
	// 점수 랜덤
			public MachinelearningStudent() {
				// super(); 이것이 생략되어있음 있는걸 까먹으면 안됨 
				kor                      = (int)(Math.random() * 101);
				eng                      = (int)(Math.random() * 101);
				math                     = (int)(Math.random() * 101);
				statistics               = (int)(Math.random() * 101);
				programmingLanguage      = (int)(Math.random() * 101);
			}
			
			@Override
			public int sum() {
				return kor + eng + math + statistics + programmingLanguage;
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
						+ "Linuxs\t: %d\n"
						+ "Network\t: %d\n"
						+ "CCNA\t: %d\n"
						+ "총점\t: %d\n"
						+ "평균\t: %.2f\n",GROUP_NAME,name,stuNum,kor, eng, math, statistics, programmingLanguage,sum(),avg());
			}
}
