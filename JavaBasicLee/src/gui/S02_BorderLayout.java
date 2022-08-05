package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S02_BorderLayout {
	
	/*
	 	컴포넌트를 배치할 수 있는 컨테이너에는 레이아웃을 설정할 수 있다
	 	
	 	# BorderLayout
	 	- 동서남북과 가운데로 이루어진 레이아웃
	 	- JFrame의 기본값
	 	
	 	# 
	 */
	public static void main(String[] args) {
		JFrame f = new JFrame("BorderLayout Test");
		
		BorderLayout manager = new BorderLayout();
		
		// 레이아웃의 컴포넌트 사이의 거리를 설정
		manager.setHgap(5);  // Horizontal (수평)
		manager.setVgap(10); // Vertical   (수직)
		
		f.setLayout(manager);
		
		f.add(new JButton("btn1"), BorderLayout.CENTER);
		f.add(new JButton("btn2"), BorderLayout.EAST);
		f.add(new JButton("btn3"), BorderLayout.WEST);
		f.add(new JButton("btn33"), BorderLayout.WEST);
		f.add(new JButton("btn4"), BorderLayout.SOUTH);
		f.add(new JButton("btn5"), BorderLayout.NORTH);
		
		f.setLocation(100, 100);
		f.setSize(500,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
