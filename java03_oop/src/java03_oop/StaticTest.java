package java03_oop;

public class StaticTest {
	//static 멤버변수 또는 메소드에 기술한다.
	int num = 1234; //반드시 객체를 생성 후 사용가능
	static int age = 25; //객체를 생성하지 않아도 사용가능
	
	// class 영역에 실행문을 static{} 내에 기술할 수 있음.
	// 생성자 메소드보다 먼저 실행됨.
	static {
		for (int i = 1; i <= 5; i++) {
			System.out.println("12345");
		}
	}
	
	public StaticTest() {
		System.out.println("StaticTest() 생성자 메소드");
	} //다른 생성자 없을때 컴파일러 기술한다.
	
	public int plus(int x, int y) {
		return x + y;
	}
	
	
	//static이 있는 메소드
	public static int minus(int x, int y) {
		return x - y;
	}
}
