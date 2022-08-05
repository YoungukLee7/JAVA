import java.io.IOException;
import java.nio.channels.UnsupportedAddressTypeException;

public class E02_Throw {
	/*
	 # throw
	 - ���ϴ� ���ܸ� �߻���Ų��
	 - ���� ���� ����� ������ ����ϴ� ������� ���� ó���� �ñ� �� �ִ�
	 
	 # throws
	 - �ش� �޼��忡�� ���ܰ� �߻����� �˸��� �����̴�
	 - �ش� �޼��� ���ο��� ���ܰ� �߻��� �� �߰��� �� �ִ�
	 - ���ο��� ���ܸ� ���� ó������ �ʰ� �޼��带 ȣ���ϴ� ���α׷��ӿ��� �����Ѵ�. 
	 
	 # �� ó������ �ʾƵ� �Ǵ� ���� (RuntimeException)
	 - RuntimeException Ŭ������ ��ӹ��� ���ܵ��� �ݵ�� ó������ �ʾƵ� �Ǵ� �����̴�.
	 - ����ó���� ���� �ʾƵ� ������ ����(������)�� �߻����� �ʴ´�.
	 
	 # �ݵ�� ó���ؾ��ϴ� �Ǵ� ���� (Exception)
	 - Exception Ŭ������ ��ӹ��� ���ܵ��� �ݵ�� ó���ؾ� �ϴ� ���ܰ� �ȴ�.
	 - ����ó���� ���� ������ �������� �Ұ����ϴ�.
	 - ��򰡿����� �ݵ�� try-catch������ ó���Ǿ�� �������� ������ �� �ִ�.
	 - �߻��� ������ �ٷ� ó���ϰ� ���� ���� ��� throws�� ����Ͽ� �ش� �޼��带 ȣ���ϴ� ������ ����ó���� ���ѱ� �� �ִ�.
	 */
								// �ݵ�� ó���ؾ� �ϴ°��� �̷��� �����ش�
	public static void method4() throws IOException, ClassNotFoundException {
		switch ((int)(Math.random()*5)) {
		case 0:
			throw new ArrayIndexOutOfBoundsException();
		case 1:
			throw new ArithmeticException();
		case 2:
			throw new IOException();
		case 3:
			throw new ClassNotFoundException();
		case 4:
			throw new UnsupportedAddressTypeException();
		}
	}
	public static void method3() {
		throw new NullPointerException();
	}
	public static void method2() {
		method3();
	}
	public static void method1() {
		method2();
	}
	
	public static void main(String[] args) {
		
		try {
			method1();
		} catch (Exception e) {
			System.out.println("�߻��� ������ �޼����� \"" + e.getMessage() + "\" �Դϴ�");
			System.out.println("���� �߻� ������ ���� ����:");
			e.printStackTrace();
		}
		
		try {
			method4();
		} catch (Exception e) {
			System.out.println(e);
		} 
		
//		throws�� �θ� �͵��� method4()�� �θ��� ���� ���´�
//		try {
//			method4();
//		} catch (ClassNotFoundException e) {
//			
//		} catch (IOException e) {
//			
//		}
		
		System.out.println("welcome");
	}
}
