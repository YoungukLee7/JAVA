package gui.quiz.hangman;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import gui.quiz.hangman.event.EnglishButtonEvent;

public class HangMainFrame extends JFrame{
	HangPicturePanel picturePanel = new HangPicturePanel();
	HangEnglishPanel englishPanel = new HangEnglishPanel();
	
	String[] words = {"Programming", "C Language", "Python Programming", "Web Designer"};
	
	// �������� ��� ������Ʈ�� ��Ʈ�� �� �� �ִ� �޼���� ���� (main���� ��Ʈ���ϴ� ���� �ּ��̴�) �ٸ� ��Ű���� �ֱ� ������ �̷��� �ؾ��Ѵ�
	public void nextPicture() {
		picturePanel.cardLayoutManager.next(picturePanel);
	}
	
	public void newGame() {
		englishPanel.answerLabel.update(words[(int)(Math.random() * words.length)]);
	}
	
	public boolean checkAnswer(String cmd) {
		return englishPanel.answerLabel.checkAnswer(cmd);
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public HangMainFrame() {
		setTitle("Hang Man");
		
		// �����ӿ� ������Ʈ �߰�
		// �׸��� �ٲ�� �г� (ī�� ���� �ƿ� ����)
		add(picturePanel, "Center");
		// (1) ������ �������� �� (_ _ _ A _ B B _)
		add(englishPanel, "South");
		
		// �����ӿ� ��� �̺�Ʈ �߰� (�ϸ鼭 �ش� �������� �ν��Ͻ��� �ѱ�)
		EnglishButtonEvent btnEvent = new EnglishButtonEvent(this);
		
		for (JButton btn : englishPanel.getAllKey()) {
			btn.addActionListener(btnEvent);
		}
		
		
		// ������ ���� �ʱ�ȭ ����
		newGame();
		setResizable(false);
		setBounds(500,100,800,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}
