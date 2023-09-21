package test07_seacth;

import java.util.Random;
import java.util.Scanner;

public class SequentialSearch {

	//for문, 찾는 값이 있는 위치를 구하여 반환, 없으면 -1
	public static int linearSearchFor(int x[], int n, int key) {
		for (int i = 0; i < n; i++) {
			if (x[i] == key) {
				return i;
			}
		}
		return -1;
	}
	//while문
	static int linearSearchWhile(int[] x, int n, int k) {
		//배열 x에서 k의 값을 찾아 index를 리턴한다. 없으면 -1을 리턴한다.
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
		
		System.out.print("요소수 : ");
		int n = s.nextInt();
		
		// 값을 저장할 배열을 생성한다.
		int x[] = new int[n];
		
		for (int i = 0; i < x.length; i++) {
//			System.out.print("x["+i+"] : ");
//			x[i] = s.nextInt();
			x[i] = ran.nextInt(100) + 1; //1~100
			System.out.println("x["+i+"] : " + x[i]);
		}
		
		//찾을 값
		System.out.print("검색할 값 : ");
		int k = s.nextInt();
		
		int idx = linearSearchFor(x, n, k);
		if (idx == -1) {
			System.out.println("찾으시는 값이 존재하지 않습니다.");
		} else {
			System.out.println(k + "은(는) x["+idx+"]에 있습니다.");
		}
		
		//-----------------------------------------------------
		int idx2 = linearSearchWhile(x, n, k);
		if (idx2 != -1) {
			System.out.println(k + "은(는) x["+idx2+"]에 있습니다.");
		} else {
			System.out.println("찾으시는 값이 존재하지 않습니다.");
		}
	}

}
