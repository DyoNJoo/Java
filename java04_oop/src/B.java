

public class B extends A {
	
	int isbn = 78910;
	String book = "HTML";
	public B() {
		//����Ŭ������ �������߿� �Ű������� �ִ� �����ڸ� ������ ���
		//superŰ���带 �̿��Ͽ� ����Ŭ������ �����ڸ� ȣ�����ش�.
		//ù��° ���๮���� ǥ���Ͽ����Ѵ�.
		//this() : ���� Ŭ������ �ٸ� ������ ȣ��
		//super() : ���� Ŭ������ �ٸ� ������ ȣ��
		super("���");
		System.out.println("BŬ������ ������ �޼ҵ� �����.");
		// ���� Ŭ������ ����Ŭ�������� ���� �ʵ���϶� ����Ŭ������ ������ �����Ѵ�.
		System.out.println(isbn + "====" + book + "====" + super.book);
		
		//����Ŭ���� ���� ������ this�� ǥ���ϴ��� ����Ŭ������ ������ �����Ѵ�.
		//����Ŭ������ ����Ŭ������ ��� ��ɵ� ����� �� ����.
		System.out.println(this.isbn + " ====> " + super.isbn);
		
		//����Ŭ���� ����, �޼ҵ�� private �����������϶� ������� �ʴ´�.
		//System.out.println("author = " + super.author);
		
		//���� Ŭ������ �޼ҵ带 ȣ��
		method1();
		inherTest(50);
		
	}
	public void inherTest(int max) {
		int total = 0;
		for (int i = 1; i <= max; i++) {
			total += i;
		}
		System.out.println("1~" + max + "������ ���� " + total);
	}
	@Override
	public void sum(int max) {
		int total = 0;
		for (int i = 1; i <= max; i += 2) {
			total += i;
		}
		System.out.println("1~" + max + "������ ���� " + total);
		//return total;	
	}
}
