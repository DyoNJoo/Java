package java02_basic_API;

public class MathTest {

	public static void main(String[] args) {
		System.out.println("abs = " + Math.abs(-67)); //���밪
		System.out.println("ceil = " + Math.ceil(12.1)); //�ø���
		System.out.println("floor = " + Math.floor(12.9)); //������
		System.out.println("max = " + Math.max(52, 89)); //�ִ�
		System.out.println("min = " + Math.min(15.3, 25.1)); //�ּҰ�
		System.out.println("pow = " + Math.pow(5, 3));
		System.out.println("round = " + Math.round(23.6)); //�ݿø�
		System.out.println("sqrt = " + Math.sqrt(10));
		
		System.out.println("random = " + Math.random()); //����
		System.out.println("-------------------------");
		//1~10������ ������ 100�������
		//���� * 10 = 0~9
		//���� * 5 = 0~4
		//���� * 25 = 0~24
		for (int i = 1; i <= 100; i++) {
			double ran = Math.random();
			//(����ȭ)(����*(ū��-������)+1)
			//(int)(����*(10-1+1))
			int ranInt = (int)(ran *= (40-15+1)) + 15;
			//1���� 40������ ������ ����
			//1���� 10������ (10-1+1) + 1
			System.out.println(ran + " -> " + ranInt);
		}
	}

}
