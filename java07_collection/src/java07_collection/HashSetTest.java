package java07_collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	//							0		0		0	0
	int data[] = { 56, 54, 78, 56, 85, 85, 90, 78, 56, 45 };
	
	public HashSetTest() {
		//Integer a = 10;
		//int b = a;
		//HashSet : �Է¼������� ����, �ߺ������� ������
		
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int d : data) {
			hs.add(d);
		}
		System.out.println("size -> " + hs.size());
		
		//HashSet��ü�� ������
		Iterator<Integer> ii = hs.iterator();
		
		//hasNext() : ���� ��ü �������� Ȯ��
		//next() : ��ü�� ������
		while (ii.hasNext()) {
			Integer obj = ii.next();
			System.out.println(obj);
		}
	}
	
	public static void main(String[] args) {
		new HashSetTest();
	}

}
