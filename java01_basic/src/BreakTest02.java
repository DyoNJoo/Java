
public class BreakTest02 {

	public static void main(String[] args) {
		point:
		
		for (int i = 1; i <= 10; i += 1) {
			for (int j = 1; j <= 10; j += 1) {
				System.out.println("i = " + i + ", j = " + j);
				if(j == 5) {
					break point;
				}
			}
		}
		int n = 1;
		int sum = 0;
		while (true) {
			sum += n;
			System.out.println("1 ~ " + n + "까지의합은 " + sum);
			if (n > 10) {
				break;
			}
			n++;
			
			
		}
	}

}
