
public class B16_Array2 {

	/*
	 # 배열안에 배열을 넣을 수 있다
	 (배열로 이루어진 배열을 만들 수 있다)
	 
	 배열은 주소를 저장한다.
	 예를들어 int[] numbers = {1, 2, 3, 4, 5}; 가 있으면 
	 int[0]을 찾을 때 바로 1을 찾는것이 아닌 1이 있는 주소로 가서 찾는 것이다.
	 int[1]를 찾을 땐 int[0] 주소에서 int니깐 +4를 하는것과 같다. {char는 주소에 +2를 한다}
	 
	 char[][][] today_char_log = { 	chs,
	 								chs2,
	 								chs3,
	 };
	 만약 char[0][0][0]이면 결과는 
	 char[0]today_char_log의 chs
	 chs[0]의 numbers
	 numbers[0]이 실행된다
	 
	 */
	public static void main(String[]args) {
	
		int[] numbers = {1, 2, 3, 4, 5};
		int[][] numbers2 = {numbers, 
							{1,2,3,4,5},
							numbers,
							numbers};
		
		System.out.println(numbers[3]);
		
		System.out.println(numbers2[0]); // 0번째 위치의 int[]을 가리킴
		System.out.println(numbers2[0][0]); // 0번째 위치 int[]의 0번째 요소를 가리킴
		
		numbers2[0][2] = 33;
		
		System.out.println(numbers2[0][2]); // [0][2]를 33으로 바꿨는데
		System.out.println(numbers2[3][2]); // [3][2]도 33으로 나오는 현상
		System.out.println(numbers2[1][2]); // 혼자 가르키는 위치가 다르기 때문에 33으로 안바뀜
		System.out.println(numbers2[2][2]); // [2][2]도 33으로 나오는 현상
		
		System.out.println(numbers2[0]);
		System.out.println(numbers2[1]); // 이것만 값이 달라졌다. 이유는 새로 만들었기 때문
		System.out.println(numbers2[2]);
		System.out.println(numbers2[3]);
		
		/*
		 2차원 배열
		 n차원 배열은 n중 반복문으로 모두 탐색할 수 있다
		 */
		char[][] chs = {
						{'a', 'b','c','d'},
						"Hello,word!".toCharArray(),
						"I have a dream".toCharArray(),
						{'x','y'}
		};
		
		System.out.println(chs[2][3]); // 띄어쓰기도 포함 예를들어 I have는 0,1,2,3,4,5까지 있는 것 
		System.out.println(chs[2][4]);
		System.out.println("===================================");
		
		for (int i = 0; i < chs.length; i++) {
			char[]arr=chs[i];
			
			System.out.println(arr);
		}
		
		System.out.println("===================================");
		
		for (int i = 0; i < chs.length; i++) {
			for (int j = 0; j < chs[i].length; j++) {
				
				System.out.printf("chs[%d][%d] : %c\n",i,j,chs[i][j]);
			}
		}
	}
}
