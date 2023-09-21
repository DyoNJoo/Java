package java03_oop;

import java.util.*;

public class Sample {
	Scanner sc = new Scanner(System.in);
	//매개변수가 없는 생성자 메소드
	public Sample() {
	}
	
	//매개변수 String이 있는 생성자메소드
	public Sample(String message) {
		System.out.print(message);
		//기능 : 매개변수 값을 콘솔에 출력하는 기능이 있다.
	}
	
	//매개변수없이 1~100까지 합을 리턴하는 메소드
	public int total() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}
	
	//매개변수로 정수형을 받아 1부터 그 수까지 합을 구하여 리턴하는 메소드
	public int inputtotal(int max) {
		int sum = 0;
		for (int i = 1; i <= max; i++) {
			sum += i;
		}
		return sum;
	}
	
	//매개변수로 정수형을 받아 1부터 그 수까지 홀수의 합을 구하여 출력하는 메소드
	public void oddnumber(int max) {
		int sum = 0;
		for (int i = 1; i <= max; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.printf("1부터 %d까지 홀수의 합은 %d\n", max, sum);
	}
	
	//매개변수로 정수형을 받아 1부터 그 수까지 짝수의 합을 구하여 리턴하는 메소드
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
		System.out.println("1 ~ 100까지의 합은 " + total());
		System.out.println("1 ~ " + max + "까지의 합은 " + inputtotal(max));
		oddnumber(max);
		System.out.println("1 ~ " + max + "까지의 합은 " + evennumber(max));
	}
	
}
