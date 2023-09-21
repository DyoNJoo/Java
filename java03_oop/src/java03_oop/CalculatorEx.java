package java03_oop;

import java.util.*;

public class CalculatorEx {
	Scanner sc = new Scanner(System.in);
	public CalculatorEx() {
		
	}
	
	public int input(String msg) {
		System.out.print(msg + " = ");
		return sc.nextInt();
	}
	
	public int plus(int x, int y) {
		return x + y;
	}
	
	public int minus(int x, int y) {
		return x - y;
	}
	
	public int add(int x, int y) {
		return x * y;
	}
	
	public int div(int x, int y) {
		return x / y;
	}
	
	public void result(int x, int y) {
		System.out.printf("%d + %d = %d\n", x, y, plus(x, y));
		System.out.printf("%d - %d = %d\n", x, y, minus(x, y));
		System.out.printf("%d * %d = %d\n", x, y, add(x, y));
		System.out.printf("%d / %d = %d\n", x, y, div(x, y));
	}
	public static void main(String[] args) {
		CalculatorEx cal = new CalculatorEx();
		int a = cal.input("첫번째 수");
		int b = cal.input("두번째 수");
		cal.result(a, b);
	}

}
