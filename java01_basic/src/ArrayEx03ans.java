
public class ArrayEx03ans {

	    public static void main(String[] args) {
	        int[][] num = new int[11][11];

	       for (int row = 0; row < num.length-1; row++) { //행의 index 0,1,2,3...9
	    	   for (int col = 0; col < num[row].length-1; col++) { //열의 index 0,1,2,3...9
	    		   int data = (row + 1) * (col + 1);
	    		   //ex) if row == 0 -> (0 + 1) * (0 + 1) = 1
	    		   //					(0 + 1) * (1 + 1) = 2
	    		   //					(0 + 1) * (2 + 1) = 3 ...
	    		   //	 else if row == 1 -> (1 + 1) * (1 + 1) = 4
	    		   num[row][col] = data;
	    		   num[row][num[row].length-1] += data; //열의 합
	    		   num[num.length-1][col] += data; //행의 합
	    	   }
	       }
	       
	       for (int i = 0; i < num.length; i++) {
	    	   for (int j = 0; j < num[i].length; j++) {
	    		   System.out.printf("%d\t", num[i][j]);
	    	   }
	    	   System.out.println();
	       }
	  }
}
