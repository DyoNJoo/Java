
public class BreakTest01 {

	public static void main(String[] args) {
		for (int i = 1; ; i++) {
			System.out.println("i = " + i);
			
			if (i > 10) {
				 break;
			}
		}
		System.out.println("�ݺ��� ����.");
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println("i = " + i + ", j = " + j);
				
				if (j == 5) {
					break;
				}
			}
		}
		
	}

}
