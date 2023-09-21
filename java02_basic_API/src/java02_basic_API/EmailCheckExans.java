package java02_basic_API;

import java.util.*;

public class EmailCheckExans {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("이메일 입력");
			String email = sc.nextLine();
			
			int atMark = email.indexOf("@");
			int point = email.indexOf(".");
			
			if (atMark == -1 || point == -1 || atMark > point || point - atMark < 3) { //잘못된 메일주소일때
				System.out.println("잘못된 이메일주소입니다.");
			}
			else { //정상 메일주소일때
				String id = email.substring(0, atMark); //0부터 @까지
				String domain = email.substring(atMark+1); //@다음부터 끝까지.
				System.out.println("이메일 -> " + id);
				System.out.println("도메인 -> " + domain);
			}
			
		} while (true);
	}

}
