import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D07_HashMap {

	/*
	 # Map
	 - �����͸� Key-Value �� ������ �����ϴ� ����� �ڷᱸ��
	 - �ε��� ��ȣ ��� Key�� ���� �����Ϳ� �����Ѵ�
	 - Key�� �ߺ��� ������� �ʴ´�
	 */
	
	public static void main(String[] args) {
		HashMap<String, Integer> map1 = new HashMap<>();
		HashMap<Integer, String> map2 = new HashMap<>();
		
		// put(K, V) : �ش� Ű�� ���� �����Ѵ�
		map1.put("Age", 10);
		map1.put("Score", 1234);
		map1.put("qty", 5);
		map1.put("cash", 5000);

		
		map2.put(330, "������");
		map2.put(450, "��������");
		
		System.out.println(map1);
		System.out.println(map2);
		
		// get(K) : �ش� Ű���� �ش��ϴ� ���� ������. �ش� Ű �Ǵ� ���� ������ null
		System.out.println( map1.get("Score"));
		System.out.println( map1.get("Age"));
		
		System.out.println( map2.get(330));
		System.out.println( map2.get(450));
		
		
		HashMap<String, String> nav = new HashMap<>();
		
		nav.put("�츮��", "����� ������ ������");
		nav.put("ȸ��", "����� ������ ��������д���");
		nav.put("�ŷ�ó1", "����� ������ ������ 321-321");
		
		// �̹� �����ϴ� Ű�� put�� �ϸ� ���� �����
		nav.put("ȸ��", "���ε����д���");
		
		System.out.println(nav);
		
		// putIfAbsent(K,V) : �ش� Ű���� ��������� ���� �ְ� null�� �����Ѵ�
		String value = nav.putIfAbsent("����1", "��⵵ ������ ������ 111-111");
		System.out.println(nav);
		System.out.println(value);
		
		// �ش� Ű���� �̹� ���� �����Ѵٸ� ���� ���� �ʰ� ����ִ� ���� ����
		value = nav.putIfAbsent("����1", "�Ƶ�����");
		System.out.println(nav);
		System.out.println(value);
		
		// Map�� �÷����� �ƴ�����, Key �Ǵ� Value�� Set �Ǵ� list�� �����ü� �ִ�
		
		// map.keySet() : �ش� ���� Key��θ� �̷���� Set�� ��ȯ�Ѵ�
		Set<String> keys = nav.keySet();
		System.out.println(keys);
		
		// ���� Key���� �ݺ������� Ȱ���� �� �ִ�
		for (String key : keys) {
			System.out.println(nav.get(key));
		}
		
		// map.values() : �ش� ���� Value��θ� �̷���� �÷����� ��ȯ�Ѵ�
		// Set�� ���� �ߺ��� �Ǹ� �������� ���� Value��θ� �̷���� �÷����� ��ȯ�Ѵ�
		Collection<String> values = nav.values();
		
		List<String> valuList = new ArrayList<>(values);
		
		Collections.sort(valuList);
		System.out.println(valuList);
		
		for (String val : values) {
			System.out.println(val);
		}
	}
}
