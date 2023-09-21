package test09.sort;

import java.util.Random;

public class ArrayQuickSort {
	//Quick Sort
	//����Ʈ�� ��� ���� �����Ͽ� (pivot) �ϰ� �ǹ� ��ġ�� ������ ���� ���� ���ʿ�.
	//ū���� �����ʿ� ��ġ�Ͽ� ����
    //					  0   1   2   3   4   5   6   7   8   9
	static int data[]; // 52, 68, 48, 12, 60, 35, 45, 56, 68, 67
	
	static void arrayPrint() {
		for (int d : data) {
			System.out.print(d + " ");
		}
		System.out.println();
	}
	
	static void swap(int idx1, int idx2) {
		int temp;
		temp = data[idx1];
		data[idx1] = data[idx2];
		data[idx2] = temp;
	}
	
	static void quickSort(int left, int right) {
		int pLeft = left;
		int pRight = right;
		
		int pivot = (left+right) / 2; //�ǹ� 4
		
		int x = data[pivot]; //�ǹ��� ��ġ�� ���� ������ ���� 60
		
		do { //��ȯ�� �����͸� pLeft, pRight ��ġ�� �������� ã��
			 //pivot���� ū���� ���ʿ��� ���� ã��
			while (data[pLeft] < x) {
				pLeft++;
			}
			//pLeft -> 1 : �ǹ����� ū���� index
			//pivot���� ���� ���� �����ʿ��� ���� ã��
			//	      12		60
			while (data [pRight] > x) {
				pRight--;
			}
			// pRight -> 8
			if (pLeft <= pRight) //��ȯ
				swap(pLeft++, pRight--);
		} while (pLeft <= pRight);
		//���ȣ��
		//�������ȣ��
		
		if (left < pRight) quickSort(left, pRight); //������� ȣ��
		if (pLeft > right) quickSort(pLeft, right); //��������� ȣ��
	}
	
	public static void main(String[] args) {
		//������ �غ�
		data = new int[10];
		
		Random ran = new Random();
		
		for (int i = 0; i < data.length; i++) {
			data[i] = ran.nextInt(100) + 1;
		}
		
		System.out.println("~~~~~~~~~~~ ���� �� ~~~~~~~~~~~");
		arrayPrint();
		
		//		���� index, �� index
		quickSort(0, data.length - 1);
		System.out.println("~~~~~~~~~~~ ���� �� ~~~~~~~~~~~");
		arrayPrint();
	}

}
