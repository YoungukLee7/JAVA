import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;

public class E05_FileInputStream {

	public static void main(String[] args) {
		
		// 파일로부터 데이터를 읽어들이는 통로
		try {
			File f = new File("files/abc.txt");
													// "files/abc.txt"
			FileInputStream in = new FileInputStream(f);
			
			
			
			
			// read() : 데이터를 한 바이트씩 읽는다. 
			//          한 바이트씩 읽기 때문에 한글등의 2바이트 문자로 직접 합치기가 어렵다.
			int ch;
			while ((ch = in.read()) != -1) {
				System.out.print((char)ch);
			} 
			// 컴파일 결과 : aaaaaaaaaa/bbb
			
			
			
			
			// read(byte[]) : 전달한 byte[]에 데이터를 담아준다 . 읽은 길이를 반환한다.
			//					파일을 끝까지 다 읽으면 -1을 반환한다
//			byte[] buffer = new byte[10];
//			
//			int len = -1;
//			
//			while ((len = in.read(buffer)) != -1) {
				// 숫자로 읽음
//				System.out.println(Arrays.toString(buffer) + ", 이번에 읽은 바이트 개수: " + len);
				// 컴파일 결과 : [97, 97, 97, 97, 97, 97, 97, 97, 97, 97], 이번에 읽은 바이트 개수: 10
//							  [47, 98, 98, 98, 97, 97, 97, 97, 97, 97], 이번에 읽은 바이트 개수: 4
//				System.out.println(new String(buffer));
				// 컴파일 결과 : aaaaaaaaaa
				//   		  /bbbaaaaaa
				// 10개씩 읽되 딱 떠있는 것만 읽는다
//				System.out.println(new String(buffer, 0, len));
				// 컴파일 결과 : aaaaaaaaaa
				//            /bbb
//			}
			
			
			
			
			
			// readAllBytes(): 한번에 파일의 모든 데이터를 byte[]로 읽는다
//			 byte[] allByte = in.readAllBytes();
			
			// BYTE 단위로 나누어져 있던 문자열을 합칠 때 charset마다 다른 방식으로 합친다.
			// (이 과정에서 문자가 깨질 수 있다)
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
