
public class E03_CustomException {
	/*
	 # ���ϴ� ���ܸ� ���� ���� ����ϱ�
	 - Exception�� ��� ������ �ݵ�� ó���ؾ� �ϴ� ����
	 - RuntimeException�� ��� ������ �ݵ�� ó���� �ʿ�� ���� ���
	 */
	public static void playCat(Cat cat) throws NotPlayableCatException {
		
		// A instanceof B : A�� B�� �ν��Ͻ����� �˻��ϴ� �� ������
		if (cat instanceof RussianBlueCat) {
			throw new NotPlayableCatException();
		}else {
			System.out.println("����̿� �������ϴ�.");
		}
	}
	
	public static void main(String[] args) {
		try {
			playCat(new Cat());
			playCat(new PersianCat());
			playCat(new RussianBlueCat());
		} catch (Exception e) {
			
		}
	}
}

class Cat{}
class PersianCat extends Cat{}
class RussianBlueCat extends Cat{}
									// RuntimeException �̶� ������ main�� try-catch�� �� �ʿ� ����. 
									// �׸��� ���þȺ��� ����ó���� �����ش�
class NotPlayableCatException extends Exception{
	public NotPlayableCatException() {
		super("���� �𸣴� ����� �ͼ���");
	}
}