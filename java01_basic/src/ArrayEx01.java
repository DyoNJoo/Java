import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String lbl[] = { "����", "����", "����", "����", "����" };
		int score[] = new int[lbl.length];
		int sum = 0;
		double avg = 0;
		
		System.out.println("����, ����, ����, ����, �������迡 ���� ������ ó���϶�.");
		
		for (int i = 0; i < lbl.length; i++) {
			System.out.printf("%s = ", lbl[i]);
			score[i] = sc.nextInt();
			sum += score[i];
		}
		
		avg = sum / lbl.length;
	
		System.out.println("���� = " + sum);
		System.out.println("��� = " + avg);

	}

}
