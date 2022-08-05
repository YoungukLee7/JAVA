package gui.quiz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;


public class S03_Gugudan extends JFrame{
	/*
	  �����ϸ� �������� ��µǴ� GUI ���α׷��� ��������
	  
	  1. ���α׷��� �����ϸ� 2���� ��µǾ� �ִ� ���·� �����Ѵ�
	  2. + ��ư�� ������ ���� ������ �������� ��µȴ� (�ִ� 19�� ����)
	  3. - ��ư�� ������ ���� ������ �������� ��µȴ� (�ּ� 2�ܱ���)
	 */
	
	JButton mainBtn = new JButton();
	JButton plusBtn = new JButton();
	JButton minusBtn = new JButton();
	int cnt = 2;
	
	public S03_Gugudan() {
		mainBtn.setText(gogodan(cnt));
		plusBtn.setText("Plus");
		minusBtn.setText("Minus");
		
		mainBtn.setFont(new Font("����", Font.PLAIN, 80));
		plusBtn.setFont(new Font("Blackadder ITC", Font.PLAIN, 50));
		minusBtn.setFont(new Font("Blackadder ITC", Font.PLAIN, 50));
		
		mainBtn.setForeground(new Color(0x000000));
		mainBtn.setBackground(new Color(0xFFFFFF));
		
		plusBtn.setForeground(new Color(0xFFFFFF));
		plusBtn.setBackground(new Color(0x0000FF));
		
		minusBtn.setForeground(new Color(0xFFFFFF));
		minusBtn.setBackground(new Color(0xFF0000));
		
		plusBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (cnt == 19) {
					cnt--;
				}
				cnt++;
				mainBtn.setText(gogodan(cnt));
			}
		});
		
		minusBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (cnt == 2) {
					cnt++;
				}
				cnt--;
				mainBtn.setText(gogodan(cnt));
			}
		});
		
		add(mainBtn, BorderLayout.CENTER);
		add(plusBtn, BorderLayout.EAST);
		add(minusBtn, BorderLayout.WEST);
		
		setTitle("������");
		setLocation(100,100);
		setSize(1000,1050);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public String gogodan(int num) {
//		ArrayList<String> dan = new ArrayList<>();
//		for (int i = 1; i <= 9; i++) {
//			dan.add(num + " X " + i + " = " + num * i);
//		}
//		return dan.toString();
		
		String dan = "<HTML>" + num + " X " + 1 + " = " + num * 1 + "<br>" 
		+ num + " X " + 2 + " = " + num * 2 + "<br>" 
		+ num + " X " + 3 + " = " + num * 3 + "<br>" 
		+ num + " X " + 4 + " = " + num * 4 + "<br>" 
		+ num + " X " + 5 + " = " + num * 5 + "<br>" 
		+ num + " X " + 6 + " = " + num * 6 + "<br>" 
		+ num + " X " + 7 + " = " + num * 7 + "<br>" 
		+ num + " X " + 8 + " = " + num * 8 + "<br>" 
		+ num + " X " + 9 + " = " + num * 9 + "</HTML>";
		
		return dan;
	}
	
	
	
	public static void main(String[] args) {
		new S03_Gugudan();
	}
}























