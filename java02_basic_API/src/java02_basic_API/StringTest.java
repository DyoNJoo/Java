package java02_basic_API;
import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {
		String name1 = "홍길동";
		String name2 = "홍길동";
		
		String username1 = new String("세종대왕");
		String username2 = new String("세종대왕");
		
		int a = 250;
		
		if (name1 == name2) {
			System.out.println("name1과 name2는 같다.");
		}
		else {
			System.out.println("name1과 name2는 다르다.");
		}
		
		if (username1 == username2) {
			System.out.println("username1과 username2는 같다.");
		}
		else {
			System.out.println("username1과 username2는 다르다.");
		}
		
		if (username1.equals(username2)) {
			System.out.println("username1과 username2는 같다.");
		}
		else {
			System.out.println("username1과 username2는 다르다.");
		}
		
		name1 = name1 + "입니다.";
		name1 = name1 + "문자열확인중";
		
		String str = "Java Programing String Test....";
		System.out.println("charAt() = " + str.charAt(5)); //index의 5번째 문자를 반환
		System.out.println(str.concat(name1)); //문자열의 연결
		
		byte[] ascii = str.getBytes(); //문자열을 아스키코드를 구하여 배열로 반환해줌.
		System.out.println("ascii -> " + Arrays.toString(ascii)); //Arrays.toString() -> 배열 내용 출력
		
		//찾는 문자가 없으면 -1
		System.out.println("indexOf -> " + str.indexOf("a")); //처음만나는 문자위치 index
		System.out.println("lastIndexOf -> " + str.lastIndexOf("a")); //뒤에서 처음만나는 문자위치 index (오른쪽부터 셈)
		System.out.println("indexOf -> " + str.indexOf("z"));
		
		System.out.println("length -> " + str.length());
		
		//문자치환 a -> 에이
		String str2 = str.replaceAll("a", "에이");
		System.out.println("replaceAll() -> " + str2);
		
		String tel = "010-1234-5678";
		String phone[] = tel.split("-"); // 0 -> 010, 1 -> 1234, 2 -> 5678
		for (String p: phone) {
			System.out.println(p);
		}
		
		//대소문자 변환
		System.out.println(str.toLowerCase() + ", " + str.toUpperCase());
		
		//일부문자열 얻어오기
		System.out.println("substring -> " + str.substring(7)); //index 7인 위치부터 끝까지의 문자열을 구한다.
		System.out.println("substring -> " + str.substring(7, 12)); //첫번째 index부터 두번째 index 앞문자까지
		
		//양쪽의 공백문자를 지운다.
		String txt = "     자바프로그래밍          ";
		System.out.println("trim -> " + txt.trim() + "*");
		
		//문자열의 비교 : equals() -> 대소문자 구별, equalsIgnoreCase() -> 대소문자 구별 X
		String data1 = "JAVA"; // A - 65
		String data2 = "James"; // a - 97
		// 65 - 97 = -32
		
		System.out.println("equals -> " + data1.equals(data2));
		System.out.println("equalsIgnoreCase -> " + data1.equalsIgnoreCase(data2));
		
		//문자열의 크기비교 : compareTo() -> 대소문자 구별함, compareToIngnoreCase() -> 대소문자 구별안함.
		// 결과 -이면 오른쪽의 변수의 문자열이 크다.
		//	   +이면 오른쪽의 변수의 문자열이 작다.
		//	   0이면 같다.
		System.out.println("compareTo() -> " + data1.compareTo(data2));
		if (data1.compareTo(data2) > 0) {
			System.out.println("data1이 크다.");
		}
		else if (data1.compareTo(data2) < 0){
			System.out.println("data2가 크다.");
		}
		else {
			System.out.println("같다.");
		}
		
		int num = 1234;
		String result = num + "";
		String result2 = String.valueOf(num); // "1234"
		
		char[] charArr = { '객', '체', '지', '향' }; // "객체지향"
		System.out.println("charArr -> " + String.valueOf(charArr));
		
		System.out.println("compareToIngnoreCase() -> " + data1.compareToIgnoreCase(data2));
		
	}

}
