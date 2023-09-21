class X {
	X() {
		System.out.print(1);
	}
	X(int x) {
		this(); //X() 호출
		System.out.print(2);
	}
}

public class Y extends X{
	Y() {
		super(6); //상위 클래스 X(int x) 호출
	}
	Y(int y) {
		this(); //Y() 호출
		System.out.println(4);
	}
	
	public static void main(String[] args) {
		new Y(5);
	}

}
