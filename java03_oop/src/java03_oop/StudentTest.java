package java03_oop;

public class StudentTest {

	public StudentTest() {
		// TODO 磊悼 积己等 积己磊 胶庞
	}

	public static void main(String[] args) {
		Student stu = new Student();
		Student stu2 = new Student(3, "全辨悼", "010-4567-4567", 85, 70.5, 80);
		
		System.out.println(stu2.getName());
		System.out.println(stu2.toString());
		System.out.println(stu.toString());
	}

}
