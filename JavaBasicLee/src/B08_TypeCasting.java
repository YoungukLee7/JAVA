
public class B08_TypeCasting {
/*
  # Ÿ��ĳ����
  - Ư�� �������� ���� �״�� �ΰ� Ÿ�Ը� ��ȯ�� �� ����ϴ� ����
  - �ش� ���� �ջ�� ����� ���� ������ ������ Ÿ���� ��ȯ��Ų��
  - �ش� ���� �ջ�� ����� ���� ���� ������ �˾Ƽ� Ÿ���� ���Ѵ�
 */
	public static void main(String []args) {
		
		byte _byte = 11;
		int _int =22;
		
		// 1. �ڿ������� Ÿ�� ĳ����
		// 4byte�� 1byte���� ���������� �˾Ƽ� Ÿ���� ���Ѵ� (byte -> int)
		_int = _byte;
		System.out.println(_int);
		System.out.println("====================");
		
		// 2. ���� �ջ�� ������ �ִ� Ÿ���� ĳ����
		// �� ���� ������ ���� ���� ������ �������� ���� �ջ�� ����� �־� �����Ͽ� ������ �߻��Ѵ�
		// �����ڰ� ������ Ÿ��ĳ������ �ؾ� �������� ����������
		_int =200;
		_byte = (byte)_int; 
		System.out.println(_byte);
		System.out.println("====================");
		
		// 3. �ؼ��� �ٸ��� �ϰ� ���� Ÿ�� ĳ����
		int ch =65;
		double value = 70.000;
		int a = 3, b = 7;
		
		System.out.println(ch);
		System.out.println((char)ch);
		System.out.println("====================");
		System.out.println(value);
		System.out.println((int)value);
		System.out.println("====================");
		System.out.println(a/b);
		System.out.println(a/(double)b);
	}
}
