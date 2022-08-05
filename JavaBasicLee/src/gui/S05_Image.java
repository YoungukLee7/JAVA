package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class S05_Image extends JFrame{

		public S05_Image() {
			super("Image test frame");
			
			JLabel label = new JLabel("wait for click");
			JButton button = new JButton("My button");
			
			// �� �⺻ ������ ���ʿ� �پ��ִ� ���̱� ������ ��� �����ϰ� ������ �� �ڵ带 �ִ´�
			label.setHorizontalAlignment(JLabel.CENTER);
			
			String[] marble = {"image/ironman.PNG"
								,"image/kaptain.PNG"
								,"image/hark.PNG"
								,"image/torr.PNG"
								,"image/black.PNG"
								,"image/hokeye.PNG"}; 
			
			// ����� Ǯ��
			ArrayList<ImageIcon> icons = new ArrayList<>();
			
			File imageDir = new File("image/");
			
			for (File image : imageDir.listFiles()) {
				icons.add(new ImageIcon(image.getAbsolutePath()));
			} 
			
			// �������� : ��ư�� ������ ���� �׸����� ���������� ��ȯ�ǵǷ� ��������
			button.addActionListener(new ActionListener() {
				int index = 0;
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// label�� �̹��� ����
					// label.setIcon(new ImageIcon("image/groote.jfif"));
					
//					label.setIcon(new ImageIcon(marble[index]));
//					label.setText("");
//					index++;
//					if (index == marble.length) {
//						index = 0;
//					}
					ImageIcon icon = icons.remove(0);
					icons.add(icon);
					label.setIcon(icon);
					label.setText("");
				}
			});
			
			
			
			add(label, BorderLayout.CENTER);
//			add(label, "CENTER"); �̷��Ե� ����
			add(button, "South");
			
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setBounds(1400,100,500,500);
			setVisible(true);
		}
	
		public static void main(String[] args) {
			new S05_Image();
			
		}
}
