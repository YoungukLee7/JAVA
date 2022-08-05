package quiz;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class D13_ParkingSystem {
	/*
	 * 차량의 정보를 보고 차량 5부제를 적용했을 때 출입 제한인지 아닌지 판별하는 프로그램을 만들어보세요
	 */
	
	public static void main(String[] args) {
		// 차량을 만듬과 동시에 키값을 꺼낸다
		Set<String> carKinds = Car.madeCar().keySet();
		System.out.println(carKinds);

		// 차량 종류 판별
		for (String carKind : carKinds) {
			if (carKind.contains("장애인")) {
				System.out.println("출입이 가능합니다. 들어가세요.");
				break;
			} else if (carKind.contains("유아동승")) {
				System.out.println("출입이 가능합니다. 들어가세요.");
				break;
			} else if (carKind.contains("경차")) {
				System.out.println("출입이 가능합니다. 들어가세요.");
				break;
			}
			// 차량 번호(value)를 꺼낸다
			Collection<Integer> carNumbers = Car.madeCar().values();

			System.out.println(carNumbers);

			for (int carNum : carNumbers) {

				// 차량 끝번호
				int carNumCheck = carNum % 10; 

				// 오늘 요일 확인
				LocalDate today = LocalDate.now();
				DayOfWeek todayWeek = today.getDayOfWeek();
				System.out.println("오늘은 " + todayWeek.getDisplayName(TextStyle.FULL, Locale.KOREA) + "입니다.");

				// 요일 번호 저장
				int todayWeekNum = todayWeek.getValue();

				// 월요일부터 금요일까지 판단해줌
				if (todayWeekNum < 6) {
					if (carNumCheck == todayWeekNum || carNumCheck == (todayWeekNum + 5) % 10) {
						System.out.println("주차장 출입이 불가합니다.");
						break;
					} else {
						System.out.println("출입이 가능합니다. 들어가세요.");
						break;
					}
				}
				// 휴무일 판단해줌
				if (todayWeekNum == 6 || todayWeekNum == 7) {
					System.out.println("출입이 가능합니다. 들어가세요.");
					break;
				}
			}
		}

	}

}
//차량을 랜덤으로 만들어주는 클래스
class Car {

	static String[] car = { "장애인", "경차", "유아동승", "승용차", "SUV" };
	// 차 종류
	static String carType() {
		return car[(int) (Math.random() * car.length)];
	}
	// 차 번호
	static int carNumber() {
		return (int) (Math.random() * 9000 + 1000);
	}
	// HashMap으로 가상 차량 만듬
	static HashMap<String, Integer> madeCar() {
		HashMap<String, Integer> madeCar = new HashMap<>();
		madeCar.put(carType(), carNumber());
		return madeCar;
	}
}