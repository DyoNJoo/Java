package test03_control;

import java.util.Scanner;

/*
 * 두수를 입력받아 거듭제곱을 구하는 프로그램을 재귀호출로 작성
 * [입력]
 * 5
 * 3
 * 
 * [출력]
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
		System.out.print("입력 : ");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		
		System.out.println(add(n1, n2));
	}
	public static void main(String[] args) {
		start();
	}

}
