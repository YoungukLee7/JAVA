import java.util.Arrays;

class pig{
	final static String type = "����";
	int gram_price;
	int gram;
	
	public pig(int gram, int gram_price) {
		this.gram = gram;
		this.gram_price = gram_price;
	}
	@Override 
	public String toString() {
		return String.format("���� : %s\n"+"g�� ���� : %d\n" + "�� ���� : %d\n" + "���� : %d"
				, type,gram_price,gram,gram_price*gram); // ���ϴ� ���ڿ��� return���ش�
	}
}
/*
# Object.toString()	
- �ش� Ŭ������ ���ڿ��μ� ��� �Ǿ�� �Ҷ� ������ ȣ��Ǵ� �޼��� 
- Object�� ��� Ÿ���� �θ��̱� ������ ��� Ŭ������ toString()�� ���ԵǾ� �ִ�
- �������̵� �ؼ� ������� ������ �⺻������ �޸𸮻��� �ּҰ��� ���ڿ��� ��ȯ�Ѵ�.
*/

// �ش� Ŭ������ toString() �޼��带 �������̵� �ϸ� ���ϴ� ���·� ��� �����ϴ�
public class C08_ToString {

	public static void main(String[] args) {
		pig meat = new pig(150, 40);
		
		// �ν��Ͻ��� ����Ϸ��� �ϸ� �ּҰ��� ���´�
		// �ش� Ŭ������ toString() �޼��带 �������̵� �ϸ� ���ϴ� ���·� ��� �����ϴ�
		
		// �ش� �ν��Ͻ��� toString���� ���ڿ��� �����ͼ� ����ϱ�
		System.out.println(meat.toString());
		
		// �ش� �ν��Ͻ��� �׳� ����ϱ�
		System.out.println(meat);
		
		// println() �޼���� ��� �ش� �ν��Ͻ��� toString() ����� �ֿܼ� ����ϴ� �޼����̴�
	}
}
