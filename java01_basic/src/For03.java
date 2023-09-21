
public class For03 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				//System.out.printf("%3d", j);
				System.out.printf("%3s", "*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				
				//System.out.printf("%3d", j);
				System.out.printf("%3s", "*");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > 0; j--) {
				if (j > i) {
					System.out.printf("%3s", " ");
				}
				else {
					System.out.printf("%3s", "*");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		
		for (int i = 5; i >= 1; i--) {
			for (int j = 5; j >= 1; j--) {
				if (j > i) {
					System.out.printf("%3s", " ");
				}
				else {
					System.out.printf("%3s", "*");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		
		for (int i = 5; i >= 1; i--) {
			for (int s = 1; s <= 5-i; s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
