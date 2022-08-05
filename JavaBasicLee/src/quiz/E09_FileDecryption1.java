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
	 # ��ȣȭ �� frankenstein_encrypted.txt�� ����� ������ �����Ͻÿ�
	 
	 1. ��ȣ�� ������ ó�� 10���� 1 ~ 25������ Ű�� ��� ��ȭ�� ����� ��� �ֿܼ� ���
	 2. ����ڴ� �ش� ����� ���� �˸´� Ű�� �����Ͽ� ��ȣȭ�� ������ �� ����
	 3. ��ȣȭ ����� frankenstein_decrypted.txt�� ���� 
	 ����� Ǯ��
	 */
	final static String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	final static char[] UPPERCASE = ALPHABET.toCharArray();
	final static char[] lOWERCASE = ALPHABET.toLowerCase().toCharArray();
	
	File crypto;
	
//	// �⺻������ 10
//	int sampleLength = 10;
	
	public E09_FileDecryption1(File crypto) {
		this.crypto = crypto;
	}
	
	// ��ȣȭ �ϴ� �޼���
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
		// �Ϲ� String�� �־��ִ� �ͺ��� �ӵ��� ������ (���̰� ���� ����)
		StringBuilder samplebuilder = new StringBuilder();
		
		// AutoClose �������̽��� ������ Ŭ�������� try()���� ����� �� �ִ�.
		// try ���� ()�� ������ ��ü���� try���� �����鼭 �ڵ����� close()�� �����Ѵ�
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
		// 10�پ� �����ֱ�
		sample();
		
		
		// ��� ���� �����ϱ� (BufferedReader�� �̿��� �ַܼκ��� �Է¹ޱ�) (��ĳ�ʺ��� ������)InputStreamReader�� �����ִ� ������ �Ѵ�. System.in�� InputStream�̴�
		// InputStreamReader : byte������ InputStream�� char ������ Reader�� �������ϴ� Ŭ����
		try (
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader in = new BufferedReader(isr);
		){
			while (true) {
				try {
					System.out.print("���Ͻô� key�� �����ϼ��� > ");
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
				// �̰͸� �ᵵ ������
				FileWriter fout = new FileWriter(decryptedFile);
				// �����ϱ� �̰��� �Ἥ ������ �а�
				BufferedWriter bout = new BufferedWriter(fout);
				// ���� �����ϴϱ� �̰��� ����
				PrintWriter out = new PrintWriter(bout);
				){
			String line;
			while ((line = in.readLine()) != null) {
//				out.write(decrypt(line, key) + "\n");
				out.println(decrypt(line, key));
				// printf�� ��� �����ϴ�
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
