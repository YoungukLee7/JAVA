package myutil;
// public : 앞에 붙이면 다른 패키지에서도 쓸수 있다
public class Range {

	int start;
	int end;
	int incre; // 중가값
	int length; // 줄 수
	public int[] range; // 이곳에 내가 원하는 값이 들어갈 수밖에 없게 만들었다

	public Range(int end) {
		this(0, end, end < 0 ? -1 : 1);
	}

	public Range(int start, int end) {
		this(start, end, start > end ? -1 : 1);
	}
	

	public Range(int start, int end, int incre) {
		this.start = start;
		this.end = end;
		this.incre = incre;
		this.length = length();
		this.range = range();
	}

	int length() {

		int diff = end - start;

		int length = diff / incre;

		if (length < 0) {
			return 0;
		}

		length += diff % incre == 0 ? 0 : 1;

		return length;
	}

	int[] range() {

		int[] arr = new int[length];

		for (int i = 0; i < length; ++i) {
			arr[i] = start + incre * i;
		}
		return arr;
	}
}
