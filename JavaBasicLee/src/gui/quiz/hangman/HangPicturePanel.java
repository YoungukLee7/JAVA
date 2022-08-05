package gui.quiz.hangman;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

// ��� �׸� �г�
public class HangPicturePanel extends JPanel{
	
	CardLayout cardLayoutManager = new CardLayout(20, 20);
	
	public HangPicturePanel() {
		System.out.println("�г� ���� : " + this.getWidth());
		System.out.println("�г� ���� : " + this.getHeight());
		
		add(new HangImageLabel("image/apple.jpg"));
		add(new HangImageLabel("image/banana.jpeg"));
		add(new HangImageLabel("image/mango.jpg"));
		add(new HangImageLabel("image/peach.jfif"));
		
		setLayout(cardLayoutManager);
		setBackground(Color.black);
	}
}
