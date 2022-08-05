package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class S04_Event extends JFrame{
	
	public S04_Event() {
		super("Event!");
		
		JButton btn1 = new JButton("Button1");
		JButton btn2 = new JButton("Button2");
		
		// ����� ���� ����� ���� ������Ʈ
		JLabel label = new JLabel("Hello");
		
		// SwingConstants : �������� ���Ǵ� ���� ������� ������
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		String[] animals = {"Saza","GoyangE","Penguimn", "Girin","Dog"};
		
		
		// ���콺 �� �̺�Ʈ
		btn1.addMouseWheelListener(new MouseWheelListener() {
			int index = 0;
			
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				// ���콺 ���� �ø��� -1�̰� ������ 1�ΰ��� �̿��Ͽ� Ǯ����
				if (e.getWheelRotation() < 0) {
					return;
				}
				
				label.setText(animals[(index += e.getWheelRotation()) % animals.length]);
				
				
//				switch (e.getWheelRotation()) {
//				case 1:
//					label.setText("��� ���콺 ���� ���Ƚ��ϴ�!");
//					break;
//				case -1:
//					label.setText("��� ���콺 ���� �÷Ƚ��ϴ�!");
//					break;
//				} 
			}
		});
		
		
		// MouseListeneró�� �ʹ� ���� �޼��带 �����ؾ��ϴ� �������̽����� ����
		// Adapter Ŭ�������� �����Ѵ� (���� ���� �͸� ��� �����ϴ�)
		btn2.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("���콺�� ������ ����");
				label.setForeground(Color.red);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("���콺�� �������� ����");
				label.setForeground(Color.black);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Ŭ��");
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("���콺 ��ư�� ����");
			}
		});
		
		// Ű���� �̺�Ʈ
		btn2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("Ű�� ������ �����ϴ�. : " + e);
				
				System.out.println("��� ���� ���� : " + e.getKeyChar());
				
				System.out.println("����Ʈ Ű�� �����ֳ���? : " + e.isShiftDown());
			}
		});
		
		add(btn1, BorderLayout.WEST);
		add(btn2, BorderLayout.EAST);
		add(label, BorderLayout.CENTER);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100,100,500,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new S04_Event();
		
	}
}
