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
	 		phoneBook.put("기본", new HashMap<>());
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
//		mybook.phoneBook.get("가족").put("010-1234-1234", new PersonInfo("가족", "123", "김씨"));
	 */
	
	public static void main(String[] args) {
		D08_PhoneBook mybook = new D08_PhoneBook();
		
		addPhoneNo("가족", "010-1234-1234","이영욱");
		addPhoneNo("가족", "010-2345-2345","박철우");
		addPhoneNo("가족", "010-3456-3456","최강민");
		addPhoneNo("가족", "010-4657-4567","최준영");
		addPhoneNo("가족", "010-5678-5678","김재민");
		addPhoneNo("가족", "010-6789-6789","김수영");
		
		System.out.println(mybook.phoneBook.get("가족"));
	}
	
	

}























