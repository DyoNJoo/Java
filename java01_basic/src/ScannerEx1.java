import java.util.*;
//ctrl + space�� �̿��Ͽ� import

public class ScannerEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� = ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 1) ? "Ȧ��" : "¦��";
		//String result = (num % 2 == 0) ? "¦��" : "Ȧ��";
		
		System.out.printf("%d�� %s�Դϴ�.\n", num, result);
		
//		if (num % 2 == 0) {
//			System.out.printf("%d�� ¦���Դϴ�.\n", num);
//		}
//		else {
//			System.out.printf("%d�� Ȧ���Դϴ�.\n", num);
//		}
	}

}
