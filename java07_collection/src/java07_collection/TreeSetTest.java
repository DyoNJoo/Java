package java07_collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	String data[] = { "JAVA","�ڹ�","Apple","���","Banana","�ٳ���","Spring","������","1234","JAVA","���","������" };
	
	public TreeSetTest() {
		//TreeSet : �ߺ�������. �Է¼������� ����. �������ش�.
		TreeSet<String> ts = new TreeSet<String>();
		
		for (int i = 0; i < data.length; i++) {
			ts.add(data[i]);
		}
		
		//������������ ��ü ������
		Iterator<String> ii = ts.iterator();
		while (ii.hasNext()) {
			String txt = ii.next();
			System.out.println(txt);
		}
		System.out.println("---------------------");
		// ������������ ��ü ������
		Iterator<String> iii = ts.descendingIterator();
		while (iii.hasNext()) {
			String txt = iii.next();
			System.out.println(txt);
		}
	}
	
	public static void main(String[] args) {
		new TreeSetTest();
		
	}

}
