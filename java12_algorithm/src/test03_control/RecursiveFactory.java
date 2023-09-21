package test03_control;

public class RecursiveFactory {

	//for���� �̿��� ���丮�� ���ϱ�
	static int factorialFor(int n) {
		int fact = 1; //n ~ 1���� ��
		for (int i = n; i >= 1; i--) {
			fact *= i;
		}
		return fact;
	}
	
	//while�� �̿��� ���丮�� ���ϱ�
	static int factorialWhile(int n) {
		int fact = 1;
		while(n >= 1) {
			fact *= n;
			n--;
		}
		return fact;
	}
	
	// ��ȯ���� ���� ��� ȣ��
	static int fact = 1;
	static void factorialRecusiver(int n) {
		if (n <= 0) return;
		fact *= n;
		factorialRecusiver(n-1);
	}
	
	//��ȯ���� �ִ� ��� ȣ��
	static int factorialRecusiver2(int n) {
		if (n == 1) return 1;
		// 5 * 4 * 3 * 2 * 1
		return n * factorialRecusiver2(n-1);
	}
	public static void main(String[] args) {
		// ������ ������ ���丮���ϱ�
		System.out.println(factorialFor(5));
		System.out.println(factorialWhile(5));
		
		factorialRecusiver(5);
		System.out.println(fact);
		
		System.out.println(factorialRecusiver2(5));
	}

}
