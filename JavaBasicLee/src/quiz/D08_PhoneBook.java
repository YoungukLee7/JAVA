package quiz;

import java.lang.ProcessHandle.Info;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import myobj.phonebook.PersonInfo;

public class D08_PhoneBook {
	
	 	 static HashMap<String, HashMap<String, PersonInfo>> phoneBook = new HashMap<>();
	 	
	 	public D08_PhoneBook() {
	 		phoneBook.put("�⺻", new HashMap<>());
		}
	 	
	 	static void addGroup(String groupName) {
	 		
	 		if (!phoneBook.containsKey(groupName)) {
	 			phoneBook.put(groupName, new HashMap<>());
			}
		}
	 	
	 	static void addPhoneNo(String groupName, String name, String tel) {
			addGroup(groupName);
			HashMap group = (HashMap)phoneBook.get(groupName);
			group.put(tel, name);	
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
//		mybook.phoneBook.get("����").put("010-1234-1234", new PersonInfo("����", "123", "�达"));
	 */
	
	public static void main(String[] args) {
		D08_PhoneBook mybook = new D08_PhoneBook();
		
		addPhoneNo("����", "010-1234-1234","�̿���");
		addPhoneNo("����", "010-2345-2345","��ö��");
		addPhoneNo("����", "010-3456-3456","�ְ���");
		addPhoneNo("����", "010-4657-4567","���ؿ�");
		addPhoneNo("����", "010-5678-5678","�����");
		addPhoneNo("����", "010-6789-6789","�����");
		
		System.out.println(mybook.phoneBook.get("����"));
	}
	
	

}























