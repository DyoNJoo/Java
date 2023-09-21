package java05_exception;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest1 {

	public ExceptionTest1() {
		// 두수를 입력받아 합을 출력하라.
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("첫번째정수 = "); // "12.6" "abc"
			int n1 = sc.nextInt(); // InputMismatchException -> 문자열을 정수로 변환해야 하는데 정수로 바꿀 수 없는 문자
			
			//Integer.parseInt(scan.nextLint());
			
			System.out.print("두번째정수 = ");
			int n2 = sc.nextInt();
			
			int hap = n1 + n2;
			System.out.println("n1 + n2 = " + hap);
			
			int divide = hap/n2; // 15/0 프로그램에서는 어떤 수를 0으로 나눌 수 없다. ArithmeticException
			System.out.println("hap / n2 = " + divide);
			
			int[] arr = new int[4]; // arr[0] ~ arr[3]
			arr[arr.length-1] = 120; // 배열 arr의 길이는 4다. 하지만 배열의 인덱스는 0부터 3까지이므로 arr.length = 4가 되며, arr[4]는 존재하지 않는 인덱스다.
			// 결과는 ArrayIndexOutOfBoundsException 예외처리 발생
			System.out.println(Arrays.toString(arr));
		} catch (InputMismatchException ime) {
			System.out.println("정수를 입력하여야 합니다.");
			System.out.println(ime.getMessage());
			ime.printStackTrace();
		} catch (ArithmeticException ae) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(ae.getMessage());
			ae.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			System.out.println("index를 잘못 사용하였습니다.");
			System.out.println(aioobe.getMessage());
			aioobe.printStackTrace();
		} finally { //try문코드가 예외 발생하든 안하든 부조건 실행되는 영역
			System.out.println("finally는 무조건 실행됨");			
		}
		
	}

	public static void main(String[] args) {
		new ExceptionTest1();

	}

}
