import java.util.*;

public class ForEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� = ");
		int i;
		int input = sc.nextInt();
		int total = 0;
		int sum = 0;
		int sum2 = 0;
		for (i = 1; i <= input; i++) {
			if (i % 2 == 0) {
				sum2 += i;
			}
			else {
				sum += i;
			}
			total += i;
		}
		
		System.out.println("1 ~ " + (i-1) + "������ Ȧ���� ���� " + sum);
		System.out.println("1 ~ " + (i-1) + "������ ¦���� ���� " + sum2);
		System.out.println("1 ~ " + (i-1) + "������ ���� " + total);
	}

}
