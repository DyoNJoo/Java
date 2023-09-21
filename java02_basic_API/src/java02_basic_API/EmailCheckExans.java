package java02_basic_API;

import java.util.*;

public class EmailCheckExans {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("�̸��� �Է�");
			String email = sc.nextLine();
			
			int atMark = email.indexOf("@");
			int point = email.indexOf(".");
			
			if (atMark == -1 || point == -1 || atMark > point || point - atMark < 3) { //�߸��� �����ּ��϶�
				System.out.println("�߸��� �̸����ּ��Դϴ�.");
			}
			else { //���� �����ּ��϶�
				String id = email.substring(0, atMark); //0���� @����
				String domain = email.substring(atMark+1); //@�������� ������.
				System.out.println("�̸��� -> " + id);
				System.out.println("������ -> " + domain);
			}
			
		} while (true);
	}

}
