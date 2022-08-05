import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;

public class E05_FileInputStream {

	public static void main(String[] args) {
		
		// ���Ϸκ��� �����͸� �о���̴� ���
		try {
			File f = new File("files/abc.txt");
													// "files/abc.txt"
			FileInputStream in = new FileInputStream(f);
			
			
			
			
			// read() : �����͸� �� ����Ʈ�� �д´�. 
			//          �� ����Ʈ�� �б� ������ �ѱ۵��� 2����Ʈ ���ڷ� ���� ��ġ�Ⱑ ��ƴ�.
			int ch;
			while ((ch = in.read()) != -1) {
				System.out.print((char)ch);
			} 
			// ������ ��� : aaaaaaaaaa/bbb
			
			
			
			
			// read(byte[]) : ������ byte[]�� �����͸� ����ش� . ���� ���̸� ��ȯ�Ѵ�.
			//					������ ������ �� ������ -1�� ��ȯ�Ѵ�
//			byte[] buffer = new byte[10];
//			
//			int len = -1;
//			
//			while ((len = in.read(buffer)) != -1) {
				// ���ڷ� ����
//				System.out.println(Arrays.toString(buffer) + ", �̹��� ���� ����Ʈ ����: " + len);
				// ������ ��� : [97, 97, 97, 97, 97, 97, 97, 97, 97, 97], �̹��� ���� ����Ʈ ����: 10
//							  [47, 98, 98, 98, 97, 97, 97, 97, 97, 97], �̹��� ���� ����Ʈ ����: 4
//				System.out.println(new String(buffer));
				// ������ ��� : aaaaaaaaaa
				//   		  /bbbaaaaaa
				// 10���� �е� �� ���ִ� �͸� �д´�
//				System.out.println(new String(buffer, 0, len));
				// ������ ��� : aaaaaaaaaa
				//            /bbb
//			}
			
			
			
			
			
			// readAllBytes(): �ѹ��� ������ ��� �����͸� byte[]�� �д´�
//			 byte[] allByte = in.readAllBytes();
			
			// BYTE ������ �������� �ִ� ���ڿ��� ��ĥ �� charset���� �ٸ� ������� ��ģ��.
			// (�� �������� ���ڰ� ���� �� �ִ�)
//			 String fileDataStr  = new String(allByte, Charset.forName("UTF-8"));
			
//			 System.out.println(fileDataStr);
			
			 
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
