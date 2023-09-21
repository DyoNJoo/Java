import java.util.*;

public class ForEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 = ");
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
		
		System.out.println("1 ~ " + (i-1) + "까지의 홀수의 합은 " + sum);
		System.out.println("1 ~ " + (i-1) + "까지의 짝수의 합은 " + sum2);
		System.out.println("1 ~ " + (i-1) + "까지의 합은 " + total);
	}

}
