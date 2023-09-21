package java02_basic_API;

import java.util.Calendar;

public class Calendertest {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();

		//날짜 정보 변경
		//년 월 일 변경
		date.set(2024, 2, 15);
		
		//월 변경
		date.set(Calendar.MONTH, 6);
		
		//년도를 2022년으로 변경
		date.set(Calendar.YEAR, 2022);
		System.out.println(date);
		
		int year = date.get(1);
		int month = date.get(Calendar.MONTH) + 1;
		int day = date.get(Calendar.DAY_OF_MONTH);
		int amPm = date.get(Calendar.AM_PM); //오전 : 0, 오후 : 1
		String amPmTxt = "오전";
		
		if (amPm == 1)
			amPmTxt = "오후";
		
		int hour = date.get(Calendar.HOUR);
		int min = date.get(Calendar.MINUTE);
		int week = date.get(Calendar.DAY_OF_WEEK);//요일 1 (일), 2 (월), 3 (화), 4 (수), 5 (목), 6 (금), 7 (토)
		String weekTxt = "";
		
		switch (week) {
			case 1:
				weekTxt = "일";
				break;
			case 2:
				weekTxt = "월";
				break;
			case 3:
				weekTxt = "화";
				break;
			case 4:
				weekTxt = "수";
				break;
			case 5:
				weekTxt = "목";
				break;
			case 6:
				weekTxt = "금";
				break;
			case 7:
				weekTxt = "토";
				break;
		}
		System.out.printf("%d년 %d월 %d일 %s %d시 %d분 (%s)\n", year, month, day, amPmTxt, hour, min, weekTxt);
	}

}
