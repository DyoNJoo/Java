package test01_basic;

public class DoWhileEx {

	public static void main(String[] args) {
		int c = 0;
		int max = 64;
		do {
			c++;
			int r = (int)(Math.random()*(90-65+1)) + 65;
			System.out.print(r + " ");
			if (r > max) {
				max = r;
			}
		} while (c < 10);
		System.out.println("\n" + max);
	}

}
