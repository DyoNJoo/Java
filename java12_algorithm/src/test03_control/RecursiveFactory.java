package test03_control;

public class RecursiveFactory {

	//for문을 이용한 팩토리얼 구하기
	static int factorialFor(int n) {
		int fact = 1; //n ~ 1까지 곱
		for (int i = n; i >= 1; i--) {
			fact *= i;
		}
		return fact;
	}
	
	//while문 이용한 팩토리얼 구하기
	static int factorialWhile(int n) {
		int fact = 1;
		while(n >= 1) {
			fact *= n;
			n--;
		}
		return fact;
	}
	
	// 반환형이 없는 재귀 호출
	static int fact = 1;
	static void factorialRecusiver(int n) {
		if (n <= 0) return;
		fact *= n;
		factorialRecusiver(n-1);
	}
	
	//반환형이 있는 재귀 호출
	static int factorialRecusiver2(int n) {
		if (n == 1) return 1;
		// 5 * 4 * 3 * 2 * 1
		return n * factorialRecusiver2(n-1);
	}
	public static void main(String[] args) {
		// 임의의 값까지 팩토리얼구하기
		System.out.println(factorialFor(5));
		System.out.println(factorialWhile(5));
		
		factorialRecusiver(5);
		System.out.println(fact);
		
		System.out.println(factorialRecusiver2(5));
	}

}
