package test03_control;

import java.util.Scanner;

/*
 * �μ��� �Է¹޾� �ŵ������� ���ϴ� ���α׷��� ���ȣ��� �ۼ�
 * [�Է�]
 * 5
 * 3
 * 
 * [���]
 * 5 * 5 * 5 = 125
 * 
 */

public class RecursiveEx {
	static int add(int n, int m) {
		if (m <= 0) return 1;
		return n * add(n, m-1);
	}
	
	static void start() {
		Scanner s = new Scanner(System.in);
		System.out.print("�Է� : ");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		
		System.out.println(add(n1, n2));
	}
	public static void main(String[] args) {
		start();
	}

}
