package java02_basic_API;

import java.util.Calendar;

public class Calendertest {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();

		//��¥ ���� ����
		//�� �� �� ����
		date.set(2024, 2, 15);
		
		//�� ����
		date.set(Calendar.MONTH, 6);
		
		//�⵵�� 2022������ ����
		date.set(Calendar.YEAR, 2022);
		System.out.println(date);
		
		int year = date.get(1);
		int month = date.get(Calendar.MONTH) + 1;
		int day = date.get(Calendar.DAY_OF_MONTH);
		int amPm = date.get(Calendar.AM_PM); //���� : 0, ���� : 1
		String amPmTxt = "����";
		
		if (amPm == 1)
			amPmTxt = "����";
		
		int hour = date.get(Calendar.HOUR);
		int min = date.get(Calendar.MINUTE);
		int week = date.get(Calendar.DAY_OF_WEEK);//���� 1 (��), 2 (��), 3 (ȭ), 4 (��), 5 (��), 6 (��), 7 (��)
		String weekTxt = "";
		
		switch (week) {
			case 1:
				weekTxt = "��";
				break;
			case 2:
				weekTxt = "��";
				break;
			case 3:
				weekTxt = "ȭ";
				break;
			case 4:
				weekTxt = "��";
				break;
			case 5:
				weekTxt = "��";
				break;
			case 6:
				weekTxt = "��";
				break;
			case 7:
				weekTxt = "��";
				break;
		}
		System.out.printf("%d�� %d�� %d�� %s %d�� %d�� (%s)\n", year, month, day, amPmTxt, hour, min, weekTxt);
	}

}
