package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D03_Jiphap {
	/*
	 ������ ����� �����غ�����
	 1. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� Set���� ��ȯ�ϴ� �޼��� 
	 2. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� Set���� ��ȯ�ϴ� �޼��� 
	 3. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� Set���� ��ȯ�ϴ� �޼���
	 */
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Set<String> set = new HashSet<>();
		
		list.add("apple");
		list.add("apple");
		list.add("apple");
		list.add("banana");
		list.add("orange");
		
		set.add("banana");
		set.add("orange");
		set.add("melon");
		set.add("watermalon");
		set.add("strawberry");
		set.add("dragon fruits");
		
		System.out.println("list: " + list);
		System.out.println("set:  " + set);
		
		System.out.println("������: " + habjibhab(list, set));
		System.out.println("������: " + kuojibhab(list, set));
		System.out.println("������: " + chajibhab(list, set));
		
		
	}
	public static Set habjibhab(List<String> x,Set<String> y) {
		Set<String> sum = new HashSet<>();
		sum.addAll(x);
		sum.addAll(y);
		return sum;
	}
	
	public static Set kuojibhab(List<String> x,Set<String> y) {
		Set<String> kou = new HashSet<>();
		kou.addAll(y);
		kou.retainAll(x);
		return kou;
	}
	
	public static Set chajibhab(List<String> x,Set<String> y) {
		Set<String> cha = new HashSet<>();
		cha.addAll(x);
		cha.removeAll(y);
		return cha;
	}
}





















