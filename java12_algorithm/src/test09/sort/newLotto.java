package test09.sort;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class newLotto {

	public static void main(String[] args) {
		Random random = new Random(); // 난수 생성을 위한 객체 선언
        Scanner sc = new Scanner(System.in);

        while (true)
        {
        	System.out.print("게임수 -> ");
	        int cnt = sc.nextInt();
	        
	        for(int i = 1; i <= cnt; i++) {
	        	int lotto[] = new int[7]; //게임을 저장 배열

	        	//번호, 중복, 보너스까지
	        	for (int j = 0; j < lotto.length; j++) {
	        		lotto[j] = random.nextInt(45) + 1; // 1 ~ 45
	        		
	        		for (int k = 0; k < j; k++) {
	        			if (lotto[k] == lotto[j]) {
	        				j--;
	        				break;
	        		}
	        	}
	        }
	        	for (int x = 1; x < lotto.length - 1; x++) {
	        		int temp = lotto[x];
	        		int p;
	        		for (p = x-1; p >= 0 && temp < lotto[p]; p--) {
	        			lotto[p+1] = lotto[p]; //값교환
	        		}
	        		lotto[p+1] = temp;
	        	}
	        	System.out.print(i + "게임 = [");
	        	for (int j = 0; j < lotto.length-1; j++) {
	        		System.out.print(lotto[j]);
		        	if (j == 5) {
		        		System.out.println("], bonus = " + lotto[lotto.length - 1]);
		        	} else {
		        		System.out.print(", ");
		        	}
	        	}
	        	
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
