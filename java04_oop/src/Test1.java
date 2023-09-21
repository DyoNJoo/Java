
class Test1 {

}

class Ex extends Test1 {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		Ex e1 = new Ex();
		Ex e2 = (Ex)t1;
		Object o1 = (Object)t1;
		System.out.println(e2);
	}
}

