class Test {
	public int a;
	protected Test(int a) {
		this.a = a;
	}
}

class Ex extends Test1 {
	protected Ex(int a) { //private -> public / protected·Î ¼öÁ¤
		super(a);
	}
}


public class Sam {
	public static void main(String[] args) {
		Ex ob = new Ex(420);
		System.out.print(ob.a);
	}
}

