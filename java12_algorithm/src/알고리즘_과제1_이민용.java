import java.util.Scanner;

public class Encryption {

	static String decrypt(String encrypt, String key) {
		StringBuilder dcp = new StringBuilder();
		
		int kindex = 0; //Ű ���ڿ� �񱳸� ���� �ε��� �ϳ��� ����
		
        for (int i = 0; i < encrypt.length(); i++) {
        	char c = encrypt.charAt(i);
        	char keyC = key.charAt(kindex);
        	
        	if (c == keyC) {
        		kindex++; // ���� ���ڿ� Ű ���ڰ� ��ġ�ϸ� ���� Ű ���ڸ� ���ϱ� ���� �ε��� ����
        	} else {
        		dcp.append(c); // ��ġ���� �ʴ� ��� �ش� ���ڸ� ���� ���ڿ��� �߰�
        	}
        	
        	if (kindex >= key.length()) {
        		kindex = 0; // Ű ���ڿ��� ��� ��������� �ٽ� ù ��° Ű ���ڷ� �ʱ�ȭ
        	}
        }
        
        return dcp.toString();
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String encrypt = s.nextLine(); //��ȣȭ ���ڿ�
		String key = s.nextLine(); //Ű ���ڿ�
		
		String decrypted = decrypt(encrypt, key);
		System.out.println(decrypted);
	}

}
