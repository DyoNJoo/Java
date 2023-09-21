package java05_exception;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalendarOOP2 {
	
	public int data;
	
	public CalendarOOP2() {
		do {
			start();
		} while (true);
	}
	
	public void start() {
		int year = inData("�⵵");
		int month = inData("��");
		Calendar date = setDate(year, month);
		int week = date.get(Calendar.DAY_OF_WEEK);
		int lastDay = date.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		titlePrint(year, month);
		spacePrint(week);
		dayPrint(week, lastDay);
	}
	
	public int inData(String msg) {
		Scanner sc = new Scanner(System.in);
		//System.out.print(msg + " = ");
		//return sc.nextInt();
		
		//�⵵, �� ����, ����ȭ �Ǽ��� ������ -> InputMismatchException
		int input;
		while (true) {
			try {
				System.out.print(msg + " = ");
				//int data = sc.nextInt();
				//sc.nextLine();
				input = Integer.parseInt(sc.nextLine());
				
				if (msg.equals("��") && (input < 1 || input > 12)) {
					System.out.println("1���� 12������ ���� �Է����ּ���.");
					continue;
				}
				break;
			} catch (NumberFormatException e) {
				//sc.nextLine();
				System.out.println(msg + "�� �߸� �Է��Ͽ����ϴ�.");
			}
		}
		//�������
		return input;
	}
	
	public Calendar setDate(int y, int m) {
		Calendar now = Calendar.getInstance(); //���ó�¥
		now.set(y, m-1, 1);
		return now;
	}
	
	public void titlePrint(int y, int m) {
		System.out.printf("\t\t\t%d�� %d��\n", y, m);
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
	}
	
	public void spacePrint(int week) {
		for (int i = 1; i < week; i++) {
			System.out.print("\t");
		}
	}
	
	public void dayPrint(int week, int lastDay) {
		for (int i = 1; i <= lastDay; i++) {
			System.out.print(i + "\t");
			if ((week - 1 + i) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}
	
	public void dayPrint2(int week, int lastDay) {
		spacePrint(week);
		dayPrint(week, lastDay);
	}
	public static void main(String[] args) {
		CalendarOOP2 cal = new CalendarOOP2();
		cal.start();

	}

}
