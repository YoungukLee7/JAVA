package gui.component;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ColorStateButton extends JButton{
	
	private static Color[] bg_colors = {Color.white,Color.green,Color.yellow,Color.red,Color.black};
	private int state = 0;
	private int num;
	
	private static ActionListener eventListener = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			ColorStateButton performedButton = (ColorStateButton)e.getSource();
			performedButton.change();
		}
	};
	
	public ColorStateButton(int num) {
		// super("button" + num);
		this.num = num;
		
		addActionListener(eventListener);
		
		setText("button" + num);
		setBackground(bg_colors[state]);
	}
	
	public void change() {
		if (state < bg_colors.length - 1) {
			setBackground(bg_colors[++state]);
		}
	}
}
