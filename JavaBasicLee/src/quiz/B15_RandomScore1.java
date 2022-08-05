package quiz;

public class B15_RandomScore1 {
	/*
	 1번 학생 100명의 점수 (0~100)를 랜덤으로 생성하여 배열에 저장
	 2번 배열에 저장된 값을 보기 좋은 형태로 출력
	 3번 모든 학생들의 평균 점수를 출력 (소수 둘째자리까지 출력)
	 4번 배열에 저장된 값들 중 가장 낮은 점수와 가장 높은점수를 출력
	 강사님 풀이
	 */
	public static void main(String[] args) {

		// 1.
		int[] score = new int[100];
		for (int i = 0; i < 100; i++) {
			score[i] = (int) (Math.random() * 101);
		}
		// 2.
		for (int i = 0; i < score.length; i++) {
			System.out.println("┌─────┐");
			System.out.printf ("│ %3d │\n",score[i]);
			System.out.println("└─────┘");
		}
		// 3.
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.printf("총점 : %d, 평균 : %.2f\n",sum,sum/100.0);
		
		// 4.
		int best=0, worst=100;
		for (int i = 0; i < score.length; i++) {
			best = best < score[i] ? score[i] : best;
			worst = worst > score[i] ? score[i] : worst;
		}
		System.out.printf("최대값 : %d, 최소값 : %d\n",best,worst);
	}

}
