package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E06_Copy {
	/*
	files ���� ������ ��� ������
	files_copy ������ ������ ������
	Hint: File Ŭ������ list() �޼���
 */

	public void copy(File src, File copy) {
		try {
			FileInputStream in = new FileInputStream(src);
			FileOutputStream out = new FileOutputStream(copy);
			
			byte[] buffer = new byte[1024];
			
			int len;
			while ((len = in.read(buffer)) != -1) {
				out.write(buffer, 0 , len);
				
				in.close();
				out.close();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {

	}
}
