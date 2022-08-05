package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;

public class S09_JTable extends JFrame{

	public S09_JTable() {
		
		String[][] rowData = {
				{"아메리카노","1500"},
				{"카페라때","2500"},
				{"레몬에이드","3000"},
				{"에스프레소","2500"},
		};
		
		String[] coloumNames = {"Coffee Name", "Price"};
		
		// JTable은 ScrollPane에 붙여야 제대로 나온다
		JTable table = new JTable(rowData, coloumNames);
		JButton south = new JButton("Print console");
		
		// 테이블 수정 막기
		// table.setEnabled(false);
		
		// 테이블 선택 이벤트 처리하기
		
		// ListSelectionModel : 테이블 선택에 관련된 설정을 할 수 있는 모델
		ListSelectionModel selectionModel = table.getSelectionModel();
		
		// selectionModel : 선택 모드를 설정할 수 있다
		selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		// selectionModel.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		
		// CellSelection : 한 셀만 선택할 수 있도록 설정
		table.setCellSelectionEnabled(true);
		
		// 테이블 선택 이벤트
		selectionModel.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (!e.getValueIsAdjusting()) {
					System.out.println("select row : " + table.getSelectedRow());
					System.out.println("select col : " + table.getSelectedColumn());
				}else {
					System.out.println("Adjusting... (마우스를 꾹 누르고 조정중)");
					
					System.out.println("Adjusting firstIndex : " + e.getFirstIndex());
					System.out.println("Adjusting lastIndex : " + e.getLastIndex());
				}
			}
		});
		
		// System.out.println("선택 모드 : " + selectionModel.getSelectionMode());
		
		// 특정 컴포넌트를 스크롤 가능한 형태로 보여주기 위해 사용한다
		JScrollPane scrollPane = new JScrollPane(table);
		
		add(scrollPane, "Center");
		add(south,"South");

		// 테이블 내부의 데이터 콘솔에서 보기
		south.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 테이블 데이터 정보는 table.getModel();
				TableModel model = table.getModel();
				
				int colCount = model.getColumnCount();
				int rowCount = model.getRowCount();
				
				System.out.println("컬럼 : " + model.getColumnCount());
				System.out.println("행 : " + model.getRowCount());
				
				for (int row = 0; row < rowCount; row++) {
					for (int col = 0; col < colCount; col++) {
						System.out.println(model.getValueAt(row, col) + "\t");
					}
					System.out.println();
				}
			}
		});
		
		setBounds(500,100,500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new S09_JTable();
	}
}
