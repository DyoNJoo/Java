import java.util.*;

public class IfEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ϴ� �޴��� ����");
		System.out.println("1. �簢���� ����");
		System.out.println("2. ���� ����");
		int input = sc.nextInt();
		
		if (input == 1) {
			System.out.print("����(�غ�) = ");
			double n1 = sc.nextDouble();
			System.out.print("����(����) = ");
			double n2 = sc.nextDouble();
			double result = n1 * n2;
			System.out.printf("�簢���� ���� = %.2f\n", result);
		}
		else if (input == 2) {
			System.out.print("������ = ");
			double radius = sc.nextDouble();
			double result = Math.PI * radius * radius;
			System.out.printf("���� ���� = %.2f\n", result);
		}
		else
		{
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
		}
	}

}
