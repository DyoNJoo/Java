
public class Child extends Parent{
	String username = "sunsin";
	int age = 25;
	public Child() {
		
	}
	
	@Override
	public void nameOutput() {
		System.out.println("name -> " + username);
	}
	
	public void output() {
		System.out.println(num + ", " + username);
	}
}
