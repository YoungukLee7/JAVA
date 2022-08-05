package quiz;

import java.util.Arrays;

public class C01_Range1 {
	/*
 	1. 최대값을 매개변수로 받으면 0부터 최대값 미만의 모든 값을 포함하는 int배열을 생성하여 반환하는
 	range 매서드를 만들어 보세요
 	
 	ex) range(10)의 결과 -> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 	
 	2. 최소값과 최대값을 매개변수로 전달받으면
 		최소값부터 최대값 미만의 모든 값을 포함하는 int 배열을 생성하여 반환하는 
 		range 메서드를 만들어 보세요
 		
 	ex) range(10,15)의 결과 -> [10,11,12,13,14]
 	ex) range(15,10)의 결과 -> [15,14,13,12,11]
 	
 	3. 최소값과 최대값과 증가값을 매개변수로 전달 받으면
 		최소값부터 최대값 미만까지 증가값만큼 증가하는 int 배열을 생성하여 반환하는
 		range 메서드를 만들어 보세요
 		
 	ex) range(30,40,3)의 결과 -> [30,33,36,39]
 	ex) range(40,45,5)의 결과 -> [40]
 	ex) range(40,30,-2)의 결과 -> [40,38,36,34,32]
 	강사님 풀이
 */
	
	public static int[] range(int end) {
		int[] arr = new int[end];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		return arr;
	}
	
	public static int[] range(int start, int end) {
		int[] arr = new int[Math.abs(end-start)]; // start가 더 클수도 있어 절대값을 쓴다
		
		// start값이 더 작으면 1씩 증가, start값이 더 크면 1씩 감소
		int incre = start < end ? 1 : -1;
		
		for (int i = start, index = 0; i != end; i+=incre) {
			arr[index++] = i;
		}

		return arr;
	}

	public static int length(int start, int end, int incre) {
		// diff의 결과가 양수라는 것은 end가 더 크므로 incre가 양수여야 한다는 뜻이다
		// diff의 결과가 음수라는 것은 end가 더 작으므로 incre가 음수여야 한다는 뜻이다
		
		// end 값 미만의 개수를 찾는것이므로 incre가 양수일때에는 -1을 해야하고
		// incre가 음수일 때에는 +1을 해야한다 (범위가 1 줄어들어야 한다)
		int diff = (end-start) + (incre > 0 ? -1 : 1);
		
		// 차이를 증가값만큼 나누면 숫자가 몇개 등장하는지 알 수 있다
		int length = diff /incre;
		
		if (length < 0) {
			System.out.println("length : 0");
			return 0;
		} else {
			// 첫 숫자를 포함하기 때문에 개수가 1 증가해야 한다
			length += 1;
		}
		System.out.println("length : " + length);
		return length;
	}
	
	public static int length2(int start, int end, int incre) {
		
		int diff = end - start;
		
		int length = diff / incre;
		
		if (length <0) {
			return 0;
		}
		
		length += diff % incre == 0 ? 0 : 1;
		
		return length;
	}
	
	public static int[] range(int start, int end, int incre) {
		
		int len = length2(start, end, incre);
		int[] arr = new int[len];
		
		for (int i = 0; i < len; ++i) {
			arr[i] = start + incre * i;
		}
		return arr;
	}

	public static void main(String[] args) {
		
		/*
		 # 메서드 오버로딩
		 - 자바에서는 같은 이름의 메서드를 여러개 선언할 수 있다
		 - 이름이 같은 메서드여도 매개변수의 타입 또는 개수가 다르다면 다른 매서드로 인식된다
		 */

		System.out.println("1번");
		System.out.println(Arrays.toString(range(10)));
		
		myutil.Range r = new myutil.Range(10,20);        // myutil에서 받아온 것
		myutil.Range r2 = new myutil.Range(30,10,-5);
		myutil.Range r3 = new myutil.Range(5);
		
		System.out.println(Arrays.toString(r.range));
		System.out.println(Arrays.toString(r2.range));
		System.out.println(Arrays.toString(r3.range));   // 여기까지 myutil에서 받아온 것
		
		// forEach문 : 나열된 것들을 하나씩 차례대로 꺼내면서 반복하는 문법
//		for (int i : range(10)) {
//			System.out.println("i : " + i);
//		}
//		
//		for (char c : "Hello".toCharArray()) {
//			System.out.println("c : " + c);
//		}
		
		System.out.println("2번");
		System.out.println(Arrays.toString(range(10, 15)));
		System.out.println(Arrays.toString(range(15, 10)));
		System.out.println("3번");
		System.out.println(Arrays.toString(range(10, 18, 2)));
		System.out.println(Arrays.toString(range(10, 19, 2)));
		System.out.println(Arrays.toString(range(19, 10, 2)));
		System.out.println(Arrays.toString(range(20, 10, -2)));
	}

}
