package gui.quiz;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import gui.quiz.action.GugudanButtenAction;

public class S03_Gugudan1 {
	/*
	  실행하면 구구단이 출력되는 GUI 프로그램을 만들어보세요
	  
	  1. 프로그램을 실행하면 2단이 출력되어 있는 상태로 시작한다
	  2. + 버튼을 누르면 단이 증가한 구구단이 출력된다 (최대 19단 까지)
	  3. - 버튼을 누르면 단이 감소한 구구단이 출력된다 (최소 2단까지)
	  강사님 풀이
	 */
	public static void main(String[] args) {
		JFrame gugudanFrame = new JFrame("구구단");
		
		JButton[] gugudanButten = new JButton[9];

		JButton plusButton = new JButton("+");
		JButton minusButton = new JButton("-");
		
		for (int i = 0; i < 9; i++) {
			gugudanButten[i] = new JButton(String.format("%d X %d = %d", 2, i + 1, 2 * (i + 1)));
			
			gugudanButten[i].setBounds(0, 0 + 40 * i, 300, 40);
			
			gugudanFrame.add(gugudanButten[i]);
		}
		
		ActionListener gugudanAction = new GugudanButtenAction(gugudanButten);
		
		plusButton.setBounds(300,0,54,180);
		plusButton.addActionListener(gugudanAction);
		
		minusButton.setBounds(300,180,54,180);
		minusButton.addActionListener(gugudanAction);
		
		
		gugudanFrame.add(plusButton);
		gugudanFrame.add(minusButton);
		
		// setResizable(false) : 크기 변경 막아주기 (고정)
		gugudanFrame.setResizable(false);
		gugudanFrame.setLayout(null);
		gugudanFrame.setBounds(100, 100,369,398); // 레이아웃 쓰는것이 좋음 (무조건) 이유는 모서리 마추기 어려움
		gugudanFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gugudanFrame.setVisible(true);
	}
}
