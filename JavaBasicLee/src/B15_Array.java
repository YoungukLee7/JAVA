	
public class B15_Array {

	/*
	 # �迭 (Array)
	 - ���� Ÿ�� ������ �ѹ��� ������ �����ϴ� �����Դϴ�.
	 - ���� �̸����� ������ ������ ������ �Ŀ� �ε����� �����Ѵ�
	 - �迭�� ����� ���ÿ� ũ�⸦ ���ؾ� �Ѵ�
	 - ũ�Ⱑ �������� ���� ũ�⸦ ������ �� ����
	 - �迭�� �� ��ȣ(�ε���)�� 0���� ��ü ���� -1�� ���� �ִ�.
	 - �迭�� ������ ���ÿ� ��� ���� �ʱ�ȭ �Ǿ��ִ�.
	 (���� : 0 , �Ǽ� : 0.0 , boolean : false, ������ : null)
	 - �迭�� .length�� �Ҷ��� ()�� ������ �ʴ´�
	 
	 # �迭 ���� ���
	 1. Ÿ��[] ������ = new Ÿ��[ũ��];
	 2. Ÿ��[] ������ = {��1, ��2, ��3,...};
	 3. Ÿ��[] ������ = new Ÿ��[] {��1, ��2, ��3,...};
	 */
	public static void main(String[] args) {
		// �迭�� ���̰� 3�϶� �� ��ȣ�� 2�� ���� �ִ�
		int[] score = new int[5];
		
		score [0] = 99;
		score [1] = 98;
		score [2] = 97;
//		score [3] = 96;
		
		System.out.println("score�� ���� : " + score.length);
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
		
		// booleanŸ���� false�� �ʱ�ȭ �Ǿ��ִ�
		boolean[] complete = new boolean[5];
		
		for (int i = 0; i < complete.length; i++) {
			System.out.printf("complete[%d] : %b\n",i,complete[i]);
		}
		
		
		// char[]�� ���ڿ��̳� �ٸ�����
		char[] text = new char[100]; 
		
		text[0] = 'a';
		text[1] = 'b';
		text[2] = 'c';
		text[3] = 'd';
		
		System.out.println(text);
		
		int[] num = new int[1000]; //���� num�� 1000�� ���������
		
		num[0] = 5;
		num[1] = 3;
		num[2] = 4;
		
		// �迭 �����ϱ�
		short[] eye_power = new short[10];
		long[] money = {123L,234L,345L,5,7}; // longŸ�Կ� int�� �� �� �ִ�. Ÿ��ĳ�����̶� �� �� �ִ�.
		String[] name = new String[] {"��ö��","��ö��","��ö��","��ö��",};
		
		// �迭�� ���� �ֱ� (�� �����ϱ�)
		name[3] = "������";
		
		// �迭�� ���� ������ ����Ѵ�
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		
		// StringŸ���� char[]�� ��ȯ�Ͽ� ��� ����
		String welcomeMessage = "Hello,word!";
		
		char[] msg = welcomeMessage.toCharArray();
		
		msg[5] = '!';
		
		System.out.println(msg);
		
		System.out.println(msg[0]);
		System.out.println(msg[1]);
		System.out.println(msg[msg.length-1]); // .length -1 ��° �ε����� ������ ����
		System.out.println(msg[msg.length-2]); 
		System.out.println(msg[msg.length-3]); 
		System.out.println(msg[msg.length-4]); 
		System.out.println(msg[msg.length-5]); 
	}

}
