package java03_oop;

public class Member {
	int num; //0
	String name; //null
	
	public Member() {
		System.out.println("Member() ������ �޼ҵ� �����...");
	}
	public Member(int num) { //new Member(100)
		this();
		//this : ����Ŭ������ �������� num�� �����Ѵ�.
		this.num = num;
	}
	public Member(String name) {
		
	}
	public Member(int num, String name) { //new Member(200, "BTS");
		//this.num = num;		
		//������ �޼ҵ忡�� �ٸ� ������ �޼ҵ带 ȣ�� this()
		//�ݵ�� ù��° ���๮���� ǥ���Ͽ��� �Ѵ�
		this(num); //Member(int num)�� ȣ���.
		this.name = name;

	}
	public void output() {
		System.out.println(num + " -> " + name);
	}
}
