package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

import myobj.phonebook.PersonInfo;

public class D08_PhoneBook1 {
	
	HashMap<String, HashMap<String, PersonInfo>> phoneBook = new HashMap<>();
	
	public D08_PhoneBook1() {
 		phoneBook.put("기본", new HashMap<>());
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
			System.out.println("해당 그룹이 존재하지 않습니다. 그룹을 먼저 생성하세요");
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
		
		myBook.addGroup("가족");
		
		myBook.addPerson(new PersonInfo("가족", "333-2-3", "김아빠"));
		myBook.addPerson(new PersonInfo("가족", "111-222-4", "박엄마"));
		myBook.addPerson(new PersonInfo("가족", "111-222-5", "김동생"));
		myBook.addPerson(new PersonInfo("가족", "111-333-6", "박친척"));
		myBook.addPerson(new PersonInfo("가족", "111-333-777", "박친척동생"));
		
//		myBook.searchByName("김"); 3. 이름의 일부를 입력하면 일치하는 모든 사람의 목록을 보여주는 메서드
//		myBook.searchByNumber("333"); 4. 전화번호의 일부를 입력하면 일치하는 모든 사람의 목록을 보여주는 메서드
		myBook.printAll(PersonInfo.NAME_COLUMN, true); // 5. 등록된 모든 정보를 원하는 항목 기준으로 오름/내림차순으로 출력하는 메서드
	}
	
	/*
 	# HashMap을 이용해서 전화번호부를 구현해보세요
 	1. {그룹,전화번호,개인정보}를 저장해야 한다
 	2. 전화번호부 HashMap에 그룹명을 키값으로 넣으면 해당 그룹의 HashMap을 꺼낼 수 있다
 	3. 꺼낸 그룹 HashMap에 전화번호를 키값으로 넣으면 그 사람의 개인정보를 꺼낼 수 있다
 	
 	# 구현해야 할 메서드
 	1. 새로운 그룹을 추가하는 메서드
 	2. 존재하는 그룹에 새로운 전화번호 및 개인정보를 등록하는 메서드
 	3. 이름의 일부를 입력하면 일치하는 모든 사람의 목록을 보여주는 메서드
 	4. 전화번호의 일부를 입력하면 일치하는 모든 사람의 목록을 보여주는 메서드
 	5. 등록된 모든 정보를 원하는 항목 기준으로 오름/내림차순으로 출력하는 메서드
	mybook.phoneBook.get("가족").put("010-1234-1234", new PersonInfo("가족", "123", "김씨"));
	강사님 풀이
 */
	
}

