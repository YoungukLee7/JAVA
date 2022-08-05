package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
                      //<X>�� �ν��Ͻ��� �����Ҷ� Ÿ���� ä���شٴ� ���̴� �׷��� �տ� static�� �����δ� <>�ȿ� ����̵� ����ص� �ȴ�
public class D03_Jiphap1<X> {
	/*
	 ������ ����� �����غ�����
	 1. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� Set���� ��ȯ�ϴ� �޼��� 
	 2. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� Set���� ��ȯ�ϴ� �޼��� 
	 3. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� Set���� ��ȯ�ϴ� �޼���
	 ����� Ǯ��
	 .�� ���̴� ���� ������ ���� �ٲ۴� �׷��� ��ȭ��Ű�� �������� �ٸ� ������ ����ְ� �����Ѵ�
	 */
	
	// <X>�� �ν��Ͻ��� �����Ҷ� Ÿ���� ä���شٴ� ���̴� �׷��� �տ� static�� �����δ�
	Set<X> union(Collection<X> a, Collection<X> b) { // ������
		Set<X> union = new HashSet<>(a);
		union.addAll(b);
		return union;
	}
	
	Set<X> inter(Collection<X> a, Collection<X> b) { // ������
		Set<X> inter = new HashSet<>(a);
		inter.retainAll(b);
		return inter;
	}
	
	Set<X> diff(Collection<X> a, Collection<X> b) { // ������
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
		
//		 �̷��� ���׸��� 2�� �̻��� ������ �� public class D03_Jiphap1<X,Y>�� ���ָ� ����� �޼��嵵 <Y>�� �ٲ��ش�
//		 D03_Jiphap1<Integer, String> jiphapToo3 = new D03_Jiphap1<>();
		 
		 System.out.println("������: " + jiphapToo2.union(C, D));
		 
		System.out.println("������: " + jiphapTool.union(A, B));
		System.out.println("������: " + jiphapTool.inter(A, B));
		System.out.println("A - B: " + jiphapTool.diff(A, B));
		System.out.println("B - A: " + jiphapTool.diff(B, A));
	}
}
