package java07_collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	//							0		0		0	0
	int data[] = { 56, 54, 78, 56, 85, 85, 90, 78, 56, 45 };
	
	public HashSetTest() {
		//Integer a = 10;
		//int b = a;
		//HashSet : 입력순서유지 안함, 중복데이터 허용안함
		
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int d : data) {
			hs.add(d);
		}
		System.out.println("size -> " + hs.size());
		
		//HashSet객체를 얻어오기
		Iterator<Integer> ii = hs.iterator();
		
		//hasNext() : 다음 객체 존재유무 확인
		//next() : 객체를 얻어오기
		while (ii.hasNext()) {
			Integer obj = ii.next();
			System.out.println(obj);
		}
	}
	
	public static void main(String[] args) {
		new HashSetTest();
	}

}
