package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
                      //<X>는 인스턴스를 생성할때 타입을 채워준다는 말이다 그래서 앞에 static을 못붙인다 <>안에 어떤것이든 사용해도 된다
public class D03_Jiphap1<X> {
	/*
	 다음의 기능을 구현해보세요
	 1. 두 컬랙션을 매개변수로 전달 받으면 두 컬랙션의 합집합을 Set으로 반환하는 메서드 
	 2. 두 컬랙션을 매개변수로 전달 받으면 두 컬랙션의 교집합을 Set으로 반환하는 메서드 
	 3. 두 컬랙션을 매개변수로 전달 받으면 두 컬랙션의 차집합을 Set으로 반환하는 메서드
	 강사님 풀이
	 .을 붙이는 것은 원본의 값을 바꾼다 그래서 변화시키고 싶을때는 다른 값에다 집어넣고 실행한다
	 */
	
	// <X>는 인스턴스를 생성할때 타입을 채워준다는 말이다 그래서 앞에 static을 못붙인다
	Set<X> union(Collection<X> a, Collection<X> b) { // 합집합
		Set<X> union = new HashSet<>(a);
		union.addAll(b);
		return union;
	}
	
	Set<X> inter(Collection<X> a, Collection<X> b) { // 교집합
		Set<X> inter = new HashSet<>(a);
		inter.retainAll(b);
		return inter;
	}
	
	Set<X> diff(Collection<X> a, Collection<X> b) { // 차집합
		Set<X> diff = new HashSet<>(a);
		diff.removeAll(b);
		return diff;
	}
	
	
	public static void main(String[] args) {
		List<Integer> A = new ArrayList<>();
		Set<Integer> B = new HashSet<>();
		
		List<String> C = new ArrayList<>();
		List<String> D = new ArrayList<>();
		
		
		Collections.addAll(A, 1,3,5,7,9);
		Collections.addAll(B, 7,9,11,13,15);
		Collections.addAll(C, "A","B","C","D","E");
		Collections.addAll(D, "F","G","H","I","J");
		
		 D03_Jiphap1<Integer> jiphapTool = new D03_Jiphap1<>();
		 D03_Jiphap1<String> jiphapToo2 = new D03_Jiphap1<>();
		
//		 이렇게 제네릭에 2개 이상을 써줬을 때 public class D03_Jiphap1<X,Y>로 써주며 사용할 메서드도 <Y>로 바꿔준다
//		 D03_Jiphap1<Integer, String> jiphapToo3 = new D03_Jiphap1<>();
		 
		 System.out.println("합집합: " + jiphapToo2.union(C, D));
		 
		System.out.println("합집합: " + jiphapTool.union(A, B));
		System.out.println("교집합: " + jiphapTool.inter(A, B));
		System.out.println("A - B: " + jiphapTool.diff(A, B));
		System.out.println("B - A: " + jiphapTool.diff(B, A));
	}
}
