package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class E09_FileDecryption1 {
	/*
	 # 암호화 된 frankenstein_encrypted.txt를 사용해 다음을 구현하시오
	 
	 1. 암호문 파일의 처음 10줄을 1 ~ 25까지의 키로 모두 복화한 결과를 모두 콘솔에 출력
	 2. 사용자는 해당 결과를 보고 알맞는 키를 선택하여 복호화를 진행할 수 있음
	 3. 복호화 결과는 frankenstein_decrypted.txt에 저장 
	 강사님 풀이
	 */
	final static String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	final static char[] UPPERCASE = ALPHABET.toCharArray();
	final static char[] lOWERCASE = ALPHABET.toLowerCase().toCharArray();
	
	File crypto;
	
//	// 기본값으로 10
//	int sampleLength = 10;
	
	public E09_FileDecryption1(File crypto) {
		this.crypto = crypto;
	}
	
	// 복호화 하는 메서드
	public static String decrypt(String str, int key) {
		StringBuilder builder = new StringBuilder();
		char[] chs = str.toCharArray();
		
		for (char ch : chs) {
			if (Character.isUpperCase(ch)) {
				int index = ch - 'A';
				builder.append(UPPERCASE[index - key < 0 ? 26 + (index - key) : index - key]);
			}else if (Character.isLowerCase(ch)) {
				int index = ch - 'a';
				builder.append(lOWERCASE[index - key < 0 ? 26 + (index - key) : index - key]);
			}else {
				builder.append(ch);
			}
		}
		
		return builder.toString();
	}
	
	public void sample() {
		// 일반 String에 넣어주는 것보다 속도가 빠르다 (차이가 많이 난다)
		StringBuilder samplebuilder = new StringBuilder();
		
		// AutoClose 인터페이스가 구현된 클래스들은 try()문을 사용할 수 있다.
		// try 옆의 ()에 선언한 객체들은 try문이 끝나면서 자동으로 close()를 실행한다
		try (
				FileReader fin = new FileReader(crypto); 
				BufferedReader in = new BufferedReader(fin);
		) {
			for (int i = 0; i < 10; i++) {
				samplebuilder.append(in.readLine() + "\n");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (int key = 1; key < 26; key++) {
			System.out.printf("[key %d]\n",key);
			System.out.println(decrypt(samplebuilder.toString(), key));
		}
	}
	
	public void bruteForce() {
		// 10줄씩 보여주기
		sample();
		
		
		// 골라서 파일 생성하기 (BufferedReader를 이용해 콘솔로부터 입력받기) (스캐너보다 빠르다)InputStreamReader는 감사주는 역할을 한다. System.in는 InputStream이다
		// InputStreamReader : byte단위인 InputStream을 char 단위인 Reader로 재포장하는 클래스
		try (
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader in = new BufferedReader(isr);
		){
			while (true) {
				try {
					System.out.print("원하시는 key를 선택하세요 > ");
					String userInput = in.readLine();
					int key = Integer.parseInt(userInput);
					
					execute(key);
					
					break;
				} catch (NumberFormatException e) {
					System.out.println("please input integer number.");
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	
	public void execute(int key) {
		String[] path = crypto.getPath().split("\\.");
		
		path[0] = path[0] + "_decrypted";
		
		File decryptedFile = new File(String.join(".", path));
		
		try (
				FileReader fin = new FileReader(crypto);
				BufferedReader in = new BufferedReader(fin);
				// 이것만 써도 되지만
				FileWriter fout = new FileWriter(decryptedFile);
				// 느리니까 이것을 써서 빠르게 읽고
				BufferedWriter bout = new BufferedWriter(fout);
				// 보기 불편하니까 이것을 쓴다
				PrintWriter out = new PrintWriter(bout);
				){
			String line;
			while ((line = in.readLine()) != null) {
//				out.write(decrypt(line, key) + "\n");
				out.println(decrypt(line, key));
				// printf도 사용 가능하다
//				out.printf(decrypt(line, key));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		E09_FileDecryption1 decryption1 = new E09_FileDecryption1(new File("files/frankenstein_encrypted.txt"));
		
		decryption1.bruteForce();
	}
}
