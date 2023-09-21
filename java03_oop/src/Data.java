
public class Data {

	String userid = "ggm";
	private String password = "1234";
	Data() {
		System.out.println("생성자 메소드 실행됨");
	}
	private Data(String userid) {
		this.userid = userid;
	}
	void dataOutput() {
		System.out.println(userid);
	}
	private void information() {
		System.out.println(userid + " = " + password);
	}
	void test() {
		information();
	}
}
