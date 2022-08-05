import java.util.ArrayList;

public class D01_ArrayList {

	/*
	 # 자료구조
	 - 데이터를 효율적으로 저장하는 여러가지 방식들
	 - 상황마다 최적의 효율을 내는 자료구조가 있다
	 
	 # java Collection Interface
	 - Collection은 자바에서 제공하는 자료구조 인터페이스이다
	 - Collection끼리는 언제든지 다른 컬렉션으로 변환이 가능하다
	 - Collection 인터페이스를 구현한 클래스로는 List,Set등이 있다
	 
	 # java.util.ArrayList
	 - 배열과 유사하지만 크기가 자동으로 조절되는 자료구조를 구현한 클래스
	 - 배열처럼 데이터를 순차적으로 저장한다 (인덱스가 있다)
	 - 모든 데이터를 순서대로 접근하는 속도가 가장 빠른 컬랙션이다
	 */
	public static void main(String[] args) {
		// 1. 타입을 지정하지 않고 ArrayList를 생성하기
		ArrayList list1 = new ArrayList();
		
		// list.add(item): 리스트의 맨 뒤에 원하는 데이터를 추가한다
		list1.add(10);
		list1.add(11);
		list1.add(12);
		list1.add(13);
		list1.add(14);
		list1.add("음");
		list1.add("료");
		list1.add(new Apple());
		
		// list.add(index, item): 리스트의 원하는 위치에 데이터를 추가한다
		list1.add(3, "비행기");
		
		System.out.println(list1);
		
		
		// list1.get(index): 리스트에서 해당 인덱스의 데이터를 하나 꺼내는 메서드
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(6));
		System.out.println(list1.get(7));
		
		// Object타입으로 업캐스팅 되어있는 int
		Object obj = list1.get(0);
		// 다운 캐스팅 시 타입이 다르면 에러가 발생할 수 있음 (불편하다)
		int a = (int) obj;
		
		System.out.println(a);
		
		// 2. <>로 타입을 지정하며 ArrayList 생성하기 (제네릭)
		ArrayList<String> list2 = new ArrayList<>();
		
		list2.add("cat");
		list2.add("dog");
		list2.add("zibra");
		list2.add("lion");
		list2.add("giraffe");
		
		list2.add(2, "꼬부기");
		
		System.out.println(list2);
		
		// 제네릭 내부에는 기본형 타입은 사용할 수 없다 (int,short,.....)
		// 풀네임으로 적어야 한다
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
		
		// list.size(): 해당 리스트의 크기를 반환한다
		System.out.println(list1.size());
		System.out.println(list2.size());
		System.out.println(list3.size());
		System.out.println(list4.size());
		System.out.println(list5.size());
		
		// list.contains(item): 리스트에 해당 값이 포함되어 있는지 여부를 반환한다.
		
		System.out.println("list2에 사자가 있나요? " + list2.contains("사자"));
		System.out.println("list2에 lion가 있나요? " + list2.contains("lion"));
		
		// list.indexOf(item): 리스트에서 해당 값의 위치를 반환한다. 찾지 못하면 -1을 반환한다
		System.out.println(list2.indexOf("apple"));
		System.out.println(list2.indexOf("lion"));
		
		// list.set(index, item): 리스트의 해당 위치의 값을 수정한다
		list2.set(4, "whale");
		
		System.out.println(list2);
		// 사자를 고래로 바꿔서 사자가 없다고 나옴
		System.out.println(list2.contains("lion"));
		
		// 연습문제: 직접 써보면서 list.remove()메서드가 어떤 오버로딩이 있고, 어떤 반화값을 가지고 있는지 추리해보세요
		
		// list.remove(index): index번째에 있는 값이 지워지면서 지운 내용을 반환한다
		// list.remove(Object): 해당 내용을 삭제하고 삭제 성공 여부를 반환한다
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
		
		// 반복문 활용하기
		for (int i = 0; i < list3.size(); i++) {
			System.out.println(list3.get(i));
		}
		System.out.println("---------------------------");
		for (String animal : list2) {
			System.out.println(animal);
		}
	}
}
