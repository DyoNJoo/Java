package java02_basic_API;

import java.util.*;

//StringTokenizer를 활용한 실습

public class EmailCheckEx {

	public static void main(String[] args) {
		while (true) {
			String email;
			String[] information = new String[2];
			
			Scanner sc = new Scanner(System.in);
			System.out.print("이메일 입력 = ");
			email = sc.nextLine();
			StringTokenizer st1 = new StringTokenizer(email, "@");
			//입력받은 email 문자열을 "@" 기호를 기준으로 객체 생성
			information[0] = st1.nextToken();
			//첫 번째 토큰인 아이디를 information[0]에 저장함.
			
			if (!st1.hasMoreTokens()) {
				System.out.println("잘못된 이메일 주소입니다.");
				continue;
				//@가 아닌 다른 기호를 입력했을 경우 오류메시지를 출력함.
			}
			
			StringTokenizer st2 = new StringTokenizer(st1.nextToken());
			// "@" 이후의 부분인 도메인을 객체 생성하여 분리함.
			information[1] = st2.nextToken();
			//두 번째 토큰인 도메인을 information[1]에 저장함.
			
			System.out.println("아이디 -> " + information[0]);
			System.out.println("도메인 -> " + information[1]);
		}
		
	}

}
/*

요구조건 : split()메소드 사용 X

실행
이메일입력 = abcd.nate.com
잘못된 이메일주소입니다

이메일입력 = abcd@naver.com
아이디 -> abcd
도메인 -> nate.com

이메일입력 =

*/