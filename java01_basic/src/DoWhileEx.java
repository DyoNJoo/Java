import java.util.*;

public class DoWhileEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ���� = ");
		int j = sc.nextInt();
		int i = 0;
		int k = 0;
		
		while (true) {
			i++;
			k += i;
			if (k >= j) {
				break;
			}
		}
		System.out.printf("1 ~ %d������ ���� %d\n", i, j);
	}

}
