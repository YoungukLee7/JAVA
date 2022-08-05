import java.util.Scanner;

public class B03_If {
	/*
	 # if문
	 - ()안에 값이 true일 때 {}안의 내용을 실행하는 문법
	 - ()안의 값이 false일때는 {}안의 내용을 모두 무시한다
	 = {}안에 들어가는 내용이 단 한 줄이라면 {}를 생략할 수 있다
	 - if문에 들어갈 값이 많다면 {}로 다 묶어준다
	 
	 # else if문
	 - 위에 있는 if문이 실행되지 않았다면 if문 처럼 동작한다. 
	 - else if는 여러번 사용할 수 있다
	 - else if는 단독으로 사용할 수 없다 (if문이 있어야 한다)
	 
	 # else문
	 - 위에 있는 if문, else if문이 모두 실행되지 않았다면 {}안의 내용을 무조건 실행한다
	 - if문 바로 다음에 쓸수있다
	 - 단독으로 사용할 수 없다
	 - else가 붙어있는 if절은 최소 한번은 실행된다
	 - 초기화의 용도로 쓴다.
	 
	 if문
	 if문
	 이렇게 있으면 두개 다 실행됨
	 
	 if문
	 else if문
	 이렇게 있으면 if문이 실행되면 else if문은 실행 안됨
	 if문이 실행 안되면 else if문이 실핼됨
	 */
	public static void main(String[] args) {
		if(true) {
			System.out.println("if문이 true일 때 생성되는 명령어1");
			System.out.println("if문이 true일 때 생성되는 명령어2");
			System.out.println("if문이 true일 때 생성되는 명령어3");
		}
		
		int a = 7;
		
		if (a%2==0) {
			System.out.println("a의 값이 짝수일 때만 실행되는 문장");
		} else if (a%3==0) {
			System.out.println("a의 값이 짝수가 아니면서 3의 배수임");
		} else if (a%3==0) {
			System.out.println("2의 배수가 아니고 3의 배수도 아닌 5의 배수임");
		} else {
			System.out.println("위의 조건이 모두 아닙니다");
		}
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("구매 할 사과의 개수 : ");
		int apple = scanner.nextInt();
		String size;
		
		if(apple > 10) {
			size = "대용량 종이백";
		} else if (apple > 5) {
			size = "중형 종이백";
		} else {
			size = "소형 종이백";
		}
		
		System.out.println(size);
	
	}

}
