package java10_io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;

public class ObjectOutputStreamTest {

	public ObjectOutputStreamTest() {
		// TODO 자동 생성된 생성자 스텁
	}

	public void start() {
		//객체를 파일로 쓰기 - 반드시 직렬화
		DataVO vo = new DataVO();
		vo.setNum(7777);
		vo.setName("박태환");
		
		Calendar d = (Calendar.getInstance());
		d.set(2024, 5, 19); // 2024. 5. 19
		vo.setDate(d);
		
		try {
			File f = new File("C://Users/이민용/Desktop/풀스택/javaFileText/object.txt");
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(vo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("쓰기 완료");
	}
	public static void main(String[] args) {
		new ObjectOutputStreamTest().start();

	}

}
