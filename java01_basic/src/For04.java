import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("0���� ū Ȧ���� �Է� -> ");
		int max = sc.nextInt();
		for (int i = 1; i <= max; i += 2) { //1, 3, 5, 7, 9 -> ���ٿ� ����� ������ ��

			//����
			for (int j = 1; j <= (max - i) / 2; j++) {
				System.out.print(" ");
			}
			
			//�������
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
