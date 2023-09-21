package java10_io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;

public class ObjectOutputStreamTest {

	public ObjectOutputStreamTest() {
		// TODO �ڵ� ������ ������ ����
	}

	public void start() {
		//��ü�� ���Ϸ� ���� - �ݵ�� ����ȭ
		DataVO vo = new DataVO();
		vo.setNum(7777);
		vo.setName("����ȯ");
		
		Calendar d = (Calendar.getInstance());
		d.set(2024, 5, 19); // 2024. 5. 19
		vo.setDate(d);
		
		try {
			File f = new File("C://Users/�̹ο�/Desktop/Ǯ����/javaFileText/object.txt");
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(vo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("���� �Ϸ�");
	}
	public static void main(String[] args) {
		new ObjectOutputStreamTest().start();

	}

}
