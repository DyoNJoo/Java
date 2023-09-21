
public class TypeCastingMain {

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("c.num = " + c.num + ", c.username = " + c.username + ", c.age = " + c.age);
		
		//��� ���迡�� ���� Ŭ���� ��ü�� ���� Ŭ���� ��ü�� ������ �ϸ� �ڵ�����ȯ�� ��.
		//���� Ŭ������ �����ߴµ� �� Ŭ������ ���� Ŭ������ Parent�� �����Ѱ���.
		Parent p = new Child(); //Parent, Child, Object		�� ���� �ְ�, Child�� ����������.
		System.out.println("p.num = " + p.num + ", p.username = " + p.username);
		
		//����Ŭ������ ���� ���� ���� ����ó����.
		//System.out.println("p.num = " + p.num + ", p.username = " + p.username + ", p.age = " + p.age);
		
		//int a = 10;	double b = a;	int c = (int)b;
		
		
		//����Ŭ���� Ÿ���� instance�� ����Ŭ���� Ÿ������ �����ϱ� ���ؼ��� ���� ����ȯ�� �ʿ��ϴ�.
		Child c2 = (Child) p;
		System.out.println("c2.num = " + c2.num + ", c2.username = " + c2.username + ", c2.age = " + c2.age);
		
//		Parent pp = new Parent();	//Parent, Object	���ʿ� Child�� �������� ����.
//		Child cc = (Child) pp; //����Ŭ���� ��ü ������ ����Ŭ������ ����ȯ�� �Ҽ�����
		//���ʿ� Child�� �������� �����Ƿ� Child���� ��������ȯ�� �Ұ�����. �ذ��ϴ� ����� ���� Ŭ���� Child�� �����ؼ� Parent ���� Ŭ������ �����ؾ���.
//		System.out.println(cc.age);
		
		String str = new String("����ȯ ������");
		Object obj = new String("��Ӱ� ���谡 �ִ�.");
		Object cObj = new Child(); //Child ��ü�� ���� Object�� �ִ´�.
		
		System.out.println(str);
		System.out.println(obj);
		System.out.println(cObj);
		
		System.out.println("----------------------------------------");
		Child mc = new Child();
		mc.numOutput(); //num = 100
		mc.nameOutput(); //�̸� = sunsin
		mc.output();
		System.out.println("========================================");
		
		Parent mp = mc; //�ڵ�����ȯ		���� �����ϴ� ��ü�� Child.
		mp.numOutput();
		//mp.output(); //����Ŭ������ ����Ŭ���� �����ϸ� �������� �ִ� �޼ҵ�� ����ȴ�.
		//�������̵� �޼ҵ�� ���� -> ������ ����ȯ�ϴ��� �������̵��� ����� ������.
		mp.nameOutput();
		
		//����Ŭ���������� ��ȯ�� ��ü�� �ٽ� ����Ŭ������ ����
		Child mc2 = (Child)mp; //�ٽ� ����Ŭ������ ���� ��ȯ�Ѵ�
		mc2.numOutput();
		mc2.nameOutput();
		mc2.output();
	}

}
