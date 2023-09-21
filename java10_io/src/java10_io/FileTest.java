package java10_io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileTest {

	public FileTest() {
		// File : ����̺�, ����, ���ϸ����� ��ü�� �����Ͽ� ����ó���� �Ҽ� �ִ� Ŭ����
		File f1 = new File("C://Users/�̹ο�/Desktop/Ǯ����/javaFileText");
		File f2 = new File("C://Users/�̹ο�/Desktop/Ǯ����/javaFileText/sql04.sql");
		File f3 = new File(f1, "test.txt");
		
		//���� �����ϱ�
		File f4 = new File("C://Users/�̹ο�/Desktop/Ǯ����/newFolder");
		if (!f4.exists()) { //������ ���翩�� Ȯ�� : true -> ����, false -> �������� ����
			if (f4.mkdir()) { //���������� ���� ���, mkdirs() -> ������������ ������ �Ұ��
				System.out.println("������ �����Ǿ����ϴ�.");
			} else {
				System.out.println("���� ������ �����Ͽ����ϴ�.");
			} 
		}
		// ���� �����ϱ�
		try {
			if (!f3.exists()) {
				if (f3.createNewFile()) {
					System.out.println("������ �����Ǿ����ϴ�.");
				} else {
					System.out.println("���� ������ �����Ͽ����ϴ�.");
				}
			}
			
			//1970. 1. 1. 00:00:00���� ��¥�� �ð��� �и��ʷ� ǥ���Ѵ�.
			long lastDate = f2.lastModified();
			Calendar now = Calendar.getInstance();
			now.setTimeInMillis(lastDate);
			SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
			String lastModified = fmt.format(now.getTime());
			System.out.println("������ ������ : " + lastModified);
			
			// Ư�� ����̺��� ����, ���ϸ���� ���ϱ�
			File f5 = new File("C://");
			File[] list = f5.listFiles();
			
			//getPath() : ��� + ����
			//getName() : ���ϸ�
			//getAbsolutePath() : ��� + ����
			//getParent() : ���
			
			for (File f : list) {
				if (f.isDirectory()) {
					if (f.isHidden()) {
						System.out.println(f.getPath() + "[��������]");
					} else {
						System.out.println(f.getPath() + "[����]");
					}
				} else if (f.isFile()) { //���� �϶�
					if (f.isHidden()) {
						System.out.println(f.getPath() + "[��������]");
					} else {
						System.out.println(f.getPath() + "[����]");
					}
				}
			}
			
			//����ý����� ����̺��ϱ��ϱ�
			File[] drive = File.listRoots();
			for(File f : drive) {
				System.out.println(f.getPath());
			}
			
			//�뷮 Ȯ��
			long size = f2.length();
			System.out.println(f2.getName() + "����ũ�� -> " + f2.length());
			
			//���� ����
			boolean r = f3.delete();
			System.out.println("�������� : " + r);
		}
			catch(IOException e) {
				e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new FileTest();
	}

}
