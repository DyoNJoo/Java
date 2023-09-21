package test07_seacth;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {

	static int binarySearch(int arr[], int n, int k) {
		int pl = 0; // �˻� ������ ���� index = 0
		int pr = n-1;// �˻������� �� index = ������ �� -1 arr.length-1
		
		do {
			int pc = (pl + pr)/2;		//�߰� index
			if (arr[pc] == k) {
				return pc;
			} else if (arr[pc] > k) { //�߾Ӱ��� �� Ŭ��
				pr = pc - 1; //pr�� �߾Ӱ� -1�� �ڸ��� �Űܶ�
			} else { //�߾Ӱ��� �� ������
				pl = pc + 1;
			}
			
		} while (pr >= pl); //pr�� pl���� ũ�ų� ���������� �ݺ�
							//�� �̻� ���� ����.
		return -1; //ã�� ���� ���� ���� �ʴ´�.
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		
		System.out.print("��Ҽ� : ");
		int n = scan.nextInt();
		
		int arr[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = r.nextInt(100) + 1;
		}
		
		//����
		Arrays.sort(arr); //�迭�� ������������ ����
		System.out.println(Arrays.toString(arr));
		
		System.out.print("ã�� �� : ");
		int key = scan.nextInt();
		
		int searchIndex = binarySearch(arr, n, key);
		if (searchIndex == -1) {
			System.out.println("�迭�� " + key + "�� �����ϴ�.");
		} else {
			System.out.println(key + "�� arr["+searchIndex+"] ��ġ�� ���� �����մϴ�.");
		}
		//
	}

}
