package quiz;

public class B06_ForQuiz4 {
	/*
	 For문을 사용해 다음과 같이 숫자를 출력해보세요
	 
	 1. 0 3 6 9 12 ... 96 99
	 
	 2. -35 -28 -21 ... 0 7 ... 35
	 
	 3. 100 200 300 400 ... 800 900 1000
	 
	 4. 100 99 98 97 96 ... 5 4 3 2 1 0
	 
	 5. 0 1 2 3...6 7 8 9 0 1 2 ... (30번 진행)
	 
	 6. 10 9 ... 3 2 1 10 9 8 7 ... 3 2 1 10 9 ... (30번 진행)
	 
	 7. 7 77 777 7777 .... 7777777777
	 */
	public static void main(String[] args) {
//		 1. 0 3 6 9 12 ... 96 99
		for (int i = 0; i < 100; i += 3) {
			System.out.print(i + " ");
		}
		System.out.println();
//		 2. -35 -28 -21 ... 0 7 ... 35
		for (int i = -35; i <= 35; i += 7) {
			System.out.print(i + " ");
		}
		System.out.println();
//		 3. 100 200 300 400 ... 800 900 1000
		for (int i = 100; i <= 1000; i += 100) {
			System.out.print(i + " ");
		}
		System.out.println();
//		 4. 100 99 98 97 96 ... 5 4 3 2 1 0
		for (int i = 100; i >= 0; i -= 1) {
			System.out.print(i + " ");
		}
		System.out.println();
//		 5. 0 1 2 3...6 7 8 9 0 1 2 ... (30번 진행)
		for (int j = 0; j <= 30; j++) {
			for (int i = 0; i < 10; i += 1) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
//		 6. 10 9 ... 3 2 1 10 9 8 7 ... 3 2 1 10 9 ... (30번 진행)
		for (int j = 0; j <= 30; j++) {
			for (int i = 10; i > 0; i -= 1) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
//		7. 7 77 777 7777 .... 7777777777
		for (long i = 7L; i <= 7777777777L; i = (i * 10) + 7L) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}

