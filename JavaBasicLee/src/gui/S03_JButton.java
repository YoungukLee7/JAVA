package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class S03_JButton extends JFrame {
	
	JButton mainBtn = new JButton();
	JButton subBtn = new JButton();
	
	
	public S03_JButton() {
		mainBtn.setText("main");
		subBtn.setText("click!");
		
		// 글꼴 설정 (글꼴 보는 곳 : c드라이브 > 윈도우즈 > 폰트)
		                       // 글꼴 이름,    글꼴 색깔,  글꼴 크기
		mainBtn.setFont(new Font("Castellar", Font.PLAIN, 200));
		subBtn.setFont(new Font("Castellar", Font.PLAIN, 50));
		
		// 색상 설정
		mainBtn.setForeground(new Color(0xFFFFFF));
		mainBtn.setBackground(new Color(0x000000));
		
		// 버튼 이벤트 설정 (액션 리스너)
		subBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mainBtn.setText(Integer.toString((int)(Math.random() * 100)));
			}
		});
		
		add(mainBtn, BorderLayout.CENTER);
		add(subBtn, BorderLayout.EAST);
		
		setTitle("JButton Practice!!");
		setLocation(100,100);
		setSize(1000,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new S03_JButton();
	}
}
