import java.lang.System;
import java.lang.String;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 = ");
		int dataInt = Integer.parseInt(scan.nextLine());
		System.out.printf("값 = %d\n", dataInt);
		
		System.out.print("실수 = ");
		double dataDouble = Double.parseDouble(scan.nextLine());
		System.out.printf("값 = %f\n", dataDouble);
		
		System.out.print("문자 입력 = ");
		String name = scan.nextLine();
		System.out.println(name);
		
		System.out.println();
		String str = "";
	}

}
