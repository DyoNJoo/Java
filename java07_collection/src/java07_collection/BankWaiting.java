package java07_collection;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.Scanner;

public class BankWaiting {

	public BankWaiting() {
		
	}

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		LinkedList<String> count = new LinkedList<String>();
		
		Calendar now = Calendar.getInstance();
		Scanner s = new Scanner(System.in);
		int cnt = 0;
		
		int year = now.get(1);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int hour = now.get(Calendar.HOUR);
		int min = now.get(Calendar.MINUTE);
		
		while (true) {	
			System.out.print("[1. in(손님) / 2. out(은행원)] ");
			int input = s.nextInt();
			
			if (input == 1) {
				count.add(null);
				ll.add(null);
				System.out.println("대기인 수 : " + ll.size() + " --> 날짜 : " + year + "-" + month + "-" + day + " " + hour + ":" + min + ", 번호 : " + count.size());
			}
			else {
				cnt++;
				ll.pop();
				System.out.println("대기인 수 : " + ll.size() + ", " + "호출번호 : " + cnt);
			}
		}

	}

}


/*
실행

메뉴[1. in(손님) / 2. out(은행원)]? 1
대기인 수 : 1명 (본인 포함) --> 날짜 : 2023-08-03 10:39, 번호: 1

메뉴[1. in(손님) / 2. out(은행원)]? 1
대기인 수 : 2명 --> 날짜 : 2023-08-03 10:45, 번호: 2

메뉴[1. in(손님) / 2. out(은행원)]? 2
대기인 수 : 1명, 호출번호 : 1번

메뉴[1. in(손님) / 2. out(은행원)]? 1
대기인 수 : 2명 --> 날짜 : 2023-08-03 10:45, 번호: 3

*/