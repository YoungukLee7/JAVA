
public class C04_Static {

	/*
	 # static (���� ����,Ŭ���� ����) (�ݴ� ������ �ν��Ͻ� ����)
	 - ���� Ŭ������ ��� �ν��Ͻ��� �������� ����ϴ� ������ ���� �����̶�� �Ѵ�
	 - �տ� static�� ���� �ڿ�(�ʵ�,�޼���)�� ��� �ν��Ͻ��� �������� ����ϴ� �ڿ��� �ȴ�
	 - static������ �ڿ��� �ƹ��� �ν��Ͻ��� ���Ƶ� Ŭ������ �ϳ��̱� ������
	 	Ŭ���� �̸��� .�� ¦�� ����� �� �ִ� h1.wedth++; �� PlayingCard.wedth++; �� ������ �տ� �� ���� �������� �ʴ´�
	 - static������ �ڿ��� �ν��Ͻ��� ����� ������ ��� �� �� �ִ�
	 PlayingCard h1 = new PlayingCard(1, 1); �̰��� ����� ������ static���� �ִ�
	 - static �޼���� �ν��Ͻ��� ����� ������ ��� �����ؼ� �ν��Ͻ� ������ ����� �� ����
	 - static �ʵ常 ����ϴ� �޼���� static �޼���� ����� ���� ����
	 - �ν��Ͻ� ������ Ȱ���ϴ� �޼���� �ݵ�� �ν��Ͻ� �޼��忩�� �Ѵ�
	 */
	public static void main(String[] args) {
		System.out.println(PlayingCard.height);
		PlayingCard.changeSize(0, 0);
		
		PlayingCard h1 = new PlayingCard(1, 1);
		PlayingCard s1 = new PlayingCard(1, 1);
		PlayingCard d10 = new PlayingCard(1, 10);
		
		
		for (int i = 0; i < 10; i++) {
			PlayingCard.wedth++;
			h1.print();
			s1.print();
			d10.print();
		}
		
		
		System.out.println(h1.wedth);
		System.out.println(s1.wedth);
		System.out.println(d10.wedth);
		
		
		
	}
}

class PlayingCard{
	// ��� �ν��Ͻ��� �Բ� ����� �� (����ƽ ����,Ŭ���� ����,���� ����) ī�� ���� ���̴� �ȴ޶��� (static�� ���δ�)
	static int wedth = 0;
	static int height = 200;
	
	static char[] suits = {'��', '��','��','��'};
	
	// �� �ν��Ͻ��� �ڱ⸸�� ������ ������ ��� �� ��(�ν��Ͻ� ����) ī�� ���ڳ� ����� �޶���
	int suit;
	int num;
	
	public static void changeSize(int wedth,int height) {
		// this�� �ν��Ͻ��� ������ �� �ڱ� �ڽ��� �ǹ� ������ ,static������ ����� �� ����
		PlayingCard.wedth = wedth;
		PlayingCard.height = height;
		
		System.out.println("�ٲ� �ʺ� : " + PlayingCard.wedth);
		System.out.println("�ٲ� ���� : " + PlayingCard.height);
//		System.out.println("���� ī�� ����: " + suits[suit]);  // �ν��Ͻ� �����̿��� �� �� ���� 
//		ö���ϰ� static������ ��� ���� ī��μ� ������ �ִ°��� ���������� suit�� ��������� �� �� �ִ�
	}
	
	public PlayingCard(int suit, int num) {
		this.suit = suit;
		this.num = num;
	}
	
	public void print() {
		System.out.print("��������");
		for (int i = 0; i < wedth; i++) {
			System.out.print("��");
		}
		System.out.println("����");
		
		System.out.printf("�� %c%2d", suits[suit], num);
		
		for (int i = 0; i < wedth; i++) {
			System.out.print(' ');
		}
		System.out.println("��");
		
		System.out.print("������");
		for (int i = 0; i < wedth; i++) {
			System.out.print("��");
		}
		System.out.println("������");
	}
}
// �������� static �ڿ��� ������ Ŭ������ �ϳ� �����غ�����. (�ʺ�/����,ī�� ��� ����)
class Tourist{
	
	int date; // �湮����
	int countryNum; // �湮�ѱ�����ȣ
	int landMarkNum; // �湮�ѷ��帶ũ��ȣ
	int corrosion; // �ν�
	int naturalDisasters; // �ڿ�����
	
	static String[] completion = {"1889", "124", "80", "1653", "1931"}; // �ϰ� �ñ�
	static String[] country = {"������","�߱�","��Ż����","�ε�","�����"}; // ����
	static String[] name = {"����ž","�����强","�ݷμ���","Ÿ������","������"}; // ���帶ũ �̸�
	
	void info(){
		System.out.println("�湮���� : " + date);
		System.out.println("�湮�ѱ�����ȣ : " + countryNum);
		System.out.printf("���� : %s �ϰ� : %s�� ���帶ũ : %s",country[countryNum],completion[countryNum],name[countryNum]);
		System.out.println("�ν� : " + corrosion);
		System.out.println("�ڿ����ط� ���� �ı� : " + naturalDisasters);
	}
	
	Tourist(int year) {
		this(year, 0);
	}
	
	Tourist(int year , int naturalDisasters){
		corrosion -= year * 10;
		naturalDisasters *= 100;
	}
	
	
}

class SolidR4{
	// Ŭ���� ����, ���� ��� (�������� �� ��)
	static int ���� = 8000;
	static int �帮��Ʈ = 90;
	static int acc = 49;
	static int �ڳʸ� = 556;
	static int �ν��ͽð� = 440;
	static int �ν��͹ٲ� = 200;
	static String category = "���ǵ� īƮ/ �Ϲ�";
	static String description = "���̽��� �ٵ��Դϴ�.";
	
	static String[] color = {"������", "�����", "�ʷϻ�", "�Ķ���", "������", "���", "��ũ��"};
	
	// �ν��Ͻ� ���� (���� �ٸ� ��)
	String enginePatch;
	String kit;
	String handle;
	String wheel;
	String owner;
	int paint;
	
}