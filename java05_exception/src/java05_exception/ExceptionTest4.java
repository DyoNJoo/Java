package java05_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest4 {
	Scanner sc = new Scanner(System.in);
	public ExceptionTest4() {
		int x = inData("first");
		int y = inData("second");
		hap(x, y);
		divide(x, y);
	}
	//�Է¹޴� �޼ҵ�
	public int inData(String msg) throws InputMismatchException, ArithmeticException, ArrayIndexOutOfBoundsException {
		System.out.print(msg + " -> ");
		return sc.nextInt();
	}
	//��
	public void hap(int x, int y) throws ArithmeticException, ArrayIndexOutOfBoundsException {
		System.out.println("�� -> " + (x + y));
	}
	//������
	public void divide(int x, int y) throws ArithmeticException, ArrayIndexOutOfBoundsException {
		System.out.println("�� -> " + (x / y));
		getData();
	}
	//�迭�̿� �޼ҵ�
	public void getData() throws ArrayIndexOutOfBoundsException {
		int a[] = {10, 20, 30};
		int s = 0;
		for (int i = 0; i <= a.length; i++) {
			s += a[i];
		}
		System.out.println("�迭�� �� -> " + s);
	}
	public static void main(String[] args) {
		try {
			new ExceptionTest4();
		} catch (InputMismatchException e) {
			System.out.println("�Է¿��� �߻���.");
		} catch (ArithmeticException e) {
			System.out.println("0���� ������ ����.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� ÷�� ���� �߸� �ԷµǾ����ϴ�.");
		}
	}

}
