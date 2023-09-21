package java03_oop;

import java.util.*;

public class Sample {
	Scanner sc = new Scanner(System.in);
	//�Ű������� ���� ������ �޼ҵ�
	public Sample() {
	}
	
	//�Ű����� String�� �ִ� �����ڸ޼ҵ�
	public Sample(String message) {
		System.out.print(message);
		//��� : �Ű����� ���� �ֿܼ� ����ϴ� ����� �ִ�.
	}
	
	//�Ű��������� 1~100���� ���� �����ϴ� �޼ҵ�
	public int total() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}
	
	//�Ű������� �������� �޾� 1���� �� ������ ���� ���Ͽ� �����ϴ� �޼ҵ�
	public int inputtotal(int max) {
		int sum = 0;
		for (int i = 1; i <= max; i++) {
			sum += i;
		}
		return sum;
	}
	
	//�Ű������� �������� �޾� 1���� �� ������ Ȧ���� ���� ���Ͽ� ����ϴ� �޼ҵ�
	public void oddnumber(int max) {
		int sum = 0;
		for (int i = 1; i <= max; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.printf("1���� %d���� Ȧ���� ���� %d\n", max, sum);
	}
	
	//�Ű������� �������� �޾� 1���� �� ������ ¦���� ���� ���Ͽ� �����ϴ� �޼ҵ�
	public int evennumber(int max) {
		int sum = 0;
		for (int i = 1; i <= max; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		return sum;
	}

	public void allSum(int max) {
		System.out.println("1 ~ 100������ ���� " + total());
		System.out.println("1 ~ " + max + "������ ���� " + inputtotal(max));
		oddnumber(max);
		System.out.println("1 ~ " + max + "������ ���� " + evennumber(max));
	}
	
}
