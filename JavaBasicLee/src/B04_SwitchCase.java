
public class B04_SwitchCase {
	/*
	 * # Switch-Case�� 
	 * - ()���� ���� ����� ���� ������ �ڵ带 �����ϴ� ���� 
	 * - ()�ȿ� booleanŸ�� ��� �ٸ� Ÿ���� ����Ѵ�
	 * - case�� �Ҽ��̸� ���� ������ ������ ���� ����� 
	 * - if������ �Ϻ��ϰ� ��ü �����Ͽ� ���� ������� �ʴ´� 
	 * - break���� �Ⱦ��� break���� ������ ���� �������鼭 ��� case�� �����մϴ� 
	 * - default�� if���� else���� ������ �Ѵ�
	 */
	public static void main(String[] args) {

		int num = 23;

		switch (num) {
		case 0:
			System.out.println("num�� 0�Դϴ�");
			break;
		case 1:
			System.out.println("num�� 1�Դϴ�");
			break;
		case 2: case 3: case 4:
			System.out.println("num�� 2 or 3 or 4�Դϴ�");
			break;
		default:
			System.out.println("���� case�� ��� �ش� ���� �ʾ� ����˴ϴ�.");
			break;
		}
	}

}
