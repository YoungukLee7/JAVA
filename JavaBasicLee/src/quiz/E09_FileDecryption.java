package quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class E09_FileDecryption {
	/*
	 # 암호화 된 frankenstein_encrypted.txt를 사용해 다음을 구현하시오
	 
	 1. 암호문 파일의 처음 10줄을 1 ~ 25까지의 키로 모두 복화한 결과를 모두 콘솔에 출력
	 2. 사용자는 해당 결과를 보고 알맞는 키를 선택하여 복호화를 진행할 수 있음
	 3. 복호화 결과는 frankenstein_decrypted.txt에 저장
	 */
	static File encryptionBook = new File("files/frankenstein_encrypted.txt");
	
	public static void read() {
		FileReader fin = null;
		BufferedReader bin = null;
		String lineTen = "";
		
		try {
			fin = new FileReader(encryptionBook);
			bin = new BufferedReader(fin);
			
			String line;
			int cnt = 0;
			while ((line = bin.readLine()) != null) {
				if (cnt > 9) {
					break;
				}
				lineTen += line + '\n';
				cnt++;
			} 
			decoding(lineTen);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bin.close();
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void decoding(String line) {
		
		String test = "";
		
		for (int i = 1; i <= 25; i++) {
			test += "key " + i + "=======================================================================================\n";
			for (int j = 0; j < line.length(); j++) {
				
				char ch = line.charAt(j);
				
				if (Character.isLowerCase(ch)) {
					if (ch + i >= 97 && ch + i <= 122) {
						ch = (char) (ch + i);
					}else if(ch + i > 122){  
							ch = (char) (ch + i - 26);
					}
				}else if (Character.isUpperCase(ch)) {
					if (ch + i >= 65 && ch + i <= 90) {
						ch = (char) (ch + i);
					}else if(ch + i > 90){  
							ch = (char) (ch + i - 26);
					}
				}
				test += ch;
			}
		}
		System.out.println(test);
	}
	
	
	public static void solution() {
		FileReader fin = null;
		BufferedReader bin = null;
		String lineTen = "";
		
		try {
			fin = new FileReader(encryptionBook);
			bin = new BufferedReader(fin);
			
			String line;
			while ((line = bin.readLine()) != null) {
				lineTen += line + '\n';
			} 
			Scanner sc = new Scanner(System.in);
			System.out.print("복호화 번호 입력 >> ");
			int key = sc.nextInt();
			plusKey(lineTen, key);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bin.close();
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void plusKey(String solution, int key) {
		File f = new File("files/frankenstein_decrypted.txt");
		FileWriter out = null;

		String test = "";

		for (int i = 0; i < solution.length(); i++) {

			char ch = solution.charAt(i);

			if (Character.isLowerCase(ch)) {
				if (ch + key >= 97 && ch + key <= 122) {
					ch = (char) (ch + key);
				} else if (ch + key > 122) {
					ch = (char) (ch + key - 26);
				}
			} else if (Character.isUpperCase(ch)) {
				if (ch + key >= 65 && ch + key <= 90) {
					ch = (char) (ch + key);
				} else if (ch + key > 90) {
					ch = (char) (ch + key - 26);
				}
			}
			test += ch;
		}
		try {
			out = new FileWriter(f);
			out.write(test);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("작성 완료!");
	}
	
	public static void main(String[] args) {
		read();
		solution();
	}
}
