package java03_oop;

import java.util.*;

public class GotCha {
	
	public void start() {
		Scanner sc = new Scanner(System.in);
	    Random ran = new Random();
	    int answer = ran.nextInt(100) + 1;
	    int count = 0;
	    boolean correct = false;
	
	    System.out.println("���� ���߱� ����");
	    System.out.println("���� 1~100������ ������ �Է��ϼ��� - ");
		
		while (!correct) {
			count++;
			int num = sc.nextInt();

			if (num < 1 || num > 100) {
				System.out.println("���ڴ� 1���� �۰ų� 100���� ũ�� �� �˴ϴ�.");
			}
			else if (num < answer) {
				System.out.println("�� ū���� �Է��ϼ���.");
			}
			else if (num > answer) {
				System.out.println("�� �������� �Է��ϼ���.");
			}
			else {
				correct = true;
				System.out.printf("���߾����ϴ�. ���� = %d\n", answer);
				System.out.printf("%d������ ���߾����ϴ�.", count);
			}
		}
	}
	
	public static void main(String[] args) {
		GotCha game = new GotCha();
		game.start();
	}
}
