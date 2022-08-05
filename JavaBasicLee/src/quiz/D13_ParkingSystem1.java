package quiz;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

import myobj.parking.Car;
import myobj.parking.CarFactory;
import myobj.parking.CarType;

public class D13_ParkingSystem1 {
	/*
	 * ������ ������ ���� ���� 5������ �������� �� ���� �������� �ƴ��� �Ǻ��ϴ� ���α׷��� ��������
	 */
	
	private static HashMap<DayOfWeek, String> limitNumMap = new HashMap<>();
	private static HashSet<CarType> allowedCarType = new HashSet<>();
	
	static {
		limitNumMap.put(DayOfWeek.MONDAY,    "16");
		limitNumMap.put(DayOfWeek.TUESDAY,   "27");
		limitNumMap.put(DayOfWeek.WEDNESDAY, "38");
		limitNumMap.put(DayOfWeek.THURSDAY,  "49");
		limitNumMap.put(DayOfWeek.FRIDAY,    "50");
		
		allowedCarType.add(Car.babyRide);
		allowedCarType.add(Car.disabled);
		allowedCarType.add(Car.lightCard);
	}
	
	public void check(Car car) {
		DayOfWeek todaysDow = LocalDate.now().getDayOfWeek();
		
		String limitNum = limitNumMap.get(todaysDow);
		
		if (limitNum == null) {
			System.out.println("������ �ָ��̹Ƿ� ���� 5������ �������� �ʽ��ϴ�");
			return;
		}
		
		System.out.printf("������ %s�̹Ƿ� ���� ����ȣ %c, %c���� ������ ���ѵ˴ϴ�.\n",
				todaysDow.getDisplayName(TextStyle.FULL, Locale.KOREA),
				limitNum.charAt(0),limitNum.charAt(1));
		
		if (allowedCarType.contains(car.getCarType())) {
			System.out.println("�����,����,���Ƶ��� ������ 5������ ����� �ƴմϴ�.");
			car.setState(1);
		}else if (limitNum.contains(car.getLastNum())) {
			System.out.println("���� 5���� ����̹Ƿ� ������ ���ѵ˴ϴ�");
			car.setState(2);
		}else {
			System.out.println("���� 5���� ����� �ƴմϴ�");
			car.setState(1);
		}
	}
	
	public static void main(String[] args) {
		D13_ParkingSystem1 sys = new D13_ParkingSystem1();
		
		for (int i = 0; i < 100; i++) {
			Car car = CarFactory.getRandomTestCar();
			
			System.out.println(car);
			
			sys.check(car);
			
			System.out.println(car);
			
			System.err.println("------------------------------------------------------");
		}
	}
}
