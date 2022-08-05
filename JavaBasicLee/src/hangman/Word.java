package hangman;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Word {
	
	static Image image = new Image();
	private static String[] word = {"N U M B E R","E A R T H","O C E A N","S E C T I O N","D A N G E R","M A C H I N E"};
	static String randomWord;
	static String wordNumber;

	// 랜덤 단어 뽑는 메서드
	public Word() {
		randomWord = word[(int)(Math.random()*word.length)];
	}
	
	// 랜덤 단어 글자수 표시 메서드
	public String wordNum() {
		int wordnum = randomWord.length();
		if (wordnum == 9) {
			wordNumber = "_ _ _ _ _";
		}else if (wordnum == 11) {
			wordNumber = "_ _ _ _ _ _";
		}else if (wordnum == 13) {
			wordNumber = "_ _ _ _ _ _ _";
		}
		return wordNumber;
	}
	
	public ActionListener check(JButton button, JLabel label, JPanel panel) {
		ActionListener eventListener = new ActionListener() {
			int index;
			Color colors = Color.red;

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton buttonKey = (JButton)e.getSource();
//				buttonColor.setForeground(colors);
				
				// 랜덤 생성 단어에 이 단어가 있다면
				if (randomWord.contains(e.getActionCommand())) {
					// 어느 자리에 있는지 찾기
					index = randomWord.indexOf(e.getActionCommand());
					
					if (index == 0) {
						wordNumber = e.getActionCommand() + wordNumber.substring(1, wordNumber.length());
						button.setText(wordNumber);
						buttonKey.setEnabled(false);
					} else if (index == 2) {
						wordNumber = wordNumber.substring(0, 2) + e.getActionCommand() + wordNumber.substring(3, wordNumber.length());
						button.setText(wordNumber);
						buttonKey.setEnabled(false);
					} else if (index == 4) {
						wordNumber = wordNumber.substring(0, 4) + e.getActionCommand() + wordNumber.substring(5, wordNumber.length());
						button.setText(wordNumber);
						buttonKey.setEnabled(false);
					} else if (index == 6) {
						wordNumber = wordNumber.substring(0, 6) + e.getActionCommand() + wordNumber.substring(7, wordNumber.length());
						button.setText(wordNumber);
						buttonKey.setEnabled(false);
					} else if (index == 8) {
						wordNumber = wordNumber.substring(0, 8) + e.getActionCommand() + wordNumber.substring(9, wordNumber.length());
						button.setText(wordNumber);
						buttonKey.setEnabled(false);
					} else if (index == 10) {
						wordNumber = wordNumber.substring(0, 10) + e.getActionCommand() + wordNumber.substring(11, wordNumber.length());
						button.setText(wordNumber);
						buttonKey.setEnabled(false);
					} else if (index == 12) {
						wordNumber = wordNumber.substring(0, 12) + e.getActionCommand() + wordNumber.substring(13, wordNumber.length());
						button.setText(wordNumber);
						buttonKey.setEnabled(false);
					}
				} else {
					image.nextImage(label, panel);
					buttonKey.setEnabled(false);
				}
			if (wordNumber.contains(randomWord)) {
				image.winImage(label);
				panel.setVisible(false);
				return;
			}
			}
		};
		return eventListener;
	}
	
	public String getRandomWord() {
		return randomWord;
	}
}
	












