package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class D06_SortRanking1 {
	/*
	 ���� ������� ����� ������ �� �ִ� ������ Ŭ������ �ϳ� �����ϰ�
	 �ش� ��� ������ Ŭ���� Ÿ�Ӽ��� ���������� ����� �� �ִ� ���α׷��� ��������
	 ����� Ǯ��
	 */
	public static void main(String[] args) {
		List<Record> records = new ArrayList<>();
		
		records.add(new Record("Khj", 1000, 33000));
		records.add(new Record("Lee", 800, 40000));
		records.add(new Record("Kim", 3300, 21000));
		records.add(new Record("JJJ", 2200, 53000));
		records.add(new Record("KKK", 2200, 13000));
		records.add(new Record("AAA", 2200, 22000));
		records.add(new Record("ABB", 2200, 31000));
		records.add(new Record("ABC", 2200, 13580));
		
		Collections.sort(records);
		System.out.println(records);
		
		Collections.sort(records,Record.ORDER_BY_SCORE_DESC);
		System.out.println(records);
	}
	
}

class Record implements Comparable<Record> {
	String name;
	int time;
	int score;
	
	// Comparator�� ���� ���� �ȿ� �����
	// Record�� ���� �����̹Ƿ� Record �ȿ� �־� ������ �������� ���� �� �ִ�
	// ����Ʈ���� ������ : �����ִ� �͵鳢�� �� ������� ����. �������� ����.
	                                                      // �Ｎ���� ��ӹ��� ��
	final public static Comparator<Record> ORDER_BY_SCORE_DESC = new Comparator<>() {

		@Override
		public int compare(Record r1, Record r2) {
			return Integer.compare(r2.score, r1.score) == 0 ? 
					Integer.compare(r1.time, r2.time) : Integer.compare(r2.score, r1.score);
			// return r1.score != r2.score ? r2.score - r1.score : r1.time - r2.time;
		}
		
	};

	public Record(String name, int time, int score) {
		this.name = name;
		this.time = time;
		this.score = score;
	}

	@Override // �ð��� ����
	public int compareTo(Record r) {
		return time != r.time ? time - r.time : r.score - score;
	}
	
	@Override
	public String toString() {
		return String.format("name: %s, time: %d, score: %d\n", name,time,score);
	}
}