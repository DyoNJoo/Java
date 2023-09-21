import java.util.*;
//ctrl + space를 이용하여 import

public class ScannerEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 = ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 1) ? "홀수" : "짝수";
		//String result = (num % 2 == 0) ? "짝수" : "홀수";
		
		System.out.printf("%d은 %s입니다.\n", num, result);
		
//		if (num % 2 == 0) {
//			System.out.printf("%d는 짝수입니다.\n", num);
//		}
//		else {
//			System.out.printf("%d는 홀수입니다.\n", num);
//		}
	}

}
