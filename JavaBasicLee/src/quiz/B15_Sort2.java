package quiz;

import java.util.Arrays;

public class B15_Sort2 {
//	# 버블 정렬
	public static void main(String[] args) {
		int[] desc = new int [10];

		for (int i = 0; i < desc.length; i++) {
			desc[i] = (int)(Math.random()*100000);
		}
		
		System.out.println(Arrays.toString(desc));
		
		for (int step = 0; step < desc.length - 1; step++) {
			for (int i = 0; i < desc.length - 1 - step; i++) {
				if (desc[i] < desc[i+1]) {
					int temp = desc[i];
					desc[i] = desc[i+1];
					desc[i+1] = temp;
				}
			}
			System.out.printf("%d 단계 : %s\n",step,Arrays.toString(desc));
		}
	}

}
