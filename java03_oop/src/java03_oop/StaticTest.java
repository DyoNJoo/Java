package java03_oop;

public class StaticTest {
	//static ������� �Ǵ� �޼ҵ忡 ����Ѵ�.
	int num = 1234; //�ݵ�� ��ü�� ���� �� ��밡��
	static int age = 25; //��ü�� �������� �ʾƵ� ��밡��
	
	// class ������ ���๮�� static{} ���� ����� �� ����.
	// ������ �޼ҵ庸�� ���� �����.
	static {
		for (int i = 1; i <= 5; i++) {
			System.out.println("12345");
		}
	}
	
	public StaticTest() {
		System.out.println("StaticTest() ������ �޼ҵ�");
	} //�ٸ� ������ ������ �����Ϸ� ����Ѵ�.
	
	public int plus(int x, int y) {
		return x + y;
	}
	
	
	//static�� �ִ� �޼ҵ�
	public static int minus(int x, int y) {
		return x - y;
	}
}
