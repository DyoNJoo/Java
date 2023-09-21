package java03_oop;

public class SingletonTest {
	//new�� �̿��Ͽ� ��ü�� ������ �� ������ �����.
	//static ��������� �̿��Ͽ� ��ü�� �ߺ� �����Ѵ�.
	private static SingletonTest single = null;
	
	//public, private, protected, default
	//private ���� �����ڸ� �̿��Ͽ� �ܺο��� ��ü�����Ұ��� �����
	private SingletonTest() {
		
	}

	//��ü�� �����Ͽ� �������ִ� �޼ҵ� : getInstance();
	public static SingletonTest getInstance() {
		//��ü���� �� ��ü�����ϱ�
		if (single == null) {
			single = new SingletonTest();
		}
		return single;
	}
}
