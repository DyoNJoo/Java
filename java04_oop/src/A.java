

public class A {

	int isbn = 123456;
	String book = "�ڹ�";
	private String author = "ȫ�浿";
	//��ӵ��� ����
	public A() {
		System.out.println("AŬ������ ������ �޼ҵ� ����� >>>");
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
		System.out.println("1~100������ Ȧ���� ���� " + total);
	}
	
	void sum(int max) {
		int total = 0;
		for (int i = 1; i <= max; i += 2) {
			total += i;
		}
		System.out.println("1~" + max + "������ ���� " + total);
	}
	
}
