import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class E11_ObjectStream {
	/*
	 # ObjectInputStream, ObjectOutputStream
	 - ������ ������(�ν��Ͻ�)���� ���� �� �� �ִ� ��Ʈ��
	 - java������ �ؼ� �� �� �ִٴ� ������ �ִ�
	 - Serializable �������̽��� �����Ǿ� �ִ� Ŭ������ ������ �� �ִ�
	 - Serializable : ������� �ִ� Ŭ������ 0�� 1�� ��ȭ�� �� �ִ�.
	 */
	public static void main(String[] args) {
		
		File objectFile = new File("files/object.txt");

		try (
				FileOutputStream fout = new FileOutputStream(objectFile);
				ObjectOutputStream out = new ObjectOutputStream(fout);
		) {
			
			out.writeObject(new Cup("Red", 600));
			out.writeObject(new Cup("Blue", 600));
			out.writeObject(new Cup("Green", 650));
			out.writeObject(new Cup("Yello", 700));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// �о��
		try(
				FileInputStream fin = new FileInputStream(objectFile);
				ObjectInputStream in = new ObjectInputStream(fin);
		){
			Object o1 = in.readObject();
			Object o2 = in.readObject();
			Object o3 = in.readObject();
			Object o4 = in.readObject();
			
			System.out.println(o1);
			System.out.println(o2);
			System.out.println(o3);
			System.out.println(o4);
			
			// ObjectŸ������ �������� ������ ����Ϸ��� �ٿ� ĳ���� �ؾ��Ѵ�
			Cup c1 = (Cup) o1;
			
			System.out.println(c1.color);
			System.out.println(c1.capacity);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}


class Cup implements Serializable{
	
	// ������ ���ڵ� �Ǵ� ���ڵ��� üũ�Ǵ� ID
	private static final long derialVersionUID = 8992604252870984929L;
	
	String color;
	int capacity;
	
	public Cup(String color, int capacity) {
		this.color = color;
		this.capacity = capacity;
	}
	
	@Override
	public String toString() {
		return String.format("%s[%d]", color,capacity);
	}
}