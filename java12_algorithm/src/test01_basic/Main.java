package test01_basic;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int middleNumber(int a, int b, int c) {
		//a < b < c
		//a > b > c
		if (a < b && b < c || a > b && b > c) {
			return b;
		} else if (b < c && c < a || b > c && c > a) {
//			b < c < a
//			b > c > a
			return c;
		} else if (c < a && a < b || c > a && a > b) {
//			c < a < b
//			c > a > b
			return a;
		} else
			return -1; //중간값이 없을때
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 -> ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.nextLine(); //엔터 버리기

		System.out.println("중간값 -> " + middleNumber(a, b, c));
	}

}

/*
a < b < c
a > b > c

중간값은 b

b < c < a
b > c > a

중간값은 c

c < a < b
c > a > b

중간값은 a
*/