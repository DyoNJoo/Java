import java.util.*;

public class MoneyCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int won = 50000; //ȭ������� ���� ū ������ ��
		int div = 5; //���� ȭ������� ����� ���� ��
	
		System.out.print("�ݾ��� �Է��ϼ��� = ");
		int money = sc.nextInt();
		
		while (money > 0) {
			
			int cnt = money/won;
			
			if (cnt > 0) {
				
				String danwi = "��";
				if (won >= 1000) {
					danwi = "��";
				}
								
					System.out.printf("%d�� = %d%s\n", won, cnt, danwi);
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
