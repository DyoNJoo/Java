package java10_io;

import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public InputStreamReaderTest() {
		// TODO 자동 생성된 생성자 스텁
	}

	public void start() {
		// InputStreamReader : 문자단위로 입력받는 클래스
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		try {
//			while (true) {
//				int code = isr.read();
//				if (code == 13) break;
//				System.out.println(code + " -> " + (char)code + ", " + String.valueOf((char)code));
//			}
			
			char[] inData = new char[10];
//			int cnt = isr.read(inData); //배열의 크기만큼 문자열 한번에 읽어온다.
//			System.out.println(cnt + " -> " + String.valueOf(inData));
			
			
			//배열의 원하는 위치와 갯수를 지정하여 입력받기
			int cnt = isr.read(inData, 2, 4);
			System.out.println(cnt + " -> " + new String(inData));
			
			System.out.println("12345");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new InputStreamReaderTest().start();
	}

}
