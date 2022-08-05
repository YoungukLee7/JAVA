package gui;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class S10_ComboBox extends JFrame{

	public S10_ComboBox() {
		setTitle("ComboBox Example");
		
		JComboBox<String> combo = new JComboBox<>();
		
		combo.setBounds(50,50,100,20);
		combo.addItem("Apple");
		combo.addItem("Banana");
		combo.addItem("Orange");
		combo.addItem("Kiwi");
		
		add(combo);
		
		// �޺� �ڽ��� ������ ������
		combo.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// ������ ������ �ٲ� ������ ���õ� �����۰� ���� ������ �������� �̺�Ʈ�� �����Ѵ�
				switch (e.getStateChange()) {
				case ItemEvent.SELECTED:
					System.out.println("SELECTED: " + e.getItem());
					break;
				case ItemEvent.DESELECTED:
					System.out.println("DESELECTED: " + e.getItem());
					break;
				}
				
				
				System.out.println(e.getItem());
			}
		});
		
		setLayout(null);
		setBounds(500,100,500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new S10_ComboBox();
	}
}
