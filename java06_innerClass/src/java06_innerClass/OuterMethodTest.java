package java06_innerClass;

public class OuterMethodTest {
	String email = "abcd@nate.com";
	public OuterMethodTest() {
		// TODO �ڵ� ������ ������ ����
	}
	
	public void innerTestMethod() {
		String addr = "����� ������";
		//�޼ҵ峻�� �����ϴ� ����Ŭ����
		class MethodInner {
			int num = 2222;
			String username = "ȫ�浿";
			MethodInner() {}
			void print() {
				System.out.println("��ȣ = " + num);
				System.out.println("�̸� = " + username);
				System.out.println("�ּ� = " + addr); //�޼ҵ峻�� ������ ����
				System.out.println("�̸��� = " + email); //�ܺ� �������
			}
		}
		
		//�޼ҵ峻�� ����Ŭ���� ��ü ����
		MethodInner mi = new MethodInner();
		mi.print();
	}
	/////////////////////////////////////////////////////
	public static void main(String[] args) {
		OuterMethodTest omt = new OuterMethodTest();
		omt.innerTestMethod();
	}

}
