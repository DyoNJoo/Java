package java07_collection;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Lotto {

	public static void main(String[] args) {
		Random random = new Random(); // 난수 생성을 위한 객체 선언
        Scanner sc = new Scanner(System.in);

        while (true)
        {
        	System.out.print("게임수 -> ");
	        int game = sc.nextInt();
	        
	        //***배열사용안함
	        
	        for (int i = 1; i < game; i++) {
	        	TreeSet<Integer> lotto = new TreeSet<Integer>(); //번호 저장할 객체, 중복제거, 정렬
	        	int ran;
	        	while (true) {
	        		ran = random.nextInt(45) + 1;
	        		lotto.add(ran);
	        		//번호 7개 있으면 반복문 중단
	        		if (lotto.size() >= 7) {
	        			break;
	        		}
	        	}
	        	
	        	//lotto에서 ran(보너스번호)를 제거
	        	lotto.remove(ran);
	        	
	        	//출력
	        	System.out.print(i + "게임 = ");
	        	System.out.print(lotto.toString()); //번호
	        	System.out.println(", Bonus = " + ran);//보너스
	        	
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
