//1. �߻�Ŭ���� ���

public class AbstractMain extends AbstractTest {

	public AbstractMain() {
		// TODO �ڵ� ������ ������ ����
	}
	
	@Override
	public void plus(int i, int j) {
		int r = i + j;
		System.out.printf("%d + %d = %d\n", i, j, r);
	}
	
	@Override
	public int minus(int x, int y) {
		return 0;
	}
	
	@Override
	public void multiple() {
		System.out.println("multiple() �޼ҵ� ����");
	}

	public static void main(String[] args) {
		//�߻�Ŭ������ �̿��� �޼ҵ尡 ���ԵǾ� �����Ƿ� ��ü�� ������ �� ����.
		//AbstractTest at = new AbstractTest();
		
		AbstractMain am = new AbstractMain();
		am.method1();
		am.plus(45, 12);
		am.multiple();
	}

}
