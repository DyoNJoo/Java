package java02_basic_API;

public class WrapperTest {

	public WrapperTest() {

	}
	
	public void start() {
		// Wrapper클래스 : 기본 데이터형의 데이터를 객체화하는 클래스들
		int a = 10;
		int b = 3;
		
		Integer i1 = new Integer(5); //기본 타입의 값을 줄 경우
		Integer i2 = new Integer("12"); //문자열을 줄 경우
		
		String data = "24";
		
		//문자화된 숫자 -> int(Integer)
		int c = Integer.parseInt(data); //원시데이터인 int 타입을 반환 - 기본 int가 필요할시
		Integer d = Integer.valueOf(data); //Integer 래퍼(wrapper)객체를 반환 - Integer 래퍼 객체가 필요할시
		
		//기본데이터타입은 상수를 직접가진다.
		//객체형은 해당 클래스의 기능을 모두 가진다.
		System.out.println("바이트 수 -> " + d.SIZE);
		
		int e = Integer.bitCount(a); //2진수의 1의 갯수를 구한다.
		System.out.println("e = " + e);
		
		int f = Integer.parseInt("17");
		Integer g = a; // 오토박싱 : v1.5 이상은 객체형 = 기본타입데이터 대립
		int h = g; // 오토언박싱 : v 1.5이상에서 기본 타입 = 객체형
		
		System.out.println("max -> " + Integer.max(a, b));
		System.out.println("reverse -> " + Integer.reverse(a));
		
		System.out.println("29 -> " + Integer.toHexString(29) + ", " + Integer.toOctalString(29));
		//toHexString 16진수, toOctalString 8진수
	}

	public static void main(String[] args) {
		WrapperTest wt = new WrapperTest();
		wt.start();
	}

}
