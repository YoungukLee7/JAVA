package quiz;


class Subway{
	String[] SUBWAY_COLOR = {"����","���","��Ȳ��","�ϴû�","�����","£����Ȳ��","Ź�� ���"};
	
	String[][] SUBWAY_MAP = {
							{"��õ","����õ","����","�繰��","��ȭ","�־�","����","����","���"},
							{"������","�������Ÿ�","��õ��û","����õ","����","�ŵ���"},
							{},
							{},
							{},
							{},
							{"�����","�Ŵ���Ÿ�","��¹��","��","���Ǵ��Ա�","����"},
	};
	
	
	int line; // �� ȣ��
	int current_station; // ���� ���ִ� ��
	boolean direction = true; // ���� ������ ���� �ٽ� ó������ ���ư��� ���� �ۼ�

	
	
	void next() { // ���� ������ ���� �ż��� 
		// �����ϴ� �����϶� �� ������ ���̰ų�
		// �����ϴ� �����϶� �� ���� ���̶�� ������ �ٲ۴�
		if (direction && current_station + 1 == SUBWAY_MAP[line -1].length
			||	(!direction && current_station == 0)) {
			direction = !direction;
		}
		if (direction) {
			current_station++;
		} else {
			current_station--;
		}
	}

	
	
	void info() {
		System.out.println("[���� ����]");
		System.out.println("line : " + line + "ȣ��");
		System.out.println("���� : " + SUBWAY_COLOR[line - 1]);
		System.out.println("���� ������ : " + SUBWAY_MAP[line - 1][current_station]);
	}

}

public class C02_subway {

	public static void main(String[] args) {

		Subway sub1 = new Subway();
		Subway sub2 = new Subway();

		sub1.line = 1;
		sub1.current_station = 3;

		sub2.line = 7;
		sub2.current_station = 0;

		sub1.info();
		sub2.info();

		for (int i = 0; i < 10; i++) {
			sub1.next();
			sub1.info();
		}
	}
}
