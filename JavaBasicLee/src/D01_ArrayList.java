import java.util.ArrayList;

public class D01_ArrayList {

	/*
	 # �ڷᱸ��
	 - �����͸� ȿ�������� �����ϴ� �������� ��ĵ�
	 - ��Ȳ���� ������ ȿ���� ���� �ڷᱸ���� �ִ�
	 
	 # java Collection Interface
	 - Collection�� �ڹٿ��� �����ϴ� �ڷᱸ�� �������̽��̴�
	 - Collection������ �������� �ٸ� �÷������� ��ȯ�� �����ϴ�
	 - Collection �������̽��� ������ Ŭ�����δ� List,Set���� �ִ�
	 
	 # java.util.ArrayList
	 - �迭�� ���������� ũ�Ⱑ �ڵ����� �����Ǵ� �ڷᱸ���� ������ Ŭ����
	 - �迭ó�� �����͸� ���������� �����Ѵ� (�ε����� �ִ�)
	 - ��� �����͸� ������� �����ϴ� �ӵ��� ���� ���� �÷����̴�
	 */
	public static void main(String[] args) {
		// 1. Ÿ���� �������� �ʰ� ArrayList�� �����ϱ�
		ArrayList list1 = new ArrayList();
		
		// list.add(item): ����Ʈ�� �� �ڿ� ���ϴ� �����͸� �߰��Ѵ�
		list1.add(10);
		list1.add(11);
		list1.add(12);
		list1.add(13);
		list1.add(14);
		list1.add("��");
		list1.add("��");
		list1.add(new Apple());
		
		// list.add(index, item): ����Ʈ�� ���ϴ� ��ġ�� �����͸� �߰��Ѵ�
		list1.add(3, "�����");
		
		System.out.println(list1);
		
		
		// list1.get(index): ����Ʈ���� �ش� �ε����� �����͸� �ϳ� ������ �޼���
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(6));
		System.out.println(list1.get(7));
		
		// ObjectŸ������ ��ĳ���� �Ǿ��ִ� int
		Object obj = list1.get(0);
		// �ٿ� ĳ���� �� Ÿ���� �ٸ��� ������ �߻��� �� ���� (�����ϴ�)
		int a = (int) obj;
		
		System.out.println(a);
		
		// 2. <>�� Ÿ���� �����ϸ� ArrayList �����ϱ� (���׸�)
		ArrayList<String> list2 = new ArrayList<>();
		
		list2.add("cat");
		list2.add("dog");
		list2.add("zibra");
		list2.add("lion");
		list2.add("giraffe");
		
		list2.add(2, "���α�");
		
		System.out.println(list2);
		
		// ���׸� ���ο��� �⺻�� Ÿ���� ����� �� ���� (int,short,.....)
		// Ǯ�������� ����� �Ѵ�
		ArrayList<Integer> list3 = new ArrayList<>();
		
		list3.add(8);
		list3.add(11);
		list3.add(99);
		list3.add(999);
		
		System.out.println(list3);
		
		ArrayList<Character> list4 = new ArrayList<>();
		list4.add('H');
		list4.add('E');
		list4.add('L');
		list4.add('L');
		list4.add('O');
		
		System.out.println(list4);
		
		ArrayList<Double> list5 = new ArrayList<>();
		list5.add(0.1);
		list5.add(1.1);
		
		System.out.println(list5);
		
		// list.size(): �ش� ����Ʈ�� ũ�⸦ ��ȯ�Ѵ�
		System.out.println(list1.size());
		System.out.println(list2.size());
		System.out.println(list3.size());
		System.out.println(list4.size());
		System.out.println(list5.size());
		
		// list.contains(item): ����Ʈ�� �ش� ���� ���ԵǾ� �ִ��� ���θ� ��ȯ�Ѵ�.
		
		System.out.println("list2�� ���ڰ� �ֳ���? " + list2.contains("����"));
		System.out.println("list2�� lion�� �ֳ���? " + list2.contains("lion"));
		
		// list.indexOf(item): ����Ʈ���� �ش� ���� ��ġ�� ��ȯ�Ѵ�. ã�� ���ϸ� -1�� ��ȯ�Ѵ�
		System.out.println(list2.indexOf("apple"));
		System.out.println(list2.indexOf("lion"));
		
		// list.set(index, item): ����Ʈ�� �ش� ��ġ�� ���� �����Ѵ�
		list2.set(4, "whale");
		
		System.out.println(list2);
		// ���ڸ� ���� �ٲ㼭 ���ڰ� ���ٰ� ����
		System.out.println(list2.contains("lion"));
		
		// ��������: ���� �Ẹ�鼭 list.remove()�޼��尡 � �����ε��� �ְ�, � ��ȭ���� ������ �ִ��� �߸��غ�����
		
		// list.remove(index): index��°�� �ִ� ���� �������鼭 ���� ������ ��ȯ�Ѵ�
		// list.remove(Object): �ش� ������ �����ϰ� ���� ���� ���θ� ��ȯ�Ѵ�
		System.out.println(list2.remove(3));
		System.out.println(list2);
		
		list2.add("appple");
		list2.add("appple");
		list2.add("appple");
		list2.add("appple");
		list2.add("appple");
		
		while (list2.remove("apple")) {
			System.out.println(list2);
		}
		
		// �ݺ��� Ȱ���ϱ�
		for (int i = 0; i < list3.size(); i++) {
			System.out.println(list3.get(i));
		}
		System.out.println("---------------------------");
		for (String animal : list2) {
			System.out.println(animal);
		}
	}
}
