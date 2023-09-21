package java07_collection;

import java.util.LinkedList;

public class LinkedListTest {

	public LinkedListTest() {
		
	}

	public void start() {
		//LinkedList : List 인터페이스를 상속받고 있으므로 순서유지, 중복객체
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.offer("홍길동");
		ll.offer(new String("세종대왕"));
		ll.offer("이순신");
		ll.offer("안중근");
		
		while (!ll.isEmpty()) { //true : 비어있다, false : 객체있음
			String name = ll.pop(); //먼저 저장된 객체를 꺼내고 컬렉션에 객체를 제거한다.
			System.out.println("name = " + name);
		}
		System.out.println("size() -> " + ll.size());
	}
	
	public static void main(String[] args) {
		new LinkedListTest().start();

	}

}
