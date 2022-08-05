package myobj.poketmon;

public class Trainer {

	String name;
	Poketmon[] own_poketmon = new Poketmon[6];
	
	int index = 0;
	
	public Trainer(String name) {
		this.name = name;
	}
	
	public void catchPoketmon(Poketmon poke) {
		if (index == 6) {
			System.out.println("�ָӴϰ� ���� ���� " + poke.name + "�� �����־����ϴ�.");
			return;
		}
		own_poketmon[index++] = poke; 
	}
	
	public void printOwn() {
		for (int i = 0; i < index; i++) {
			own_poketmon[i].printStats();
		}
	}
	
	public static void main(String[] args) {
		Trainer t = new Trainer("����");
		
		t.catchPoketmon(new Poketmon("�̻��ؾ�", 1, 2, 3, 4, 5, 6));
		t.catchPoketmon(new Pikachu());
		t.catchPoketmon(new Pikachu());
		t.catchPoketmon(new Pikachu());
		t.catchPoketmon(new Pichu());
		t.catchPoketmon(new Pichu());
		t.catchPoketmon(new Pichu());
		
		
		t.printOwn();
	}
	
}
