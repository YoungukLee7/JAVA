package myobj.rps;

public class Shape {

	final public static Shape ROCK = new Shape(0);
	final public static Shape SCISSORS = new Shape(1);
	final public static Shape PAPER = new Shape(2);
	
	final private static Shape[] shapes = {ROCK,SCISSORS,PAPER};
	final private static String[] names = {"��","��","��"};
	
	private int shape;
	
	private  Shape(int shape) {
		this.shape = shape;
	}
	
	
	public static Shape random() { 
		return shapes[(int)(Math.random()*shapes.length)];
	}
	
	/**
	 ������ �̱�� 1, �������� �̱�� -1.���� 0���� ����
	 */
	public static int versus(Shape a, Shape b) {
		int left = a.getValue();
		int right = b.getValue();
		
		// ���� 0, ���� 1, �� 2
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
