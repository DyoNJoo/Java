
public class Data {

	String userid = "ggm";
	private String password = "1234";
	Data() {
		System.out.println("������ �޼ҵ� �����");
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
