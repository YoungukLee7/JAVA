package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

import myobj.phonebook.PersonInfo;

public class D08_PhoneBook1 {
	
	HashMap<String, HashMap<String, PersonInfo>> phoneBook = new HashMap<>();
	
	public D08_PhoneBook1() {
 		phoneBook.put("�⺻", new HashMap<>());
	}
	
	public boolean addGroup(String groupName) {
 		if (!phoneBook.containsKey(groupName)) {
 			phoneBook.put(groupName, new HashMap<>());
 			return true;
		}else {
			return false;
		}
	}
	
	public boolean addPerson(PersonInfo info) {
		String group = info.getGroup();
		String number = info.getNumer();
		
		if (phoneBook.containsKey(group)) {
			HashMap<String, PersonInfo> groupMap = phoneBook.get(group);
			groupMap.put(number, info);
			return true;
		}else {
			System.out.println("�ش� �׷��� �������� �ʽ��ϴ�. �׷��� ���� �����ϼ���");
			return false;
		}
	}
	
	public void searchByName(String query) {
		for (HashMap<String, PersonInfo> group : phoneBook.values()) {
			
			for (PersonInfo info : group.values()) {
				if (info.checkByName(query)) {
					System.out.println(info);
				}
			}
		} 
	}
	
	public void searchByNumber(String query) {
		for (HashMap<String, PersonInfo> group : phoneBook.values()) {
			
			for (PersonInfo info : group.values()) {
				if (info.checkByNumber(query)) {
					System.out.println(info);
				}
			}
		} 
	}
	
	public void printAll(int column, boolean asc) {
		ArrayList<PersonInfo> allInfo = new ArrayList<>();
		
		for (HashMap<String, PersonInfo> group : phoneBook.values()) {
			allInfo.addAll(group.values());
		}
		
		Comparator<PersonInfo> comparator = PersonInfo.getComparator(column,asc);
		Collections.sort(allInfo, comparator);
		for (PersonInfo info : allInfo) {
			System.out.println(info);
		}
		
	}
	
	public static void main(String[] args) {
		D08_PhoneBook1 myBook = new D08_PhoneBook1();
		
		myBook.addGroup("����");
		
		myBook.addPerson(new PersonInfo("����", "333-2-3", "��ƺ�"));
		myBook.addPerson(new PersonInfo("����", "111-222-4", "�ھ���"));
		myBook.addPerson(new PersonInfo("����", "111-222-5", "�赿��"));
		myBook.addPerson(new PersonInfo("����", "111-333-6", "��ģô"));
		myBook.addPerson(new PersonInfo("����", "111-333-777", "��ģô����"));
		
//		myBook.searchByName("��"); 3. �̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ����� ����� �����ִ� �޼���
//		myBook.searchByNumber("333"); 4. ��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ����� ����� �����ִ� �޼���
		myBook.printAll(PersonInfo.NAME_COLUMN, true); // 5. ��ϵ� ��� ������ ���ϴ� �׸� �������� ����/������������ ����ϴ� �޼���
	}
	
	/*
 	# HashMap�� �̿��ؼ� ��ȭ��ȣ�θ� �����غ�����
 	1. {�׷�,��ȭ��ȣ,��������}�� �����ؾ� �Ѵ�
 	2. ��ȭ��ȣ�� HashMap�� �׷���� Ű������ ������ �ش� �׷��� HashMap�� ���� �� �ִ�
 	3. ���� �׷� HashMap�� ��ȭ��ȣ�� Ű������ ������ �� ����� ���������� ���� �� �ִ�
 	
 	# �����ؾ� �� �޼���
 	1. ���ο� �׷��� �߰��ϴ� �޼���
 	2. �����ϴ� �׷쿡 ���ο� ��ȭ��ȣ �� ���������� ����ϴ� �޼���
 	3. �̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ����� ����� �����ִ� �޼���
 	4. ��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ����� ����� �����ִ� �޼���
 	5. ��ϵ� ��� ������ ���ϴ� �׸� �������� ����/������������ ����ϴ� �޼���
	mybook.phoneBook.get("����").put("010-1234-1234", new PersonInfo("����", "123", "�达"));
	����� Ǯ��
 */
	
}

