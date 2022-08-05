package myobj.student;

abstract public class Student implements Average, GradeCard{
	
	private static String[] firstName = {"채현","규환","영욱","현지","수민","진우","효정","호민","유진","준혁","민호","은희"};
	private static String[] LastName = {"고","강","김","권","박","배","송","안","이","최","송","안","장","하"};
	
	private static int currStuNum = 1000; // 학번 시작을 1000으로
	
	protected String name;
	protected int stuNum;
	
	protected Student() { // 접근제어자 이럴 때 사용
		name = getRanName();
		stuNum = currStuNum++;
	}
	
	@Override
	public String toString() {
		return name + "[" + stuNum + "]";
	}
	
	
	public static String getRanName() { // 이름을 랜덤하게
		return LastName[(int)(Math.random()*LastName.length)] 
				+ firstName[(int)(Math.random()*firstName.length)];
	}
	

}