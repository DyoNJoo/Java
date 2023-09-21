package java10_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public FileReaderTest() {
		
	}

	public void start() {
		//���Ͽ��� ������ �о����
		try {
			File f = new File("C://Users/�̹ο�/Desktop/Ǯ����/javaFileText", "sql04.sql");
			FileReader fr = new FileReader(f); //�ѹ��� 1���ھ� �о�´�
			BufferedReader br = new BufferedReader(fr); //���پ� �о����
			
			while (true) {
				String inData = br.readLine(); //EOF�϶� ��ȯ���� null;
				if(inData == null) break;
				System.out.println(inData);
			}
		}
		catch (FileNotFoundException e) {
				e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new FileReaderTest().start();

	}

}
