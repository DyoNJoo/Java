package java02_basic_API;

import java.util.Arrays;
import java.util.Collections;

public class ArraysTest {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		int data[] = { 23, 65, 79, 41, 31, 32, 46, 56 };
		System.out.println("정렬 전 -> " + Arrays.toString(data));
		
		//정렬
		Arrays.sort(data); //오름차순으로 정렬됨.
		System.out.println("정렬 후 -> " + Arrays.toString(data));
		
		
		//배열의 일부값만 정렬하기
		//				0	1	2	3	4	5	6	7
		int data2[] = { 52, 23, 12, 56, 34, 88, 94, 25 };
		System.out.println("정렬 전 -> " + Arrays.toString(data2));
		
		//sort(int[] a, int fromIndex, int toIndex(앞까지 정렬))
		Arrays.sort(data2, 2, 5);
		System.out.println("정렬 후 -> " + Arrays.toString(data2));
		
		//문자형배열의 정렬 "2", "홍", "A"
		String data3[] = {"red", "orange", "apple", "banana"};
		Arrays.sort(data3);
		System.out.println("data3 -> " + Arrays.toString(data3));
		
		//내림차순으로 정렬 (문자 데이터)
		Arrays.sort(data3, Collections.reverseOrder());
		System.out.println("data3 -> " + Arrays.toString(data3));
		
		//배열복사
		int data4[] = Arrays.copyOfRange(data2, 3, 7); //data2의 index 3부터 index 7앞까지
		System.out.println("copy -> " + Arrays.toString(data4));
	}

}
