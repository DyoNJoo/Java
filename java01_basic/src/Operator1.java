
public class Operator1 {

	public static void main(String[] args) {
		// ��������� : +, -, *, /, %
		
		int n1 = 14;
		int n2 = 3;
		//���� = ���� / ����
		//�Ǽ� = ���� / �Ǽ�
		//�Ǽ� = �Ǽ� / ����
		//�Ǽ� = �Ǽ� / �Ǽ�
		
		
		//������� = ����, ���, ����
		int result = n1 / n2;
		System.out.println(result);
		
		double result2 = (double) n1 / n2;
		System.out.println(result2);
		
		int a = 10;
		a = a + 1;
		System.out.println("a = " + a);
		
		a += 1;
		System.out.println("a = " + a);
		
		a++;
		System.out.println("a = " + a);
		
		++a;
		System.out.println("a = " + a);
		
		int b = a++ + 10;
		System.out.println("a = " + a + ", b = " + b);
		
		int c = ++a;
		System.out.println("a = " + a + ", c = " + c);
		
		int d = a--;
		System.out.println("a = " + a + ", d = " + d);
		
		int x = 5;
		x += 10 / 3 * 4;
		System.out.println("x = " + x);
		
		int y = 10;
		y = y * 2 % 3 + 7 / 3;
		System.out.println("y = " + y);
	}

}
