
public class GuGuDan {

	public static void main(String[] args) {
		
		 for (int startDan = 1; startDan < 10; startDan += 3) { //한번 실행할때마다 수식이 3씩 증가.
			 //단제목		1		2		3
			 for (int dan = startDan; dan < startDan + 3; dan++) { // 1 -> dan 1,2,3		4 -> dan 4, 5, 6		7 -> dan 7, 8, 9
				 System.out.print("=  " + dan + "단  = \t");
			 }
			 System.out.println();
			 
			 //구구단 출력
			 for (int i = 2; i <= 9; i++) { //2, 3, 4, 5, 6, 7, 8, 9
				 for (int dan = startDan; dan < startDan + 3; dan++) { // 1 -> dan 1,2,3		4 -> dan 4, 5, 6		7 -> dan 7, 8, 9
					 System.out.printf("%d * %d = %d\t", dan, i , dan * i);
				 }
				 System.out.println();
			 }
		 }
	  }
}