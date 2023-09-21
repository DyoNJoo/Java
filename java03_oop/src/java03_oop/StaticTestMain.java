package java03_oop;

public class StaticTestMain {

	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		System.out.println("st.num -> " + st.num);
		
		System.out.println("st.age -> " + st.age);
		//static 멤버변수는 클래스명.멤버변수로 접근이 가능함.
		System.out.println("StaticTest.age -> " + StaticTest.age);
		
		StaticTest st2 = new StaticTest();
		System.out.println("변경전 st2.num -> " + st2.num);
		st2.num = 5678;
		System.out.println("st1.num -> " + st.num + ", st2.num -> " + st2.num);
		
		st.age = 26;
		StaticTest.age = 27;
		System.out.println("st2.age -> " + st2.age);
		
		System.out.println(st.plus(10,20));
		System.out.println(StaticTest.minus(100, 200));
		System.out.println(st.minus(100,200));
		
	}

}
