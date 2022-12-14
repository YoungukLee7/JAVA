
public class B08_TypeCasting {
/*
  # 타입캐스팅
  - 특정 데이터의 값은 그대로 두고 타입만 변환할 때 사용하는 문법
  - 해당 값이 손상될 우려가 있을 때에는 강제로 타입을 변환시킨다
  - 해당 값이 손상될 우려가 전혀 없을 때에는 알아서 타입을 변한다
 */
	public static void main(String []args) {
		
		byte _byte = 11;
		int _int =22;
		
		// 1. 자연스러운 타입 캐스팅
		// 4byte에 1byte값을 넣을때에는 알아서 타입이 변한다 (byte -> int)
		_int = _byte;
		System.out.println(_int);
		System.out.println("====================");
		
		// 2. 값이 손상될 위험이 있는 타입의 캐스팅
		// 더 넓은 범위의 값을 작은 변수에 넣을때는 값이 손상될 우려가 있어 컴파일에 에러가 발생한다
		// 개발자가 강제로 타입캐스팅을 해야 컴파일이 가능해진다
		_int =200;
		_byte = (byte)_int; 
		System.out.println(_byte);
		System.out.println("====================");
		
		// 3. 해석을 다르게 하고 싶은 타입 캐스팅
		int ch =65;
		double value = 70.000;
		int a = 3, b = 7;
		
		System.out.println(ch);
		System.out.println((char)ch);
		System.out.println("====================");
		System.out.println(value);
		System.out.println((int)value);
		System.out.println("====================");
		System.out.println(a/b);
		System.out.println(a/(double)b);
	}
}
