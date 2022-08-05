import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;

public class E07_CharacterStream {
	/*
	 # InputStream/OutputStream
	 - byte 단위로 데이터를 입/출력하는 클래스
	 - 불편하다
	 
	  # Reader/Writer
	  - char단위로 데이터를 입/출력하는 클래스
	  - 2byte로 이루어진 문자도 쉽게 입/출력 할 수 있다
	  
	  # Charset
	  - ASCII코드 까지는 모든 문자셋이 동일하지만 그 이후의 문자 코드는 각 회사마다 다르다
	  - MS949 : 윈도우즈에서 사용하는 문자셋
	  - EUC-KR : 이클립스가 기본적으로 사용하는 한국어 문자셋. 유효한 한국어만 들어있다. (뷁뛝꿿 X)
	  - UTF-8 : 가장 표준이 되는 문자셋. 많은 문자를 포함하고 있어서 용량도 크다.
	 */
	
	public static void main(String[] args) {
		// 각 다른 문자셋으로 문자열을 byte로 나눈 결과
		System.out.println(Arrays.toString("안녕하세요".getBytes(Charset.forName("MS949"))));
		System.out.println(Arrays.toString("안녕하세요".getBytes(Charset.forName("EUC-KR"))));
		System.out.println(Arrays.toString("안녕하세요".getBytes(Charset.forName("UTF-8"))));
		
		File f = new File("files/FileWriter.abc");
		try {
			                                                         // append = true는 냐용을 추가한다
		                                                             // append = false (기본값)은 냐용을 덮어쓴다 
			FileWriter out = new FileWriter(f,Charset.forName("UTF-8"),false);
			
			out.write('한');
			out.write('글');
			out.write('자');
			out.write('씩');
			out.write('\n');
			
			out.write("한번에 여러 글자씩 신나게 쓸 수 있다.\n byte[]로 바꿔야 하는 것도 모르고 쓸 수 있다");
			
			char[] arr = "\nABCDEFGHIJKLMNOP".toCharArray();

			out.write(arr);
			
			// off : 시작 위치, len: 몇 문자를 사용할지
			out.write(arr, 5, 3);
			
			for (int i = 0; i < 3; i++) {
				// append는 write와 같은 기능을 한다 (write를 사용해도 상관없다.)
				out.append("\n /)/)\n");
				out.append("( ..)\n");
				out.append("(   )\n");
			}
			
			out.write(arr);
			out.write(arr);
			out.write(arr);
			
			out.close();
			System.out.println("파일 쓰기 완료");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		// -----------------------------------------------------------------------------------------
		
		System.out.println("읽기 시작");
		
		try {
			FileReader in = new FileReader(f, Charset.forName("UTF-8"));
			
			char[] buffer = new char[1024];
			
			int len;
			while ((len = in.read(buffer)) != -1) {
				System.out.println(new String(buffer, 0, len));
			}
			
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
