package java05_exception;

public class MyException extends Exception {

	public MyException() {
		super("���� ������ �Է��ϼž� �մϴ�.");
	}
	public MyException(String message) {
		//����Ŭ������ �����ڸ޼ҵ� ȣ��
		super(message);
	}
}
