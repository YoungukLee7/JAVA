package quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

import myobj.saveGame.Player;
import myobj.saveGame.RspGame;

public class E07_SaveGame {
	/*
	 ��ǻ�Ϳ��� ������ ���������� ������ �ϳ� �����, ���� ����� ������ ���Ͽ� �����غ�����
	 ������ �ٽ� �����ϸ� ���� ������ �״�� �ݿ��ǵ��� �������� 
	 */
	public static void main(String[] args) {

		Player users = new Player();
		Player cpus = new Player();

		Scanner sc = new Scanner(System.in);

		while (true) {

			RspGame cpu = RspGame.random();
			RspGame user = null;

			System.out.print("����(0) �ָ�(1) ��(2) : ");
			switch (sc.nextInt()) {
			case 0:
				user = RspGame.SCISSORS;
				break;
			case 1:
				user = RspGame.ROCK;
				break;
			case 2:
				user = RspGame.PAPER;
				break;
			default:
				System.out.println("�ٽ� �����ϼ���.");
				break;
			}
			System.out.printf("user: %s cpu: %s\n", user.getRspGameName(), cpu.getRspGameName());
			switch (RspGame.check(user, cpu)) {
			case 1:
				System.out.println("user�� �̰���ϴ�.");
				users.win();
				cpus.lose();
				break;
			case 0:
				System.out.println("���º� �Դϴ�.");
				users.draw();
				cpus.draw();
				break;
			case -1:
				System.out.println("cpu�� �̰���ϴ�.");
				cpus.win();
				users.lose();
				break;
			}

			File f = new File("files/saveData.txt");
			try {
				FileWriter out = new FileWriter(f, Charset.forName("UTF-8"));

				out.write("[USER]\n");
				out.write(users.saveData());
				out.write("[CPU]\n");
				out.write(cpus.saveData());

				out.close();

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("��� �ۼ� �Ϸ�");
		}
	}
}
