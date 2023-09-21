package java10_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public FileReaderTest() {
		
	}

	public void start() {
		//파일에서 데이터 읽어오기
		try {
			File f = new File("C://Users/이민용/Desktop/풀스택/javaFileText", "sql04.sql");
			FileReader fr = new FileReader(f); //한번에 1글자씩 읽어온다
			BufferedReader br = new BufferedReader(fr); //한줄씩 읽어오기
			
			while (true) {
				String inData = br.readLine(); //EOF일때 반환값은 null;
				if(inData == null) break;
				System.out.println(inData);
			}
		}
		catch (FileNotFoundException e) {
				e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new FileReaderTest().start();

	}

}
