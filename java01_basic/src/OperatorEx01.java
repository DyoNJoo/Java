import java.util.Scanner;

public class OperatorEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�޿� => ");
		
		int salary = Integer.parseInt(sc.nextLine());
		int bonus = (int)((salary >= 100) ? salary * 0.1 : salary * 0.2);
		
		System.out.printf("���ʽ� => %d\n", bonus);
		
//		double money = sc.nextDouble();
//		double bonus;
//		
//		if (money <= 100) {
//			bonus = 0.2 * money;
//		}
//		else {
//			bonus = 0.1 * money;
//		}
//		
//		System.out.printf("���ʽ� => %f\n", bonus);
	}
}
