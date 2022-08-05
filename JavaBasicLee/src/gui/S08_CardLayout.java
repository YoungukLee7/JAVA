package gui;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import gui.component.ImageLabal;

public class S08_CardLayout extends JFrame{
	 
	public S08_CardLayout() {
		setTitle("Card Layout");
		
		JButton button = new JButton("South Button");
		JPanel panel = new JPanel();
		
		// CardLayout : ī��ó�� ���� ������Ʈ�� �ѱ�� ����� �ִ� ���̾ƿ�
		CardLayout cardLayoutManager = new CardLayout();
		
		panel.setLayout(cardLayoutManager);
		
		panel.add("Apple", new ImageLabal("image/apple.jpg"));
		panel.add("Banana", new ImageLabal("image/banana.jpeg"));
		panel.add("Mango", new ImageLabal("image/mango.jpg"));
		panel.add("Peach", new ImageLabal("image/peach.jfif"));
		
		add(button, "South");
		add(panel, "Center");
		
		// Event Listeners
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// next(parent) : ��ư�� ���������� ī�� ���̾ƿ��� �������� �ѱ�
				// cardLayoutManager.next(panel); // CardLayout�� ������ ���� ��� �����̳ʸ� �����ؾ� �ϴ��� �Ű������� �˷���� �Ѵ�
				
				// previous(parent) : ī�巹�̾ƿ��� �������� �ѱ��
				// cardLayoutManager.previous(panel);
				
				// first(parent) : ù��° ī��� �̵��ϱ�
				// cardLayoutManager.first(panel);
				
				// last(parent) : ������ ī��� �̵��ϱ�
				// cardLayoutManager.last(panel);
				
				// show(parent, cardName) : ���ϴ� ī��� �̵��ϱ�. �����̳ʿ� �߰��� �� �ٿ��� �̸��� �ʿ��ϴ�
				// ī�� �̸��� ��ҹ��ڸ� ������ �����Ѵ�
				cardLayoutManager.show(panel, "Mango");
			}
		});
		
		setBounds(1300,100,500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new S08_CardLayout();
	}
}
