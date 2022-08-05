package gui.component;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImageLabal extends JLabel{
	
	public ImageLabal(String path) {
		setIcon(new ImageIcon(path));
	}
}
