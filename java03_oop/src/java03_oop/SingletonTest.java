package java03_oop;

public class SingletonTest {
	//new를 이용하여 객체를 생성할 수 없도록 만든다.
	//static 멤버변수를 이용하여 객체를 중복 생성한다.
	private static SingletonTest single = null;
	
	//public, private, protected, default
	//private 접근 제한자를 이용하여 외부에서 객체생성불가로 만들기
	private SingletonTest() {
		
	}

	//객체를 생성하여 리턴해주는 메소드 : getInstance();
	public static SingletonTest getInstance() {
		//객체없을 때 객체생성하기
		if (single == null) {
			single = new SingletonTest();
		}
		return single;
	}
}
