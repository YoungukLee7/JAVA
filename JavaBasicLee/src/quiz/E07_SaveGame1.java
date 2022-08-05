package quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;

import myobj.rps.Shape;

public class E07_SaveGame1 {
	/*
	 컴퓨터와의 간단한 가위바위보 게임을 하나 만들고, 게임 종료시 전적을 파일에 저장해보세요
	 게임을 다시 실행하면 예전 전적이 그대로 반영되도록 만들어보세요 
	 강사님 풀이
	 */
	public static void main(String[] args) {
		File saveFile = new File("files/save.rps");
		// 승무패를 로그에 찍고 싶을 때
		File logFile = new File("files/rps.log");
		
		int win = 0, draw = 0, lose = 0;
		
		try {
			FileReader in = new FileReader(saveFile);
			
			char[] buffer = new char[50];
			
			int len = in.read(buffer);
			
			String data = new String(buffer, 0 , len);
			
			String[] record = data.split("/");
			
			win = Integer.parseInt(record[0]);
			draw = Integer.parseInt(record[1]);
			lose = Integer.parseInt(record[2]);
			
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("세이브 파일을 찾을 수 없어서 처음부터 시작합니다.");
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		// 파일로 저장하는 것 == 컴퓨터 하드 디스크에 데이터를 세기는 것

		try {
			FileWriter out = new FileWriter(logFile,true);
			
		for (int i = 0; i < 10; i++) {
			Shape com = Shape.random();
			Shape user = Shape.random();

			out.write(String.format("컴퓨터 [%s] vs 유저 [%s]로 ", com,user));
			switch (Shape.versus(com, user)) {
			case 1:
				System.out.println("com이 이겼습니다.");
				out.write("컴퓨터 승리");
				lose++;
				break;
			case -1:
				System.out.println("user가 이겼습니다.");
				out.write("유저 승리");
				win++;
				break;
			case 0:
				System.out.println("비겼습니다.");
				out.write("무승부");
				draw++;
				break;
			}
			out.append("\t-" + LocalTime.now() + "\n");
		}
		
		out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileWriter out = new FileWriter(saveFile);
			
			out.append(String.format("%d/%d/%d", win,draw,lose));
			
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.printf("%d승 %d무 %d패로 10판이 끝났습니다.",win,draw,lose);
		System.out.println("전적을 저장합니다..");
	}
}
