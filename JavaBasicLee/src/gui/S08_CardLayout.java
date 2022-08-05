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
		
		// CardLayout : 카드처럼 다음 컴포넌트로 넘기는 기능이 있는 레이아웃
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
				// next(parent) : 버튼을 누를때마다 카드 레이아웃을 다음으로 넘김
				// cardLayoutManager.next(panel); // CardLayout을 조작할 때는 어느 컨테이너를 조작해야 하는지 매개변수로 알려줘야 한다
				
				// previous(parent) : 카드레이아웃을 이전으로 넘기기
				// cardLayoutManager.previous(panel);
				
				// first(parent) : 첫번째 카드로 이동하기
				// cardLayoutManager.first(panel);
				
				// last(parent) : 마지막 카드로 이동하기
				// cardLayoutManager.last(panel);
				
				// show(parent, cardName) : 원하는 카드로 이동하기. 컨테이너에 추가할 때 붙였던 이름이 필요하다
				// 카드 이름은 대소문자를 엄격히 구분한다
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
