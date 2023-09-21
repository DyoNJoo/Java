import java.util.*;

public class SwitchEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 = ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 = ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 = ");
		int mat = sc.nextInt();
		
		int total = kor + eng + mat;
		int average = total / 3;
		int switch_num = average / 10;
		char grade;
		
		System.out.println("총점 = " + total);
		System.out.println("평균 = " + average);
		
		switch(switch_num) {
		case 10:
		case 9:
			grade = 'A';
			System.out.println("학점 = " + grade);
			break;
		case 8:
			grade = 'B';
			System.out.println("학점 = " + grade);
			break;
		case 7:
			grade = 'C';
			System.out.println("학점 = " + grade);
			break;
		case 6:
			grade = 'D';
			System.out.println("학점 = " + grade);
			break;
		default:
			grade = 'F';
			System.out.println("학점 = " + grade);
			break;
		}
	}

}
