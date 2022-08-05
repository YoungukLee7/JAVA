package myobj.student;

public class MachinelearningStudent extends Student{

	// 3. �ӽŷ��� �л����� ������ ����,����,����,�����,���α׷��� ��� ������ �ִ�
	private int kor;
	private int eng;
	private int math;
	private int statistics;
	private int programmingLanguage;
	
	
	private final static String GROUP_NAME = "�ӽŷ���"; // ���α׷��� ��
	private final static int SUBJECT_COUNT = 5; // ���� 5��
	
	// ���� ����
			public MachinelearningStudent() {
				// super(); �̰��� �����Ǿ����� �ִ°� ������� �ȵ� 
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
						+ "����\t: %d\n"
						+ "���\t: %.2f\n",GROUP_NAME,name,stuNum,kor, eng, math, statistics, programmingLanguage,sum(),avg());
			}
}
