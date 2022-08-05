
/*
 #윈도우 단축키
 - win + e : 탐색기
 - win + shift + s : 스크린샷 (스크린샷 후 카카오톡에 붙여넣기 가능)
 - win + 방향키 : 창 크기 조절
 
 #블록지정 단축키
 - home : 현재 줄의 맨 앞으로 이동
 - end : 현재 줄의 맨 뒤로 이동
 - shift + home : 현재 커서 위치부터 맨 앞까지 블록 지정한다
 - shift + end : 현재 커서 위치부터 맨 뒤까지 블록 지정한다
 - shift + 방향키 : 커서를 움직이며 블록 지정한다
 - ctrl + a : 전체 문서를 블록 지정한다
 - ctrl + home : 문서의 맨 위로 이동한다
 - ctrl + end : 문서의 맨 아래까지 이동한다
 - ctrl + shift + home : 현재 위치부터 문서의 맨 위까지 블록 지정한다
 - ctrl + shift + end : 현재 위치부터 문서의 맨 아래까지 블록 지정한다
 */

/* #주석
	 - 개발자가 하고 싶은 말을 적어놓는 곳
	 - 프로그램 실행에 영향을 미치지 않는다
	 - 언어별로 주석을 사용하는 방법이 다를 수 있다
	 - 한 줄 주석과 여러 줄 주석이 있다
	 */
		
	/*
	 #이클립스 단축키
	 - Ctrl + (+ or -) : 글자 크기 조절
	 - Ctrl + m : 현재 창 최대/최소화
	 - Ctrl + F11 : 컴파일 및 실행
	 - F2 : 오류 설명 
	 */

// #public class의 이름은 반드시 파일명과 같아야 한다
public class A00_Hello {
	//이클립스에서 빨간줄이 (에러가 발견됬을때) F2를 누른다
	
	/*
	 # main() 함수
	 - java에서 어떤 단어 뒤에 ()가 있으면 함수라고 한다
	 - 프로그램의 시작지점
	 - 사용자가 프로그램을 실행하면 가장 먼저 main() 함수를 찾아서 실행하다
	 - main() 함수가 종료되면 프로그램도 종료된다
	 */
	
	public static void main(String[] args) {
	// 프로그램 시작하면 가장 먼저 도착하는 곳
		
		
	/* # System.out.println() 함수
	 - ()안에 전달한 데이터를 콘솔 화면에 출력하는 함수
	 
	 # 콘솔
	 - 글자만 나오는 CLI(command line interface) 환경의 화면
	 - 이클립스에서는 테스트용으로 콘솔을 제공해준다
	 - 우리가 만든 프로그램은 실제 콘솔에도 실행 가능하다
	 - 제작한 소스 코드(.java)의 컴파일 결과(.class)는 프로젝트 내부의 bin폴더에 저장된다
	
	
	# 세미클론(;)
	-세미클론은 한 명령어가 끝났음을 컴파일러에게 알리는 문자
	
	*/	
	System.out.println("┌──────────────────┐"); 
	System.out.println("│   Hello, world!  │"); 
	System.out.println("└──────────────────┘"); 
	
	/*
	 # 자바의 데이터 종류 (리터럴의 종류)
	 1. ""사이에 적는 것 : 문자열 (String), 문자를 여러개 적을 수 있는 타입
	 2. '' 사이에 적는 것 : 문자(Character), 하나의 문자를 의미하는 데이터 타입
	 3. 그냥 숫자를 적는 것 : 정수(Integer), 계산이 가능
	 4. 소수를 적는 것 : 실수(Float, Double), 계산이 가능
	 5. true/false : 참/거짓(Boolean)
	 */
	
	System.out.println("Hello");
	System.out.println('H');
	System.out.println(100 * 13);
	System.out.println(123.45678 / 100);
	System.out.println(true);
	System.out.println(false);
	
	//문자열과 다른 타입을 + 하면 이어붙는다
	System.out.println("Hello " + 1234);
	System.out.println("Hello " + 123.456);
	System.out.println("Hello " + ": ABC");
	System.out.println("Hello " + true);
	 
	/*
	 # 들여쓰시 (Tab)
	 - 코드 블록이 {} 내부에 있다면 한 단계 더 들여써야 한다
	 - 전체적인 코드의 형태를 알아보기 쉬어진다
	 - 블록 지정 후 Ctrl + i : 자동 들여쓰기 
	 */
	
	
	// 프로그램의 마지막 부분
	}

}
