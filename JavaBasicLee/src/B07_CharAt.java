
public class B07_CharAt {
	/*
	 # "���ڿ�".charAt(index);
	 
	 - �ش� ���ڿ����� ���ϴ� �ε����� ���ڸ� charŸ������ ������ �Լ�
	 - ù ��° ���ڴ� 0�� �ε�����
	 
	  # "���ڿ�".length();
	  - �ش� ���ڿ��� �� ���� ���ڷ� �̷�������� intŸ������ ��ȯ�ϴ� �Լ�
	  - ���ڿ��� ������ �ε����� '���� - 1'�̴�
	 */
	public static void main(String[]args) {
		
		String msg = "My name is younguk";
		
		System.out.println(msg.charAt(6));
		System.out.println(msg.charAt(5));
		System.out.println(msg.charAt(4));
		System.out.println(msg.charAt(3));
		System.out.println(msg.charAt(2));
		System.out.println(msg.charAt(1));
		System.out.println(msg.charAt(0));
		
		System.out.println("---------------------------------");
		
		System.out.println("msg�� ����: " + msg.length());
		
		for (int i = 0; i < msg.length(); ++i) {
			System.out.println(msg.charAt(i));
		}
	}
}
