package test01_basic;

public class ForEx {

	public static void main(String[] args) {
		for (int i = 2; i <= 50; i++) { //2, 3, 4, 5, 6, ... 50
			int j;
			for (j = 2; j <= i; j++) { // (i = 3, j = 2 / i = 4, j = 2, 3)
				if (i % j == 0) {
					break; //���������� �Ҽ��� �ƴ�
				}
			}
			// �Ҽ��϶� ���
			// i = 4, j = 2
			// i = 5, j = 5
			if (i == j)
				System.out.print(i + " ");
		}
	}
}
