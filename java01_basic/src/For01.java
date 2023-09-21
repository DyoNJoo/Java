
public class For01 {

	public static void main(String[] args) {
		int sum = 0;
		int i;
		for (i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~" + (i-1) + "까지의 합은 = " + sum);
		
		for (int j = 5; j >=1 ; j--) {
			System.out.println(j);
		}
		
		for (int x = 2; x <= 10; x += 2) {
			System.out.println(x);
		}
		
	}

}
