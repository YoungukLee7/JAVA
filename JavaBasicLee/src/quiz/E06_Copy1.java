package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class E06_Copy1 {
	/*
	files 폴더 내부의 모든 내용을
	files_copy 폴더로 복사해 보세요
	Hint: File 클래스의 list() 메서드
	강사님 풀이
	
 */
	// 1.
	public void copy(File src, File dst) {
		try {
			FileInputStream in = new FileInputStream(src);
			FileOutputStream out = new FileOutputStream(dst);
			
			byte[] buffer = new byte[1024];
			
			int len;
			while ((len = in.read(buffer)) != -1) {
				out.write(buffer,0,len);
			}
			
			in.close();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 4.
	public File getCopyFile(File src) {
		String path = src.getPath();
		
		int sep = path.indexOf('\\');
		
		String before = path.substring(0,sep) + "_copy";
		String after = path.substring(sep);
		
		return new File (before + after);
	}
	
	// 3.
	void addAllPathToMap(Map<File, File> map, File dir) {
		for (File f : dir.listFiles()) {
			if (f.isDirectory()) {
				addAllPathToMap(map, f);
			}else if (f.isFile()) {
				map.put(f, getCopyFile(f));
			}
		}
	}
	// 2.
	// 자기 자신을 다시 부르는 재귀함수
	public HashMap<File, File> findAllPath(File dir) {
		// new HashMap<>()을 다시 하지 않기 위해서 addAllPathToMap을 따로 해줬다. (아래서만 돌게 하려고)
		HashMap<File, File> copyMap = new HashMap<>();
		
		if (!dir.isDirectory()) {
			System.out.println("디렉토리만 탐색할 수 있습니다.");
			return null;
		}
		
		addAllPathToMap(copyMap, dir);
		
		return copyMap;
				
		}
			
	// 5.
	public void copyAll(File dir) {
		HashMap<File, File> foundMap = findAllPath(dir);
		
		for (File src : foundMap.keySet()) {
			File dst = foundMap.get(src);
			
			if (!dst.getParentFile().exists()) {
				dst.getParentFile().mkdirs();
			}
			
			copy(src, dst);
		}
	}
	
	public static void main(String[] args) {

		E06_Copy1 copy = new E06_Copy1();
		
		copy.copyAll(new File("files"));
	}
}
