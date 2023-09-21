import java.util.Scanner;


public class WhileEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Á¤¼ö = ");
			int input = sc.nextInt();
			int i = 0;
			int sum = 0;
			int sum2 = 0;
			
			while (i <= input) {
				if (i % 2 == 0) {
					sum += i;
				}
				else {
					sum2 += i;
				}
				i++;
			}
			
			System.out.printf("È¦¼öÇÕ = %d\n", sum2);
			System.out.printf("Â¦¼öÇÕ = %d\n", sum);
		}
	}
}
