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
		
		
		// �������� : �� ��ư�� ���� ������ ������� ���� ���ϰ� ��������
		// ���� Ǭ��
		ActionListener eventListener = new ActionListener() {
			int index;
			Color[] colors = {Color.green,Color.yellow,Color.red,Color.black};
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// e.getSource() : �̺�Ʈ�� �߻��� ��ü�� ����ִ�. ����Ϸ��� �ٿ�ĳ������ �ʿ��ϴ�
				// System.out.println(e.getSource());
				
				JButton performedButton = (JButton)e.getSource();
				// getForeground() : ���� ���� ����
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
			// ���� Ǭ��
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
