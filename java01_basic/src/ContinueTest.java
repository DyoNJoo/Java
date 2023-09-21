
public class ContinueTest {

	public static void main(String[] args) {
		//continue문 : 반복문을 1단계 건너뛴다.
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}

	}

}
