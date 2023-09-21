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
			System.out.print("[1. in(�մ�) / 2. out(�����)] ");
			int input = s.nextInt();
			
			if (input == 1) {
				count.add(null);
				ll.add(null);
				System.out.println("����� �� : " + ll.size() + " --> ��¥ : " + year + "-" + month + "-" + day + " " + hour + ":" + min + ", ��ȣ : " + count.size());
			}
			else {
				cnt++;
				ll.pop();
				System.out.println("����� �� : " + ll.size() + ", " + "ȣ���ȣ : " + cnt);
			}
		}

	}

}


/*
����

�޴�[1. in(�մ�) / 2. out(�����)]? 1
����� �� : 1�� (���� ����) --> ��¥ : 2023-08-03 10:39, ��ȣ: 1

�޴�[1. in(�մ�) / 2. out(�����)]? 1
����� �� : 2�� --> ��¥ : 2023-08-03 10:45, ��ȣ: 2

�޴�[1. in(�մ�) / 2. out(�����)]? 2
����� �� : 1��, ȣ���ȣ : 1��

�޴�[1. in(�մ�) / 2. out(�����)]? 1
����� �� : 2�� --> ��¥ : 2023-08-03 10:45, ��ȣ: 3

*/