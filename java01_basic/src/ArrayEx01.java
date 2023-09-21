import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String lbl[] = { "국어", "영어", "수학", "과학", "물리" };
		int score[] = new int[lbl.length];
		int sum = 0;
		double avg = 0;
		
		System.out.println("국어, 영어, 수학, 과학, 물리시험에 대한 점수를 처리하라.");
		
		for (int i = 0; i < lbl.length; i++) {
			System.out.printf("%s = ", lbl[i]);
			score[i] = sc.nextInt();
			sum += score[i];
		}
		
		avg = sum / lbl.length;
	
		System.out.println("총점 = " + sum);
		System.out.println("평균 = " + avg);

	}

}
