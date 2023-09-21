package java05_exception;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest1 {

	public ExceptionTest1() {
		// �μ��� �Է¹޾� ���� ����϶�.
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("ù��°���� = "); // "12.6" "abc"
			int n1 = sc.nextInt(); // InputMismatchException -> ���ڿ��� ������ ��ȯ�ؾ� �ϴµ� ������ �ٲ� �� ���� ����
			
			//Integer.parseInt(scan.nextLint());
			
			System.out.print("�ι�°���� = ");
			int n2 = sc.nextInt();
			
			int hap = n1 + n2;
			System.out.println("n1 + n2 = " + hap);
			
			int divide = hap/n2; // 15/0 ���α׷������� � ���� 0���� ���� �� ����. ArithmeticException
			System.out.println("hap / n2 = " + divide);
			
			int[] arr = new int[4]; // arr[0] ~ arr[3]
			arr[arr.length-1] = 120; // �迭 arr�� ���̴� 4��. ������ �迭�� �ε����� 0���� 3�����̹Ƿ� arr.length = 4�� �Ǹ�, arr[4]�� �������� �ʴ� �ε�����.
			// ����� ArrayIndexOutOfBoundsException ����ó�� �߻�
			System.out.println(Arrays.toString(arr));
		} catch (InputMismatchException ime) {
			System.out.println("������ �Է��Ͽ��� �մϴ�.");
			System.out.println(ime.getMessage());
			ime.printStackTrace();
		} catch (ArithmeticException ae) {
			System.out.println("0���� ���� �� �����ϴ�.");
			System.out.println(ae.getMessage());
			ae.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			System.out.println("index�� �߸� ����Ͽ����ϴ�.");
			System.out.println(aioobe.getMessage());
			aioobe.printStackTrace();
		} finally { //try���ڵ尡 ���� �߻��ϵ� ���ϵ� ������ ����Ǵ� ����
			System.out.println("finally�� ������ �����");			
		}
		
	}

	public static void main(String[] args) {
		new ExceptionTest1();

	}

}
