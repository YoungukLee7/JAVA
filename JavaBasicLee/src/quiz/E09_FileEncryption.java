package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class E09_FileEncryption {
	/*
	 # 시저 암호
	 - 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 치환하는 암호화 방식
	 - 키값만큼 원문의 모든 알파벳을 오른쪽으로 밀어주면 암호화가 되고 
	 - 암호문에서 키값만큼 알파벳을 왼쪽으로 밀어주면 복호화가 된다. 
	 
	 ABCDEFGHIJKLMNOPQRSTUVWXYZ 

			key가 3일때
	 hello -----------> khoor
	 
	 문제) files/frankenstein.txt를 원하는 키값으로 암호화한 파일 frankenstein_encrypted.txt을 생성해보세요
	 (알파벳만 암호화되고 그 외의 문자는 모두 무시한다)
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

