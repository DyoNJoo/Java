package java07_collection;

import java.util.LinkedList;

public class LinkedListTest {

	public LinkedListTest() {
		
	}

	public void start() {
		//LinkedList : List �������̽��� ��ӹް� �����Ƿ� ��������, �ߺ���ü
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.offer("ȫ�浿");
		ll.offer(new String("�������"));
		ll.offer("�̼���");
		ll.offer("���߱�");
		
		while (!ll.isEmpty()) { //true : ����ִ�, false : ��ü����
			String name = ll.pop(); //���� ����� ��ü�� ������ �÷��ǿ� ��ü�� �����Ѵ�.
			System.out.println("name = " + name);
		}
		System.out.println("size() -> " + ll.size());
	}
	
	public static void main(String[] args) {
		new LinkedListTest().start();

	}

}
