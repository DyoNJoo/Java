import java.lang.System;
import java.lang.String;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� = ");
		int dataInt = Integer.parseInt(scan.nextLine());
		System.out.printf("�� = %d\n", dataInt);
		
		System.out.print("�Ǽ� = ");
		double dataDouble = Double.parseDouble(scan.nextLine());
		System.out.printf("�� = %f\n", dataDouble);
		
		System.out.print("���� �Է� = ");
		String name = scan.nextLine();
		System.out.println(name);
		
		System.out.println();
		String str = "";
	}

}
