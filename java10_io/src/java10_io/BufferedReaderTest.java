package java10_io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderTest {

	public BufferedReaderTest() {
		start();
	}

	public void start() {
		// BufferedInputStream : 1byte������ �Է��Ͽ� ���ۿ� ������ 1�پ� ���� �� �ִ� Ŭ����
		// BufferedReader : char���� �Է��Ͽ� ���ۿ� ������ 1�پ� ���� �� �ִ� Ŭ����
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			String txt = br.readLine(); //�ֿܼ� �Էµ� �����͸� Enter�� �������� 1�� �о�´�.
			System.out.println(txt);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new BufferedReaderTest();

	}

}
