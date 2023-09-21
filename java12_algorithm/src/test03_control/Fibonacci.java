package test03_control;

import java.util.Scanner;

public class Fibonacci {
	//�Ǻ���ġ ����
	// 0 1 1 2 3 5 8 13 21...
	//�ݺ����� �̿��� �Ǻ���ġ ���� ���ϱ�
	public static void forFibonacci(int n) {
		int num1 = 0; //ù��° ��
		int num2 = 1; //�ι�° ��
		int sum = 1; //�հ� ��
		
		for (int i = 0; i < n; i++) { //0,1,2,3,4
			System.out.print(sum + " ");
			//������
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}
	}
	//���ȣ���� �̿��� �Ǻ���ġ ���� ���ϱ�
	public static int fibo(int n) {
		if (n <= 1) {
			return n;
		} else {
			//���� + ������
			//1		0
			//	   n�� ����	   n�� ������
			return fibo(n-1) + fibo(n-2);
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("���� �Է� -> ");
		int j = s.nextInt();

		//�ݺ����� �̿��� �Ǻ���ġ ���� ���ϱ�
		forFibonacci(j);
		System.out.println();
		
		//���ȣ���� �̿��� �Ǻ���ġ ���� ���ϱ�
		for (int i = 1; i <= j; i++) { // 1, 2, 3, 4, 5
			System.out.print(fibo(i) + " ");
		}
	}

}
