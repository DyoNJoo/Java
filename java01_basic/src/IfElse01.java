import java.util.*;

public class IfElse01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if (num > 0) {
			int sum = num * 100;
			System.out.printf("%d", sum);
		}
		else if (num == 0) {
			int sum = 0;
			System.out.printf("%d", sum);
		}
		else {
			int sum = -num * 100;
			System.out.printf("%d", sum);
		}
		
	}

}
