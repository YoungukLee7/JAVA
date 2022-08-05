package myobj.BlackJack;

public class Player1 {

	private int money;
	private int win;
	private int draw;
	private int lose;
	private int betmoney;
	
	public  Player1() { // 플레이어는 돈 5000원 시작 일단 이거 안씀
		money = 5000;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void betting(int betmoney) { // 배팅
		this.betmoney = betmoney;
	}
	
	public void win() { // 이기면 
		win++;
		money += betmoney;
	}
	
	public void draw() { // 비기면
		draw++;
	}
	
	public void lose() { // 지면
		lose++;
		money -= betmoney;
	}
	
	@Override
	public String toString() {
		return String.format("보유 머니: %d\n," + "승률: %.2f", 
								money,(double)win / (win + lose + draw));
	}
}
