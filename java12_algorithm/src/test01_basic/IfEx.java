package test01_basic;

import java.util.Scanner;

public class IfEx {

	public IfEx() {
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int avg = 0;
		System.out.print("���������Է� : ");
		int kor = sc.nextInt();
		System.out.print("���������Է� : ");
		int eng = sc.nextInt();
		System.out.print("���������Է� : ");
		int math = sc.nextInt();
		
		sum = kor + eng + math;
		avg = sum / 3;
		
		String result = "";
		
		if (kor < 40 || eng < 40 || math < 40) {
			result = "�������� ���հ�";
		} else {
			if (avg >= 60) {
				result = "�հ�";
			} else {
				result = "���հ�";
			}
		}

		System.out.println("��� = " + result);
	}

}
