package test09.sort;

import java.util.Random;

public class ArrayInsertionSort {
	static int arr[];
	static Random ran = new Random();
	static void setData(int size) {
		arr = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(100) + 1;
		}
	}
	static void print() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	static void insertionSort() {
		//���� �������� index
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];	//�񱳴���� �Ǵ� �����͸� �ӽú����� �����Ѵ�.
			//					  temp���� �񱳴���� �Ǵ� ���� ũ�� �������� Ȯ���ؾ� �Ѵ�.
			int j;
			for (j = i - 1; j >= 0 && temp < arr[j]; j--) { // i = 3 -> j = 2,1,0	i = 5 -> j = 4,3,2,1,0
				//���� �ø���
				arr[j + 1] = arr[j];
			}
			//temp�� �ڸ��� �� �����ϱ�
			arr[j + 1] = temp;
		}
	}
	public static void main(String[] args) {
		// ��������(insertion sort)
		// �迭�� ��� ��Ҹ� �տ������� ���ʴ�� �̹� ���ĵ� �κа� ���Ͽ�, �ڽ��� ��ġ�� ã�� �����Ѵ�.
		
		setData(10);
		System.out.println("***** ������ *****");
		print();
		
		//�����ϱ� (Insertion Sort)
		insertionSort();
		System.out.println("***** ������ *****");
		print();
	}

}
