package test07_seacth;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {

	static int binarySearch(int arr[], int n, int k) {
		int pl = 0; // 검색 범위의 시작 index = 0
		int pr = n-1;// 검색범위의 끝 index = 데이터 수 -1 arr.length-1
		
		do {
			int pc = (pl + pr)/2;		//중간 index
			if (arr[pc] == k) {
				return pc;
			} else if (arr[pc] > k) { //중앙값이 더 클때
				pr = pc - 1; //pr을 중앙값 -1의 자리로 옮겨라
			} else { //중앙값이 더 작을때
				pl = pc + 1;
			}
			
		} while (pr >= pl); //pr이 pl보다 크거나 같을때까지 반복
							//더 이상 값이 없다.
		return -1; //찾을 값이 존재 하지 않는다.
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		
		System.out.print("요소수 : ");
		int n = scan.nextInt();
		
		int arr[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = r.nextInt(100) + 1;
		}
		
		//정렬
		Arrays.sort(arr); //배열을 오름차순으로 정렬
		System.out.println(Arrays.toString(arr));
		
		System.out.print("찾을 값 : ");
		int key = scan.nextInt();
		
		int searchIndex = binarySearch(arr, n, key);
		if (searchIndex == -1) {
			System.out.println("배열에 " + key + "은 없습니다.");
		} else {
			System.out.println(key + "는 arr["+searchIndex+"] 위치에 값이 존재합니다.");
		}
		//
	}

}
