import java.util.Scanner;


public class ArrayExScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//�л����� �Է¹޾� ���κ� ����, ���, ����, ���� ����, ���
		String title[] = { "����", "����", "����" };
		
		//�л� �� �Է¹޾� �����͸� ������ ���� Ȯ��
		System.out.print("�л��� = ");
		int cnt = Integer.parseInt(sc.nextLine()); // "5" -> 5
		
		//�л����� ������ �迭
		String names[] = new String[cnt]; //�л��� ��ŭ ����, ex) 5 -> index 0,1,2,3,4
		//����, ����, ���, ���� ���� ������ �迭
		double jumsu[][] = new double[cnt + 2][6]; //�ؿ� ���� ������ ����� �־�� �ϹǷ� cnt + 2
		
		//�⺻������ �Է¹ޱ�
		
		for (int i = 0; i < cnt; i++) {//�л�����ŭ
			System.out.print("�л��̸� = ");
			names[i] = sc.nextLine();
			for (int j = 0; j < title.length; j++) {
				System.out.print(title[j] + " = ");
				jumsu[i][j] = Double.parseDouble(sc.nextLine());
			}
		}
		
		//����ó��
		for (int i = 0; i < cnt; i++) { //0, 1, 2, 3, 4
			for (int j = 0; j < title.length; j++) {
				jumsu[i][3] += jumsu[i][j]; //���κ� ����
				jumsu[cnt][j] += jumsu[i][j]; //��������
			}
			jumsu[i][4] = jumsu[i][3] / title.length; //���κ� ���
		}
		
		//���� ���
		for (int i = 0; i < title.length; i++) {
			jumsu[cnt + 1][i] = jumsu[cnt][i] / cnt;
		}
		
		//�������ϱ�
		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < cnt; j++) {
				if(jumsu[i][4] < jumsu[j][4]) {
					jumsu[i][5]++; //���������� ���� 1����
				}
			}
			jumsu[i][5]++;
		}
		
		//����ϱ�
		System.out.println("�̸�\t����\t����\t����\t����\t���\t����");
		
		for (int i = 0; i < names.length + 2; i++) {
			if (i == cnt) {
				System.out.print("����\t");
			}
			else if (i == cnt + 1) {
				System.out.print("���\t");
			}
			else {
				System.out.print(names[i] + "\t"); //�̸� ���
			}
			
			//������, ����, ���, ����
			for (int j = 0; j < jumsu[i].length; j++) {
				if(j == 5) {
					System.out.printf("%8d", (int)jumsu[i][j]);
				}
				else {
					System.out.printf("%8.1f", jumsu[i][j]);
				}
			}
			System.out.println();
		}
		
	}

}
