
public class PrintTest {

	public static void main(String[] args) {
		//��¹� (�ܼ�)
		//println() : ������ ����ϰ� �ٹٲ�
		//print() : ���ڸ� ����� �ٹٲ� X
		//printf() : ������ ��� ��, ������ �����Ͽ� �����
		
		//����� : \", \', \n -> newline, \t
		
		System.out.println("println() \"�޼ҵ带\"\n �̿���\t ��¹�" + 100);
		System.out.println(200);
		
		System.out.print("������");
		System.out.print("��¹���");
		System.out.print("�����ϴ���");
		System.out.println("���ٿ� ��µȴ�.");
		
		double num = 10/3;
		System.out.println(num);
		
		//printf()�޼ҵ�� format�� �̿��Ͽ� �ڸ����� ������ �� �ִ�.
		//printf("�����������", ����, ����, ����, .......);
		// %d, %8d -> ����, �ڸ���
		// %f, %8.2f -> �Ǽ�, %���ڸ���. �Ҽ������ڸ��� f
		// %s, %10s -> ���ڿ�
		// %c -> char
		// %o -> 8����
		// %x -> 16����
		
		int x = 1234;
		int y = 20;
		System.out.printf("x�� ���� %d\n", x);
		System.out.printf("y�� ���� %10d\n", y);
		System.out.printf("x = %5d, y = %-5d\n", x, y); // - ���ڸ��� �����ʿ�
		System.out.printf("num = %f, num = %-8.2f\n", num, num);
		
		String name = "ȫ�浿";
		String lastname = "gildong";
		System.out.printf("str = %s, str = %10s\n", name, lastname);
	}

}
