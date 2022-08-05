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
				{"�Ƹ޸�ī��","1500"},
				{"ī���","2500"},
				{"�����̵�","3000"},
				{"����������","2500"},
		};
		
		String[] coloumNames = {"Coffee Name", "Price"};
		
		// JTable�� ScrollPane�� �ٿ��� ����� ���´�
		JTable table = new JTable(rowData, coloumNames);
		JButton south = new JButton("Print console");
		
		// ���̺� ���� ����
		// table.setEnabled(false);
		
		// ���̺� ���� �̺�Ʈ ó���ϱ�
		
		// ListSelectionModel : ���̺� ���ÿ� ���õ� ������ �� �� �ִ� ��
		ListSelectionModel selectionModel = table.getSelectionModel();
		
		// selectionModel : ���� ��带 ������ �� �ִ�
		selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		// selectionModel.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		
		// CellSelection : �� ���� ������ �� �ֵ��� ����
		table.setCellSelectionEnabled(true);
		
		// ���̺� ���� �̺�Ʈ
		selectionModel.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (!e.getValueIsAdjusting()) {
					System.out.println("select row : " + table.getSelectedRow());
					System.out.println("select col : " + table.getSelectedColumn());
				}else {
					System.out.println("Adjusting... (���콺�� �� ������ ������)");
					
					System.out.println("Adjusting firstIndex : " + e.getFirstIndex());
					System.out.println("Adjusting lastIndex : " + e.getLastIndex());
				}
			}
		});
		
		// System.out.println("���� ��� : " + selectionModel.getSelectionMode());
		
		// Ư�� ������Ʈ�� ��ũ�� ������ ���·� �����ֱ� ���� ����Ѵ�
		JScrollPane scrollPane = new JScrollPane(table);
		
		add(scrollPane, "Center");
		add(south,"South");

		// ���̺� ������ ������ �ֿܼ��� ����
		south.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ���̺� ������ ������ table.getModel();
				TableModel model = table.getModel();
				
				int colCount = model.getColumnCount();
				int rowCount = model.getRowCount();
				
				System.out.println("�÷� : " + model.getColumnCount());
				System.out.println("�� : " + model.getRowCount());
				
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
