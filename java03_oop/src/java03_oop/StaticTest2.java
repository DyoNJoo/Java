package java03_oop;

public class StaticTest2 {

	int bun = 12;
	static String name = "ȫ�浿";
	
	//�Ű������� ���� �����ڴ� �����Ϸ� �����Ͻ� �������ش�.
	public StaticTest2(int bun) {
		this.bun = bun;
	}
	
	public String gugudan(int dan) {
		String result = "";
		for (int i = 1; i <= 9; i++) {
			result += dan + "*" + i + "=" + (dan*i) + "";
		}
		return result;
	}
	
	public static String dan(int dan) {
		String result = "";
		for (int i = 1; i <= 9; i++) {
			result += dan + "*" + i + "=" + (dan*i) + "\n";
		}
		return result;
	}
	
	public static void main(String[] args) {
		StaticTest2 st = new StaticTest2(2);
		System.out.println("bun -> " + st.bun); //bun��������� static���� �ƴϹǷ� ��ü�� �����Ͽ��� ����� �����ϴ�.
		System.out.println("name -> " + name); //StaticTest2.name
		
		//gugudan(5); //static ���� �޼ҵ�� ���� Ŭ������ ��ü�� ����� ��ü��.�޼ҵ������ ȣ���ؾ���
		System.out.println(dan(5));
	}

}
