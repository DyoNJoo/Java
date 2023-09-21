package java05_exception;

public class ExceptionTest3 {

	public ExceptionTest3() {
		// TODO 磊悼 积己等 积己磊 胶庞
	}
	
	public void start() throws ClassNotFoundException {
		Class cls = Class.forName("java.lang.String2");
	}

	public static void main(String[] args) throws ClassNotFoundException {
		ExceptionTest3 et3 = new ExceptionTest3();
		try {
			et3.start();
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}
