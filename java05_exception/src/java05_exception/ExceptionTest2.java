package java05_exception;

import java.util.Arrays;
import java.util.Scanner;

public class ExceptionTest2 {
	Scanner sc = new Scanner(System.in);
	public ExceptionTest2() {
		// TODO �ڵ� ������ ������ ����
	}
	
	public void start() {
		try {
			System.out.print("ù��°���� = "); 
			int n1 = sc.nextInt(); //InputMismatchException -> �߸��� ����.
			
			System.out.print("�ι�°���� = ");
			int n2 = sc.nextInt(); //InputMismatchException
			
			int hap = n1 + n2;
			System.out.println("n1 + n2 = " + hap);
			
			int divide = hap/n2; //ArithmeticException -> 0���� ������ ����.
			System.out.println("hap / n2 = " + divide);
			
			int[] arr = new int[4];
			arr[arr.length] = 120; //ArrayIndexOutOfBoundsException -> �߸��� ����
			System.out.println(Arrays.toString(arr));
		} catch (ArithmeticException ae) {
			System.out.println("0���� ���� �� �����ϴ�.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("����ó�� ��");
		}
	}

	public static void main(String[] args) {
		new ExceptionTest2().start();

	}

}
