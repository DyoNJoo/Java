class X {
	X() {
		System.out.print(1);
	}
	X(int x) {
		this(); //X() ȣ��
		System.out.print(2);
	}
}

public class Y extends X{
	Y() {
		super(6); //���� Ŭ���� X(int x) ȣ��
	}
	Y(int y) {
		this(); //Y() ȣ��
		System.out.println(4);
	}
	
	public static void main(String[] args) {
		new Y(5);
	}

}
