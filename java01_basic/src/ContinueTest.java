
public class ContinueTest {

	public static void main(String[] args) {
		//continue�� : �ݺ����� 1�ܰ� �ǳʶڴ�.
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}

	}

}
