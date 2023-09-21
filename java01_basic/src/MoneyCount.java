import java.util.*;

public class MoneyCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int won = 50000; //화폐단위중 제일 큰 단위의 값
		int div = 5; //다음 화폐단위를 만들기 위한 값
	
		System.out.print("금액을 입력하세요 = ");
		int money = sc.nextInt();
		
		while (money > 0) {
			
			int cnt = money/won;
			
			if (cnt > 0) {
				
				String danwi = "개";
				if (won >= 1000) {
					danwi = "장";
				}
								
					System.out.printf("%d원 = %d%s\n", won, cnt, danwi);
			}
			
			money -= (cnt * won);
			won /= div;
			
			if (div == 5)
				div = 2;
			else
				div = 5;
		}
	}

}
