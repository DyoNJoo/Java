package java05_exception;

public class MyException extends Exception {

	public MyException() {
		super("양의 정수를 입력하셔야 합니다.");
	}
	public MyException(String message) {
		//상위클래스의 생성자메소드 호출
		super(message);
	}
}
