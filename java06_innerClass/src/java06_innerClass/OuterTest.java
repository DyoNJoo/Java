package java06_innerClass;

public class OuterTest {
	int num = 5678;
	String name = "�������";
	String tel = "010-1234-5678";
	
	public OuterTest() {
		
	}
	
	public void gugudan(int dan) {
		for (int i = 2; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
	}
	
	public void testMethod() {
		//���� Ŭ������ �޼ҵ� ȣ��
		//getInfor();
		
		//����Ŭ������ ��ü �����
		InnerTest it = new InnerTest();
		it.getInfor();
	}
	//����Ŭ���� : Ŭ���� �ҼӵǾ� �ִ� Ŭ����
	//1. Ŭ���������� ���ǵ� ����Ŭ����
	class InnerTest {
		//�������
		int num = 1234;
		String name = "ȫ�浿";
		//������ �޼ҵ�
		InnerTest() {
			System.out.println("InnerTest() ������ �޼ҵ�");
		}
		
		//�޼ҵ�
		void getInfor() {
			//����Ŭ������ �ܺ�Ŭ������ ��������� ������ �� �ִ�.
			System.out.println(num + ", " + name + ", " + tel);
			//����Ŭ�������� �ܺ�Ŭ������ �޼ҵ带 ȣ��
			gugudan(2);
		}
	}
	
	//2. �޼ҵ峻�� ����Ŭ����
	//3. �͸��� ����Ŭ����
	
	public static void main(String[] args) {
		//���� Ŭ������ ��ü����
		//1. �ܺ�Ŭ������ ��ü�����
		//OuterTest ot = new OuterTest();
		//2. ����Ŭ���� ��ü�����
		//OuterTest.InnerTest it = ot.new InnerTest();
		
		OuterTest.InnerTest it = new OuterTest().new InnerTest();
		//�޼ҵ� ȣ��
		it.getInfor();
		
		////////////////////////////
		OuterTest ot2 = new OuterTest();
		ot2.testMethod();
	}

}
