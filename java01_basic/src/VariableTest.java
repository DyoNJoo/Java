
public class VariableTest {

	public static void main(String[] args) {
		// ���� : ���� �����ϴ� ��
		// ���� : byte(1), short(2), int(4 : �⺻��������), long(8)
		int age;
		int age2 = 25;
		byte kor = 50;
		
		long maxdata = 2148974988954894L; //������ ���(���ͳ�)�� int���̱� ������ int�� ũ�⺸�� ū ��쿡�� L�� ������.
		// "���ڿ�"�� ������������ + ������ �ϸ� �����. age�� ������������ �ʱⰪ�� ��� ���Ұ�.
		//System.out.println("age = " + age);
		System.out.println("age2 = " + age2);
		System.out.println("score = " + kor);
		System.out.println("maxdata = " + maxdata);
		
		//float(4), double(8)
		float height = 175.6f;
		double key = 175.6;
		
		System.out.println("height = " + height);
		System.out.println("key = " + key);
		
		//�� : boolean -> true, false;
		boolean boo = false;
		System.out.println("boo -> " + boo);
		
		//���� : char(2) : 1���� ���ڸ� ���� ����.
		
		char c1 = 'A'; //�ܵ���ǥ
		char c2 = '��';
		
		int r1 = c1 + 1; //B
		//A + 1 = 66;
		//A = 65;
		System.out.println("r1 = " + r1);
		
		char r2 = (char)(c1 + 1); //��������ȯ : type castring
		System.out.println("r2 = " + r2);
		
		int keyint = (int)key;
		System.out.println("keyInt = " + keyint);
		
		//�������������� ū ���������� �����Ҷ��� �ڵ����� ����ȯ�� �ȴ�.
		double data1 = 2356;
		System.out.println("data1 = " + data1);
		
		String name = "ȫ�浿";
		System.out.println("name = " + name);
		
		byte num1 = (byte)130;
		System.out.println("num1 = " + num1);
		
	}
	
}
