package java02_basic_API;

import java.util.*;

//StringTokenizer�� Ȱ���� �ǽ�

public class EmailCheckEx {

	public static void main(String[] args) {
		while (true) {
			String email;
			String[] information = new String[2];
			
			Scanner sc = new Scanner(System.in);
			System.out.print("�̸��� �Է� = ");
			email = sc.nextLine();
			StringTokenizer st1 = new StringTokenizer(email, "@");
			//�Է¹��� email ���ڿ��� "@" ��ȣ�� �������� ��ü ����
			information[0] = st1.nextToken();
			//ù ��° ��ū�� ���̵� information[0]�� ������.
			
			if (!st1.hasMoreTokens()) {
				System.out.println("�߸��� �̸��� �ּ��Դϴ�.");
				continue;
				//@�� �ƴ� �ٸ� ��ȣ�� �Է����� ��� �����޽����� �����.
			}
			
			StringTokenizer st2 = new StringTokenizer(st1.nextToken());
			// "@" ������ �κ��� �������� ��ü �����Ͽ� �и���.
			information[1] = st2.nextToken();
			//�� ��° ��ū�� �������� information[1]�� ������.
			
			System.out.println("���̵� -> " + information[0]);
			System.out.println("������ -> " + information[1]);
		}
		
	}

}
/*

�䱸���� : split()�޼ҵ� ��� X

����
�̸����Է� = abcd.nate.com
�߸��� �̸����ּ��Դϴ�

�̸����Է� = abcd@naver.com
���̵� -> abcd
������ -> nate.com

�̸����Է� =

*/