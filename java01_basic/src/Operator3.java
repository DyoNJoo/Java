
public class Operator3 {

	public static void main(String[] args) {
		// 논리연산자
		
		int data = 0;
		boolean result = data >= 1 && data <= 100;

		String msg = result ? "1~100사이의 값" : "범위 밖";
		System.out.println(msg);

	}

}
