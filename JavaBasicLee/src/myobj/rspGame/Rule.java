package myobj.rspGame;

public class Rule {

	
	RpsPlayer cpuNum = new RpsPlayer(); // ��ǻ�� �¹��� ����
	RpsPlayer playerNum = new RpsPlayer(); // �÷��̾� �¹��� ����
	
	public void cpuScore() { // ��ǻ�� �¹��� print
		cpuNum.print();
	}
	
	public void playerScore() { // �÷��̾� �¹��� print
		playerNum.print();
	}
	
	
	private String[] rockScissorsPaper = {"�ָ�","����","��"};
	
	private String cpuPlayer() { // cpu �������� ���������� ����
		String cpu = rockScissorsPaper[(int)(Math.random()*3)];
		return cpu;
	}
	
	
	public void rock() { // �÷��̾ �ָ� 
		String cpu = cpuPlayer();
		System.out.printf("����    : %s\n",cpu);
		if (cpu == "�ָ�") {
			System.out.println("�÷��̾� : �ָ�");
			System.out.println("�����ϴ�.");
			cpuNum.draw();
			playerNum.draw();
		}else if (cpu == "����") {
			System.out.println("�÷��̾� : �ָ�");
			System.out.println("�̰���ϴ�.");
			cpuNum.lose();
			playerNum.win();
		}else if(cpu == "��"){
			System.out.println("�÷��̾� : �ָ�");
			System.out.println("�����ϴ�.");
			cpuNum.win();
			playerNum.lose();
		}
	}
	
	public void scissors() { // �÷��̾ ����
		String cpu = cpuPlayer();
		System.out.printf("����    : %s\n",cpu);
		if (cpu == "�ָ�") {
			System.out.println("�÷��̾� : ����");
			System.out.println("�����ϴ�.");
			cpuNum.win();
			playerNum.lose();
		}else if (cpu == "����") {
			System.out.println("�÷��̾� : ����");
			System.out.println("�����ϴ�.");
			cpuNum.draw();
			playerNum.draw();
		}else if(cpu == "��"){
			System.out.println("�÷��̾� : ����");
			System.out.println("�̰���ϴ�.");
			cpuNum.lose();
			playerNum.win();
		}
	}
	
	public void paper() { // �÷��̾ ��
		String cpu = cpuPlayer();
		System.out.printf("����    : %s\n",cpu);
		if (cpu == "�ָ�") {
			System.out.println("�÷��̾� : ��");
			System.out.println("�̰���ϴ�.");
			cpuNum.lose();
			playerNum.win();
		}else if (cpu == "����") {
			System.out.println("�÷��̾� : ��");
			System.out.println("�����ϴ�.");
			cpuNum.win();
			playerNum.lose();
		}else if(cpu == "��"){
			System.out.println("�÷��̾� : ��");
			System.out.println("�����ϴ�.");
			cpuNum.draw();
			playerNum.draw();
		}
	}
	
	
}
