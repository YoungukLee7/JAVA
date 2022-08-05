package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class D06_SortRanking {
	/*
	 여러 사람들의 기록을 저장할 수 있는 데이터 클래스를 하나 설계하고
	 해당 기록 정보를 클리어 타임순과 점수순으로 출력할 수 있는 프로그램을 만들어보세요
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
		
		System.out.println("[점수 높은 순서]");
		Collections.sort(list,new Score());
		System.out.println(list);
		System.out.println();
		System.out.println("[기록 빠른 순서]");
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
		return "점수: " + score + "점 " + " 클리어 타임: " + clearTime + "초";
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