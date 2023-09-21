import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Lottoans {

	public static void main(String[] args) {
		Random random = new Random(); // 난수 생성을 위한 객체 선언
        Scanner sc = new Scanner(System.in);

        while (true)
        {
        	System.out.print("게임수 -> ");
	        int game = sc.nextInt();
	        for (int i = 0; i < game; i++) {
	        	int lotto[] = new int[7];
	        	for (int j = 0; j < lotto.length; j++) {
	        		lotto[j] = random.nextInt(45) + 1;
		        		        		
	        		for (int check = 0; check < j; check++) {
	        			if (lotto[check] == lotto[j]) {
	        				j--;
	        				break;
	        			}
	        		}
	        	}
	        	//System.out.println("로또번호 " + Arrays.toString(lotto));
	        	
	        	System.out.print(i + 1 + "게임 = ");
	        	Arrays.sort(lotto, 0, 6);
	        	System.out.print(Arrays.toString(Arrays.copyOfRange(lotto, 0, 6)));
	        	System.out.println(", bonus = " + lotto[6]);
        }

	        	System.out.print("계속하시겠습니까? (1 : 예, 2 : 아니오) ");
	        	int submit = sc.nextInt();
	        	if(submit == 2) {
	        		break;
	        	}
	        	else {
	        		continue;
	        	}
	  
	        }
	}

}
