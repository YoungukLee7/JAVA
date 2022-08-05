package quiz;


class Subway{
	String[] SUBWAY_COLOR = {"남색","녹색","주황색","하늘색","보라색","짙은주황색","탁한 녹색"};
	
	String[][] SUBWAY_MAP = {
							{"인천","동인천","도원","재물포","도화","주안","간석","동암","백운"},
							{"까차산","신정내거리","양천구청","도람천","문래","신도림"},
							{},
							{},
							{},
							{},
							{"보라매","신대방삼거리","장승배기","상도","숭실대입구","남성"},
	};
	
	
	int line; // 몇 호선
	int current_station; // 현재 서있는 역
	boolean direction = true; // 역이 끝가지 가면 다시 처음으로 돌아가기 위해 작성

	
	
	void next() { // 다음 역으로 가는 매서드 
		// 증가하는 방향일때 맨 오른쪽 역이거나
		// 감소하는 방향일때 맨 왼쪽 역이라면 방향을 바꾼다
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
		System.out.println("[차량 정보]");
		System.out.println("line : " + line + "호선");
		System.out.println("색상 : " + SUBWAY_COLOR[line - 1]);
		System.out.println("현재 정차역 : " + SUBWAY_MAP[line - 1][current_station]);
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
