import java.util.Scanner;

public class Encryption {

	static String decrypt(String encrypt, String key) {
		StringBuilder dcp = new StringBuilder();
		
		int kindex = 0; //키 문자열 비교를 위해 인덱스 하나를 선언
		
        for (int i = 0; i < encrypt.length(); i++) {
        	char c = encrypt.charAt(i);
        	char keyC = key.charAt(kindex);
        	
        	if (c == keyC) {
        		kindex++; // 현재 문자와 키 문자가 일치하면 다음 키 문자를 비교하기 위해 인덱스 증가
        	} else {
        		dcp.append(c); // 일치하지 않는 경우 해당 문자를 원본 문자열에 추가
        	}
        	
        	if (kindex >= key.length()) {
        		kindex = 0; // 키 문자열을 모두 사용했으면 다시 첫 번째 키 문자로 초기화
        	}
        }
        
        return dcp.toString();
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String encrypt = s.nextLine(); //암호화 문자열
		String key = s.nextLine(); //키 문자열
		
		String decrypted = decrypt(encrypt, key);
		System.out.println(decrypted);
	}

}
