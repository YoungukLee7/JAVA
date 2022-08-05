package hangman;


import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Image{
	int cnt = 1;
	
	// ���� �̹���
	String[] gameImage = {"hangmanImage/oneYoung.PNG"
						 ,"hangmanImage/twoYoung.PNG"
						 ,"hangmanImage/threeYoung.PNG"
						 ,"hangmanImage/fourYoung.PNG"
						 ,"hangmanImage/fiveYoung.PNG"
						 ,"hangmanImage/sixYoung.PNG"
						 ,"hangmanImage/sevenYoung.PNG"
						 ,"hangmanImage/eighthYoung.PNG"
						 ,"hangmanImage/nineYoung.PNG"
						};
	
	// �⺻ ���� �̹���
	public void BasicImage(JLabel label) {
		label.setIcon(new ImageIcon(gameImage[0]));
		label.setText("");
	}
	
	// ����ڰ� �̰��� ��
	public void winImage(JLabel label) {
		label.setIcon(new ImageIcon(gameImage[8]));
		label.setText("");
	}
	
	// ����ڰ� Ʋ���� �� 
	public void nextImage(JLabel label, JPanel panel) {
		if (cnt == 7) {
			label.setIcon(new ImageIcon(gameImage[7]));
			panel.setVisible(false);
			return;
		}
		label.setIcon(new ImageIcon(gameImage[cnt]));
		label.setText("");
		cnt++;
	}
}
