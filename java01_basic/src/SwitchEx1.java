import java.util.*;

public class SwitchEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� = ");
		int kor = sc.nextInt();
		System.out.print("���� ���� = ");
		int eng = sc.nextInt();
		System.out.print("���� ���� = ");
		int mat = sc.nextInt();
		
		int total = kor + eng + mat;
		int average = total / 3;
		int switch_num = average / 10;
		char grade;
		
		System.out.println("���� = " + total);
		System.out.println("��� = " + average);
		
		switch(switch_num) {
		case 10:
		case 9:
			grade = 'A';
			System.out.println("���� = " + grade);
			break;
		case 8:
			grade = 'B';
			System.out.println("���� = " + grade);
			break;
		case 7:
			grade = 'C';
			System.out.println("���� = " + grade);
			break;
		case 6:
			grade = 'D';
			System.out.println("���� = " + grade);
			break;
		default:
			grade = 'F';
			System.out.println("���� = " + grade);
			break;
		}
	}

}
