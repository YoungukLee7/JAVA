package myobj.student;

abstract public class Student implements Average, GradeCard{
	
	private static String[] firstName = {"ä��","��ȯ","����","����","����","����","ȿ��","ȣ��","����","����","��ȣ","����"};
	private static String[] LastName = {"��","��","��","��","��","��","��","��","��","��","��","��","��","��"};
	
	private static int currStuNum = 1000; // �й� ������ 1000����
	
	protected String name;
	protected int stuNum;
	
	protected Student() { // ���������� �̷� �� ���
		name = getRanName();
		stuNum = currStuNum++;
	}
	
	@Override
	public String toString() {
		return name + "[" + stuNum + "]";
	}
	
	
	public static String getRanName() { // �̸��� �����ϰ�
		return LastName[(int)(Math.random()*LastName.length)] 
				+ firstName[(int)(Math.random()*firstName.length)];
	}
	

}