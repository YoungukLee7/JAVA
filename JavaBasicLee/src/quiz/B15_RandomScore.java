package quiz;

public class B15_RandomScore {

	/*
	 1번 학생 100명의 점수 (0~100)를 랜덤으로 생성하여 배열에 저장
	 2번 배열에 저장된 값을 보기 좋은 형태로 출력
	 3번 모든 학생들의 평균 점수를 출력 (소수 둘째자리까지 출력)
	 4번 배열에 저장된 값들 중 가장 낮은 점수와 가장 높은점수를 출력
	 */
	public static void main(String[] args) {

		int sum = 0;
		int max = 0;
		int min = 100;
//		 1번 학생 100명의 점수 (0~100)를 랜덤으로 생성하여 배열에 저장
		int[] student = new int[100];
		for (int i = 0; i < student.length; i++) {
			student[i] = (int) (Math.random() * 100);
			if (max < student[i]) {
				max = student[i];
			}

			if (min > student[i]) {
				min = student[i];
			}
			sum += student[i];
//		 2번 배열에 저장된 값을 보기 좋은 형태로 출력
			System.out.printf("student[%2d] : %d\n", i, student[i]);
		}
//		 3번 모든 학생들의 평균 점수를 출력 (소수 둘째자리까지 출력)
		System.out.printf("평균점수 : %.2f\n", sum / 100.0);
//		 4번 배열에 저장된 값들 중 가장 낮은 점수와 가장 높은점수를 출력
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

}
