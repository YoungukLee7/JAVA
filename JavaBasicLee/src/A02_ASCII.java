
public class A02_ASCII {
	
	/*
	 # ASCII �ڵ�
	 - ���� 0 ~ 127������ �����ϴ� ���ڵ鸦 ASCII �ڵ��� �Ѵ�
	 - 'A' -> 65, 'a' -> 97, '0' -> 48 (�ܿ��)
	 */
	public static void main(String[] args) {
	
	/*
	 ��� �����ʹ� ������ 0��1�� ��ȯ�Ǿ� ����ȴ�
	 ���ڴ� �ٷ� 0�� 1�� ��ȯ�� �� ���� ������ ���ڿ� �ش��ϴ� ���ڰ��� �����Ѵ�
	 
	 �� ���� �� 0 ~ 127�� ������ ASCII �ڵ��� �Ѵ�
	 65 - 'A'
	 97 - 'a'
	 
	 10���� : 10 ---encoding----> 2���� : 1010
	    A -> 65 ---encoding----> 0100 0001
	    B -> 66 ---encoding----> 0100 0010
	  
	  0100 0001 ---decoding---> A 
	  0100 0010 ---decoding---> B 
	    
	 */
		
	System.out.println("abcdefg!!");
	System.out.println('0'); // ���� 0 - �����δ� 48�̶�� ���� ������ ����
	System.out.println(0); // ���� 0 - �����ε� 0
	
	// ���� Ÿ�� ���ͷ��� ���� ���� ���� �ʹٸ� �տ� (int)�� ���δ�
	System.out.println((int)'0');
	System.out.println((int)'A');
	
	// ���� Ÿ�� ���ͷ��� ���� ���¸� ���� �ʹٸ� �տ� (char)�� ���δ�
	System.out.println((char)97);
	System.out.println((char)122);
	
	// ���� Ÿ�� ���ͷ��� �����δ� ���ڰ�(�ڵ尪)�� ������ �־� ��� �����ϴ�
	System.out.println('A' + 100); // ����� �⺻������ ���ڴ�
	System.out.println((char)('A' + 20)); // A�κ��� 20��° �ڿ� �ִ� ���ڸ� ã�� ���
	System.out.println((char)('Z' - 13)); // Z�κ��� 13��° �տ� �ִ� ���ڸ� ã�� ���
	System.out.println('A' - 'a'); // �빮�ڿ� �ҹ����� �Ÿ� (�빮�ڿ� �ҹ��ڸ� ��ȯ�ϱ� ���� �Ÿ�)
	System.out.println((char)('k' + ('A' - 'a'))); // �ҹ��� k�� �빮�� K�� ��ȯ
	System.out.println('L' - 'A'); // �� ��° ���ĺ����� �˾Ƴ� �� ����
	
	// ���ڿ��� ���ڰ� ������ ����� �� �ִ� Ÿ���̱� ������ �����ڵ�� ��ȯ�� �� ����
	System.out.println("A" + 10);
	
	
	}

}
