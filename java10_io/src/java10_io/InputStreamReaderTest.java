package java10_io;

import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public InputStreamReaderTest() {
		// TODO �ڵ� ������ ������ ����
	}

	public void start() {
		// InputStreamReader : ���ڴ����� �Է¹޴� Ŭ����
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		try {
//			while (true) {
//				int code = isr.read();
//				if (code == 13) break;
//				System.out.println(code + " -> " + (char)code + ", " + String.valueOf((char)code));
//			}
			
			char[] inData = new char[10];
//			int cnt = isr.read(inData); //�迭�� ũ�⸸ŭ ���ڿ� �ѹ��� �о�´�.
//			System.out.println(cnt + " -> " + String.valueOf(inData));
			
			
			//�迭�� ���ϴ� ��ġ�� ������ �����Ͽ� �Է¹ޱ�
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
