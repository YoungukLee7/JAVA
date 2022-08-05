package myobj.student;

public class NetworkStudent extends Student{

	//	2. ��Ʈ��ũ�� �л����� ������ ����,����,������,��Ʈ��ũ,CCNA������ �ִ�
	private int kor;
	private int eng;
	private int linuxs;
	private int network;
	private int ccna;
	
	
	private final static String GROUP_NAME = "��Ʈ��ũ"; // ���α׷��� ��
	private final static int SUBJECT_COUNT = 5; // ���� 5��
	
	// ���� ����
		public NetworkStudent() {
			// super(); �̰��� �����Ǿ����� �ִ°� ������� �ȵ� 
			kor       = (int)(Math.random() * 101);
			eng       = (int)(Math.random() * 101);
			linuxs    = (int)(Math.random() * 101);
			network   = (int)(Math.random() * 101);
			ccna      = (int)(Math.random() * 101);
		}
		
		@Override
		public int sum() {
			return kor + eng + linuxs + network + ccna;
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
					+ "���\t: %.2f\n",GROUP_NAME,name,stuNum,kor, eng, linuxs, network, ccna,sum(),avg());
		}
}
