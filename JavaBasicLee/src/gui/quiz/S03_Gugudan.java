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
	  실행하면 구구단이 출력되는 GUI 프로그램을 만들어보세요
	  
	  1. 프로그램을 실행하면 2단이 출력되어 있는 상태로 시작한다
	  2. + 버튼을 누르면 단이 증가한 구구단이 출력된다 (최대 19단 까지)
	  3. - 버튼을 누르면 단이 감소한 구구단이 출력된다 (최소 2단까지)
	 */
	
	JButton mainBtn = new JButton();
	JButton plusBtn = new JButton();
	JButton minusBtn = new JButton();
	int cnt = 2;
	
	public S03_Gugudan() {
		mainBtn.setText(gogodan(cnt));
		plusBtn.setText("Plus");
		minusBtn.setText("Minus");
		
		mainBtn.setFont(new Font("보통", Font.PLAIN, 80));
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
		
		setTitle("구구단");
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























