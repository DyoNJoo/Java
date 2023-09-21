package java05_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest4 {
	Scanner sc = new Scanner(System.in);
	public ExceptionTest4() {
		int x = inData("first");
		int y = inData("second");
		hap(x, y);
		divide(x, y);
	}
	//입력받는 메소드
	public int inData(String msg) throws InputMismatchException, ArithmeticException, ArrayIndexOutOfBoundsException {
		System.out.print(msg + " -> ");
		return sc.nextInt();
	}
	//합
	public void hap(int x, int y) throws ArithmeticException, ArrayIndexOutOfBoundsException {
		System.out.println("합 -> " + (x + y));
	}
	//나누기
	public void divide(int x, int y) throws ArithmeticException, ArrayIndexOutOfBoundsException {
		System.out.println("몫 -> " + (x / y));
		getData();
	}
	//배열이용 메소드
	public void getData() throws ArrayIndexOutOfBoundsException {
		int a[] = {10, 20, 30};
		int s = 0;
		for (int i = 0; i <= a.length; i++) {
			s += a[i];
		}
		System.out.println("배열의 합 -> " + s);
	}
	public static void main(String[] args) {
		try {
			new ExceptionTest4();
		} catch (InputMismatchException e) {
			System.out.println("입력예외 발생함.");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없음.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 첨자 값이 잘못 입력되었습니다.");
		}
	}

}
