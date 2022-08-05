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
	 컴퓨터와의 간단한 가위바위보 게임을 하나 만들고, 게임 종료시 전적을 파일에 저장해보세요
	 게임을 다시 실행하면 예전 전적이 그대로 반영되도록 만들어보세요 
	 */
	public static void main(String[] args) {

		Player users = new Player();
		Player cpus = new Player();

		Scanner sc = new Scanner(System.in);

		while (true) {

			RspGame cpu = RspGame.random();
			RspGame user = null;

			System.out.print("가위(0) 주먹(1) 보(2) : ");
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
				System.out.println("다시 선택하세요.");
				break;
			}
			System.out.printf("user: %s cpu: %s\n", user.getRspGameName(), cpu.getRspGameName());
			switch (RspGame.check(user, cpu)) {
			case 1:
				System.out.println("user가 이겼습니다.");
				users.win();
				cpus.lose();
				break;
			case 0:
				System.out.println("무승부 입니다.");
				users.draw();
				cpus.draw();
				break;
			case -1:
				System.out.println("cpu가 이겼습니다.");
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
			System.out.println("기록 작성 완료");
		}
	}
}
