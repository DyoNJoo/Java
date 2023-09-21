package test03_control;

import java.util.Scanner;

public class Fibonacci {
	//피보나치 수열
	// 0 1 1 2 3 5 8 13 21...
	//반복문을 이용한 피보나치 수열 구하기
	public static void forFibonacci(int n) {
		int num1 = 0; //첫번째 값
		int num2 = 1; //두번째 값
		int sum = 1; //합계 값
		
		for (int i = 0; i < n; i++) { //0,1,2,3,4
			System.out.print(sum + " ");
			//다음값
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}
	}
	//재귀호출을 이용한 피보나치 수열 구하기
	public static int fibo(int n) {
		if (n <= 1) {
			return n;
		} else {
			//전값 + 전전값
			//1		0
			//	   n의 전값	   n의 전전값
			return fibo(n-1) + fibo(n-2);
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("정수 입력 -> ");
		int j = s.nextInt();

		//반복문을 이용한 피보나치 수열 구하기
		forFibonacci(j);
		System.out.println();
		
		//재귀호출을 이용한 피보나치 수열 구하기
		for (int i = 1; i <= j; i++) { // 1, 2, 3, 4, 5
			System.out.print(fibo(i) + " ");
		}
	}

}
