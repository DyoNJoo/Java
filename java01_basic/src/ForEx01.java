import java.util.*;

public class ForEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("´Ü = ");
		int dan = sc.nextInt();
		int sum = 0;
		for (int i = 1; i < 10; i++) {
			sum = dan * i;
			System.out.printf("%d * %d = %d\n", dan, i, sum);
		}
	}

}
