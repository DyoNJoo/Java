package java03_oop;

public class SingletonMain {

	public SingletonMain() {
		// TODO �ڵ� ������ ������ ����
	}
	
	public static void main(String[] args) {
		//�����ڰ� �޼ҵ� privete�̹Ƿ� ��ü �����Ұ�
		//SingletonTest st = new SingletonTest();
		
		//��ü��.������� ���ٺҰ�
	    //SingletonTest.single
		
		SingletonTest st = SingletonTest.getInstance();
		SingletonTest st2 = SingletonTest.getInstance();
		
		System.out.println(st);
		System.out.println(st2);
		
		Member m1 = new Member(); //1000����
		Member m2 = new Member(); //2000����
		System.out.println(m1);
		System.out.println(m2);
		
	}
}
