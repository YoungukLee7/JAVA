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
	 * ������ ������ ���� ���� 5������ �������� �� ���� �������� �ƴ��� �Ǻ��ϴ� ���α׷��� ��������
	 */
	
	public static void main(String[] args) {
		// ������ ����� ���ÿ� Ű���� ������
		Set<String> carKinds = Car.madeCar().keySet();
		System.out.println(carKinds);

		// ���� ���� �Ǻ�
		for (String carKind : carKinds) {
			if (carKind.contains("�����")) {
				System.out.println("������ �����մϴ�. ������.");
				break;
			} else if (carKind.contains("���Ƶ���")) {
				System.out.println("������ �����մϴ�. ������.");
				break;
			} else if (carKind.contains("����")) {
				System.out.println("������ �����մϴ�. ������.");
				break;
			}
			// ���� ��ȣ(value)�� ������
			Collection<Integer> carNumbers = Car.madeCar().values();

			System.out.println(carNumbers);

			for (int carNum : carNumbers) {

				// ���� ����ȣ
				int carNumCheck = carNum % 10; 

				// ���� ���� Ȯ��
				LocalDate today = LocalDate.now();
				DayOfWeek todayWeek = today.getDayOfWeek();
				System.out.println("������ " + todayWeek.getDisplayName(TextStyle.FULL, Locale.KOREA) + "�Դϴ�.");

				// ���� ��ȣ ����
				int todayWeekNum = todayWeek.getValue();

				// �����Ϻ��� �ݿ��ϱ��� �Ǵ�����
				if (todayWeekNum < 6) {
					if (carNumCheck == todayWeekNum || carNumCheck == (todayWeekNum + 5) % 10) {
						System.out.println("������ ������ �Ұ��մϴ�.");
						break;
					} else {
						System.out.println("������ �����մϴ�. ������.");
						break;
					}
				}
				// �޹��� �Ǵ�����
				if (todayWeekNum == 6 || todayWeekNum == 7) {
					System.out.println("������ �����մϴ�. ������.");
					break;
				}
			}
		}

	}

}
//������ �������� ������ִ� Ŭ����
class Car {

	static String[] car = { "�����", "����", "���Ƶ���", "�¿���", "SUV" };
	// �� ����
	static String carType() {
		return car[(int) (Math.random() * car.length)];
	}
	// �� ��ȣ
	static int carNumber() {
		return (int) (Math.random() * 9000 + 1000);
	}
	// HashMap���� ���� ���� ����
	static HashMap<String, Integer> madeCar() {
		HashMap<String, Integer> madeCar = new HashMap<>();
		madeCar.put(carType(), carNumber());
		return madeCar;
	}
}