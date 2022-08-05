package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D03_Jiphap {
	/*
	 다음의 기능을 구현해보세요
	 1. 두 컬랙션을 매개변수로 전달 받으면 두 컬랙션의 합집합을 Set으로 반환하는 메서드 
	 2. 두 컬랙션을 매개변수로 전달 받으면 두 컬랙션의 교집합을 Set으로 반환하는 메서드 
	 3. 두 컬랙션을 매개변수로 전달 받으면 두 컬랙션의 차집합을 Set으로 반환하는 메서드
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
		
		System.out.println("합집합: " + habjibhab(list, set));
		System.out.println("교집합: " + kuojibhab(list, set));
		System.out.println("차집합: " + chajibhab(list, set));
		
		
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





















