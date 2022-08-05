package gui;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.tree.DefaultTreeCellEditor.EditorContainer;

import gui.component.ColorStateButton;
import oracle.net.aso.c;

public class S06_GridLayout extends JFrame{

	public S06_GridLayout() {
		LayoutManager manager = new GridLayout(5,10);
		
		
		// 연습문제 : 각 버튼을 누를 때마다 순서대로 색이 변하게 만들어보세요
		// 내가 푼것
		ActionListener eventListener = new ActionListener() {
			int index;
			Color[] colors = {Color.green,Color.yellow,Color.red,Color.black};
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// e.getSource() : 이벤트가 발생한 객체를 담고있다. 사용하려면 다운캐스팅이 필요하다
				// System.out.println(e.getSource());
				
				JButton performedButton = (JButton)e.getSource();
				// getForeground() : 현재 색깔 상태
				Color color = performedButton.getForeground();
				
				if (color == colors[3]) {
					index = 3;
				}else if (color == colors[2]) {
					index = 3;
				}else if (color == colors[1]) {
					index = 2;
				}else if (color == colors[0]) {
					index = 1;
				}else {
					index = 0;
				}
				
				performedButton.setForeground(colors[index]);
			}
		};
		
		for (int i = 0; i < 50; i++) {
			// 내가 푼것
			// JButton button = new JButton("Button" + (i + 1));
			// button.addActionListener(eventListener);
			
			
			JButton button = new ColorStateButton(i + 1);
			add(button);
		}
		
		setLayout(manager);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(900,100,1000,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new S06_GridLayout();
	}
}
