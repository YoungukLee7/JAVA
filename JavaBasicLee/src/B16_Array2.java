
public class B16_Array2 {

	/*
	 # �迭�ȿ� �迭�� ���� �� �ִ�
	 (�迭�� �̷���� �迭�� ���� �� �ִ�)
	 
	 �迭�� �ּҸ� �����Ѵ�.
	 ������� int[] numbers = {1, 2, 3, 4, 5}; �� ������ 
	 int[0]�� ã�� �� �ٷ� 1�� ã�°��� �ƴ� 1�� �ִ� �ּҷ� ���� ã�� ���̴�.
	 int[1]�� ã�� �� int[0] �ּҿ��� int�ϱ� +4�� �ϴ°Ͱ� ����. {char�� �ּҿ� +2�� �Ѵ�}
	 
	 char[][][] today_char_log = { 	chs,
	 								chs2,
	 								chs3,
	 };
	 ���� char[0][0][0]�̸� ����� 
	 char[0]today_char_log�� chs
	 chs[0]�� numbers
	 numbers[0]�� ����ȴ�
	 
	 */
	public static void main(String[]args) {
	
		int[] numbers = {1, 2, 3, 4, 5};
		int[][] numbers2 = {numbers, 
							{1,2,3,4,5},
							numbers,
							numbers};
		
		System.out.println(numbers[3]);
		
		System.out.println(numbers2[0]); // 0��° ��ġ�� int[]�� ����Ŵ
		System.out.println(numbers2[0][0]); // 0��° ��ġ int[]�� 0��° ��Ҹ� ����Ŵ
		
		numbers2[0][2] = 33;
		
		System.out.println(numbers2[0][2]); // [0][2]�� 33���� �ٲ�µ�
		System.out.println(numbers2[3][2]); // [3][2]�� 33���� ������ ����
		System.out.println(numbers2[1][2]); // ȥ�� ����Ű�� ��ġ�� �ٸ��� ������ 33���� �ȹٲ�
		System.out.println(numbers2[2][2]); // [2][2]�� 33���� ������ ����
		
		System.out.println(numbers2[0]);
		System.out.println(numbers2[1]); // �̰͸� ���� �޶�����. ������ ���� ������� ����
		System.out.println(numbers2[2]);
		System.out.println(numbers2[3]);
		
		/*
		 2���� �迭
		 n���� �迭�� n�� �ݺ������� ��� Ž���� �� �ִ�
		 */
		char[][] chs = {
						{'a', 'b','c','d'},
						"Hello,word!".toCharArray(),
						"I have a dream".toCharArray(),
						{'x','y'}
		};
		
		System.out.println(chs[2][3]); // ���⵵ ���� ������� I have�� 0,1,2,3,4,5���� �ִ� �� 
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
