package java10_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import javax.xml.crypto.Data;

public class ObjectInputStreamTest {

	public ObjectInputStreamTest() {
		// TODO 자동 생성된 생성자 스텁
	}

	public void start() {
		// 파일에 저장된 Object 객체를 읽어오기(input)
		try {
			File file = new File("C://Users/이민용/Desktop/풀스택/javaFileText", "object.txt");
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			DataVO vo = (DataVO)ois.readObject(); //하위로 형변환 해줘야 한다.
			
			System.out.println(vo.getNum());
			System.out.println(vo.getName());
			System.out.println(vo.getDate());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new ObjectInputStreamTest().start();

	}

}
