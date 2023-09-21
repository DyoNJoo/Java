
public class IfElseIf01 {

	public static void main(String[] args) {
		int kor = 95;
		int eng = 80;
		int mat = 70;

		int total = kor + eng + mat;
		double average = total / 3. ;
		
		char grade;
		if (average >= 90) {
			grade = 'A';
		}
		else if (average >= 80) {
			grade = 'B';
		}
		else if (average >= 70) {
			grade = 'C';
		}
		else if (average >= 60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		
		String grade2 = "";
		if (average >= 90) {
			grade2 = "A";
		}
		if (average >= 80 && average < 90) {
			grade2 = "B";
		}
		if (average >= 70 && average < 80) {
			grade2 = "C";
		}
		if (average >= 60 && average < 70) {
			grade2 = "D";
		}
		
		System.out.println("ÃÑÁ¡ = " + total);
		System.out.println("Æò±Õ = " + average);
		System.out.println("ÇĞÁ¡ = " + grade);
		System.out.println("ÇĞÁ¡2 = " + grade2);
	}

}
