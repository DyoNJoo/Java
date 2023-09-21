package java02_basic_API;

public class StringBufferTest {

	public static void main(String[] args) {
		// StringBuffer는 스레드가 지원
		// StringBuilder는 스레드가 지원되지 않음.
		// 객체가 생성되면 주소를 이동하지 않는다.
		
		String name = "홍길동";
		
		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = new StringBuffer(100);
		StringBuffer sb3 = new StringBuffer("스트링테스트");
		
		//문자열을 마지막에 추가하기
		sb.append("StringBuffer클래스 테스트");
		sb.append(1234);
		System.out.println("sb = " + sb.toString());

		//문자열 삽입
		sb.insert(6, "(스트링)");
		System.out.println("sb = " + sb.toString());
		
		//문자열 삭제
		sb.delete(6, 11);
		System.out.println("sb = " + sb.toString());
		
		//문자열 뒤집기
		sb.reverse();
		System.out.println("sb = " + sb.toString());
		
		
		//공간확인
		System.out.println("sb = " + sb.capacity() + ", " + sb2.capacity() + ", " + sb3.capacity());
		
	}

}
