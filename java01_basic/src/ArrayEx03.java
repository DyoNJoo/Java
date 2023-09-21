
public class ArrayEx03 {
	
	    public static void main(String[] args) {
	        int[][] num = new int[11][11];

	        for (int i = 0; i < 10; i++) {
	            for (int j = 0; j < 10; j++) {
	               num[i][j] = (i + 1) * (j + 1);
	            }
	        }

	        for (int i = 0; i < 10; i++) {
	            int sum = 0;
	            for (int j = 0; j < 10; j++) {
	                sum += num[i][j];
	            }
	            num[i][10] = sum;
	            num[10][i] = sum;
	        }
	        
	        // 배열 출력하기
	        for (int i = 0; i < 11; i++) {
	            for (int j = 0; j < 11; j++) {
	                System.out.print(num[i][j] + "\t");
	            }
	            System.out.println();
	        }
	  }
}
