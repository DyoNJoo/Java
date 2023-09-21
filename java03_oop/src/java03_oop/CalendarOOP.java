
package java03_oop;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarOOP {
	Scanner sc = new Scanner(System.in);
	Calendar date = Calendar.getInstance();
	int year, month;
	
	String title[] = {"일", "월", "화", "수", "목", "금", "토"};
	
	public CalendarOOP() {
		
	}
	
	int input(String msg) {
		System.out.print(msg + " = ");
		return sc.nextInt(); // 문자를 입력받아 숫자(int)로 변경하여 리턴
	}
	
	public void date(int year, int month) {
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
		output(year, month, week, lastDay);
	}
	
	public void output(int year, int month, int week, int lastDay) {
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
	
	
	public static void main(String[] args) {
		CalendarOOP cal = new CalendarOOP();
		while (true) {
			int year = cal.input("년도");
			int month = cal.input("월");
			if (month < 1 || month > 12) {
				System.out.println("입력이 잘못되었습니다.");
				continue;
			}
			cal.date(year, month);
			break;
		}
	}
}
