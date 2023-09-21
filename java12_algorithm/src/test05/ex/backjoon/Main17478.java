package test05.ex.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main17478 {
	static String arr[] = new String[6];
	static String underBar = "";
		
	public static void recursive(int n) {
		String underBarTemp = underBar;
		if (n == 0) {
			System.out.println(underBarTemp + arr[0]);
			System.out.println(underBarTemp + arr[4]);
			System.out.println(underBarTemp + arr[5]);
			return;
		}
		
		for (int i = 0; i <= 3; i++) {
			System.out.println(underBarTemp + arr[i]);
		}
		
		underBar += "____";
		recursive(n - 1);
		System.out.println(underBarTemp + arr[5]);
	}
	public static void main(String[] args) throws IOException {
	
		arr[0] = ("\"����Լ��� ������?\"");
	    arr[1] = ("\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
	    arr[2] = ("���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
	    arr[3] = ("���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
        arr[4] = ("\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
        arr[5] = ("��� �亯�Ͽ���.");
           
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
		
        System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
        
        recursive(n);
	}

}
