package java05_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

// 1~100������ ���� �Է¹޾� �׼������� ���� ���Ͽ� ����ϴ� Ŭ����
public class MyExceptionTest {

	public MyExceptionTest() {
		
	}
	public void startSum() {
		int max = inData();
		sumOutput(max);
	}
	//�Է¹޴¸޼ҵ�
	
	public int inData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���. ");
		int n;
		while (true) {
			try {
				n = sc.nextInt();
				if (n < 1 || n > 100) {
					//������ ���� �߻� : throw
					//throw new MyException("1���� 100������ ������ �Է��ϼž� �մϴ�.");
					throw new MyException();
				}
				break;
			} catch(InputMismatchException e) {
				System.out.println("������ �Է����� �ʾҽ��ϴ�.");
				e.printStackTrace();
			} catch(MyException e) {
				System.out.println(e.getMessage());
			}
		}
		return n;
	}
	
	//���� ���Ͽ� ����ϴ� �޼ҵ�
	public void sumOutput(int max) {
		int sum = 0;
		for (int i = 1; i <= max; i++) {
			sum += i;
		}
		System.out.println("1 ~ " + max + "������ ���� " + sum);
	}
	public static void main(String[] args) {
		MyExceptionTest ex = new MyExceptionTest();
		ex.startSum();
	}

}
