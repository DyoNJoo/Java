package test02_basic;

public class Array2Ex3 {

	public static void main(String[] args) {
		int data[][] = {
				{1, 2, 3, 4, 0},
				{5, 6, 7, 8, 0},
				{9, 10, 11, 12, 0},
				{0, 0, 0, 0, 0}
		};
		for (int r = 0; r < data.length - 1; r++) {
			for (int c = 0; c < data[r].length - 1; c++) {
				data[r][data[r].length - 1] += data[r][c]; //���� ��
				data[data.length - 1][c] += data[r][c];//���� ��
			}
		}
		
		for (int r = 0; r < data.length; r++) {
			for (int c = 0; c < data[r].length; c++) {
				System.out.print(data[r][c] + " ");
			}
			System.out.println();
		}
	}

}
