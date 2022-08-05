
public class B09_BreakContinue {
/*
  # break
  - switch-case 문에서 사용하면 해당 case를 탈출한다
  - 반복문 내부에서 사용하면 해당 반복문을 탈출한다
  
  # continue
  - 반복문 내부에서 사용하면 그 즉시 다음 반복으로 넘어간다
  - continue 아래에 남은 코드는 모두 무시한다
 */
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			
			if(i==60) {
				break; // if문과 연계할 수 있다
			}
		}
		System.out.println("break를 써서 반복문이 끝났습니다");
		
		for (int dan = 1; dan < 10; dan++) {
			
			if(dan % 3!=0) {
				 continue; // if문과 연계할 수 있다 
			}
			System.out.println(dan + "단");
			for (int num = 1; num < 10; num++) {
				if (dan > num) {
					System.out.println(dan + "단 " + dan + " X " + num + " = " + dan*num);
				}
			}
		}
	}

}
