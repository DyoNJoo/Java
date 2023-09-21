package test05.ex.backjoon;

import java.util.Scanner;

public class Main1244 {
	static Scanner scan = new Scanner(System.in);
	static int arr[];
	
	static void man(int swNum) {
		//swNum�� ��� ��ġ�� ����ġ ���¸� �ٲ۴�.	2 -> 2,4,6,8
		//									3 -> 3,6
		for (int i = swNum; i < arr.length; i += swNum) {
			//i��°�� ����ġ ���� ����
			arr[i] ^= 1; //0 -> 1, 1 -> 0 �ٲ�Ƿ� ����ġ ���°� �ٲ�.
		}
	}
	
	static void woman(int swNum) {
		int left = swNum - 1; //���� index�� ���� ����
		int right = swNum + 1; //������ index�� ���� ����
		
		while (true) {
			//break�� �߻��ϴ� ��Ȳ
			//left�� 0���� �۰ų� ������
			if (left <= 0 || right > arr.length) {
				break;
			}
			//left, right��ġ�� ���� �ٸ���
			
			if (arr[left] != arr[right]) {
				break;
			}
			
			left--;
			right++;
		}
		// left + 1���� right - 1���� ����ġ ���� �����ϱ�
		for (int i = left + 1; i <= right - 1; i++) {
			arr[i] = arr[i] ^ 1;
		}
	}
	
	static void switchPrint() {
		for (int i = 1; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			if (i % 20 == 0)
				System.out.println();
		}
	}
	public static void main(String[] args) {
	
		//����ġ ��
		int num = scan.nextInt();
		
		//�迭�� ����
		arr = new int[num + 1];
		
		//����ġ ���¸� �Է¹޾� �迭�� ����
		for (int i = 1; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		//�л� ��
		int student = scan.nextInt();
		
		for (int s = 1; s <= student; s++) {
			int gender = scan.nextInt(); //����
			int swNum = scan.nextInt(); //����ġ ��ȣ
			
			if (gender == 1) man(swNum);
			else if (gender == 2) woman(swNum); 
		}
		
		switchPrint();
	}
 
}
