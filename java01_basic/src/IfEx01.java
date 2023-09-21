import java.util.*;

public class IfEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째수 : ");
		int num2 = sc.nextInt();
		
		if (num1 >= 1 && num2 >= 1) {
			int sum = num1 + num2;
			int dif = num1 - num2;
			int pro = num1 * num2;
			int quo = num1 / num2;
			System.out.printf("%d + %d = %d\n", num1, num2, sum);
			System.out.printf("%d - %d = %d\n", num1, num2, dif);
			System.out.printf("%d * %d = %d\n", num1, num2, pro);
			System.out.printf("%d / %d = %d\n", num1, num2, quo);
		}
		else {
			System.out.println("두 수중 하나가 양수가 아닙니다.");
		}

	}

}
