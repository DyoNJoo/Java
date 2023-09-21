package java10_io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataOutputStreamTest {

	public DataOutputStreamTest() {
		// TODO 자동 생성된 생성자 스텁
	}

	public void start() {
		//DataInputStream, DataOutputStream : 원 데이터의 크기만큼 바이트를 확보하여 정보 1개를 저장한다.
		
		int intData = 1234;
		double dblData = 235.69;
		char charData = '한';
		boolean booData = true;
		
		try {
			//Data 쓰기
			FileOutputStream fos = new FileOutputStream("C://Users/이민용/Desktop/풀스택/javaFileText/data.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			
			dos.writeInt(intData); //4byte
			dos.writeDouble(dblData); //8byte
			dos.writeChar(charData); //3byte
			dos.writeBoolean(booData); //1byte
			
			dos.close();
			fos.close();
			
			//Data크기만큼 읽어오기
			File file = new File("C://Users/이민용/Desktop/풀스택/javaFileText/data.txt");
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
