import java.util.*;

public class IfEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 메뉴를 선택");
		System.out.println("1. 사각형의 넓이");
		System.out.println("2. 원의 넓이");
		int input = sc.nextInt();
		
		if (input == 1) {
			System.out.print("가로(밑변) = ");
			double n1 = sc.nextDouble();
			System.out.print("세로(높이) = ");
			double n2 = sc.nextDouble();
			double result = n1 * n2;
			System.out.printf("사각형의 넓이 = %.2f\n", result);
		}
		else if (input == 2) {
			System.out.print("반지름 = ");
			double radius = sc.nextDouble();
			double result = Math.PI * radius * radius;
			System.out.printf("원의 넓이 = %.2f\n", result);
		}
		else
		{
			System.out.println("잘못 입력하였습니다.");
		}
	}

}
