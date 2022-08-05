package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class D06_SortRanking1 {
	/*
	 여러 사람들의 기록을 저장할 수 있는 데이터 클래스를 하나 설계하고
	 해당 기록 정보를 클리어 타임순과 점수순으로 출력할 수 있는 프로그램을 만들어보세요
	 강사님 풀이
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
	
	// Comparator를 보기 좋게 안에 만든것
	// Record의 정렬 기준이므로 Record 안에 넣어 놓으면 응집도를 높일 수 있다
	// 소프트웨어 응집도 : 관련있는 것들끼리 잘 묶어놓는 정도. 높을수록 좋다.
	                                                      // 즉석에서 상속받은 것
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

	@Override // 시간순 정렬
	public int compareTo(Record r) {
		return time != r.time ? time - r.time : r.score - score;
	}
	
	@Override
	public String toString() {
		return String.format("name: %s, time: %d, score: %d\n", name,time,score);
	}
}