
public class B06_For {
	/*
	 # 반복문 (Loop)
	 - for, while, for-each, do-while(X)
	 - 똑같은 코드를 여러번 반복하고 싶을 때 사용한다
	 
	 # for 문
	 
	  for (초기값; 반복조건;증가값) {
	  	가운데의 반복조건이 참인 동안 반복될 코드들
	  }
	 */
	public static void main(String[] args) {
		
		for (int i = 0; i < 5000; ++i) { // 증가값에 i+= 2 가 들어가면 결과가 짝수로 나온다
			System.out.println("Hello, world!" + i);
		}
		System.out.println("반복문 종료!");
		
		/*
		 1. 가장 기본적인 형태의 for문
		 - 초기값에 0을 주고, 조건에는 반복하고 싶은 횟수를 적는다
		 - 증가는 1씩 한다
		 - 원하는 횟수만큼 반복하기 가장 좋은 for문
		 */
		for (int i = 0; i < 50; ++i) { 
			System.out.println("원하는 횟수만큼 반복문! " + ( i + 1 ));
		}
		System.out.println("반복문 종료!");
		
		/*
		 2. 초기값과 증가값과 조건을 자유롭게 설정한 for문
		 - 초기값, 증가값, 조건은 자유롭게 변경하여 용도에 맞게 사용할 수 있다
		 - 초기값, 증가값, 조건은 꼭 넣지 않아도 된다
		 - 조건을 넣지 안으면 무한 반복된다
		 */
		for (byte b = 0; ; ++b) { 
			System.out.println("hi! " + b);
		}
	}

}
