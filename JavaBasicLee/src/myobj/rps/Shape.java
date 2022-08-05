package myobj.rps;

public class Shape {

	final public static Shape ROCK = new Shape(0);
	final public static Shape SCISSORS = new Shape(1);
	final public static Shape PAPER = new Shape(2);
	
	final private static Shape[] shapes = {ROCK,SCISSORS,PAPER};
	final private static String[] names = {"묵","찌","빠"};
	
	private int shape;
	
	private  Shape(int shape) {
		this.shape = shape;
	}
	
	
	public static Shape random() { 
		return shapes[(int)(Math.random()*shapes.length)];
	}
	
	/**
	 왼쪽이 이기면 1, 오른쪽이 이기면 -1.비기면 0으로 리턴
	 */
	public static int versus(Shape a, Shape b) {
		int left = a.getValue();
		int right = b.getValue();
		
		// 바위 0, 가위 1, 보 2
		if (left == right) {
			return 0;
		}else if ((left + 1) % 3 == right) {
			return 1;
		}else {
			return -1;
		}
	}
	
	public int getValue() {
		return shape;
	}
	
	public String getName() {
		return names[shape];
	}
	
	@Override
	public String toString() {
		return getName();
	}
}
