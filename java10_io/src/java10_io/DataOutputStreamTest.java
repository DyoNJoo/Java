package java10_io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataOutputStreamTest {

	public DataOutputStreamTest() {
		// TODO �ڵ� ������ ������ ����
	}

	public void start() {
		//DataInputStream, DataOutputStream : �� �������� ũ�⸸ŭ ����Ʈ�� Ȯ���Ͽ� ���� 1���� �����Ѵ�.
		
		int intData = 1234;
		double dblData = 235.69;
		char charData = '��';
		boolean booData = true;
		
		try {
			//Data ����
			FileOutputStream fos = new FileOutputStream("C://Users/�̹ο�/Desktop/Ǯ����/javaFileText/data.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			
			dos.writeInt(intData); //4byte
			dos.writeDouble(dblData); //8byte
			dos.writeChar(charData); //3byte
			dos.writeBoolean(booData); //1byte
			
			dos.close();
			fos.close();
			
			//Dataũ�⸸ŭ �о����
			File file = new File("C://Users/�̹ο�/Desktop/Ǯ����/javaFileText/data.txt");
			FileInputStream fis = new FileInputStream(file);
			DataInputStream dis = new DataInputStream(fis);
			
			int intRead = dis.readInt();
			double doubleRead = dis.readDouble();
			char charRead = dis.readChar();
			boolean booRead = dis.readBoolean();

			System.out.println("int -> " + intRead);
			System.out.println("double -> " + doubleRead);
			System.out.println("char -> " + charRead);
			System.out.println("boolean -> " + booRead);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new DataOutputStreamTest().start();
	}

}
