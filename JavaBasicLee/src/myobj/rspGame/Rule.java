package myobj.rspGame;

public class Rule {

	
	RpsPlayer cpuNum = new RpsPlayer(); // 컴퓨터 승무패 저장
	RpsPlayer playerNum = new RpsPlayer(); // 플레이어 승무패 저장
	
	public void cpuScore() { // 컴퓨터 승무패 print
		cpuNum.print();
	}
	
	public void playerScore() { // 플레이어 승무패 print
		playerNum.print();
	}
	
	
	private String[] rockScissorsPaper = {"주먹","가위","보"};
	
	private String cpuPlayer() { // cpu 랜덤으로 가위바위보 내기
		String cpu = rockScissorsPaper[(int)(Math.random()*3)];
		return cpu;
	}
	
	
	public void rock() { // 플레이어가 주먹 
		String cpu = cpuPlayer();
		System.out.printf("딜러    : %s\n",cpu);
		if (cpu == "주먹") {
			System.out.println("플레이어 : 주먹");
			System.out.println("비겼습니다.");
			cpuNum.draw();
			playerNum.draw();
		}else if (cpu == "가위") {
			System.out.println("플레이어 : 주먹");
			System.out.println("이겼습니다.");
			cpuNum.lose();
			playerNum.win();
		}else if(cpu == "보"){
			System.out.println("플레이어 : 주먹");
			System.out.println("졌습니다.");
			cpuNum.win();
			playerNum.lose();
		}
	}
	
	public void scissors() { // 플레이어가 가위
		String cpu = cpuPlayer();
		System.out.printf("딜러    : %s\n",cpu);
		if (cpu == "주먹") {
			System.out.println("플레이어 : 가위");
			System.out.println("졌습니다.");
			cpuNum.win();
			playerNum.lose();
		}else if (cpu == "가위") {
			System.out.println("플레이어 : 가위");
			System.out.println("비겼습니다.");
			cpuNum.draw();
			playerNum.draw();
		}else if(cpu == "보"){
			System.out.println("플레이어 : 가위");
			System.out.println("이겼습니다.");
			cpuNum.lose();
			playerNum.win();
		}
	}
	
	public void paper() { // 플레이어가 보
		String cpu = cpuPlayer();
		System.out.printf("딜러    : %s\n",cpu);
		if (cpu == "주먹") {
			System.out.println("플레이어 : 보");
			System.out.println("이겼습니다.");
			cpuNum.lose();
			playerNum.win();
		}else if (cpu == "가위") {
			System.out.println("플레이어 : 보");
			System.out.println("졌습니다.");
			cpuNum.win();
			playerNum.lose();
		}else if(cpu == "보"){
			System.out.println("플레이어 : 보");
			System.out.println("비겼습니다.");
			cpuNum.draw();
			playerNum.draw();
		}
	}
	
	
}
