package java07_collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	String data[] = { "JAVA","자바","Apple","사과","Banana","바나나","Spring","스프링","1234","JAVA","사과","스프링" };
	
	public TreeSetTest() {
		//TreeSet : 중복허용안함. 입력순서유지 안함. 정렬해준다.
		TreeSet<String> ts = new TreeSet<String>();
		
		for (int i = 0; i < data.length; i++) {
			ts.add(data[i]);
		}
		
		//오름차순으로 객체 얻어오기
		Iterator<String> ii = ts.iterator();
		while (ii.hasNext()) {
			String txt = ii.next();
			System.out.println(txt);
		}
		System.out.println("---------------------");
		// 내림차순으로 객체 얻어오기
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
