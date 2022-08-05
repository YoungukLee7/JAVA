package gui.quiz.hangman;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

// 행맨 그림 패널
public class HangPicturePanel extends JPanel{
	
	CardLayout cardLayoutManager = new CardLayout(20, 20);
	
	public HangPicturePanel() {
		System.out.println("패널 넓이 : " + this.getWidth());
		System.out.println("패널 높이 : " + this.getHeight());
		
		add(new HangImageLabel("image/apple.jpg"));
		add(new HangImageLabel("image/banana.jpeg"));
		add(new HangImageLabel("image/mango.jpg"));
		add(new HangImageLabel("image/peach.jfif"));
		
		setLayout(cardLayoutManager);
		setBackground(Color.black);
	}
}
