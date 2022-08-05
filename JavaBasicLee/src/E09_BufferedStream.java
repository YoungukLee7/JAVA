import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class E09_BufferedStream {
	/*
	 # Buffer
	 - 데이터를 한개씩 여러번 전달하는 것보다 모아서 한꺼번에 전달하는 방식이 훨씬 처리속도가 빠르다
	 - 버퍼가 미리 구현된 스트림 클래스들은 앞에 buffered 라는 이름이 붙어있다 
	 - BufferedInputStream, BufferedReader ...
	 */
	
	static File book = new File("files/frankenstein.txt");
	
	/** 한글자씩 읽기*/
	public static void read1() {
		FileReader in = null;
		
		try {
			in = new FileReader(book);
			
			int ch;
			while ((ch = in.read()) != -1) {
				System.out.print((char)ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
			}
		}
	}
	
	/** 버퍼 방식으로 읽기(1024)*/
	public static void read2() {
		FileInputStream in = null;
		try {
			in = new FileInputStream(book);
			
			byte[] buffer = new byte[1024];
			
			int len;
			while ((len = in.read(buffer)) != -1) {
				System.out.print(new String(buffer,0,len));
			}
			
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
	}
	
	/** 버퍼 방식으로 읽기(2048)*/
	public static void read3() {
		FileReader in = null;
		try {
			in = new FileReader(book);
			
			char[] buffer = new char[2048];
			
			int len;
			while ((len = in.read(buffer)) != -1) {
				System.out.print(new String(buffer,0,len));
			}
			
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
	}
	
	/** bufferedReader 사용하기*/
	public static void read4(){
		FileReader fin = null;
		BufferedReader bin = null;
		
		try {
			fin = new FileReader(book);
			bin = new BufferedReader(fin);
			
			// BufferedReader에는 readLine()이라는 메서드가 있어서 한줄 씩 읽기 편하다
			String line; 
			while ((line = bin.readLine()) != null) {
				System.out.println(line);
			} 
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				// 가장 최근에 열었던 순서대로 닫아 줄 것
				bin.close();
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
//		long start = System.currentTimeMillis();
//		read1();
//		System.out.println("\n걸린 시간: " + (System.currentTimeMillis() - start) + "ms");
		
		// 코드 실행 시간 보는 메서드
		long start = System.currentTimeMillis();
		read4();
		System.out.println("\n걸린 시간: " + (System.currentTimeMillis() - start) + "ms");
	}
}
