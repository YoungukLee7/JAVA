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
		
		// 기능이 없는 출력을 위한 컴포넌트
		JLabel label = new JLabel("Hello");
		
		// SwingConstants : 스윙에서 사용되는 여러 상수들이 모여있음
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		String[] animals = {"Saza","GoyangE","Penguimn", "Girin","Dog"};
		
		
		// 마우스 휠 이벤트
		btn1.addMouseWheelListener(new MouseWheelListener() {
			int index = 0;
			
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				// 마우스 휠을 올리면 -1이고 내리면 1인것을 이용하여 풀었다
				if (e.getWheelRotation() < 0) {
					return;
				}
				
				label.setText(animals[(index += e.getWheelRotation()) % animals.length]);
				
				
//				switch (e.getWheelRotation()) {
//				case 1:
//					label.setText("방금 마우스 휠을 내렸습니다!");
//					break;
//				case -1:
//					label.setText("방금 마우스 휠을 올렸습니다!");
//					break;
//				} 
			}
		});
		
		
		// MouseListener처럼 너무 많은 메서드를 구현해야하는 인터페이스들을 위해
		// Adapter 클래스들이 존재한다 (쓰고 싶은 것만 사용 가능하다)
		btn2.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("마우스가 범위에 들어옴");
				label.setForeground(Color.red);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("마우스가 범위에서 나감");
				label.setForeground(Color.black);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("클릭");
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("마우스 버튼을 놓음");
			}
		});
		
		// 키보드 이벤트
		btn2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("키를 눌렀다 땠습니다. : " + e);
				
				System.out.println("방금 누른 문자 : " + e.getKeyChar());
				
				System.out.println("쉬프트 키가 눌려있나요? : " + e.isShiftDown());
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
