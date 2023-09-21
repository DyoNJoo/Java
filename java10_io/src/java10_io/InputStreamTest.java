package java10_io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {

	public InputStreamTest() {
		// TODO 자동 생성된 생성자 스텁
	}
	
	public void start() {
		// InputStream : byte단위 입력받는다.
		//				 추상클래스이므로 객체를 생성할 수 없다.
		//				 System클래스 멤버변수 중 in멤버변수가 InputStream 객체를 가진다.
		InputStream is = System.in;
		try {
			while (true) {
//				int readData = is.read(); //입력데이터 없을때
//				if (readData == -1) break;
//				System.out.println(readData);
//				System.out.println((char)readData);
//				byte[] data = new byte[5];
//				한번에 5byte를 입력받아 data배열에 담고 입력한 byte수를 리턴해준다.
//				int cnt = is.read(data);
//				System.out.println(new String(data));
				byte[] data = new byte[5];
				int cnt = is.read(data, 0, 4);
				System.out.println(cnt + " --> " + new String(data));
			}
			//System.out.println("--------------");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new InputStreamTest().start();

	}

}
