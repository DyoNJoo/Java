package test01_basic;

import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��Ͻÿ� : ");
		int dan = sc.nextInt();
		int i = 1;
		
		while (i < 10) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
			i++;
		}
	}

}
