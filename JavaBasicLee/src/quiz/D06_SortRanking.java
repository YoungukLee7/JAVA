package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class D06_SortRanking {
	/*
	 ���� ������� ����� ������ �� �ִ� ������ Ŭ������ �ϳ� �����ϰ�
	 �ش� ��� ������ Ŭ���� Ÿ�Ӽ��� ���������� ����� �� �ִ� ���α׷��� ��������
	 */
	public static void main(String[] args) {
		ArrayList<GameData> list = new ArrayList<>();
		list.add(new GameData(90, 13.2));
		list.add(new GameData(87, 11.08));
		list.add(new GameData(66, 20.6));
		list.add(new GameData(73, 15.5));
		list.add(new GameData(73, 13.5));
		list.add(new GameData(43, 18.7));
		list.add(new GameData(100, 9.86));
		
		System.out.println("[���� ���� ����]");
		Collections.sort(list,new Score());
		System.out.println(list);
		System.out.println();
		System.out.println("[��� ���� ����]");
		Collections.sort(list,new ClearTime());
		System.out.println(list);
	}
}


class GameData{
	
	int score;
	double clearTime;
	
	public GameData(int score, double clearTime) {
		this.score = score;
		this.clearTime = clearTime;
	}
	
	@Override
	public String toString() {
		return "����: " + score + "�� " + " Ŭ���� Ÿ��: " + clearTime + "��";
	}
}


class Score implements Comparator<GameData>{

	@Override
	public int compare(GameData game1, GameData game2) {
		return game1.score < game2.score ? 1 : -1;
	}
	
}

class ClearTime implements Comparator<GameData>{

	@Override
	public int compare(GameData game1, GameData game2) {
		return game1.clearTime < game2.clearTime ? -1 : 1;
	}
	
}