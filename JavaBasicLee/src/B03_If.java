import java.util.Scanner;

public class B03_If {
	/*
	 # if��
	 - ()�ȿ� ���� true�� �� {}���� ������ �����ϴ� ����
	 - ()���� ���� false�϶��� {}���� ������ ��� �����Ѵ�
	 = {}�ȿ� ���� ������ �� �� ���̶�� {}�� ������ �� �ִ�
	 - if���� �� ���� ���ٸ� {}�� �� �����ش�
	 
	 # else if��
	 - ���� �ִ� if���� ������� �ʾҴٸ� if�� ó�� �����Ѵ�. 
	 - else if�� ������ ����� �� �ִ�
	 - else if�� �ܵ����� ����� �� ���� (if���� �־�� �Ѵ�)
	 
	 # else��
	 - ���� �ִ� if��, else if���� ��� ������� �ʾҴٸ� {}���� ������ ������ �����Ѵ�
	 - if�� �ٷ� ������ �����ִ�
	 - �ܵ����� ����� �� ����
	 - else�� �پ��ִ� if���� �ּ� �ѹ��� ����ȴ�
	 - �ʱ�ȭ�� �뵵�� ����.
	 
	 if��
	 if��
	 �̷��� ������ �ΰ� �� �����
	 
	 if��
	 else if��
	 �̷��� ������ if���� ����Ǹ� else if���� ���� �ȵ�
	 if���� ���� �ȵǸ� else if���� ���۵�
	 */
	public static void main(String[] args) {
		if(true) {
			System.out.println("if���� true�� �� �����Ǵ� ��ɾ�1");
			System.out.println("if���� true�� �� �����Ǵ� ��ɾ�2");
			System.out.println("if���� true�� �� �����Ǵ� ��ɾ�3");
		}
		
		int a = 7;
		
		if (a%2==0) {
			System.out.println("a�� ���� ¦���� ���� ����Ǵ� ����");
		} else if (a%3==0) {
			System.out.println("a�� ���� ¦���� �ƴϸ鼭 3�� �����");
		} else if (a%3==0) {
			System.out.println("2�� ����� �ƴϰ� 3�� ����� �ƴ� 5�� �����");
		} else {
			System.out.println("���� ������ ��� �ƴմϴ�");
		}
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� �� ����� ���� : ");
		int apple = scanner.nextInt();
		String size;
		
		if(apple > 10) {
			size = "��뷮 ���̹�";
		} else if (apple > 5) {
			size = "���� ���̹�";
		} else {
			size = "���� ���̹�";
		}
		
		System.out.println(size);
	
	}

}
