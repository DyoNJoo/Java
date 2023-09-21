package test09.sort;

public class ArrayBubbleSort {
	//							i - �� ������, j - ���� ������
	static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static void print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// �������� : ������ 2���� ���� ���Ͽ� ��ȯ�ϴ� ���Ĺ��
		//		    ���������� �����ϱⰡ ����.
		//			�̹� ���ĵ� �����ʹ� �ӵ��� ������.
		//			�������� ���ĵ� �����͸� ������ ��� �ӵ��� ������.
		
		//1~100������ ������ 10�� ����� ������������ ���� (Bubble Sort)
		
		int arr[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * (100 - 1 + 1)) + 1;
		}
		
		System.out.println("========== ���� �� ==========");
		print(arr);
		//���� ����
		
		for (int k = 0; k < arr.length; k++) {
			for (int i = arr.length - 1; i > 0; i--) { //9,8,7,6,5,4,3,2,1
				if (arr[i] < arr[i-1]) {
					swap(arr, i-1, i);
				}
			}
		}
		
		System.out.println("========== ���� �� ==========");
		print(arr);
	}

}
