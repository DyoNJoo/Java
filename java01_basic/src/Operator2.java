
public class Operator2 {

	public static void main(String[] args) {
		//관계(비교연산자) : >, <, >=, <=, ==, !=
		
		int a = 10;
		int b = 15;
		// 비교연산자를 이용한 연산은 결과가 논리형이다. 조건식
		boolean r1 = a > b;
		System.out.println("r1 = " + r1);
		
		// 산술 > 비교(관계)
		// 10 < 18
		boolean r2 = a < b + 3;
		System.out.println("r2 = " + r2);
		
		//삼항연산자 : (조건식) ? 참 : 거짓
		int score = 65; // 80점 이상이면 A, 미만이면 B
		String grade = score >= 80 ? "A" : "B";
		System.out.println("grade = " + grade);
		
		char grade2 = (score >= 80) ? 'A' : (score >= 70) ? 'B' : 'C';
		System.out.println("grade2 = " + grade2);
		
		int x = 36;
		//x의 값이 0보다 크면 "양수", 0보다 작으면 "음수", 0은 "0"이 출력이되는 삼항연산 수식을 세운다.
		String r3 = (x > 0) ? "양수" : (x < 0) ? "음수" : "0";
		System.out.println("x는 " + r3);
	}

}
