
public class C12_InstanceLifeCycle {

	/*
	 # �ν��Ͻ��� ������ �ڵ����� ����Ǵ� �ڵ���� ����
	 1. (ù �����) ����ƽ ����� ����ȴ�
	 2. �ν��Ͻ� ����
	 3. �ν��Ͻ� ��� ����
	 4. ������ ȣ��
	 */
	
	
	public static void main(String[] args) {
		new InstanceLife();
		// static�� 2�� ������ �� ������� �ʴ´�
		/*
		 ����ƽ ������ ������ �޸𸮿� �Ǿ���� ���� �ƴ϶�
		 �ش� Ŭ������ ���ʷ� ���Ǵ� ������ �޸𸮿� �Ǹ��� �ȴ�.
		 */
		new InstanceLife();
		new InstanceLife();
	}
	
}

// ���赵
class InstanceLife{
	
	
	
	static {
		System.out.println("1. ����ƽ ���");
	}
	
	{
		System.out.println("2. �ν��Ͻ� ���");
	}
	
	public InstanceLife() {
		System.out.println("3. ������ ���");
	}
	
}