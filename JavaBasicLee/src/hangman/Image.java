package hangman;


import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Image{
	int cnt = 1;
	
	// 게임 이미지
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
	
	// 기본 시작 이미지
	public void BasicImage(JLabel label) {
		label.setIcon(new ImageIcon(gameImage[0]));
		label.setText("");
	}
	
	// 사용자가 이겼을 때
	public void winImage(JLabel label) {
		label.setIcon(new ImageIcon(gameImage[8]));
		label.setText("");
	}
	
	// 사용자가 틀렸을 때 
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
