package java06_innerClass;

public class Sample {
	int num = 9999;
	public Sample() {
		System.out.println("���� ������ �޼ҵ�");
	}
	// ��
	public void sum() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("sum = " + sum);
	}
	
	//Ȧ�� ��
	public void oddSum() {
		int sum = 0;
		for (int i = 1; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println("oddSum = " + sum);
	}
	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����

	}

}
