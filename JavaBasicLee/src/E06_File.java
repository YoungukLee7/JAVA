import java.io.File;

public class E06_File {
	/*
	 # java.io.File
	 - 파일 시스템에 저장된 파일 또는 디렉토리의 정보를 담을 수 있는 클래스
	 - 인스턴스에 담겨있는 정보를 바탕으로 파일 시스템을 직접 수정할 수 있다
	 */
	public static void main(String[] args) {
		File f1 = new File("files");
		File f2 = new File("files/abc.txt");
		File f3 = new File("notExistFile.abcd"); // 존재하지 않은 파일도 파일 객체로 만들 수 있음
		
		// return을 file로 한다
		System.out.println("f1의 절대경로: " + f1.getAbsoluteFile());
		
		// getAbsolutePath(): 절대 경로 볼 수 있다 (D:\JavaAWS\java-workspace\JavaBasicLee\flies)
		// return을 String으로 한다
		System.out.println("f1의 절대경로: " + f1.getAbsolutePath());
		System.out.println("f2의 절대경로: " + f2.getAbsolutePath());
		System.out.println("f3의 절대경로: " + f3.getAbsolutePath());
		
		// canRead(), canWrite(), canExecute() : 해당 파일의 권한 확인 메서드
		System.out.println(f1.canRead()); // false
		System.out.println(f2.canRead()); // false
		System.out.println(f3.canRead()); // false
		
		// 해당 경로가 절대경로인지 확인하는 메서드
		File f4 = new File("D:\\JavaAWS\\java-workspace\\JavaBasicLee\\files");
		
		
		System.out.println("절대 경로니? " + f1.isAbsolute()); 
		System.out.println("절대 경로니? " + f4.isAbsolute()); 
		
		// 디렉토리, 파일, 존재 여부 확인 메서드
		System.out.println("디렉토리(폴더)니? " + f1.isDirectory());
		System.out.println("f1은 파일이니? " + f1.isFile());
		System.out.println("f2은 파일이니? " + f2.isFile());
		System.out.println("f3은 파일이니? " + f3.isFile());
		System.out.println("f4은 파일이니? " + f4.isFile());
		System.out.println("존재하니? " + f1.exists());
		System.out.println("존재하니? " + f3.exists());
		
		//mkdir() : 해당 경로를 가진 디렉토리를 새로 생성 (상위 디렉토리가 존재하지 않으면 생성 불가능)
		File dir1 = new File("files2");
		
		// 생성 성공시 true 반환
		System.out.println(dir1.mkdir() ? "files2 디렉토리 생성에 성공하였습니다." : "files2 디렉토리 생성에 실패하였습니다.");
		
		//mkdirs() : 상위 디렉토리가 존재하지 않아도 경로상 모든 부모 디렉토리들을 생성해줍니다
		// 생성 성공시 true 반환
		File dir2 = new File("test/test/dir2");
		
		System.out.println(dir2.mkdirs() ? "dir2 디렉토리 생성에 성공하였습니다." : "dir2 디렉토리 생성에 실패하였습니다.");
	}
}
