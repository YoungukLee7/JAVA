package myobj;

public class SoccerManager {
	
	public static void soccerAttack(ManagerOrder order) {
		order.attack();
	}
	
	public static void soccerDefence(ManagerOrder order) {
		order.defense();
	}
	
	public static void main(String[] args) {
		System.out.println("[���� ����]");
		System.out.print("���ݼ�\t: ");
		soccerAttack(new StrikerTactics());
		System.out.print("�̵��ʴ�\t: ");
		soccerAttack(new MidfielderTactics());
		System.out.print("�����\t: ");
		soccerAttack(new DefenderTactics());
		
		System.out.println();
		
		System.out.println("[���� ����]");
		System.out.print("���ݼ�\t: ");
		soccerDefence(new StrikerTactics());
		System.out.print("�̵��ʴ�\t: ");
		soccerDefence(new MidfielderTactics());
		System.out.print("�����\t: ");
		soccerDefence(new DefenderTactics());
	}

}



abstract class ManagerOrder{
	abstract void attack();
	abstract void defense();
}

class StrikerTactics extends ManagerOrder{

	@Override
	void attack() {
		System.out.println("�Ʒ��� �������� �ʰ� ���������� ����");
		
	}

	@Override
	void defense() {
		System.out.println("�Ʒ��� ������ ���� ����");
		
	}
	
}

class MidfielderTactics extends ManagerOrder{

	@Override
	void attack() {
		System.out.println("���� �����̽� ������ ���������� ħ��");
		
	}

	@Override
	void defense() {
		System.out.println("�߾ӿ��� ���� �� ���������� Ż��");
		
	}
	
}

class DefenderTactics extends ManagerOrder{

	@Override
	void attack() {
		System.out.println("���� Ǯ�� ���������� ���̵�� ħ��");
		
	}

	@Override
	void defense() {
		System.out.println("�߾� ���񿡸� ����");
		
	}
	
}