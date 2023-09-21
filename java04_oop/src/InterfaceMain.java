//인터페이스를 상속받아 모든 메소드를 오버라이딩해야한다.
//여러개를 상속받을 수 있다.


public class InterfaceMain implements InterfaceTest, InterfaceA {

	public InterfaceMain() {
		// TODO 자동 생성된 생성자 스텁
	}
	
	@Override
	public int add(int a, int b) {
		if (a < MIN || a > MAX) {
			a = 0;
		}
		return a + b;
	}
	
	@Override
	public int minus(int a, int b) {
		return a - b;
	}
	
	@Override
	public int multiple(int a, int b) {
		return a * b;
	}
	
	@Override
	public int divide(int a, int b) {
		return a / b;
	}
	public static void main(String[] args) {
		InterfaceMain im = new InterfaceMain();
		System.out.println("im.add(50, 100) -> " + im.add(-50, 100));
		System.out.println("im.minus(90, 12) -> " + im.minus(90, 12));
		System.out.println("im.multiple(12, 12) -> " + im.multiple(12, 12));
		System.out.println("im.divide(10, 3) -> " + im.divide(10, 3));
		
		//하위클래스를 객체로 만들어 상위 인터페이스로 대입
		InterfaceTest it = new InterfaceMain(); // add, minus, multiple - 숨김,divide - 숨김
		System.out.println("add -> " + it.add(5,10));
		//System.out.println("multiple -> " + it.multiple()); //숨겨져 있으므로 동작 안됨
		
		InterfaceMain im2 = (InterfaceMain) it; // add, minus, multiple, divide
		System.out.println("더하기 -> " + im2.add(34, 12));
		System.out.println("곱하기 -> " + im2.multiple(4, 8));
	}

}
