package test09.sort;

public class ArraySelectionSort {
	static int arr[]; 
	static void setData(int lng) {
		arr = new int[lng];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * (100-1+1)) + 1;
		}
	}
	static void swap(int idx1, int idx2) {
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}
	static void selectionSort() {
		//���������� ����� index
		//				 0				8
		for (int point = 0; point < arr.length-1; point++) { //0,1,2,3,4,5,6,7,8
			//�������� �����������ͱ��� �� �������� ���� ���� index�� ���Ѵ�.
			int minIndex = point; //���� ���� ���� �ִ� index
			for (int i = point + 1; i < arr.length; i++) { //1,2,3,4,5,6,7,8,9  2,3,4,5,6,7,8,9  3,4,5,6,7,8,9 ...
				if (arr[minIndex] > arr[i]) {
					minIndex = i;
				}
			}
			//minIndex��ġ�� ���� point��ġ�� ���� ��ȯ�Ѵ�.
			swap(minIndex, point);
		}
		
	}
	static void print() {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		setData(10);
		System.out.println("========= ���� �� =========");
		print();
		
		selectionSort();
		System.out.println("========= ���� �� =========");
		print();
	}

}
