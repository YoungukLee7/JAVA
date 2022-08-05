package hangman;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HangmanSystem extends JFrame{
	
	public HangmanSystem() {
		// �г� 2������
		JPanel panel = new JPanel(new BorderLayout());
		JPanel panel2 = new JPanel(new BorderLayout());
		// �ܾ� �޼���
		Word word = new Word();
		// �̹��� �޼���
		Image image = new Image();
		// ���ĺ� ��ư
		JButton[] button = new JButton[26];
		// �� �߰�
		JLabel label = new JLabel("test");
		
		image.BasicImage(label);
		
		JButton button2 = new JButton(word.wordNum());
		panel.add(button2, "South");
		panel.add(label, "Center");
		
		for (int i = 0, j = 0, k = 0; i < button.length; i++) {
			button[i] = new JButton((char)(65 + i) + "");
			button[i].addActionListener(word.check(button2, label, panel2));
			
			if (i < 9) {
				button[i].setBounds(0, 0 + 45 * i, 170, 55);
				panel2.add(button[i]);
			}else if (i < 18) {
				button[i].setBounds(170, 0 + 45 * j, 170, 55);
				panel2.add(button[i]);
				j++;
			}else if (i >= 18){
				button[i].setBounds(340, 0 + 45 * k, 170, 55);
				panel2.add(button[i]);
				k++;
			}
		}
		
		add(panel);
		add(panel2);
		
		setTitle("HangMan");
		setResizable(false);
		setLayout(new GridLayout(2,1));
		panel2.setLayout(new GridLayout(3, 9));
		setBounds(1300,0,525,850);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new HangmanSystem();
	}
}
