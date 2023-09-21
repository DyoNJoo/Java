import java.util.*;

public class SwitchTest {

	public static void main(String[] args) {
		// switch문 : 범위 없는 조건문
		Scanner sc = new Scanner(System.in);
				System.out.print("색상번호를 입력하시오. ");
		int colorNum = sc.nextInt();
		
		switch (colorNum) {
		case 1:
			System.out.println("빨강");
			break;
		case 2:
			System.out.println("파랑");
			break;
		case 3:
			System.out.println("노랑");
			break;
		case 4:
			System.out.println("초록");
			break;
		default:
			System.out.println("잘못된 컬러정보입니다.");
		}
	}

}
