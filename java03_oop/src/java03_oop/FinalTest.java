package java03_oop;

public class FinalTest {

	//final Ű����
	//		�������, class, method�� ǥ���� �� �ִ�.
	//		��������� �ʱⰪ�� �����Ǹ� �� �̻� ���� ������ �� ����. ���ȭ�� ����
	//		�޼ҵ�� ��ȯ�� ������ ����ϰ� ��ӽ� �������̵��� �Ұ����ϴ�.
	//		Ŭ������ class Ű���� ������ ����ϰ� ��������� �ʴ´�.
	
	//		final ������ ��� �빮�� �����.
	//		�ռ����϶��� ���ܾ� _(under bar)�� �����Ѵ�.
	final int NUM = 10;
	//final int age;
	final String USER_NAME = "�������";
	
	static final String ADDR = "����� ������";
		
	public static void main(String[] args) {
		FinalTest ft = new FinalTest();
		System.out.println(ft.NUM + ", " + ft.USER_NAME);
		
		System.out.println(FinalTest.ADDR);
		System.out.println(ADDR);
	}

}
