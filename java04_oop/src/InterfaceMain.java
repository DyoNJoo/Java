//�������̽��� ��ӹ޾� ��� �޼ҵ带 �������̵��ؾ��Ѵ�.
//�������� ��ӹ��� �� �ִ�.


public class InterfaceMain implements InterfaceTest, InterfaceA {

	public InterfaceMain() {
		// TODO �ڵ� ������ ������ ����
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
		
		//����Ŭ������ ��ü�� ����� ���� �������̽��� ����
		InterfaceTest it = new InterfaceMain(); // add, minus, multiple - ����,divide - ����
		System.out.println("add -> " + it.add(5,10));
		//System.out.println("multiple -> " + it.multiple()); //������ �����Ƿ� ���� �ȵ�
		
		InterfaceMain im2 = (InterfaceMain) it; // add, minus, multiple, divide
		System.out.println("���ϱ� -> " + im2.add(34, 12));
		System.out.println("���ϱ� -> " + im2.multiple(4, 8));
	}

}
