import java.util.Calendar;
import java.util.Scanner;

public class CalenderExans {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar date = Calendar.getInstance();
		
		String title[] = {"일", "월", "화", "수", "목", "금", "토"};
		
		System.out.print("년도 = ");
		int year = sc.nextInt();
		System.out.print("월 = ");
		int month = sc.nextInt();
		
		date.set(year, month - 1, 1);
		
		int week = date.get(Calendar.DAY_OF_WEEK);
		
		int lastDay = 31;
		
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			lastDay = 30;
		case 2:
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				lastDay = 29;
			}
			else {
				lastDay = 28;
			}
		}
		
		System.out.printf("\t\t\t%d년 %d월\n", year, month);
		
		for (String t : title) {
			System.out.print(t + "\t");
		}
		System.out.println();
		
		for (int i = 1; i < week; i++) {
			System.out.print("\t");
		}
		
		for (int i = 1; i <= lastDay; i++) {
			System.out.print(i + "\t");
			if ((week - 1 + i) % 7 == 0) {
				System.out.println();
			}
		}
	}

}
