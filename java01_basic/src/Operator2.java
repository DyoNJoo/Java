
public class Operator2 {

	public static void main(String[] args) {
		//����(�񱳿�����) : >, <, >=, <=, ==, !=
		
		int a = 10;
		int b = 15;
		// �񱳿����ڸ� �̿��� ������ ����� �����̴�. ���ǽ�
		boolean r1 = a > b;
		System.out.println("r1 = " + r1);
		
		// ��� > ��(����)
		// 10 < 18
		boolean r2 = a < b + 3;
		System.out.println("r2 = " + r2);
		
		//���׿����� : (���ǽ�) ? �� : ����
		int score = 65; // 80�� �̻��̸� A, �̸��̸� B
		String grade = score >= 80 ? "A" : "B";
		System.out.println("grade = " + grade);
		
		char grade2 = (score >= 80) ? 'A' : (score >= 70) ? 'B' : 'C';
		System.out.println("grade2 = " + grade2);
		
		int x = 36;
		//x�� ���� 0���� ũ�� "���", 0���� ������ "����", 0�� "0"�� ����̵Ǵ� ���׿��� ������ �����.
		String r3 = (x > 0) ? "���" : (x < 0) ? "����" : "0";
		System.out.println("x�� " + r3);
	}

}
