import java.io.File;

public class E06_File {
	/*
	 # java.io.File
	 - ���� �ý��ۿ� ����� ���� �Ǵ� ���丮�� ������ ���� �� �ִ� Ŭ����
	 - �ν��Ͻ��� ����ִ� ������ �������� ���� �ý����� ���� ������ �� �ִ�
	 */
	public static void main(String[] args) {
		File f1 = new File("files");
		File f2 = new File("files/abc.txt");
		File f3 = new File("notExistFile.abcd"); // �������� ���� ���ϵ� ���� ��ü�� ���� �� ����
		
		// return�� file�� �Ѵ�
		System.out.println("f1�� ������: " + f1.getAbsoluteFile());
		
		// getAbsolutePath(): ���� ��� �� �� �ִ� (D:\JavaAWS\java-workspace\JavaBasicLee\flies)
		// return�� String���� �Ѵ�
		System.out.println("f1�� ������: " + f1.getAbsolutePath());
		System.out.println("f2�� ������: " + f2.getAbsolutePath());
		System.out.println("f3�� ������: " + f3.getAbsolutePath());
		
		// canRead(), canWrite(), canExecute() : �ش� ������ ���� Ȯ�� �޼���
		System.out.println(f1.canRead()); // false
		System.out.println(f2.canRead()); // false
		System.out.println(f3.canRead()); // false
		
		// �ش� ��ΰ� ���������� Ȯ���ϴ� �޼���
		File f4 = new File("D:\\JavaAWS\\java-workspace\\JavaBasicLee\\files");
		
		
		System.out.println("���� ��δ�? " + f1.isAbsolute()); 
		System.out.println("���� ��δ�? " + f4.isAbsolute()); 
		
		// ���丮, ����, ���� ���� Ȯ�� �޼���
		System.out.println("���丮(����)��? " + f1.isDirectory());
		System.out.println("f1�� �����̴�? " + f1.isFile());
		System.out.println("f2�� �����̴�? " + f2.isFile());
		System.out.println("f3�� �����̴�? " + f3.isFile());
		System.out.println("f4�� �����̴�? " + f4.isFile());
		System.out.println("�����ϴ�? " + f1.exists());
		System.out.println("�����ϴ�? " + f3.exists());
		
		//mkdir() : �ش� ��θ� ���� ���丮�� ���� ���� (���� ���丮�� �������� ������ ���� �Ұ���)
		File dir1 = new File("files2");
		
		// ���� ������ true ��ȯ
		System.out.println(dir1.mkdir() ? "files2 ���丮 ������ �����Ͽ����ϴ�." : "files2 ���丮 ������ �����Ͽ����ϴ�.");
		
		//mkdirs() : ���� ���丮�� �������� �ʾƵ� ��λ� ��� �θ� ���丮���� �������ݴϴ�
		// ���� ������ true ��ȯ
		File dir2 = new File("test/test/dir2");
		
		System.out.println(dir2.mkdirs() ? "dir2 ���丮 ������ �����Ͽ����ϴ�." : "dir2 ���丮 ������ �����Ͽ����ϴ�.");
	}
}
