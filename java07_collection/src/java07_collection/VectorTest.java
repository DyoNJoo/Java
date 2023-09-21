package java07_collection;

import java.util.Calendar;
import java.util.Random;
import java.util.Vector;

public class VectorTest {

		public Vector getData() {
			String name = "홍길동";
			Calendar now = Calendar.getInstance();
			Student student = new Student(3, "BTS", "010-1111-2222", 90, 80, 70);
			int num = 5678;
			Random random = new Random();
			
			//Vector : List를 상속받고 있으며, 입력 순서 유지, 같은 객체 여러개 추가 가능
			Vector v = new Vector();
			v.add(name); //0
			v.add(now); //2
			v.add(1, student); //1
			v.add(num); //3
			v.add(random); //4
			
			return v;
		}
}
