package test05.ex.backjoon;

import java.util.Scanner;

public class Backjoon_17478 {

	public static void answer(int n, int barlv) {
		String undbar = "";
		for (int i = 0; i < barlv; i++) {
			undbar += "____";
		}
		
		 if (n == 0) {
	        System.out.println(undbar + "\"����Լ��� ������?\"");
	        System.out.println(undbar + "\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
	        System.out.println(undbar + "��� �亯�Ͽ���.");
	    } else {
	        System.out.println(undbar + "\"����Լ��� ������?\"");
	        System.out.println(undbar + "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
	        System.out.println(undbar + "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
	        System.out.println(undbar + "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");

	        answer(n - 1, barlv + 1);

	        System.out.println(undbar + "��� �亯�Ͽ���.");
	    }
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		
		answer(n, 0);
	}

}
