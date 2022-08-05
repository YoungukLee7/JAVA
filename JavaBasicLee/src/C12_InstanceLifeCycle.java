
public class C12_InstanceLifeCycle {

	/*
	 # 인스턴스의 생성시 자동으로 실행되는 코드들의 순서
	 1. (첫 실행시) 스태틱 블록이 실행된다
	 2. 인스턴스 생성
	 3. 인스턴스 블록 실행
	 4. 생성자 호출
	 */
	
	
	public static void main(String[] args) {
		new InstanceLife();
		// static은 2번 실행할 때 실행되지 않는다
		/*
		 스태틱 영역은 무조건 메모리에 실어놓는 것이 아니라
		 해당 클래스가 최초로 사용되는 시점에 메모리에 실리게 된다.
		 */
		new InstanceLife();
		new InstanceLife();
	}
	
}

// 설계도
class InstanceLife{
	
	
	
	static {
		System.out.println("1. 스태틱 블록");
	}
	
	{
		System.out.println("2. 인스턴스 블록");
	}
	
	public InstanceLife() {
		System.out.println("3. 생성자 블록");
	}
	
}