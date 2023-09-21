package java10_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {

	public FileCopy() {
		// TODO �ڵ� ������ ������ ����
	}
	
	public void start() {
		// C://Users/�̹ο�/Desktop/Ǯ����/javaFileText/19.jpg
		// C://Users/�̹ο�/Desktop/Ǯ����/newFolder/19.jpg
		
		try {
			File source = new File("C://Users/�̹ο�/Desktop/Ǯ����/javaFileText/19.jpg");
			File target = new File("C://Users/�̹ο�/Desktop/Ǯ����/newFolder/", "19_2.jpg");
			
			// 1. �Է½�Ʈ��(byte) �����
			FileInputStream fs = new FileInputStream(source);
			FileOutputStream fo = new FileOutputStream(target);
			
//			while (true) {
//				//�б�
//				int byteData = fs.read(); //�б� EOF : -1
//				if(byteData == -1) break;
//				fo.write(byteData);
//			}
			//�迭�� �̿��� �����
			//�б�
			byte[] data = new byte[(int)source.length()];
			fs.read(data, 0, data.length);
			
			fo.write(data, 0, data.length);
			
			fo.close();
			fo.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new FileCopy().start();
		
	}

}
