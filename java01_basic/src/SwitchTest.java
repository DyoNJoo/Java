import java.util.*;

public class SwitchTest {

	public static void main(String[] args) {
		// switch�� : ���� ���� ���ǹ�
		Scanner sc = new Scanner(System.in);
				System.out.print("�����ȣ�� �Է��Ͻÿ�. ");
		int colorNum = sc.nextInt();
		
		switch (colorNum) {
		case 1:
			System.out.println("����");
			break;
		case 2:
			System.out.println("�Ķ�");
			break;
		case 3:
			System.out.println("���");
			break;
		case 4:
			System.out.println("�ʷ�");
			break;
		default:
			System.out.println("�߸��� �÷������Դϴ�.");
		}
	}

}
