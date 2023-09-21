package java10_io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderTest {

	public BufferedReaderTest() {
		start();
	}

	public void start() {
		// BufferedInputStream : 1byte단위로 입력하여 버퍼에 보관후 1줄씩 읽을 수 있는 클래스
		// BufferedReader : char단위 입력하여 버퍼에 보관후 1줄씩 읽을 수 있는 클래스
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			String txt = br.readLine(); //콘솔에 입력된 데이터를 Enter를 기준으로 1줄 읽어온다.
			System.out.println(txt);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new BufferedReaderTest();

	}

}
