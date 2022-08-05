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
	
	// 프레임의 모든 컴포넌트를 컨트롤 할 수 있는 메서드들 모음 (main에서 컨트롤하는 것이 최선이다) 다른 패키지에 있기 때문에 이렇게 해야한다
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
		
		// 프레임에 컴포넌트 추가
		// 그림이 바뀌는 패널 (카드 레이 아웃 예정)
		add(picturePanel, "Center");
		// (1) 정답이 보여지는 라벨 (_ _ _ A _ B B _)
		add(englishPanel, "South");
		
		// 프레임에 모든 이벤트 추가 (하면서 해당 프레임의 인스턴스를 넘김)
		EnglishButtonEvent btnEvent = new EnglishButtonEvent(this);
		
		for (JButton btn : englishPanel.getAllKey()) {
			btn.addActionListener(btnEvent);
		}
		
		
		// 프레임 관련 초기화 설정
		newGame();
		setResizable(false);
		setBounds(500,100,800,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}
