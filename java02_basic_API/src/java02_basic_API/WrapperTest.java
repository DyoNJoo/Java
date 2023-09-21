package java02_basic_API;

public class WrapperTest {

	public WrapperTest() {

	}
	
	public void start() {
		// WrapperŬ���� : �⺻ ���������� �����͸� ��üȭ�ϴ� Ŭ������
		int a = 10;
		int b = 3;
		
		Integer i1 = new Integer(5); //�⺻ Ÿ���� ���� �� ���
		Integer i2 = new Integer("12"); //���ڿ��� �� ���
		
		String data = "24";
		
		//����ȭ�� ���� -> int(Integer)
		int c = Integer.parseInt(data); //���õ������� int Ÿ���� ��ȯ - �⺻ int�� �ʿ��ҽ�
		Integer d = Integer.valueOf(data); //Integer ����(wrapper)��ü�� ��ȯ - Integer ���� ��ü�� �ʿ��ҽ�
		
		//�⺻������Ÿ���� ����� ����������.
		//��ü���� �ش� Ŭ������ ����� ��� ������.
		System.out.println("����Ʈ �� -> " + d.SIZE);
		
		int e = Integer.bitCount(a); //2������ 1�� ������ ���Ѵ�.
		System.out.println("e = " + e);
		
		int f = Integer.parseInt("17");
		Integer g = a; // ����ڽ� : v1.5 �̻��� ��ü�� = �⺻Ÿ�Ե����� �븳
		int h = g; // �����ڽ� : v 1.5�̻󿡼� �⺻ Ÿ�� = ��ü��
		
		System.out.println("max -> " + Integer.max(a, b));
		System.out.println("reverse -> " + Integer.reverse(a));
		
		System.out.println("29 -> " + Integer.toHexString(29) + ", " + Integer.toOctalString(29));
		//toHexString 16����, toOctalString 8����
	}

	public static void main(String[] args) {
		WrapperTest wt = new WrapperTest();
		wt.start();
	}

}
