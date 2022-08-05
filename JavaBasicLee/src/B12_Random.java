import java.util.Random;

public class B12_Random {

	/*
	 # Random ������ ���� �����ϱ�
	 1. Math.random() �Լ� ����ϱ�
	 
	 - 0 <= x < 1�� double Ÿ�� ���� �Ǽ��� �����ϴ� �Լ�
	 - �� ���� �Լ��� Ȱ���Ͽ� ���ϴ� ������ ���ڸ� ����� ����� �� �ִ�.
	 
	 $ ���ϴ� ������ ������ ����� ���� ( ex: 30 ~ 39 )
	 1. ������ ���� �Ǽ��� ���ϴ� ������ ������ ���Ѵ�. 
	 ( ex: 30 ~ 39�� ���ڰ� 10���̹Ƿ� 10�� ���Ѵ� )
	 0 <= x < 1 --> 0 <= x < 10
	 2. ���ϴ� ���� ���� �� ���� ���� ���ڸ� ���Ѵ�
	 ( ex: 30 ~ 39���� ���� ������ 30�� ���Ѵ� )
	 0 <= x < 10 --> 30 <= x < 40
	 3. �Ҽ��� �Ʒ��� ���´�
	 ( ex: 39.99999�� �Ҽ��� �Ʒ��� �����ϸ� 39�� �ȴ�)
	 
	 2. java.util.Random Ŭ���� ����ϱ�
	 Random random = new Random();
	 random.nextInt();
	 */
	public static void main(String[] args) {
		
		// ���ο� ���� �õ� ����
		Random random = new Random();
		
		random.nextInt();
		
		System.out.println(random.nextInt());
		System.out.println(random.nextLong());
		System.out.println(random.nextFloat());
		System.out.println(random.nextDouble());
		System.out.println(random.nextBoolean());

//		for (int i = 0; i < 10; i++) {
//			System.out.println((int)(Math.random()*10+30));
//		}
		// �������� : 1~45�� ���� ������ 10�� ����غ�����
		for (int i = 0; i < 10; i++) {
			System.out.println((int)(Math.random()*45+1));
		}
	}

}
