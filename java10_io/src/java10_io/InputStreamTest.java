package java10_io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {

	public InputStreamTest() {
		// TODO �ڵ� ������ ������ ����
	}
	
	public void start() {
		// InputStream : byte���� �Է¹޴´�.
		//				 �߻�Ŭ�����̹Ƿ� ��ü�� ������ �� ����.
		//				 SystemŬ���� ������� �� in��������� InputStream ��ü�� ������.
		InputStream is = System.in;
		try {
			while (true) {
//				int readData = is.read(); //�Էµ����� ������
//				if (readData == -1) break;
//				System.out.println(readData);
//				System.out.println((char)readData);
//				byte[] data = new byte[5];
//				�ѹ��� 5byte�� �Է¹޾� data�迭�� ��� �Է��� byte���� �������ش�.
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
