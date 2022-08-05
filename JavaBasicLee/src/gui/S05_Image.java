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
			
			// 라벨 기본 정렬이 왼쪽에 붙어있는 것이기 때문에 가운데 정렬하고 싶으면 이 코드를 넣는다
			label.setHorizontalAlignment(JLabel.CENTER);
			
			String[] marble = {"image/ironman.PNG"
								,"image/kaptain.PNG"
								,"image/hark.PNG"
								,"image/torr.PNG"
								,"image/black.PNG"
								,"image/hokeye.PNG"}; 
			
			// 강사님 풀이
			ArrayList<ImageIcon> icons = new ArrayList<>();
			
			File imageDir = new File("image/");
			
			for (File image : imageDir.listFiles()) {
				icons.add(new ImageIcon(image.getAbsolutePath()));
			} 
			
			// 연습문제 : 버튼을 누르면 여러 그림들이 순차적으로 순환되되록 만들어보세요
			button.addActionListener(new ActionListener() {
				int index = 0;
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// label의 이미지 변경
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
//			add(label, "CENTER"); 이렇게도 가능
			add(button, "South");
			
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setBounds(1400,100,500,500);
			setVisible(true);
		}
	
		public static void main(String[] args) {
			new S05_Image();
			
		}
}
