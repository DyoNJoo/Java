import java.util.*;

public class CalenderEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar date = Calendar.getInstance();
		System.out.print("년도 = ");
		int year = sc.nextInt();
		System.out.print("월 = ");
		int month = sc.nextInt();
		
		System.out.printf("\t\t\t%d년 %d월\n", year, month);
	    System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
	   
	    date.set(year, month - 1, 1); //객체의 년도와 월을 설정
	    // month - 1을 하는 이유는 -1을 해줘야 해당 월로 인식하기 때문이다.
	    
	    int day = date.get(Calendar.DAY_OF_WEEK); //일요일(1)부터 토요일(7)까지의 값을 가진다.
	    
	    for (int i = 1; i < day; i++) {
	    	System.out.printf("\t");
	    }
	    
	    for (int i = 1; i <= date.getActualMaximum(Calendar.DATE); i++) {
	    	System.out.printf("%d\t", i);
	    	if (day % 7 == 0) {
	    		System.out.println();
	    	}
	    	day++;
	    }
	}
}