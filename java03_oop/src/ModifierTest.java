import com.muitlcampus.Books;
import com.muitlcampus.Test;

public class ModifierTest {

	public static void main(String[] args) {
		// public ���������� : class, field, constractor �޼ҵ�, �޼ҵ�
		// 					��𿡼��� ������ ����Ѵ�. ����
		
		//CalendarOOP2 oop = new CalendarOOP2();
		//System.out.println(oop.data);
		//oop.start();
		
		//default ���������� : Ŭ����, �ʵ�(�������), �����ڸ޼ҵ�, �޼ҵ�
		//					���� ��Ű������ Ŭ������ ���� ����
		
		Test t = new Test();
		int n = t.num;
		System.out.println("n = " + n);
		
		//t.plus(50, 25); //
		
		Data d = new Data();
		System.out.println("userid = " + d.userid);
		d.dataOutput();
		
		//private ���������� : �ʵ��, ������ �޼ҵ�, �޼ҵ�
		//					�ʵ�� : ��ü�� ���� ������ �Ұ�����.
		//d.password -> �ʵ�� : ��ü ���� ���ٺҰ�
		
		//Data d2 = new Data("orange"); //private ������������ ������ ��ü�� ������ �� ����.
		//d.information(); //���������ڰ� private�̹Ƿ� ��ü��.�޼ҵ���� ������ �Ұ�����.
		d.test();
		
		//protected : �ʵ�, ������, �޼ҵ�
		//			  ���� ��Ű���� ������ ������ �� �ִ�.
		//			  �ٸ� ��Ű�������� �ݵ�� ��ӹ޾� ����ؾ� �Ѵ�.
		
		Product p = new Product();
		System.out.println(p.productName); //��ü�� ���� protected���� �����ϱ�
		p.output();
		
		//Books b = new Books(); //������ protected�̰� �ٸ� ��Ű���� �����Ƿ� ���ٺҰ�
		Books b2 = new Books("����");
		
		//String bookname = b2.bookName;
		System.out.println("b2.bookName -> " + b2.getBookName());
	}

}
