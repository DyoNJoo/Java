package java10_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {

	public FileCopy() {
		// TODO 자동 생성된 생성자 스텁
	}
	
	public void start() {
		// C://Users/이민용/Desktop/풀스택/javaFileText/19.jpg
		// C://Users/이민용/Desktop/풀스택/newFolder/19.jpg
		
		try {
			File source = new File("C://Users/이민용/Desktop/풀스택/javaFileText/19.jpg");
			File target = new File("C://Users/이민용/Desktop/풀스택/newFolder/", "19_2.jpg");
			
			// 1. 입력스트림(byte) 만들기
			FileInputStream fs = new FileInputStream(source);
			FileOutputStream fo = new FileOutputStream(target);
			
//			while (true) {
//				//읽기
//				int byteData = fs.read(); //읽기 EOF : -1
//				if(byteData == -1) break;
//				fo.write(byteData);
//			}
			//배열을 이용한 입출력
			//읽기
			byte[] data = new byte[(int)source.length()];
			fs.read(data, 0, data.length);
			
			fo.write(data, 0, data.length);
			
			fo.close();
			fo.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new FileCopy().start();
		
	}

}
