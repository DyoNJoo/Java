package java03_oop;

public class ClassTestMain {

	public static void main(String[] args) {
		ClassTest ct1 = new ClassTest();
//		ClassTest ct2 = new ClassTest(100);
//		ClassTest ct3 = new ClassTest("RED");
//		ClassTest ct4 = new ClassTest(200, "ORANGE");
		
		//��ü���� �޼ҵ带 ȣ���Ͽ� ����� �����Ѵ�.
		// ��ü��, �޼ҵ��()
		int returnValue = ct1.getNum();
		System.out.println("returnValue = " + returnValue);
		int returnValue2 = ct1.getNum();
		System.out.println("returnValue2 = " + returnValue2);
		System.out.println("ct1.setName() = " + ct1.name);
			
		ct1.setName(); //��ȯ���� ����(void) ���ϰ��� �����Ƿ� ������ �����Ҽ� ����
		
		int returnValue3 = ct1.getNum(10000);
		System.out.println("returnValue3 = " + returnValue3);
		
		//��ü ������ ������� ���
		System.out.println("ct1.setName() = " + ct1.name);
		
		//�ֿܼ� ���Է¹ޱ�
		String str = ct1.scan.nextLine();
		System.out.println("str = " + str);
	}

}
