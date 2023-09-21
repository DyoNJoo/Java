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
		//기준점으로 사용할 index
		//				 0				8
		for (int point = 0; point < arr.length-1; point++) { //0,1,2,3,4,5,6,7,8
			//기준점과 마지막데이터까지 중 제일작은 값을 가진 index를 구한다.
			int minIndex = point; //제일 작은 값이 있는 index
			for (int i = point + 1; i < arr.length; i++) { //1,2,3,4,5,6,7,8,9  2,3,4,5,6,7,8,9  3,4,5,6,7,8,9 ...
				if (arr[minIndex] > arr[i]) {
					minIndex = i;
				}
			}
			//minIndex위치의 값과 point위치의 값을 교환한다.
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
		System.out.println("========= 정렬 전 =========");
		print();
		
		selectionSort();
		System.out.println("========= 정렬 후 =========");
		print();
	}

}
