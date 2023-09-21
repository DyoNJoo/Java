package java02_basic_API;

public class MathTest {

	public static void main(String[] args) {
		System.out.println("abs = " + Math.abs(-67)); //절대값
		System.out.println("ceil = " + Math.ceil(12.1)); //올림값
		System.out.println("floor = " + Math.floor(12.9)); //버림값
		System.out.println("max = " + Math.max(52, 89)); //최댓값
		System.out.println("min = " + Math.min(15.3, 25.1)); //최소값
		System.out.println("pow = " + Math.pow(5, 3));
		System.out.println("round = " + Math.round(23.6)); //반올림
		System.out.println("sqrt = " + Math.sqrt(10));
		
		System.out.println("random = " + Math.random()); //난수
		System.out.println("-------------------------");
		//1~10사이의 난수를 100개만들기
		//난수 * 10 = 0~9
		//난수 * 5 = 0~4
		//난수 * 25 = 0~24
		for (int i = 1; i <= 100; i++) {
			double ran = Math.random();
			//(정수화)(난수*(큰값-작은값)+1)
			//(int)(난수*(10-1+1))
			int ranInt = (int)(ran *= (40-15+1)) + 15;
			//1부터 40까지의 난수를 생성
			//1부터 10까지는 (10-1+1) + 1
			System.out.println(ran + " -> " + ranInt);
		}
	}

}
