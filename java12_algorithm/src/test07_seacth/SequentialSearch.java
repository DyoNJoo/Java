package test07_seacth;

import java.util.Random;
import java.util.Scanner;

public class SequentialSearch {

	//for��, ã�� ���� �ִ� ��ġ�� ���Ͽ� ��ȯ, ������ -1
	public static int linearSearchFor(int x[], int n, int key) {
		for (int i = 0; i < n; i++) {
			if (x[i] == key) {
				return i;
			}
		}
		return -1;
	}
	//while��
	static int linearSearchWhile(int[] x, int n, int k) {
		//�迭 x���� k�� ���� ã�� index�� �����Ѵ�. ������ -1�� �����Ѵ�.
		int i = 0;
		while (i < n) {
			if (x[i] == k) {
				return i;
			}
			i++;
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.print("��Ҽ� : ");
		int n = s.nextInt();
		
		// ���� ������ �迭�� �����Ѵ�.
		int x[] = new int[n];
		
		for (int i = 0; i < x.length; i++) {
//			System.out.print("x["+i+"] : ");
//			x[i] = s.nextInt();
			x[i] = ran.nextInt(100) + 1; //1~100
			System.out.println("x["+i+"] : " + x[i]);
		}
		
		//ã�� ��
		System.out.print("�˻��� �� : ");
		int k = s.nextInt();
		
		int idx = linearSearchFor(x, n, k);
		if (idx == -1) {
			System.out.println("ã���ô� ���� �������� �ʽ��ϴ�.");
		} else {
			System.out.println(k + "��(��) x["+idx+"]�� �ֽ��ϴ�.");
		}
		
		//-----------------------------------------------------
		int idx2 = linearSearchWhile(x, n, k);
		if (idx2 != -1) {
			System.out.println(k + "��(��) x["+idx2+"]�� �ֽ��ϴ�.");
		} else {
			System.out.println("ã���ô� ���� �������� �ʽ��ϴ�.");
		}
	}

}
