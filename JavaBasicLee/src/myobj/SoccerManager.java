package myobj;

public class SoccerManager {
	
	public static void soccerAttack(ManagerOrder order) {
		order.attack();
	}
	
	public static void soccerDefence(ManagerOrder order) {
		order.defense();
	}
	
	public static void main(String[] args) {
		System.out.println("[공격 전술]");
		System.out.print("공격수\t: ");
		soccerAttack(new StrikerTactics());
		System.out.print("미드필더\t: ");
		soccerAttack(new MidfielderTactics());
		System.out.print("수비수\t: ");
		soccerAttack(new DefenderTactics());
		
		System.out.println();
		
		System.out.println("[수비 전술]");
		System.out.print("공격수\t: ");
		soccerDefence(new StrikerTactics());
		System.out.print("미드필더\t: ");
		soccerDefence(new MidfielderTactics());
		System.out.print("수비수\t: ");
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
		System.out.println("아래로 내려오지 않고 적극적으로 공격");
		
	}

	@Override
	void defense() {
		System.out.println("아래로 내려와 수비 협력");
		
	}
	
}

class MidfielderTactics extends ManagerOrder{

	@Override
	void attack() {
		System.out.println("하프 스페이스 공간에 적극적으로 침투");
		
	}

	@Override
	void defense() {
		System.out.println("중앙에서 상대방 공 적극적으로 탈취");
		
	}
	
}

class DefenderTactics extends ManagerOrder{

	@Override
	void attack() {
		System.out.println("양쪽 풀백 적극적으로 사이드로 침투");
		
	}

	@Override
	void defense() {
		System.out.println("중앙 수비에만 전념");
		
	}
	
}