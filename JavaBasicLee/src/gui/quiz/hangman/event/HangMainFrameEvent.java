package gui.quiz.hangman.event;

import java.awt.event.ActionListener;

import gui.quiz.hangman.HangMainFrame;

// �� Ŭ������ ��ӹ޴� Ŭ�������� ActionListener�̸鼭 main�� ������� ������ �ְ� �ȴ� 
abstract public class HangMainFrameEvent implements ActionListener{

	HangMainFrame main;
	
	public HangMainFrameEvent(HangMainFrame main) {
		this.main = main;
	}
	
}
