import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class E12_PrintStream {
	/*
	  # PrintStream, PrintWriter
	  - �����͵��� ���ϰ� ����� �� �ִ� �޼������ �߰��� ��Ʈ�� Ŭ����
	  - PrintStream���� OutputStream�� ����� ����� �� �ְ�
	  - PrintWriter���� Writer�� ����� ����� �� �ִ�
	  - printf(), println() ���� ���� �޼������ �����Ǿ� �ִ�.
	  
	  # å���� �߰��� �����ϸ� ���� �͵� (�̰��� �ڹٴ�)
	  - 678p ����
	  - 782p ��Ʈ���� ����ó��
	  - 576p ��Ƽ ������
	  - 1052p ��Ʈ��ũ ����, TCP ��ũ��ŷ, UDP ��ũ��ŷ
	 */
	
	public static void main(String[] args) {
		
		PrintStream out = System.out;
		
		out.println(" /) /) ");
		out.println("( . . )");
		out.println("(     )");
		
//		.endsWith(".rep")
		// ����: reporters ���� ������ ���ڵ� �� �������� 10���� �����Ͽ� A01 ������ ���Ϸ� ����� ������.
		File file = new File("files/reporters");
		
		try (
				FileReader fin = new FileReader(file);
				BufferedReader in = new BufferedReader(fin);
		){
				String line;
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
