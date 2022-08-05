package gui.quiz;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import gui.quiz.action.GugudanButtenAction;

public class S03_Gugudan1 {
	/*
	  �����ϸ� �������� ��µǴ� GUI ���α׷��� ��������
	  
	  1. ���α׷��� �����ϸ� 2���� ��µǾ� �ִ� ���·� �����Ѵ�
	  2. + ��ư�� ������ ���� ������ �������� ��µȴ� (�ִ� 19�� ����)
	  3. - ��ư�� ������ ���� ������ �������� ��µȴ� (�ּ� 2�ܱ���)
	  ����� Ǯ��
	 */
	public static void main(String[] args) {
		JFrame gugudanFrame = new JFrame("������");
		
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
		
		// setResizable(false) : ũ�� ���� �����ֱ� (����)
		gugudanFrame.setResizable(false);
		gugudanFrame.setLayout(null);
		gugudanFrame.setBounds(100, 100,369,398); // ���̾ƿ� ���°��� ���� (������) ������ �𼭸� ���߱� �����
		gugudanFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gugudanFrame.setVisible(true);
	}
}
