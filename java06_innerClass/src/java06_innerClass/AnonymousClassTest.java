package java06_innerClass;

public class AnonymousClassTest {
	String name = "����ũ";
	public AnonymousClassTest() {
		// TODO �ڵ� ������ ������ ����
	}
	
	public void start() {
		//�͸��� ���� Ŭ����
		Sample s = new Sample() {
			//Sample Ŭ���� sum() �޼ҵ带 �������̵�
			public void sum() {
				int evenSum = 0;
				for (int i = 2; i <= 100; i += 2) {
					evenSum += i;
				}
				System.out.println("evenSum = " + evenSum);
			}
			//�޼ҵ� �߰�
			public void print() {
				System.out.println(num + " -> " + name);
			}
		};		//.sum();	//.print();
		
		s.sum(); //�������̵� �޼ҵ尡 �����ǰ� ����
		//s.print(); //�͸��� ����Ŭ�������� �߰��� �޼ҵ�� ����ó���ȴ�.
	}
	public static void main(String[] args) {
		new AnonymousClassTest().start();

	}

}
