package java10_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import javax.xml.crypto.Data;

public class ObjectInputStreamTest {

	public ObjectInputStreamTest() {
		// TODO �ڵ� ������ ������ ����
	}

	public void start() {
		// ���Ͽ� ����� Object ��ü�� �о����(input)
		try {
			File file = new File("C://Users/�̹ο�/Desktop/Ǯ����/javaFileText", "object.txt");
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			DataVO vo = (DataVO)ois.readObject(); //������ ����ȯ ����� �Ѵ�.
			
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
