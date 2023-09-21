import java.util.*;

public class Array05 {

	public static void main(String[] args) {
		//2차원 배열
		int num[][] = new int[5][5];
		
		num[2][1] = 90;
		num[0][2] = 85;
		num[4][3] = 75;
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.printf("num[%d][%d] = %d\t", i, j, num[i][j]);
			}
			System.out.println();
		}
		
		String jusorok[][] = {
				{"홍길동", "1234", "aaa@nate.com"},
				{"이순신", "5678", "bbb@daum.net"},
				{"안중근", "7777", "ccc@naver.com"}
		};
		
		for (int i = 0; i < jusorok.length; i++) {
			for (int j = 0; j < jusorok[i].length; j++) {
				System.out.print(jusorok[i][j] + "\t");
			}
			System.out.println();
		}
		
		int data[][] = new int[3][];
		data[0] = new int[3];
		data[1] = new int[4];
		data[2] = new int[2];
		
		data[2][1] = 100;
		data[1][2] = 90;
		data[0][0] = 80;
		
		for (int a[] : data) {
			for (int b : a) {
				System.out.print(b + "\t");
			}
			System.out.println();
		}
		
	}

}
