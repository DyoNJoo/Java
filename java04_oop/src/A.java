

public class A {

	int isbn = 123456;
	String book = "자바";
	private String author = "홍길동";
	//상속되지 않음
	public A() {
		System.out.println("A클래스의 생성자 메소드 실행됨 >>>");
	}
	public A(String food) {
		System.out.println("food -> " + food);
	}
	
	public void method1() {
		System.out.println(isbn + "****" + book+ "****" + author);
	}
	
	private void sum() {
		int total = 0;
		for (int i = 1; i <= 100; i += 2) {
			total += i;
		}
		System.out.println("1~100까지의 홀수의 합은 " + total);
	}
	
	void sum(int max) {
		int total = 0;
		for (int i = 1; i <= max; i += 2) {
			total += i;
		}
		System.out.println("1~" + max + "까지의 합은 " + total);
	}
	
}
