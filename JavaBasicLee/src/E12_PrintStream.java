import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class E12_PrintStream {
	/*
	  # PrintStream, PrintWriter
	  - 데이터들을 편리하게 출력할 수 있는 메서드들이 추가된 스트림 클래스
	  - PrintStream에는 OutputStream을 등록해 사용할 수 있고
	  - PrintWriter에는 Writer를 등록해 사용할 수 있다
	  - printf(), println() 등의 편리한 메서드들이 구현되어 있다.
	  
	  # 책에서 추가로 공부하면 좋을 것들 (이것이 자바다)
	  - 678p 람다
	  - 782p 스트림과 병렬처리
	  - 576p 멀티 스레드
	  - 1052p 네트워크 기초, TCP 네크워킹, UDP 네크워킹
	 */
	
	public static void main(String[] args) {
		
		PrintStream out = System.out;
		
		out.println(" /) /) ");
		out.println("( . . )");
		out.println("(     )");
		
//		.endsWith(".rep")
		// 연습: reporters 폴더 내부의 기자들 중 랜덤으로 10명을 선택하여 A01 형식의 파일로 만들어 보세요.
		File file = new File("files/reporters");
		
		try (
				FileReader fin = new FileReader(file);
				BufferedReader in = new BufferedReader(fin);
		){
				String line;
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
