package java07_collection;

import java.util.Calendar;
import java.util.Random;
import java.util.Vector;

public class VectorTestMain {

	public static void main(String[] args) {
		VectorTest vt = new VectorTest();
		Vector vector = vt.getData();
		
		String name = (String)vector.elementAt(0);
		
		System.out.println("name -> " + name);
		
		Student stu = (Student)vector.get(1);
		System.out.println("student -> " + stu.toString());
		
		Calendar date = (Calendar)vector.get(2);
		System.out.println(date);
		
		int n = (int)vector.get(3);
		System.out.println("num -> " + n);
		
		Random ran = (Random)vector.lastElement(); 
		System.out.println("ran -> " + ran.nextInt(100));
	}

}
