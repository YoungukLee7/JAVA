package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E10_Reporters {
	/*
	 reporters.txt에 저장된 기자들의 정보를 읽은 후
	 각 기자들의 정보를 담고있는 files/reporters/이름_신문사(분야).rep 파일로 재구성해보세요
	 */
	
	static File crypto;
	
	public E10_Reporters(File crypto) {
		this.crypto = crypto;
	}
	
	public void read() {
		try (
				FileReader fin = new FileReader(crypto);
				BufferedReader in = new BufferedReader(fin);
				){
			
				String line;
				while ((line = in.readLine()) != null) {
					 info(line);
				}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void info(String line) {
		String name;
		String paperName;
		String field;
		
		String[] split = line.split("\t");
		name = split[2];
		paperName = split[0];
		if (split[1].contains("/")) {
			split[1].replace("/", ",");
			field = split[1];
		}else {
			field = split[1];
		}
		
		madeReportersFile(name, paperName, field, line);
	}
	
	
	public static void madeReportersFile(String name, String paperName, String field, String builder) {
		String[] path = crypto.getPath().split("\\.");
		
		File f = new File(path[0]);
		
		f.mkdirs();
		
		path[0] = path[0] + "/" + name + "_" + paperName + "(" + field + ").rep";
		
		
		File reportFile = new File(path[0]);
		
		
		try (
				FileWriter fout = new FileWriter(reportFile);
				BufferedWriter out = new BufferedWriter(fout);
				){
			
				out.write(builder);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		E10_Reporters file = new E10_Reporters(new File("files/reporters.txt"));
		
		file.read();
		
	}
}
