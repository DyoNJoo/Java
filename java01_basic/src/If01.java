import java.util.*;

public class If01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1234;
		
		System.out.print("임의의 수 : ");
		int data = sc.nextInt();
		
		if (data >= 1) {
			System.out.println("data = " + data);
			int x = 5678;
			System.out.println("if -> " + n +", " + x);
		}
		System.out.println("The End");
	}

}
