package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class E09_FileEncryption {
	/*
	 # ���� ��ȣ
	 - ���ĺ��� ������ �Ÿ���ŭ �о �ٸ� ���ĺ����� ġȯ�ϴ� ��ȣȭ ���
	 - Ű����ŭ ������ ��� ���ĺ��� ���������� �о��ָ� ��ȣȭ�� �ǰ� 
	 - ��ȣ������ Ű����ŭ ���ĺ��� �������� �о��ָ� ��ȣȭ�� �ȴ�. 
	 
	 ABCDEFGHIJKLMNOPQRSTUVWXYZ 

			key�� 3�϶�
	 hello -----------> khoor
	 
	 ����) files/frankenstein.txt�� ���ϴ� Ű������ ��ȣȭ�� ���� frankenstein_encrypted.txt�� �����غ�����
	 (���ĺ��� ��ȣȭ�ǰ� �� ���� ���ڴ� ��� �����Ѵ�)
	 */
	static File book = new File("files/frankenstein.txt");
	
	
	public static String read() {
		FileInputStream in = null;
		try {
			in = new FileInputStream(book);
			
			byte[] buffer = in.readAllBytes();
			
			String allBook = new String(buffer);
			return allBook;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	
	public static void key(String allBook , int keys) {
		File f = new File("files/frankenstein_encrypted.txt");
		
		String caesar = "";
		
		for (int i = 0; i < allBook.length(); i++) {
			
			char ch = allBook.charAt(i);
			
			if (Character.isLowerCase(ch)) {
				if (ch + keys >= 97 && ch + keys <= 122) {
					ch = (char) (ch + keys);
				}else if(ch + keys > 122){  
					if (keys > 26) {
						keys = keys % 26;
					}else {
						ch = (char) (ch + keys - 26);
					}
				}
			}else if (Character.isUpperCase(ch)) {
				if (ch + keys >= 65 && ch + keys <= 90) {
					ch = (char) (ch + keys);
				}else if(ch + keys > 90){
					if (keys > 26) {
						keys = keys % 26;
					}else {
						ch = (char) (ch + keys - 26);
					}
				}
			}
			caesar += ch;
		}
		try {
			FileWriter out = new FileWriter(f);
			out.write(caesar);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {
		key(read(), 100);
	}
}

