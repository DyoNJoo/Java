package java02_basic_API;

public class StringBufferTest {

	public static void main(String[] args) {
		// StringBuffer�� �����尡 ����
		// StringBuilder�� �����尡 �������� ����.
		// ��ü�� �����Ǹ� �ּҸ� �̵����� �ʴ´�.
		
		String name = "ȫ�浿";
		
		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = new StringBuffer(100);
		StringBuffer sb3 = new StringBuffer("��Ʈ���׽�Ʈ");
		
		//���ڿ��� �������� �߰��ϱ�
		sb.append("StringBufferŬ���� �׽�Ʈ");
		sb.append(1234);
		System.out.println("sb = " + sb.toString());

		//���ڿ� ����
		sb.insert(6, "(��Ʈ��)");
		System.out.println("sb = " + sb.toString());
		
		//���ڿ� ����
		sb.delete(6, 11);
		System.out.println("sb = " + sb.toString());
		
		//���ڿ� ������
		sb.reverse();
		System.out.println("sb = " + sb.toString());
		
		
		//����Ȯ��
		System.out.println("sb = " + sb.capacity() + ", " + sb2.capacity() + ", " + sb3.capacity());
		
	}

}
