
package java07_collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public ArrayListTest() {
		
	}
	
	public void start() {
		//ArrayList : �Է¼�������, �ߺ���ü ���
		//ArrayList list = new ArrayList();
		List<Student> list = new ArrayList<Student>();
		Student stu1 = new Student();
		stu1.setName("�̼���");
		stu1.setLevel(3);
		
		Student stu2 = new Student(2, "ȫ�浿", "010-1234-2222", 90, 80, 90);
		Student stu3 = new Student(1, "���߱�", "010-2222-3333", 70, 82, 90);
		
		list.add(stu1); // index 0	0
		list.add(stu2); // index 2	1
		list.add(1, stu3); // index 1 
		
		
		//index, Ȯ��� for��
//		for (Object obj : list) {
//			Student s = (Student)obj; //Object�� ����ȯ�� ����.
//			System.out.println(s.toString());
//		}
		
		for (Student s : list) {
			System.out.println(s.toString());
		}
		
		//------------------------------------
		Student getData1 = list.get(1);
		System.out.println(getData1.toString());
		
		int idx = list.indexOf(stu1);
		System.out.println("stu1.index -> " + idx);
		
		System.out.println("isEmpty -> " + list.isEmpty());
		
		Student obj = list.remove(1);
		System.out.println("size -> " + list.size());
		System.out.println(obj.toString());
		
		boolean boo = list.remove(stu1);
		System.out.println(boo + ", " + list.size());
	}
	
	public static void main(String[] args) {
		new ArrayListTest().start();

	}

}
