//�߻�Ŭ������ �߻�޼ҵ带 1���̻� �����ϰ� �ִ� Ŭ�����̴�.
//�߻�޼ҵ带 �����ϰ� �ִ� Ŭ������ class Ű���� ���ʿ� abstract�� �����Ѵ�.
//�߻�Ŭ������ ����Ҷ� �ݵ�� ����� �޾ƾ���.
//��� �߻�޼ҵ带 �������̵��� �Ͽ��� �Ѵ�.
public abstract class AbstractTest extends AbstractSuper {
    public AbstractTest() {
    
    }

    public void method1() {
        System.out.println("method1() �����");
    }

    // �߻� �޼ҵ�
    public abstract void plus(int a, int b);

    public abstract int minus(int x, int y);
}
