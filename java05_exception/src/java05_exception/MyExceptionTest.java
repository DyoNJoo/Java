package java05_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

// 1~100사이의 값을 입력받아 그수까지의 합을 구하여 출력하는 클래스
public class MyExceptionTest {

	public MyExceptionTest() {
		
	}
	public void startSum() {
		int max = inData();
		sumOutput(max);
	}
	//입력받는메소드
	
	public int inData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요. ");
		int n;
		while (true) {
			try {
				n = sc.nextInt();
				if (n < 1 || n > 100) {
					//강제로 예외 발생 : throw
					//throw new MyException("1부터 100사이의 정수를 입력하셔야 합니다.");
					throw new MyException();
				}
				break;
			} catch(InputMismatchException e) {
				System.out.println("정수를 입력하지 않았습니다.");
				e.printStackTrace();
			} catch(MyException e) {
				System.out.println(e.getMessage());
			}
		}
		return n;
	}
	
	//합을 구하여 출력하는 메소드
	public void sumOutput(int max) {
		int sum = 0;
		for (int i = 1; i <= max; i++) {
			sum += i;
		}
		System.out.println("1 ~ " + max + "까지의 합은 " + sum);
	}
	public static void main(String[] args) {
		MyExceptionTest ex = new MyExceptionTest();
		ex.startSum();
	}

}
