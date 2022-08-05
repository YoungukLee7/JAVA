package gui;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class S12_JTextArea extends JFrame{
	public S12_JTextArea() {
		setTitle("JTextArea Sample");
		
		JTextArea area = new JTextArea(10, 10);
		JLabel areaState = new JLabel();
		
		// �ڵ� �� �ٲ� ����
		area.setLineWrap(true);
		area.setFont(new Font("Consolas", Font.PLAIN, 15));
		
		// �� ũ�� ����
		area.setTabSize(4);
		
		// setCursor : �ش� ������Ʈ ���� ���콺�� �ö� ���� �� ���콺 Ŀ���� ����
		area.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		// Ű���� Ŀ���� ������ ������ �߻��ϴ� �̺�Ʈ (���� �ߴ°��� ������ �߰� �Ϸ��� �׸��� ���̾ƿ����� ����� ���)
		area.addCaretListener(new CaretListener() {
			
			@Override
			public void caretUpdate(CaretEvent e) {
				areaState.setText("" + area.getCaretPosition());
			}
		});
		
		area.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				String text = area.getText();
				
				areaState.setText(String.format("characters : %d", text.length()));
				
			}
			
		});
		
		add(areaState, "North");
		add(area, "Center");
		
		setBounds(500,100,500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new S12_JTextArea();
	}
}
