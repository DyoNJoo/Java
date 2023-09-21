package java03_oop;

public class StaticTest2 {

	int bun = 12;
	static String name = "홍길동";
	
	//매개변수가 없는 생성자는 컴파일러 컴파일시 생성해준다.
	public StaticTest2(int bun) {
		this.bun = bun;
	}
	
	public String gugudan(int dan) {
		String result = "";
		for (int i = 1; i <= 9; i++) {
			result += dan + "*" + i + "=" + (dan*i) + "";
		}
		return result;
	}
	
	public static String dan(int dan) {
		String result = "";
		for (int i = 1; i <= 9; i++) {
			result += dan + "*" + i + "=" + (dan*i) + "\n";
		}
		return result;
	}
	
	public static void main(String[] args) {
		StaticTest2 st = new StaticTest2(2);
		System.out.println("bun -> " + st.bun); //bun멤버변수가 static변수 아니므로 객체를 생성하여야 사용이 가능하다.
		System.out.println("name -> " + name); //StaticTest2.name
		
		//gugudan(5); //static 없는 메소드는 현재 클래스를 객체로 만들고 객체명.메소드명으로 호출해야함
		System.out.println(dan(5));
	}

}
