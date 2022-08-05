import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class E01_Exception {
	/*
	 # ����
	 - �츮�� ������� �����ߴ� ���� �۾����� ���ܶ�� �θ���
	 - �ڹ��� ������ Ʋ���� ���� ���ܰ� �ƴ϶� ������ ����(�ڹ� ���� ����)��� �θ���
	 - ���α׷��Ӵ� �߻��� ���͸� �̸� �����ϰ� ����� �� �� �ִ�.(���� ó��)
	 - ���� �߻� �� �⺻ ������ ���α׷��� ���� �����̴�.
	 
	 # ���� ó��
	 - ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ带 try�� ���ο� ���Խ�Ų��
	 - try�� ���ο��� ���ܰ� �߻����� ������ ��� ���� ����ȴ�
	 - try�� ���ο��� ���ܰ� �߻��ϸ� ��� try�� ������ �ߴ��ϰ� �߻��� ���ܿ� �ش��ϴ� catch������ �Ѿ��
	 - catch���� ������ ���� �ִ�.
	 - ���� �߻��� catch������ �߻��� ���ܿ� ���� �ڼ��� ������ ����ִ� �ν��Ͻ��� ���޵ȴ�
	 */
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		try {
			arr[0] = 1;
			arr[12] = 100;
			arr[1] = 3;
			
			System.out.println("try���� ������ �����߽��ϴ�.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 �ε��� ������ ������ϴ�!!");
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("Hello!");
		
		//---------------------------------------------------------------------------------------------//
		System.out.println();
		
		// ���� ó���� ��ĳ�� ����ϱ�
		Scanner sc = new Scanner(System.in);
		
		int num;
		try {
			System.out.print("���ڸ� �Է��Ͻÿ� >> ");
			num = sc.nextInt();
			num = 10/num;
		}catch (InputMismatchException e) {
			System.out.println("�ݵ�� ���ڸ� �Է��Ͻÿ�.");
			
			// ��� ������ �߻��ߴ��� ������ ���� �ִ� �޼��� (e�� ���� ������ ����ִ�)
			// e.printStackTrace();
			
			num = -1;
		}catch (ArithmeticException e) {
			System.out.println("num���� 0�� �־�� �ȵȴ�.");
			num = -2;
		}catch (Exception e) {
			System.out.println("Exception�� ��� ������ �θ��̱� ������ ������ ��� ���ܸ� �ѹ��� ó���� �� �ֽ��ϴ�.");
			num = -3;
		}finally {
			System.out.println(" /) /) ");
			System.out.println("( . . )");
			System.out.println("(     )");
			System.out.println("�� �䳢�� ���ܰ� �߻��ϴ� ���ϴ� ������ �����մϴ�.");
		}
		System.out.println("�Է��Ͻ� ���ڴ� : " + num);
	}
}
