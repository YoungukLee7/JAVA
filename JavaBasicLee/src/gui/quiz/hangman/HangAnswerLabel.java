package gui.quiz.hangman;

import java.awt.Font;

import javax.swing.JLabel;

public class HangAnswerLabel extends JLabel{

	String answer;
	boolean[] check;
	
	public HangAnswerLabel() {
		setFont(new Font("Consolas", Font.BOLD, 25));
		setHorizontalAlignment(CENTER);
	}
	
	// ���� �´��� Ȯ��
	public boolean checkAnswer(String cmd) {
		boolean found = false;
		int index = -1;
		
		// ��ҹ��� �����ϱ� ������ �빮�ڷ� �ٲ��ش�
		String upperAnswer = answer.toUpperCase();
		
		while ((index = upperAnswer.indexOf(cmd, index + 1)) != -1) {
			check[index] = true;
			found = true;
		}
		setText(getBlank());
		return found;
	}
	
	// C Programmer => _  _ _ _ _ _ _ ...
	private String getBlank() {
		StringBuilder blank = new StringBuilder();
		
		for (int i = 0, len = answer.length(); i < len; i++) {
			char ch = answer.charAt(i);
			if (check[i]) {
				blank.append(ch + " ");
			}else if (ch == ' ') {
				blank.append("  ");
			} else {
				blank.append("_ ");
			}
		}
		
		return blank.toString();
		
	}
	
	public void update(String answer) {
		this.answer = answer;
		this.check = new boolean[answer.length()];
		setText(getBlank());
	}
}
